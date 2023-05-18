import org.stringtemplate.v4.*;
import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.tree.*;


@SuppressWarnings("CheckReturnValue")
public class compilerSimple extends advBaseVisitor<ST> {

   private STGroup templates = new STGroupFile("python.stg");
   private ParseTreeProperty<LinkedList<String>> decl = new ParseTreeProperty();
   

   private HashMap<String,String> var = new HashMap();
   private int numVar=0;

   private String newVar() {
      return "v" + numVar++;
   }

   private String getVar(String v){
      if(var.containsKey(v))
         return var.get(v);
      return "";
   }

   private void setVar(String v1,String v2){
      var.put(v1,v2);
   }

   @Override public ST visitProgram(advParser.ProgramContext ctx) {
      ST res = templates.getInstanceOf("module");
      for(advParser.StatContext c : ctx.stat()){
         ST st = visit(c);
         if(st!=null)
            res.add("stat", st.render());
      }
      return res;
   }

   @Override public ST visitImportstat(advParser.ImportstatContext ctx) {
      ST res = templates.getInstanceOf("module");
      res.add("file",ctx.ID().getText());
      return res;
   }

   @Override public ST visitAutomatonNFADef(advParser.AutomatonNFADefContext ctx) {

      ST res = templates.getInstanceOf("stats");
      ST ass = templates.getInstanceOf("assign");
      ST aut = templates.getInstanceOf("automaton");
      aut.add("name",ctx.ID().getText());

      String var = newVar();
      setVar(ctx.ID().getText(), var);
      ass.add("var",var);

      for(advParser.StateDefContext c : ctx.stateDef()){
         res.add("stat", visit(c).render());
         for(String s : decl.get(c))
            aut.add("state",s);
      }

      for(advParser.AutomatonStatContext c : ctx.automatonStat()){ 
         res.add("stat", visit(c).render());
      }

      res.add("stat", visit(ctx.transitionDef()).render());
      for(String s : decl.get(ctx.transitionDef()))
         aut.add("transition",s);

      ass.add("value",aut.render());
      res.add("stat",ass.render());
      return res;
   }

   @Override public ST visitAutomatonDFADef(advParser.AutomatonDFADefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST ass = templates.getInstanceOf("assign");
      ST aut = templates.getInstanceOf("automaton");
      aut.add("name",ctx.ID().getText());

      String var = newVar();
      setVar(ctx.ID().getText(), var);
      ass.add("var",var);

      for(advParser.StateDefContext c : ctx.stateDef()){
         res.add("stat", visit(c).render());
         for(String s : decl.get(c))
            aut.add("state",s);
      }

      for(advParser.AutomatonStatContext c : ctx.automatonStat()){ 
         res.add("stat", visit(c).render());
      }

      res.add("stat", visit(ctx.transitionDef()).render());
      for(String s : decl.get(ctx.transitionDef()))
         aut.add("transition",s);

      ass.add("value",aut.render());
      res.add("stat",ass.render());
      return res;
   }

   @Override public ST visitAutomatonFor(advParser.AutomatonForContext ctx) {
      ST res = templates.getInstanceOf("forIn");
      String loopVar = newVar();
      setVar(ctx.ID().getText(), loopVar);
      res.add("var",loopVar);
      res.add("list",decl.get(ctx.expr()).get(0));

      for(advParser.AutomatonStatContext c : ctx.automatonStat())
         res.add("stat", visit(c).render());

      return res;
   }

