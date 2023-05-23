import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
@SuppressWarnings("CheckReturnValue")
public class AdvSemCheck extends advBaseVisitor<Boolean> {
   /* TYPES */   
   protected static final Type NFA_TYPE = new NFAType();
   protected static final Type DFA_TYPE = new DFAType();
   protected static final Type COMPLETE_DFA_TYPE = new CompleteDFAType();
   protected static final Type AUTOMATON_TYPE = new AutomatonType();
   protected static final Type VIEW_TYPE = new ViewType();
   protected static final Type ANIMATION_TYPE = new AnimationType();
   protected static final Type VIEWPORT_TYPE = new ViewportType();
   protected static final Type STATE_TYPE = new StateType();
   protected static final Type STRING_TYPE = new StringType();
   protected static final Type POINT_TYPE = new PointType();
   protected static final Type NUMBER_TYPE = new NumberType();
   protected static final Type BOOLEAN_TYPE = new BooleanType();
   protected static final Type LIST_TYPE = new ListType();

   // ParseTreeProperty usada para passar os simbolos de alphabetElement para alphabetDef,
   // é capaz de ser boa ideia mudar isto, está ineficiente (mas funciona)
   private ParseTreeProperty<ArrayList<Character>> alphabetValues = new ParseTreeProperty<>();
   private ParseTreeProperty<String> valuesToString = new ParseTreeProperty<>();
   // alphabetChars vai ter os carateres do alfabeto
   private ArrayList<Character> alphabetChars;
   private SymbolTable globalSymbolTable = new SymbolTable(null);
   private SymbolTable currentSymbolTable = globalSymbolTable;
   private int numInitialStates = 0;
   private int numAcceptingStates = 0;
   // type do automato a ser definido (preciso disto nas transições por causa das condições DFA/NFA,etc)
   private Type currAutomatonType;     
   // TODO: verificar se os estados a ser usados são validos para o automato ATUAl ( ainda nao sei como )
   // para cada automato, ter a lista das transições
   private Map <String, Transitions> automatonsTransitions = new HashMap<>();
   // que automato é que está a ser usado agora
   private String currentAutomatonString;
   // view -> automato
   private Map <String, String> viewAutomaton = new HashMap<>();
   // List para garantir que variaveis nao inicializadas não podem ser usadas
   private List<String> declared_not_initialized = new ArrayList<>();
   
