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
   protected static final Type STATE_TYPE = new StateType();
   protected static final Type STRING_TYPE = new StringType();
   protected static final Type POINT_TYPE = new PointType();
   protected static final Type NUMBER_TYPE = new NumberType();

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

   // TODO: mudar containsSymbol para findSymbol
   @Override public Boolean visitPropertiesDef(advParser.PropertiesDefContext ctx) {
      Boolean res = null;
      String stateID = ctx.ID().getText();
      String propertyKey;
      if (!currentSymbolTable.containsSymbol(ctx.ID().getText())) {
         System.err.printf("Can't define property for state \"%s\". Symbol not found.\n", stateID);
         ErrorHandling.registerError();
      } else {
         for (int i = 0; i < ctx.propertyElement().size(); i++)
         {
            visit(ctx.propertyElement(i));
            propertyKey = valuesToString.get(ctx.propertyElement(i));
            // TODO: será só isto??
            if (!propertyKey.equals("initial") && !propertyKey.equals("accepting"))
            {
               ErrorHandling.registerError();
               System.err.printf("Invalid property key for state \"%s\", must be either 'accepting' or 'initial'.\n", stateID);
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
      }
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
         currentAutomatonString = automatonID;
      }

      // apenas correr o resto do codigo da view se for valido
      if (!currentAutomatonString.isEmpty())
         visitChildren(ctx);
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
            if 
         }
      } else {    // transitionLabelAlter
         if (!visit(ctx.transitionLabelAlter()))
            ret = false;
      }
      return res;
   }

   @Override public Boolean visitTransitionPoint(advParser.TransitionPointContext ctx) {
      Boolean res = true;
      visit(ctx.expr());
      String exprValue, propertyKey;
      exprValue = valuesToString.get(ctx.expr());
      if (!exprValue.equals("point"))
      {
         ErrorHandling.registerError();
         System.err.printf("Invalid point in transition redefinition. Must be of 'point' type.\n");
         ret = false;
      }
      if (ctx.propertyElement() != null)
         for (int i = 0; i < ctx.propertyElement().size() ; i++) {
            visit(ctx.propertyElement(i));
            propertyKey = valuesToString.get(ctx.propertyElement(i));
            if (!propertyKey.equals("align")) {
               ErrorHandling.registerError();
               System.err.printf("Invalid property key for show statament. Must be either 'accepting' or 'highlighted'.\n");
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
         visit(ctx.propertyElement());
         if (!valuesToString.get(ctx.propertyElement()).equals("align"))
         {
            ErrorHandling.registerError();
            System.err.printf("Invalid property key for transition \"%s\", must be 'align'.\n", transitionText);
            res = false;
         }
      }
      return res;
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

   @Override public Boolean visitPlaceElement(advParser.PlaceElementContext ctx) {
      Boolean res = null;
      // Verificar que ID existe e é um state
      // TODO: cuidado com o scope, symbol table para encontrar o state 
      String exprType;

      if (ctx.ID() != null) {    // ID at expr
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
      } else {    // transitionLabelAlter at expr
         if (visit(ctx.transitionLabelAlter())) {
            visit(ctx.expr());
            System.out.println("Cheguei aqui rats");
            exprType = valuesToString.get(ctx.expr());
            if (exprType == null || !exprType.equals("point"))
            {
               ErrorHandling.registerError();
               System.err.printf("Invalid expression while trying to place the label of a state.\n");
            }
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
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitViewportDef(advParser.ViewportDefContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitViewportOn(advParser.ViewportOnContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitViewportStat(advParser.ViewportStatContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitViewportWhile(advParser.ViewportWhileContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitViewportIf(advParser.ViewportIfContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
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
      String id, propertyKey;
      // TODO: falta fazer isto da transition
      if (ctx.transition() != null) {
         ;
      } else {       // ID propertyElement*
         id = ctx.ID().getText();
         if (currentSymbolTable.findSymbol(id) == null)
         {
            System.err.printf("State '%s' not found in the 'show' statement inside viewport.\n", id);
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
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitDecl(advParser.DeclContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAlgebricOP(advParser.AlgebricOPContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitMultDivExpr(advParser.MultDivExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
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
      return visitChildren(ctx);
      //return res;
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

   @Override public Boolean visitParanthesisIDExpr(advParser.ParanthesisIDExprContext ctx) {
      Boolean res = null;
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
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAssign(advParser.AssignContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
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