   @Override public ST visitAutomatonWhile(advParser.AutomatonWhileContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitAutomatonIf(advParser.AutomatonIfContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitStateDef(advParser.StateDefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      LinkedList<String> states = new LinkedList<>();
      for(TerminalNode c : ctx.ID()){
         ST ass = templates.getInstanceOf("assign");
         ST state = templates.getInstanceOf("state");
         String var = newVar();
         ass.add("var",var);
         setVar(c.getText(), var);
         states.add(var);
         state.add("label",c.getText());
         ass.add("value",state.render());
         res.add("stat",ass.render());
      }
      decl.put(ctx,states);
      return res;
   }

   @Override public ST visitPropertiesDef(advParser.PropertiesDefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      String var = getVar(ctx.ID().getText());
      for(advParser.PropertyElementContext c : ctx.propertyElement()){
         ST setP = templates.getInstanceOf("setP");
         setP.add("var",var);
         setP.add("prop",c.propertiesKeys().prop.getText());
         List<TerminalNode> ids = c.ID(); 
         if(ids!=null)
            for(TerminalNode n : ids)
               setP.add("value",n.getText());
         else
            setP.add("value",c.Number().getText());
         res.add("stat",setP.render());
      }
      return res;
   }

   @Override public ST visitTransitionDef(advParser.TransitionDefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      LinkedList<String> l = new LinkedList<>();
      for(advParser.TransitionElementContext c: ctx.transitionElement()){
         res.add("stat",visit(c).render());
         l.add(decl.get(c).get(0));
      }
      decl.put(ctx,l);
      return res;
   }

   @Override public ST visitTransitionElement(advParser.TransitionElementContext ctx) {
      ST res = templates.getInstanceOf("assign");
      ST transition = templates.getInstanceOf("transition");
      String var = newVar();
      LinkedList l = new LinkedList<String>();
      l.add(var);
      decl.put(ctx,l);
      res.add("var",var);
      for(TerminalNode n : ctx.SYMBOL())
         transition.add("label",n.getText());
      String startSt = getVar(ctx.ID(0).getText());
      String endSt = getVar(ctx.ID(1).getText());
      transition.add("stateStart",startSt);
      transition.add("stateEnd",endSt);
      res.add("value",transition.render());
      return res;
   }

   @Override public ST visitViewDef(advParser.ViewDefContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewStat(advParser.ViewStatContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewFor(advParser.ViewForContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewWhile(advParser.ViewWhileContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewIf(advParser.ViewIfContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitTransitionRedefine(advParser.TransitionRedefineContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitTransitionPoint(advParser.TransitionPointContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitTransitionLabelAlter(advParser.TransitionLabelAlterContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitTransition(advParser.TransitionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitPlaceDef(advParser.PlaceDefContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitPlaceElement(advParser.PlaceElementContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitGridDef(advParser.GridDefContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitGridOptions(advParser.GridOptionsContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitAnimationDef(advParser.AnimationDefContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewportDef(advParser.ViewportDefContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewportOn(advParser.ViewportOnContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewportStat(advParser.ViewportStatContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewportWhile(advParser.ViewportWhileContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewportIf(advParser.ViewportIfContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewportFor(advParser.ViewportForContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewportInstructions(advParser.ViewportInstructionsContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitViewportInstructionsShowElement(advParser.ViewportInstructionsShowElementContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitPlayDef(advParser.PlayDefContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitDecl(advParser.DeclContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitAlgebricOP(advParser.AlgebricOPContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitMultDivExpr(advParser.MultDivExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitAndExpr(advParser.AndExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitIDExpr(advParser.IDExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitPointExpr(advParser.PointExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitUnaryExpr(advParser.UnaryExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitParanthesisExpr(advParser.ParanthesisExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitOrExpr(advParser.OrExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitEqualsExpr(advParser.EqualsExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitParanthesisIDExpr(advParser.ParanthesisIDExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitNumberExpr(advParser.NumberExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitReadExpr(advParser.ReadExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitCompareExpr(advParser.CompareExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitNotExpr(advParser.NotExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitListExpr(advParser.ListExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitAddSubExpr(advParser.AddSubExprContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitAssign(advParser.AssignContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitList(advParser.ListContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitPoint(advParser.PointContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitPointRect(advParser.PointRectContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitPointPol(advParser.PointPolContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitType(advParser.TypeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitGridProperties(advParser.GridPropertiesContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitPropertiesKeys(advParser.PropertiesKeysContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }
}