   @Override public Boolean visitProgram(advParser.ProgramContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitStat(advParser.StatContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitImportstat(advParser.ImportstatContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   /* Verificar se há simbolos repetidos no alfabeto */
   @Override public Boolean visitAlphabetDef(advParser.AlphabetDefContext ctx) {
      Boolean res = true;
      ArrayList<Character> alphabetChars = new ArrayList<>(), currentChars;
      for (int i = 0; i < ctx.alphabetElement().size(); i++)
      {
         if (visit(ctx.alphabetElement(i))) {
            currentChars = alphabetValues.get(ctx.alphabetElement(i));
            for (int j = 0; j < currentChars.size(); j++) {
               if (alphabetChars.contains(currentChars.get(j))) {
                  System.err.printf("Duplicate symbol in alphabet -  \"%s\"\n", currentChars.get(j));
                  ErrorHandling.registerError();
               } else
                  alphabetChars.add(currentChars.get(j));
            }
         }
      }
      this.alphabetChars = alphabetChars;
      return res;
   }

   /* Só verifica se, no caso de ser uma lista, o primeiro elemento vem antes do 2º em termos de ASCII */
   @Override public Boolean visitAlphabetElement(advParser.AlphabetElementContext ctx) {
      Boolean res = true;
      char first, second;
      Character[] tempCharArray;
      ArrayList<Character> temp;
      if (ctx.SYMBOL().size() == 2) {     // se for do tipo 'SYMBOL' - 'SYMBOL'
         first = ctx.SYMBOL(0).getText().charAt(1);      // o charAt(0) é ', por isso é preciso meter charAt(1)
         second = ctx.SYMBOL(1).getText().charAt(1);
         if (first > second) 
         {

            ErrorHandling.registerError();
            res = false;
         } else {
            // guardar todos os carateres
            tempCharArray = new Character[second - first + 1];
            for (int i = 0; i < second - first + 1; i++)
            {
               tempCharArray[i] = (char) (first + i);
            }
            alphabetValues.put(ctx, new ArrayList<Character>(Arrays.asList(tempCharArray)));
         }
      } else {       // se for do tipo SYMBOL 
         alphabetValues.put(ctx, new ArrayList<Character>(Arrays.asList(ctx.SYMBOL(0).getText().charAt(1))));
      }
      return res;
   }

   @Override public Boolean visitAutomatonDef(advParser.AutomatonDefContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAutomatonNFADef(advParser.AutomatonNFADefContext ctx) {
      Boolean res = true;
      numInitialStates = 0;
      numAcceptingStates = 0;
      int i;
      Type automatonType = NFA_TYPE;
      currAutomatonType = NFA_TYPE;

      String automaton_symbolName = ctx.ID().getText();
      // Verificar se automato com este ID já foi definido, se foi, então houve erro
      if (globalSymbolTable.containsSymbol(automaton_symbolName)) {
         ErrorHandling.registerError();
         res = false;
      } else 
         globalSymbolTable.putSymbol(automaton_symbolName, new Symbol(automatonType));

      // Agora, verificar stateDefs
      currentSymbolTable = new SymbolTable(globalSymbolTable);
      // Visitar o stateDef, que vai verificar se há simbolos repetidos e po-los 
      // na currentSymbolTable
      for (i = 0; i < ctx.stateDef().size(); i++)
      {
         visit(ctx.stateDef(i));
      }

      for (i = 0; i < ctx.automatonStat().size(); i++)
      {
         visit(ctx.automatonStat(i));

      }
      // Adicionar objeto transitions a automatonsTransitions para este automato antes de visitar transitionDef
      automatonsTransitions.put(automaton_symbolName, new Transitions());
      currentAutomatonString = automaton_symbolName;
      
      visit(ctx.transitionDef());

      if (numAcceptingStates == 0) {
         System.err.println("Automaton should have at least 1 accepting state.");
         ErrorHandling.registerError();
      }

      if (numInitialStates != 1) {
         System.err.println("Automaton should have one and only one initial state.");
         ErrorHandling.registerError();
      }

      return res;
   }

   @Override public Boolean visitAutomatonDFADef(advParser.AutomatonDFADefContext ctx) {
      Boolean res = true;
      numInitialStates = 0;
      numAcceptingStates = 0;
      int i;
      Type automatonType;
      if (ctx.complete != null) {
         automatonType = COMPLETE_DFA_TYPE;
         currAutomatonType = COMPLETE_DFA_TYPE;
      } else {
         automatonType = DFA_TYPE;
         currAutomatonType = DFA_TYPE;
      }

      String automaton_symbolName = ctx.ID().getText();
      // Verificar se automato com este ID já foi definido, se foi, então houve erro
      if (globalSymbolTable.containsSymbol(automaton_symbolName)) {
         ErrorHandling.registerError();
         res = false;
      } else 
         globalSymbolTable.putSymbol(automaton_symbolName, new Symbol(automatonType));

      // Agora, verificar stateDefs
      currentSymbolTable = new SymbolTable(globalSymbolTable);
      // Visitar o stateDef, que vai verificar se há simbolos repetidos e po-los 
      // na currentSymbolTable
      for (i = 0; i < ctx.stateDef().size(); i++)
      {
         visit(ctx.stateDef(i));
      }

      for (i = 0; i < ctx.automatonStat().size(); i++)
      {
         visit(ctx.automatonStat(i));

      }
      // Adicionar objeto transitions a automatonsTransitions para este automato antes de visitar transitionDef
      automatonsTransitions.put(automaton_symbolName, new Transitions());
      currentAutomatonString = automaton_symbolName;

      visit(ctx.transitionDef());

      if (numAcceptingStates == 0) {
         System.err.println("Automaton should have at least 1 accepting state.");
         ErrorHandling.registerError();
      }

      if (numInitialStates != 1) {
         System.err.println("Automaton should have one and only one initial state.");
         ErrorHandling.registerError();
      }

      return res;
   }

   @Override public Boolean visitAutomatonStat(advParser.AutomatonStatContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   // TODO: também é possivel ter um "for i in word" em que word é uma string (lista de chars)
   @Override public Boolean visitAutomatonFor(advParser.AutomatonForContext ctx) {
      Boolean res = null;
      // O ID do for apenas existe enquanto o for existir
      String forVarID = ctx.ID().getText();
      // TODO: Aqui não tenho a certeza se o type dos elementos da lista é obrigatoriamente estados
      // para já, vou assumir que os elementos da lista são states
      currentSymbolTable.putSymbol(forVarID, new Symbol(STATE_TYPE));
      visit(ctx.expr());
      // Verificar se o expr devolve uma lista
      String typeExpr = valuesToString.get(ctx.expr());
      if (!typeExpr.equals("list"))
      {
         System.err.printf("Invalid type of expression in AutomatonFor. Correct use -> for [id] in [list]\n");
         ErrorHandling.registerError();
      }
      // Depois disto, chamar os automatonStats
      if (ctx.automatonStat().size() == 1)
      {
         visit(ctx.automatonStat(0));
      } else
         for (int i = 0; i < ctx.automatonStat().size(); i++) {
            visit(ctx.automatonStat(i));
      }
      currentSymbolTable.removeSymbol(forVarID);
      return res;
   }

   @Override public Boolean visitAutomatonWhile(advParser.AutomatonWhileContext ctx) {
      Boolean res =  visit(ctx.expr()); // true se for booleana
      if (!res) System.err.println("Invalid boolean expression in the \"while\" statement inside the automaton definition.");
      for (int i = 0; i < ctx.automatonStat().size(); i++) {
         visit(ctx.automatonStat(i));
      }
      
      return res;
   }


   @Override public Boolean visitAutomatonIf(advParser.AutomatonIfContext ctx) {
      Boolean res =  visit(ctx.expr()); // true se for booleana
      if (!res) System.err.println("Invalid boolean expression in the \"if\" statement inside the automaton definition.");
      for (int i = 0; i < ctx.automatonStat().size(); i++) {
         visit(ctx.automatonStat(i));
      }
      
      return res;
   }

   // TODO: quando verifico se o state já existe, nao sei se o scope deve ser global ou apenas local ao automato
   @Override public Boolean visitStateDef(advParser.StateDefContext ctx) {
      Boolean res = true;
      String currId;
      for (int i = 0; i < ctx.ID().size(); i++)
      {
         currId = ctx.ID(i).getText();
         if (currentSymbolTable.containsSymbol(currId)) {
            res = false;
            ErrorHandling.registerError();
            System.err.printf("Duplicate state -  \"%s\"\n", currId);
         } else
            currentSymbolTable.putSymbol(currId, new Symbol(STATE_TYPE));
      }
      return res;
   }

   @Override public Boolean visitPropertiesDef(advParser.PropertiesDefContext ctx) {
      Boolean res = null;
      String stateID = ctx.ID().getText();
      String propertyKey;
      Symbol stateSymbol = currentSymbolTable.findSymbol(stateID);
      if (stateSymbol == null) {
         System.err.printf("Can't define property for state \"%s\". Symbol not found.\n", stateID);
         ErrorHandling.registerError();
      } else {
         if (stateSymbol.type() != STATE_TYPE) {
            // TODO: fazer este print de erro
            System.err.println();
            ErrorHandling.registerError();
         } else {
            for (int i = 0; i < ctx.propertyElement().size(); i++) {
               visit(ctx.propertyElement(i));
               propertyKey = valuesToString.get(ctx.propertyElement(i));
               if (!propertyKey.equals("initial") && !propertyKey.equals("accepting"))
               {
                  ErrorHandling.registerError();
                  System.err.printf("Invalid property key for state \"%s\", must be either 'accepting' or 'initial'.\n", stateID);
               }
            }
         }
         
         
      }
      return res;
   }

   @Override public Boolean visitPropertyElement(advParser.PropertyElementContext ctx) {
      Boolean res = true;
      String propertyKey = ctx.propertiesKeys().getText();
      String propertyValue = "";
      if (ctx.ID() != null) {
         for (int i = 0; i < ctx.ID().size(); i++)
         { 
            propertyValue = propertyValue + ctx.ID(i).getText() + " ";
         }
      } else if (ctx.Number() != null) {
         propertyValue = propertyValue + ctx.Number().getText();
      }
      if (propertyKey.equals("initial"))  // true ou false
      {
         if (!propertyValue.equals("true ") && !propertyValue.equals("false ")) {
            System.err.println("Invalid property value for \"" + propertyKey + "\" as propertyKey");
            ErrorHandling.registerError();
         } else {
            if (numInitialStates == 0) {
               numInitialStates++;
            } else {
               System.err.println("Too many initial states, only 1 may be allowed.");
            }
         }
         valuesToString.put(ctx, "initial");
      } else if (propertyKey.equals("accepting")) {
         if (!propertyValue.equals("true ") && !propertyValue.equals("false ")) {
            System.err.printf("Invalid property value for \"%s\" as propertyKey - \"%s\"\n", propertyKey, propertyValue);
            ErrorHandling.registerError();
         } else {
            numAcceptingStates++;
         }
         valuesToString.put(ctx, "accepting");

      } else if (propertyKey.equals("align")) {
         if (validAlignProperty(propertyValue)) {
            System.err.printf("Invalid property value for \"%s\" as propertyKey - \"%s\"\n", propertyKey, propertyValue);
            ErrorHandling.registerError();
         } 
         valuesToString.put(ctx, "align");
      } else if (propertyKey.equals("slope")) {
         // Tem de ser um valor numerico (mas não sei se inclui 0)
         if (!propertyValue.matches("[1-9][0-9]*")) {
            System.err.printf("Invalid property value for \"%s\" as propertyKey - \"%s\"\n", propertyKey, propertyValue);
            ErrorHandling.registerError();
         } 
         valuesToString.put(ctx, "slope");

      } else if (propertyKey.equals("highlighted")) {
         if (!propertyValue.equals("true ") && !propertyValue.equals("false ")) {
            System.err.printf("Invalid property value for \"%s\" as propertyKey - \"%s\"\n", propertyKey, propertyValue);
            ErrorHandling.registerError();
         } 
         valuesToString.put(ctx, "highlighted");
      }
      return res;
   }

   @Override public Boolean visitTransitionDef(advParser.TransitionDefContext ctx) {
      Boolean res = null;

      for (int i = 0; i < ctx.transitionElement().size(); i++)
      {
         visit(ctx.transitionElement(i));
      }
      // Depois de adicionar todas as transições definidas, verificar se cumprem condições do type
      Transitions transitions = automatonsTransitions.get(currentAutomatonString);
      if (currAutomatonType == DFA_TYPE) {
         if (!transitions.isDFAValid())
         {
            ErrorHandling.registerError();
            System.err.println("Invalid DFA Transitions!");
         }

      } else if (currAutomatonType == NFA_TYPE) {
         if (!transitions.isNFAValid())
         {
            ErrorHandling.registerError();
            System.err.println("Invalid NFA Transitions!");
         }

      } else if (currAutomatonType == COMPLETE_DFA_TYPE) {
         if (!transitions.isCompleteDFAValid(alphabetChars.size()))
         {
            ErrorHandling.registerError();
            System.err.println("Invalid Complete DFA Transitions!");
         }
      }
      
      return res;
   }


   @Override public Boolean visitTransitionElement(advParser.TransitionElementContext ctx) {
      Boolean res = null;
      Transitions transitions = automatonsTransitions.get(currentAutomatonString);

      String fromId = ctx.ID(0).getText();
      String toId = ctx.ID(1).getText();
      Character curr_alph_symbol;
      Symbol fromSymbol, toSymbol;
      fromSymbol = currentSymbolTable.findSymbol(fromId);
      toSymbol = currentSymbolTable.findSymbol(toId);
      // Verificar se os IDs da transição são estados existentes
      if (fromSymbol == null || fromSymbol.type() != STATE_TYPE)
      {
         System.err.println("Invalid \"from\" symbol in transitions definition: " + fromId);
         ErrorHandling.registerError();
      }
      if (toSymbol == null || toSymbol.type() != STATE_TYPE)
      {
         System.err.println("Invalid \"to\" symbol in transitions definition: " + toId);
         ErrorHandling.registerError();
      }
      // Verificar se os símbolos que causam a transição estão no alfabeto
      for (int i = 0; i < ctx.SYMBOL().size(); i++) {
         curr_alph_symbol = ctx.SYMBOL(i).getText().charAt(1);
         if (!alphabetChars.contains(curr_alph_symbol)) {
            ErrorHandling.registerError();
            System.err.printf("\"%s\" not found in alphabet.\n", curr_alph_symbol);
         } else {
            if (!transitions.addTransition(fromId, toId, curr_alph_symbol)) {
               System.err.printf("Duplicate transition: %s -> '%c' -> %s.\n", fromId, curr_alph_symbol, toId);
            }
         }  
      }
      
      return res;
   }

   @Override public Boolean visitViewDef(advParser.ViewDefContext ctx) {
      Boolean res = null;
      String viewID = ctx.ID(0).getText();
      String automatonID = ctx.ID(1).getText();
      Symbol automatonSymbol = globalSymbolTable.findSymbol(automatonID);
      // Verificar se há algum simbolo com o ID definido para esta view
      if (globalSymbolTable.containsSymbol(viewID)) {
         System.err.printf("Invalid ID for view -  Already taken.\n");
         ErrorHandling.registerError();
      } else {
         // Verificar se ID de automato dado existe e está associado a um automato
         if (automatonSymbol == null) {
            System.err.printf("Automaton ID not found - \"%s\"\n", automatonID);
            currentAutomatonString = "";
            ErrorHandling.registerError();
            
         } else if (!automatonSymbol.type().subtype(AUTOMATON_TYPE)) {
            System.err.printf("Invalid type for automaton given.\n");
            currentAutomatonString = "";
            ErrorHandling.registerError();
         } else {
            globalSymbolTable.putSymbol(viewID, new Symbol(VIEW_TYPE));
            currentAutomatonString = automatonID;
            viewAutomaton.put(viewID, automatonID);
            visitChildren(ctx);
         }
      }
      return res;
   }

   // TODO: lidar com algebric OP aqui dentro
   // TODO: será que vale a pena dar print de erros semanticos se o automato dado na view nao existe?
   @Override public Boolean visitViewStat(advParser.ViewStatContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitViewFor(advParser.ViewForContext ctx) {
      Boolean res = null;
      // O ID do for apenas existe enquanto o for existir
      String forVarID = ctx.ID().getText();
      // TODO: Aqui não tenho a certeza se o type dos elementos da lista é obrigatoriamente estados
      // para já, vou assumir que os elementos da lista são states
      currentSymbolTable.putSymbol(forVarID, new Symbol(STATE_TYPE));
      visit(ctx.expr());
      // Verificar se o expr devolve uma lista
      String typeExpr = valuesToString.get(ctx.expr());
      if (!typeExpr.equals("list"))
      {
         System.err.printf("Invalid type of expression in viewFor. Correct use -> for [id] in [list]\n");
         ErrorHandling.registerError();
      }
      // Depois disto, chamar os automatonStats
      if (ctx.viewStat().size() == 1)
      {
         visit(ctx.viewStat(0));
      } else
         for (int i = 0; i < ctx.viewStat().size(); i++) {
            visit(ctx.viewStat(i));
      }
      currentSymbolTable.removeSymbol(forVarID);
      return res;
   }

   @Override public Boolean visitViewWhile(advParser.ViewWhileContext ctx) {
      Boolean res =  visit(ctx.expr()); // true se for booleana
      if (!res) {
         System.err.println("Invalid boolean expression in the \"while\" statement inside the view definition.");
         ErrorHandling.registerError();
      } 
      for (int i = 0; i < ctx.viewStat().size(); i++) {
         visit(ctx.viewStat(i));
      }
      
      return res;
   }

   @Override public Boolean visitViewIf(advParser.ViewIfContext ctx) {
      Boolean res =  visit(ctx.expr()); // true se for booleana
      if (!res) {
         System.err.println("Invalid boolean expression in the \"if\" statement inside the view definition.");
         ErrorHandling.registerError();
      }
         for (int i = 0; i < ctx.viewStat().size(); i++) {
         visit(ctx.viewStat(i));
      }
      
      return res;
   }

   @Override public Boolean visitTransitionRedefine(advParser.TransitionRedefineContext ctx) {
      Boolean res = true;
      if (ctx.transition() != null) { // transition as transition point 
         String transitionText = ctx.transition().getText();
         if (!visit(ctx.transition())) {
            System.err.printf("Invalid transition '%s' on transition redefinition statement. It doesn't exist for automaton \"%s\".\n", transitionText, currentAutomatonString);
            ErrorHandling.registerError();
            res = false;
         } else {
            for (int i = 0; i < ctx.transitionPoint().size() ; i++) {
               if (!visit(ctx.transitionPoint(i)))
                  res = false;
            }
         }
      }
      return res;
   }

   @Override public Boolean visitTransitionPoint(advParser.TransitionPointContext ctx) {
      Boolean res = true;
      visit(ctx.expr());
      String exprValue, propertyKey;
      exprValue = valuesToString.get(ctx.expr());
      if (!exprValue.equals("point")) {
         ErrorHandling.registerError();
         System.err.printf("Invalid point in transition redefinition. Must be of 'point' type.\n");
         res = false;
      }
      if (ctx.propertyElement() != null)
         for (int i = 0; i < ctx.propertyElement().size() ; i++) {
            visit(ctx.propertyElement(i));
            propertyKey = valuesToString.get(ctx.propertyElement(i));
            if (!propertyKey.equals("align")) {
               ErrorHandling.registerError();
               System.err.printf("Invalid property key for show statament. Must be either 'accepting' or 'highlighted'.\n");
               res = false;
            }
         }
      return res;
   }

   @Override public Boolean visitTransitionLabelAlter(advParser.TransitionLabelAlterContext ctx) {
      Boolean res = true;
      String transitionText = ctx.transition().getText();
      if (!visit(ctx.transition())) {
         System.err.printf("Invalid transition '%s' on transition label placement. It doesn't exist for automaton \"%s\".\n", transitionText, currentAutomatonString);
         ErrorHandling.registerError();
         res = false;
      }
      if (ctx.propertyElement() != null)
      {
         for (int i = 0; i < ctx.propertyElement().size(); i++) {
            visit(ctx.propertyElement(i));
            if (!valuesToString.get(ctx.propertyElement(i)).equals("align"))
            {
               ErrorHandling.registerError();
               System.err.printf("Invalid property key for transition \"%s\", must be 'align'.\n", transitionText);
               res = false;
            }
         }
         
      }
      return res;
   }

   @Override public Boolean visitTransitionLabelAlterWithComma(advParser.TransitionLabelAlterWithCommaContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTransition(advParser.TransitionContext ctx) {
      Boolean res = false;
      String fromID = ctx.ID(0).getText();
      String toID = ctx.ID(1).getText();
      Transitions current_aut_transitions = automatonsTransitions.get(currentAutomatonString);
      if (current_aut_transitions.containsTransition(fromID, toID))
         res = true;
      return res;
   }

   
   @Override public Boolean visitPlaceDef(advParser.PlaceDefContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitIDplaceElement(advParser.IDplaceElementContext ctx) {
      Boolean res = null;
// Verificar que ID existe e é um state
      // TODO: cuidado com o scope, symbol table para encontrar o state 
      String exprType;

      String stateID = ctx.ID().getText();
      Symbol stateSymbol = currentSymbolTable.findSymbol(stateID);
      if (stateSymbol == null || stateSymbol.type() != STATE_TYPE)
      {
         ErrorHandling.registerError();
         System.err.printf("Invalid state \"%s\" on the 'place' statement inside the view definition.\n", stateID);
      }

      visit(ctx.expr());
      // quando eu visito points/numbers/strings, meto-los na 
      // valuesToString, para saber que type visitei
      exprType = valuesToString.get(ctx.expr());
      if (exprType != null && !exprType.equals("point"))
      {
         ErrorHandling.registerError();
         System.err.printf("Invalid expression while trying to place state \"%s\": Must be a point.\n", stateID);
      }
   

      return res;
   }

   @Override public Boolean visitTransitionplaceElement(advParser.TransitionplaceElementContext ctx) {
      Boolean res = null;
      String exprType;
      if (visit(ctx.transitionLabelAlter())) {
         visit(ctx.expr());
         exprType = valuesToString.get(ctx.expr());
         if (exprType == null || !exprType.equals("point"))
         {
            ErrorHandling.registerError();
            System.err.printf("Invalid expression while trying to place the label of a state.\n");
         }
      }
      return res;
   }

   @Override public Boolean visitGridDef(advParser.GridDefContext ctx) {
      Boolean res = null;
      String gridID = ctx.ID().getText();
      if (globalSymbolTable.containsSymbol(gridID))
      {
         System.err.printf("ERROR: Cannot define grid '%s'. Variable name taken.\n", gridID);
         ErrorHandling.registerError();
      }
      for (int i = 0; i < ctx.gridOptions().size(); i++) {
         visit(ctx.gridOptions(i));
      }
      return res;
   }

   @Override public Boolean visitGridOptions(advParser.GridOptionsContext ctx) {
      Boolean res = true;
      String gridProperty = ctx.gridProperties().getText();
      String gridValue = "";
      if (ctx.ID() != null) {
         for (int i = 0; i < ctx.ID().size(); i++)
         { 
            gridValue = gridValue + ctx.ID(i).getText() + " ";
         }
      } else if (ctx.Number() != null) {
         gridValue = gridValue + ctx.Number().getText();
      }


      if (gridProperty.equals("step")) {
         if (ctx.Number() == null) { // tem de ser um numero
            System.err.printf("ERROR: Invalid grid property value for \"%s\" as propertyKey - \"%s\". Must be a number.\n", gridProperty, gridValue);
            ErrorHandling.registerError();
         }
      } else if (gridProperty.equals("margin")) {
         if (ctx.Number() == null) { // tem de ser um numero
            System.err.printf("ERROR: Invalid grid property value for \"%s\" as propertyKey - \"%s\". Must be a number.\n", gridProperty, gridValue);
            ErrorHandling.registerError();
         }

      } else if (gridProperty.equals("color")) {
         if (ctx.ID() == null) { // tem de ser um ID+, que identifica a cor
            System.err.printf("ERROR: Invalid grid property value for \"%s\" as propertyKey - \"%s\". Must be a color.\n", gridProperty, gridValue);
            ErrorHandling.registerError();
         }
         
      } else if (gridProperty.equals("line")) {
         if (!gridValue.equals("solid ") && !gridValue.equals("dotted ") && !gridValue.equals("dashed ")) { // tem de ser um ID+, que identifica a cor
            System.err.printf("ERROR: Invalid grid property value for \"%s\" as propertyKey - \"%s\". Must be a 'dotted', 'dashed' or 'solid'.\n", gridProperty, gridValue);
            ErrorHandling.registerError();
         }
         
         
      }

      return res;
   }

   @Override public Boolean visitAnimationDef(advParser.AnimationDefContext ctx) {
      Boolean res = null;
      String animationID = ctx.ID().getText();
      if (globalSymbolTable.containsSymbol(animationID))
      {
         System.err.printf("Error: Variable name taken on animation definition - \"%s\"\n", animationID);
         ErrorHandling.registerError();
      } else {
         globalSymbolTable.putSymbol(animationID, new Symbol(ANIMATION_TYPE));
      }
      return visitChildren(ctx);
   }

   @Override public Boolean visitViewportDef(advParser.ViewportDefContext ctx) {
      Boolean res = null;
      String viewportID = ctx.ID(0).getText();
      String viewID = ctx.ID(1).getText();
      Symbol viewSymbol;
      // TODO: é capaz de ser local ao scope da animation
      if (globalSymbolTable.containsSymbol(viewportID))
      {
         System.err.printf("Error: Variable name taken on viewport definition - \"%s\"\n", viewportID);
         ErrorHandling.registerError();
      } else {
         globalSymbolTable.putSymbol(viewportID, new Symbol(VIEWPORT_TYPE));
         if (globalSymbolTable.containsSymbol(viewID)) {
            viewSymbol = globalSymbolTable.findSymbol(viewID);
            if (viewSymbol.type() != VIEW_TYPE) {
               System.err.printf("Error: Wrong type for variable \"%s\" in viewport definition. Must be a view.\n", viewID);
               ErrorHandling.registerError();
            } else {
               visit(ctx.expr(0));
               visit(ctx.expr(1));
               if (!valuesToString.get(ctx.expr(0)).equals("point") || !valuesToString.get(ctx.expr(1)).equals("point")) {
                  System.err.printf("Error: Viewport definition must include 2 points.\n");
                  ErrorHandling.registerError();
               } else {
                  currentAutomatonString = viewAutomaton.get(viewID);
               }
            }
   
         } else {
            System.err.printf("Error: View \"%s\" not found in viewport definition.\n", viewID);
            ErrorHandling.registerError();
         }
      }
      return res;
   }

   @Override public Boolean visitViewportOn(advParser.ViewportOnContext ctx) {
      Boolean res = null;
      String viewportID = ctx.ID().getText();
      Symbol viewportSymbol;
      if (globalSymbolTable.containsSymbol(viewportID)) {
         viewportSymbol = globalSymbolTable.findSymbol(viewportID);
         if (viewportSymbol.type() != VIEWPORT_TYPE) {
            System.err.printf("Error: Wrong type for variable \"%s\". Must be a viewport.\n", viewportID);
            ErrorHandling.registerError();
         } else {
            return visitChildren(ctx);
         }
      } else {
         System.err.printf("Error: View \"%s\" not found in viewport definition.\n", viewportID);
         ErrorHandling.registerError();
      }
      return res;
   }

   @Override public Boolean visitViewportStat(advParser.ViewportStatContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitViewportWhile(advParser.ViewportWhileContext ctx) {
      Boolean res =  visit(ctx.expr()); // true se for booleana
      if (!res) {
         System.err.println("Invalid boolean expression in the \"while\" statement inside the viewport definition.");
         ErrorHandling.registerError();
      } 
      for (int i = 0; i < ctx.viewportStat().size(); i++) {
         visit(ctx.viewportStat(i));
      }
      
      return res;
   }

   @Override public Boolean visitViewportIf(advParser.ViewportIfContext ctx) {
      Boolean res =  visit(ctx.expr()); // true se for booleana
      if (!res) {
         System.err.println("Invalid boolean expression in the \"if\" statement inside the viewport definition.");
         ErrorHandling.registerError();
      }
         for (int i = 0; i < ctx.viewportStat().size(); i++) {
         visit(ctx.viewportStat(i));
      }
      
      return res;
   }

   @Override public Boolean visitViewportFor(advParser.ViewportForContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitViewportInstructions(advParser.ViewportInstructionsContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitViewportInstructionsShowElement(advParser.ViewportInstructionsShowElementContext ctx) {
      Boolean res = null;
      String id, propertyKey, transitionText;
      Transitions current_transitions;
      if (ctx.transition() != null) {
         transitionText = ctx.transition().getText();
         if (!visit(ctx.transition())) {
            System.err.printf("Invalid transition '%s' on viewport 'show' instruction. It doesn't exist for automaton \"%s\".\n", transitionText, currentAutomatonString);
            ErrorHandling.registerError();
         }
      } else {       // ID propertyElement*
         id = ctx.ID().getText();
         if (currentSymbolTable.findSymbol(id) == null)
         {
            System.err.printf("Error: State '%s' not found in the 'show' statement inside viewport.\n", id);
            ErrorHandling.registerError();
         } else {
            for (int i = 0; i < ctx.propertyElement().size(); i++) {
               visit(ctx.propertyElement(i));
               propertyKey = valuesToString.get(ctx.propertyElement(i));
               if (!propertyKey.equals("accepting") && !propertyKey.equals("highlighted")) {
                  ErrorHandling.registerError();
                  System.err.printf("Invalid property key for show statament. Must be either 'accepting' or 'highlighted'.\n");
               }
            }
         }
      }


      return res;
   }

   @Override public Boolean visitPlayDef(advParser.PlayDefContext ctx) {
      Boolean res = null;
      String animationID = ctx.ID().getText();
      Symbol animationSymbol = globalSymbolTable.findSymbol(animationID);
      if (globalSymbolTable.containsSymbol(animationID)) {
         if (animationSymbol.type() == ANIMATION_TYPE) {
            System.err.printf("Error: Wrong type for variable \"%s\" in 'play' statement. Must be an animation.\n", animationID);
            ErrorHandling.registerError();
         }
      } else {
         System.err.printf("Error: Animation \"%s\" not found in 'play' statement.\n", animationID);
         ErrorHandling.registerError();
      }
      return res;
   }

   @Override public Boolean visitDecl(advParser.DeclContext ctx) {
      Boolean res = null;
      Type var_type = null;
      String curr_id, type_given;
      type_given = ctx.type().getText();
      if (type_given.equals("number"))
         var_type = NUMBER_TYPE;
      else if (type_given.equals("point"))
         var_type = POINT_TYPE;
      else if (type_given.equals("list"))
         var_type = LIST_TYPE;
      else if (type_given.equals("string"))
         var_type = STRING_TYPE;
      else if (type_given.equals("state"))
         var_type = STATE_TYPE;
      else if (type_given.equals("boolean"))
         var_type = BOOLEAN_TYPE;

      // TODO: Testar isto
      // Se houver assignment logo após declaração:
      if (ctx.assign().size() > 0) {
         for (int i = 0; i < ctx.assign().size(); i++) {
            curr_id = ctx.assign(i).ID().getText();
            // verificar se o ID a declarar já existe 
            if (currentSymbolTable.findSymbol(curr_id) == null) {
               declared_not_initialized.add(curr_id);
               currentSymbolTable.putSymbol(curr_id, new Symbol(var_type));
            }
            if (!visit(ctx.assign(i))) {   // retorna false se for um assignment invalido
               System.err.printf("Error: Invalid assignment for variable \"%s\".\n", curr_id);
               ErrorHandling.registerError();
            }
         }

      } else {    // se não houver assignment logo
         // declarar todos os IDs. exemplo: point p1, p2, p3;
         for (int i = 0; i < ctx.ID().size(); i++) {
            curr_id = ctx.ID(i).getText();
            // verificar se o ID a declarar já existe 
            if (currentSymbolTable.findSymbol(curr_id) == null) {
               declared_not_initialized.add(curr_id);
               currentSymbolTable.putSymbol(curr_id, new Symbol(var_type));
            }
         }
      }
      return res;
   }

   // TODO: return value
   @Override public Boolean visitAlgebricOP(advParser.AlgebricOPContext ctx) {
      Boolean res = null;
      // só fiz isto porque temos expr na gramatica
      if (ctx.decl() != null) {
         visit(ctx.decl());
      } else if (ctx.assign() != null) {
         visit(ctx.assign());
      }
      return res;
   }

   @Override public Boolean visitMultDivExpr(advParser.MultDivExprContext ctx) {
      Boolean res = null;
      visit(ctx.expr(0));     // visita a expressão da esquerda
      visit(ctx.expr(1));     // visita a expressão da direita
      String leftExprType, rightExprType;
      leftExprType = valuesToString.get(ctx.expr(0));
      rightExprType = valuesToString.get(ctx.expr(1));
      // Se forem do mesmo type, é valido
      if (leftExprType != null && rightExprType != null && leftExprType.equals(rightExprType)) {
         valuesToString.put(ctx, leftExprType); // leftexprtype ou rightexprtype é a mesma coisa
      } else {
         System.err.printf("Error: Incompatible types in multiplication/division operation. Left expression is '%s' and right is '%s'.\n", leftExprType, rightExprType);
         ErrorHandling.registerError();
      }
      return res;
   }

   @Override public Boolean visitAndExpr(advParser.AndExprContext ctx) {
      Boolean res = false;
      Boolean expr0 = visit(ctx.expr(0));
      Boolean expr1 = visit(ctx.expr(1));
      // devolve true se for uma expressão "OR" válida, com 2 expressões booleanas
      if (expr0 != null && expr1 != null && expr0 && expr1) res = true;
      
      return res;
   }

   @Override public Boolean visitIDExpr(advParser.IDExprContext ctx) {
      Boolean res = null;
      Symbol idSymbol = currentSymbolTable.findSymbol(ctx.ID().getText());
      if (idSymbol != null)
      {
         if (idSymbol.type() == POINT_TYPE)
            valuesToString.put(ctx, "point");
         else if (idSymbol.type() == NUMBER_TYPE)
            valuesToString.put(ctx, "number");
         else if (idSymbol.type() == STRING_TYPE)
            valuesToString.put(ctx, "string");
      }
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitPointExpr(advParser.PointExprContext ctx) {
      Boolean res = null;
      valuesToString.put(ctx, "point");
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitUnaryExpr(advParser.UnaryExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitParanthesisExpr(advParser.ParanthesisExprContext ctx) {
      Boolean res = null;
      String exprType;
      visit(ctx.expr());
      // o valor guardado pelo ctx.expr em valuesToString 
      // vai ser passado pelo ctx atual, pois apenas adiciona parentesis à volta
      exprType = valuesToString.get(ctx.expr());
      if (exprType != null) {
         valuesToString.put(ctx, exprType);
      }
      return res;
   }

   @Override public Boolean visitOrExpr(advParser.OrExprContext ctx) {
      Boolean res = false;
      Boolean expr0 = visit(ctx.expr(0));
      Boolean expr1 = visit(ctx.expr(1));
      // devolve true se for uma expressão "OR" válida, com 2 expressões booleanas
      if (expr0 != null && expr1 != null && expr0 && expr1) res = true;
      
      return res;
   }

   @Override public Boolean visitEqualsExpr(advParser.EqualsExprContext ctx) {
      Boolean res = false;
      visit(ctx.expr(0));
      visit(ctx.expr(1));
      String leftExpr = valuesToString.get(ctx.expr(0));
      String rightExpr = valuesToString.get(ctx.expr(1));
      // nesta linha verifico se a expr da esquerda e a expr da direita são validas,
      // e caso sejam, vejo se são do mesmo type, que é o que valuesToString tem
      // ou seja, apenas é valido fazer, por exemplo, POINT > POINT, ou NUMBER > NUMBER
      if (leftExpr != null && rightExpr != null && leftExpr.equals(rightExpr)) res = true;
      return res;
   }

   // TODO: scope do state
   // (ID) irá representar o ponto em que se encontra um state
   @Override public Boolean visitParanthesisIDExpr(advParser.ParanthesisIDExprContext ctx) {
      Boolean res = null;
      String stateID = ctx.ID().getText();
      Symbol state_symbol = currentSymbolTable.findSymbol(stateID);
      if (state_symbol != null && state_symbol.type() == STATE_TYPE) {
         valuesToString.put(ctx, "point");
      }
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitNumberExpr(advParser.NumberExprContext ctx) {
      Boolean res = null;
      valuesToString.put(ctx, "number");
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitReadExpr(advParser.ReadExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitCompareExpr(advParser.CompareExprContext ctx) {
      Boolean res = false;
      visit(ctx.expr(0));
      visit(ctx.expr(1));
      String leftExpr = valuesToString.get(ctx.expr(0));
      String rightExpr = valuesToString.get(ctx.expr(1));
      // nesta linha verifico se a expr da esquerda e a expr da direita são validas,
      // e caso sejam, vejo se são do mesmo type, que é o que valuesToString tem
      // ou seja, apenas é valido fazer, por exemplo, POINT > POINT, ou NUMBER > NUMBER
      if (leftExpr != null && rightExpr != null && leftExpr.equals(rightExpr)) res = true;
      return res;
   }

   // Devolve true se for tiver uma expressão booleana e false se não
   @Override public Boolean visitNotExpr(advParser.NotExprContext ctx) {
      Boolean res = false; // devolve true se for booleana (porque eu decidi assim)
      Boolean expr = visit(ctx.expr());
      if (expr != null && expr) res = true;
      return res;
   }

   @Override public Boolean visitListExpr(advParser.ListExprContext ctx) {
      Boolean res = null;
      // USADO NO AUTOMATONFOR para verificar se Expr é uma lista
      valuesToString.put(ctx, "list");
      return res;
   }

   @Override public Boolean visitAddSubExpr(advParser.AddSubExprContext ctx) {
      Boolean res = null;
      visit(ctx.expr(0));     // visita a expressão da esquerda
      visit(ctx.expr(1));     // visita a expressão da direita
      String leftExprType, rightExprType;
      leftExprType = valuesToString.get(ctx.expr(0));
      rightExprType = valuesToString.get(ctx.expr(1));
      // Se forem do mesmo type, é valido
      if (leftExprType != null && rightExprType != null && leftExprType.equals(rightExprType)) {
         valuesToString.put(ctx, leftExprType); // leftexprtype ou rightexprtype é a mesma coisa
      } else {
         System.err.printf("Error: Incompatible types in addition/subtraction operation. Left expression is '%s' and right is '%s'.\n", leftExprType, rightExprType);
         ErrorHandling.registerError();
      }
      // remover de valuesToString (para poupar memoria)
      valuesToString.removeFrom(ctx.expr(0));
      valuesToString.removeFrom(ctx.expr(1));
      return res;
   }

   @Override public Boolean visitAssign(advParser.AssignContext ctx) {
      Boolean res = true;
      visit(ctx.expr());
      String exprType, id_to_assign;
      id_to_assign = ctx.ID().getText();
      exprType = valuesToString.get(ctx.expr());
      Symbol id_symbol = currentSymbolTable.findSymbol(id_to_assign);
      if (id_symbol != null && exprType != null) {
         // Verificar se 'expr' é consistente com o type declarado
         if (id_symbol.type() == POINT_TYPE) {
            if (!exprType.equals("point")) {
               System.err.printf("Error: Invalid type '%s' for variable \"%s\". Expected \"%s\".\n", exprType, id_to_assign, id_symbol.type().name());
               ErrorHandling.registerError();
               res = false;
            }
         } else if (id_symbol.type() == NUMBER_TYPE) {
            if (!exprType.equals("number")) {
               System.err.printf("Error: Invalid type '%s' for variable \"%s\". Expected \"%s\".\n", exprType, id_to_assign, id_symbol.type().name());
               res = false;
               ErrorHandling.registerError();
            }
         } else if (id_symbol.type() == LIST_TYPE) {
            if (!exprType.equals("list")) {
               System.err.printf("Error: Invalid type '%s' for variable \"%s\". Expected \"%s\".\n", exprType, id_to_assign, id_symbol.type().name());
               res = false;
               ErrorHandling.registerError();
            }
         } else if (id_symbol.type() == STRING_TYPE) {
            if (!exprType.equals("string")) {
               System.err.printf("Error: Invalid type '%s' for variable \"%s\". Expected \"%s\".\n", exprType, id_to_assign, id_symbol.type().name());
               res = false;
               ErrorHandling.registerError();
            }
         } else if (id_symbol.type() == STATE_TYPE) {
            // TODO: acho que é impossivel assignment em state_types mas ya, tenho de perguntar
            if (!exprType.equals("string")) {
               System.err.printf("Error: Invalid type '%s' for variable \"%s\". Expected \"%s\".\n", exprType, id_to_assign, id_symbol.type().name());
               res = false;
               ErrorHandling.registerError();
            }
         } else if (id_symbol.type() == BOOLEAN_TYPE) {
            // TODO: fazer isto
            ;
         } 

      }
      // se o assign tiver sucesso, remover de declared_not_initialized
      if (declared_not_initialized.contains(id_to_assign)) {
         if (res) {
            declared_not_initialized.remove(id_to_assign);
         }
      }
      return res;
   }

   @Override public Boolean visitList(advParser.ListContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitPoint(advParser.PointContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitPointRect(advParser.PointRectContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }
   // TODO: fazer isto 
   @Override public Boolean visitPointPol(advParser.PointPolContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitType(advParser.TypeContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitGridProperties(advParser.GridPropertiesContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitPropertiesKeys(advParser.PropertiesKeysContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }
   
   public static boolean validAlignProperty(String property)
   {
      List<String> possibleProperties = new ArrayList<>(Arrays.asList(
         "below ",
         "above",
         "right ",
         "left ",
         "above left ",
         "above right",
         "below left ",
         "below right "
         ));
      return possibleProperties.contains(property);
   }

   public static boolean isValidBoolean(String property)
   {
      List<String> possibleProperties = new ArrayList<>(Arrays.asList(
         "and",
         "not",
         "or",
         "lesser",
         "greater",
         "greater or equal",
         "equals"
         ));
      return possibleProperties.contains(property);
   }
}
