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
   // ParseTreeProperty usada para passar os simbolos de alphabetElement para alphabetDef,
   // é capaz de ser boa ideia mudar isto, está ineficiente
   private ParseTreeProperty<ArrayList<Character>> alphabetValues = new ParseTreeProperty<>();
   private ParseTreeProperty<String> valuesToString = new ParseTreeProperty<>();
   // alphabetChars vai ter os carateres do alfabeto
   private ArrayList<Character> alphabetChars;
   private SymbolTable globalSymbolTable = new SymbolTable(null);
   private SymbolTable currentSymbolTable = globalSymbolTable;
   private int numInitialStates = 0;
   private int numAcceptingStates = 0;


   @Override public Boolean visitProgram(advParser.ProgramContext ctx) {
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

   @Override public Boolean visitAutomatonNFADef(advParser.AutomatonNFADefContext ctx) {
      Boolean res = true;
      numInitialStates = 0;
      numAcceptingStates = 0;
      int i;
      Type automatonType = NFA_TYPE;

      String symbolName = ctx.ID().getText();
      // Verificar se automato com este ID já foi definido, se foi, então houve erro
      if (globalSymbolTable.containsSymbol(symbolName)) {
         ErrorHandling.registerError();
         res = false;
      } else 
         globalSymbolTable.putSymbol(symbolName, new Symbol(automatonType));

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
      } else
         automatonType = DFA_TYPE;

      String symbolName = ctx.ID().getText();
      // Verificar se automato com este ID já foi definido, se foi, então houve erro
      if (globalSymbolTable.containsSymbol(symbolName)) {
         ErrorHandling.registerError();
         res = false;
      } else 
         globalSymbolTable.putSymbol(symbolName, new Symbol(automatonType));

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
      if (ctx.automatonFor() != null) {
         visit(ctx.automatonFor());
         System.out.println("\n\n Há um for \n\n");
      } else if (ctx.automatonIf() != null)
         visit(ctx.automatonIf());
      else if (ctx.automatonWhile() != null)
         visit(ctx.automatonWhile());
      else if (ctx.propertiesDef() != null)
         visit(ctx.propertiesDef());
      
      return res;
   }

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

   // TODO: expr tem de ser boolean ofc
   @Override public Boolean visitAutomatonWhile(advParser.AutomatonWhileContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAutomatonIf(advParser.AutomatonIfContext ctx) {
      Boolean res = null;
      // expr em automatonIf tem de ser uma expressão booleana
      visit(ctx.expr());
      return res;
   }

   // TODO: quando verifico se o state já existe, devo verificar tambem na globalsymboltable
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

   // TODO: mudar containsSymbol para lookup
   @Override public Boolean visitPropertiesDef(advParser.PropertiesDefContext ctx) {
      Boolean res = null;
      String stateID = ctx.ID().getText();
      System.out.println("State id in propertiesDef: " + stateID);
      if (!currentSymbolTable.containsSymbol(ctx.ID().getText())) {
         System.err.printf("Can't define property for state \"%s\". Symbol not found.\n", stateID);
         ErrorHandling.registerError();
      } else {
         for (int i = 0; i < ctx.propertyElement().size(); i++)
         {
            visit(ctx.propertyElement(i));
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
      //System.err.println("Property key: "  + propertyKey);
      //System.err.println("Property Value: " + propertyValue);

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
      } else if (propertyKey.equals("accepting")) {
         if (!propertyValue.equals("true ") && !propertyValue.equals("false ")) {
            System.err.printf("Invalid property value for \"%s\" as propertyKey - \"%s\"\n", propertyKey, propertyValue);
            ErrorHandling.registerError();
         } else {
            numAcceptingStates++;
         }
      } else if (propertyKey.equals("align")) {
         if (validAlignProperty(propertyValue)) {
            System.err.println("Invalid property value for \"" + propertyKey + "\" as propertyKey");
            ErrorHandling.registerError();
         } 

      } else if (propertyKey.equals("slope")) {
         // Tem de ser um valor numerico (mas não sei se inclui 0)
         if (!propertyValue.matches("[1-9][0-9]*")) {
            System.err.println("Invalid property value for \"" + propertyKey + "\" as propertyKey");
            ErrorHandling.registerError();
         } 
      } else if (propertyKey.equals("highlighted")) {
         if (!propertyValue.equals("true ") && !propertyValue.equals("false ")) {
            System.err.println("Invalid property value for \"" + propertyKey + "\" as propertyKey");
            ErrorHandling.registerError();
         } 
      }
      return res;
   }

   @Override public Boolean visitTransitionDef(advParser.TransitionDefContext ctx) {
      Boolean res = null;

      for (int i = 0; i < ctx.transitionElement().size(); i++)
      {
         visit(ctx.transitionElement(i));
      }
      return res;
   }

   // TODO: Condições de NFA/DFA/Complete DFA (em termos de aparecer simbolos repetidos e etc)
   @Override public Boolean visitTransitionElement(advParser.TransitionElementContext ctx) {
      Boolean res = null;
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
         System.err.printf("Automaton ID not found - \"%d\"\n", automatonID);
         ErrorHandling.registerError();
      }
      if (automatonSymbol.type().subtype(AUTOMATON_TYPE)) {
         System.err.printf("Invalid type for automaton given.\n");
         ErrorHandling.registerError();
      }
      return res;
   }


   @Override public Boolean visitViewStat(advParser.ViewStatContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitViewFor(advParser.ViewForContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTransitionRedefine(advParser.TransitionRedefineContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTransitionPoint(advParser.TransitionPointContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTransitionLabelAlter(advParser.TransitionLabelAlterContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTransition(advParser.TransitionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitPlaceDef(advParser.PlaceDefContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitPlaceElement(advParser.PlaceElementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitGridDef(advParser.GridDefContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitGridOptions(advParser.GridOptionsContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
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
      return visitChildren(ctx);
      //return res;
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

   @Override public Boolean visitAndExpr(advParser.AndExprContext ctx) {
      Boolean res = null;
      // VERIFICAR QUE ctx.expr(0) e ctx.expr(1) são boolean tambem
      // TODO: problema -> expr pode derivar em exprs infinitamente e têm de ser todos boolean
      // ou seja, provavelmente tenho de usar os returns

      //return res;
   }

   @Override public Boolean visitMultDivExpr(advParser.MultDivExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitIDExpr(advParser.IDExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitPointExpr(advParser.PointExprContext ctx) {
      Boolean res = null;
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
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitBiggerOrEqualExpr(advParser.BiggerOrEqualExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitSmallerExpr(advParser.SmallerExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitEqualsExpr(advParser.EqualsExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitParanthesisIDExpr(advParser.ParanthesisIDExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitNumberExpr(advParser.NumberExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitReadExpr(advParser.ReadExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitBiggerExpr(advParser.BiggerExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitSmallerOrEqualExpr(advParser.SmallerOrEqualExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitNotExpr(advParser.NotExprContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitListExpr(advParser.ListExprContext ctx) {
      Boolean res = null;

      // USADO NO AUTOMATONFOR para verificar se Expr é uma lista
      valuesToString.put(ctx, "list");
      return visitChidren(ctx);
      //return res;
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
         "equals",
         ));
      return possibleProperties.contains(property);
   }
}
