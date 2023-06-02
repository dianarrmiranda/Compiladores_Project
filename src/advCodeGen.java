import org.stringtemplate.v4.*;
import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import java.util.LinkedList;
import java.util.List;

import javax.smartcardio.TerminalFactory;

import org.antlr.v4.runtime.tree.*;

@SuppressWarnings("CheckReturnValue")
public class advCodeGen extends advBaseVisitor<ST> {

   private STGroup templates = new STGroupFile("python.stg");
   private ParseTreeProperty<LinkedList<String>> decl = new ParseTreeProperty();

   private HashMap<String, String> var = new HashMap();
   private int numVar = 0;

   private String newVar() {
      return "v" + numVar++;
   }

   private String getVar(String v) {
      if (var.containsKey(v))
         return var.get(v);
      return "";
   }

   private void setVar(String v1, String v2) {
      var.put(v1, v2);
   }

   @Override
   public ST visitProgram(advParser.ProgramContext ctx) {
      ST res = templates.getInstanceOf("module");
      for (advParser.StatContext c : ctx.stat()) {
         ST st = visit(c);
         if (st != null)
            res.add("stat", st.render());
      }
      return res;
   }

   @Override
   public ST visitImportstat(advParser.ImportstatContext ctx) {
      ST res = templates.getInstanceOf("module");
      res.add("file", ctx.ID().getText());
      return res;
   }

   @Override
   public ST visitAutomatonNFADef(advParser.AutomatonNFADefContext ctx) {

      ST res = templates.getInstanceOf("stats");
      ST ass = templates.getInstanceOf("assign");
      ST aut = templates.getInstanceOf("automaton");
      aut.add("name", ctx.ID().getText());

      String var = newVar();
      setVar(ctx.ID().getText(), var);
      ass.add("var", var);

      for (advParser.StateDefContext c : ctx.stateDef()) {
         res.add("stat", visit(c).render());
         for (String s : decl.get(c))
            aut.add("state", s);
      }

      for (advParser.AutomatonStatContext c : ctx.automatonStat()) {
         res.add("stat", visit(c).render());
      }

      res.add("stat", visit(ctx.transitionDef()).render());
      for (String s : decl.get(ctx.transitionDef()))
         aut.add("transition", s);

      ass.add("value", aut.render());
      res.add("stat", ass.render());
      return res;
   }

   @Override
   public ST visitAutomatonDFADef(advParser.AutomatonDFADefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST ass = templates.getInstanceOf("assign");
      ST aut = templates.getInstanceOf("automaton");
      aut.add("name", ctx.ID().getText());

      String var = newVar();
      setVar(ctx.ID().getText(), var);
      ass.add("var", var);

      for (advParser.StateDefContext c : ctx.stateDef()) {
         res.add("stat", visit(c).render());
         for (String s : decl.get(c))
            aut.add("state", s);
      }

      for (advParser.AutomatonStatContext c : ctx.automatonStat()) {
         res.add("stat", visit(c).render());
      }

      res.add("stat", visit(ctx.transitionDef()).render());
      for (String s : decl.get(ctx.transitionDef()))
         aut.add("transition", s);

      ass.add("value", aut.render());
      res.add("stat", ass.render());
      return res;

   }

   @Override
   public ST visitAutomatonFor(advParser.AutomatonForContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST forV = templates.getInstanceOf("forIn");

      res.add("stat", visit(ctx.expr()).render());

      String loopVar = newVar();
      setVar(ctx.ID().getText(), loopVar);
      forV.add("var", loopVar);
      forV.add("list", decl.get(ctx.expr()).get(0));

      for (advParser.AutomatonStatContext c : ctx.automatonStat())
         forV.add("stat", visit(c).render());

      res.add("stat", forV.render());
      return res;
   }

   @Override
   public ST visitAutomatonWhile(advParser.AutomatonWhileContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST wh = templates.getInstanceOf("while");
      String expr = visit(ctx.expr()).render();
      res.add("stat", expr);
      wh.add("expr", decl.get(ctx.expr()).get(0));

      for (advParser.AutomatonStatContext c : ctx.automatonStat())
         wh.add("stat", visit(c).render());

      wh.add("stat", expr);
      res.add("stat", wh.render());
      return res;
   }

   @Override
   public ST visitAutomatonIf(advParser.AutomatonIfContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST xif = templates.getInstanceOf("if");
      res.add("stat", visit(ctx.expr()).render());
      xif.add("expr", decl.get(ctx.expr()).get(0));
      for (advParser.AutomatonStatContext c : ctx.automatonStat())
         xif.add("stat", visit(c).render());

      res.add("stat", xif.render());
      if (ctx.automatonElse() != null)
         res.add("stat", visit(ctx.automatonElse()).render());

      return res;
   }

   @Override
   public ST visitAutomatonElse(advParser.AutomatonElseContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST el = templates.getInstanceOf("else");
      for (advParser.AutomatonStatContext c : ctx.automatonStat())
         el.add("stat", visit(c).render());

      res.add("stat", el.render());
      return res;
   }

   @Override
   public ST visitStateDef(advParser.StateDefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      LinkedList<String> states = new LinkedList<>();
      for (TerminalNode c : ctx.ID()) {
         ST ass = templates.getInstanceOf("assign");
         ST state = templates.getInstanceOf("state");
         String var = newVar();
         ass.add("var", var);
         setVar(c.getText(), var);
         states.add(var);
         state.add("label", c.getText());
         ass.add("value", state.render());
         res.add("stat", ass.render());
      }
      decl.put(ctx, states);
      return res;
   }

   @Override
   public ST visitPropertiesDef(advParser.PropertiesDefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      String var = getVar(ctx.ID().getText());
      for (advParser.PropertyElementContext c : ctx.propertyElement()) {
         curElementProp = var;
         res.add("stat", visit(c).render());
      }
      return res;
   }

   String curElementProp = "";

   @Override
   public ST visitPropertyElement(advParser.PropertyElementContext ctx) {
      ST res = templates.getInstanceOf("setP");

      res.add("var", curElementProp);
      res.add("prop", ctx.propertiesKeys().prop.getText());

      if (ctx.ID().size() != 0) {
         String r = "'";
         for (TerminalNode n : ctx.ID())
            r += n.getText() + " ";
         r += "'";
         res.add("value", r);
      } else
         res.add("value", ctx.Number().getText());

      return res;
   }

   @Override
   public ST visitTransitionDef(advParser.TransitionDefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      LinkedList<String> l = new LinkedList<>();
      for (advParser.TransitionElementContext c : ctx.transitionElement()) {
         res.add("stat", visit(c).render());
         l.add(decl.get(c).get(0));
      }
      decl.put(ctx, l);

      return res;
   }

   @Override
   public ST visitTransitionElement(advParser.TransitionElementContext ctx) {
      ST res = templates.getInstanceOf("assign");
      ST transition = templates.getInstanceOf("transition");
      String var = newVar();
      LinkedList l = new LinkedList<String>();
      l.add(var);
      decl.put(ctx, l);
      res.add("var", var);
      for (TerminalNode n : ctx.SYMBOL())
         transition.add("label", n.getText().replace("'", ""));
      String startSt = getVar(ctx.ID(0).getText());
      String endSt = getVar(ctx.ID(1).getText());
      transition.add("stateStart", startSt);
      transition.add("stateEnd", endSt);
      res.add("value", transition.render());
      return res;
   }

   private String curView;

   @Override
   public ST visitViewDef(advParser.ViewDefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST ass = templates.getInstanceOf("assign");
      ST view = templates.getInstanceOf("view");

      String var = newVar();
      setVar(ctx.ID(0).getText(), var);
      ass.add("var", var);
      view.add("name", ctx.ID(0).getText());
      view.add("automaton", getVar(ctx.ID(1).getText()));
      ass.add("value", view.render());
      res.add("stat", ass.render());

      curView = var;

      for (advParser.ViewStatContext c : ctx.viewStat()) {
         ST s = visit(c);
         if (s != null)
            res.add("stat", s.render());
      }

      return res;
   }

   @Override
   public ST visitViewFor(advParser.ViewForContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST forV = templates.getInstanceOf("forIn");

      res.add("stat", visit(ctx.expr()));

      String loopVar = newVar();
      setVar(ctx.ID().getText(), loopVar);
      forV.add("var", loopVar);
      forV.add("list", decl.get(ctx.expr()).get(0));

      for (advParser.ViewStatContext c : ctx.viewStat())
         forV.add("stat", visit(c).render());

      res.add("stat", forV.render());
      return res;
   }

   @Override
   public ST visitViewWhile(advParser.ViewWhileContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST wh = templates.getInstanceOf("while");
      String expr = visit(ctx.expr()).render();
      res.add("stat", expr);
      wh.add("expr", decl.get(ctx.expr()).get(0));

      for (advParser.ViewStatContext c : ctx.viewStat())
         wh.add("stat", visit(c).render());

      wh.add("stat", expr);
      res.add("stat", wh.render());
      return res;
   }

   @Override
   public ST visitViewIf(advParser.ViewIfContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST xif = templates.getInstanceOf("if");
      res.add("stat", visit(ctx.expr()).render());
      xif.add("expr", decl.get(ctx.expr()).get(0));
      for (advParser.ViewStatContext c : ctx.viewStat())
         xif.add("stat", visit(c).render());

      res.add("stat", xif.render());
      if (ctx.viewElse() != null)
         res.add("stat", visit(ctx.viewElse()).render());
      return res;
   }

   @Override
   public ST visitViewElse(advParser.ViewElseContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST el = templates.getInstanceOf("else");
      for (advParser.ViewStatContext c : ctx.viewStat())
         el.add("stat", visit(c).render());

      res.add("stat", el.render());
      return res;
   }

   @Override
   public ST visitViewportFor(advParser.ViewportForContext ctx) {
      onFor = true;
      ST res = templates.getInstanceOf("stats");
      ST forV = templates.getInstanceOf("forIn");

      res.add("stat", visit(ctx.expr()));

      String loopVar = newVar();
      setVar(ctx.ID().getText(), loopVar);
      forV.add("var", loopVar);
      forV.add("list", decl.get(ctx.expr()).get(0));

      for (advParser.ViewportStatContext c : ctx.viewportStat())
         forV.add("stat", visit(c).render());

      res.add("stat", forV.render());
      onFor=false;
      return res;
   }

   @Override
   public ST visitViewportWhile(advParser.ViewportWhileContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST wh = templates.getInstanceOf("while");
      String expr = visit(ctx.expr()).render();
      res.add("stat", expr);
      wh.add("expr", decl.get(ctx.expr()).get(0));

      for (advParser.ViewportStatContext c : ctx.viewportStat())
         wh.add("stat", visit(c).render());

      wh.add("stat", expr);
      res.add("stat", wh.render());
      return res;
   }

   @Override
   public ST visitViewportIf(advParser.ViewportIfContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST xif = templates.getInstanceOf("if");
      res.add("stat", visit(ctx.expr()).render());
      xif.add("expr", decl.get(ctx.expr()).get(0));
      for (advParser.ViewportStatContext c : ctx.viewportStat())
         xif.add("stat", visit(c).render());

      res.add("stat", xif.render());
      if (ctx.viewportElse() != null)
         res.add("stat", visit(ctx.viewportElse()).render());
      return res;
   }

   @Override
   public ST visitViewportElse(advParser.ViewportElseContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST el = templates.getInstanceOf("else");
      for (advParser.ViewportStatContext c : ctx.viewportStat())
         el.add("stat", visit(c).render());

      res.add("stat", el.render());
      return res;
   }

   @Override
   public ST visitTransitionRedefine(advParser.TransitionRedefineContext ctx) {
      ST res = templates.getInstanceOf("stats");

      String transition = visit(ctx.transition()).render();

      for (advParser.TransitionPointContext c : ctx.transitionPoint()) {
         ST r = visit(c);
         if (r != null)
            res.add("stat", r.render());
         ST add = templates.getInstanceOf("add");
         add.add("var", transition);
         add.add("prop", "point");
         add.add("value", decl.get(c));
         for (advParser.PropertyElementContext d : c.propertyElement()) {
            String prop = d.propertiesKeys().prop.getText() + "=";
            if (d.ID().size() != 0) {
               prop += "'";
               for (TerminalNode n : d.ID())
                  prop += n.getText() + " ";
               prop += "'";
            } else
               prop += d.Number().getText();
            add.add("value", prop);
         }
         res.add("stat", add.render());
      }
      return res;
   }

   @Override
   public ST visitTransitionPoint(advParser.TransitionPointContext ctx) {
      ST res = templates.getInstanceOf("stats");

      String re = visit(ctx.expr()).render();
      res.add("stat", re);

      LinkedList<String> l = decl.get(ctx.expr());
      decl.put(ctx, l);

      // for(advParser.PropertyElementContext c : ctx.propertyElement())
      // res.add("stat",visit(c).render());

      return (re.length() == 0) ? null : res;
   }

   @Override
   public ST visitTransitionLabelAlter(advParser.TransitionLabelAlterContext ctx) {
      ST res = templates.getInstanceOf("stats");

      String transition = visit(ctx.transition()).render();
      curElementProp = transition;

      for (advParser.PropertyElementContext c : ctx.propertyElement()) {
         res.add("stat", visit(c).render());
      }

      LinkedList<String> l = new LinkedList<>();
      l.add(transition);
      decl.put(ctx, l);

      return res;
   }

   @Override
   public ST visitTransitionLabelAlterWithComma(advParser.TransitionLabelAlterWithCommaContext ctx) {
      ST res = visit(ctx.transitionLabelAlter());
      decl.put(ctx, decl.get(ctx.transitionLabelAlter()));
      return res;
   }

   @Override
   public ST visitTransition(advParser.TransitionContext ctx) {
      ST res = templates.getInstanceOf("get");

      res.add("var", curView);
      res.add("prop", "transition");
      res.add("value", "'" + ctx.ID(0).getText() + "'");
      res.add("value", "'" + ctx.ID(1).getText() + "'");

      return res;
   }

   @Override
   public ST visitPlaceDef(advParser.PlaceDefContext ctx) {
      ST res = templates.getInstanceOf("stats");

      for (advParser.PlaceElementContext c : ctx.placeElement()) {
         res.add("stat", visit(c).render());
      }

      return res;
   }

   @Override
   public ST visitIDplaceElement(advParser.IDplaceElementContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST set = templates.getInstanceOf("setP");
      ST state = templates.getInstanceOf("get");

      String r = visit(ctx.expr()).render();
      if (r.length() != 0)
         res.add("stat", r);

      state.add("var", curView);
      state.add("prop", "state");
      state.add("value", "'" + ctx.ID().getText() + "'");

      set.add("var", state.render());
      set.add("prop", "pos");
      set.add("value", decl.get(ctx.expr()));

      res.add("stat", set.render());

      return res;
   }

   @Override
   public ST visitTransitionplaceElement(advParser.TransitionplaceElementContext ctx) {
      ST res = templates.getInstanceOf("stats");

      ST set = templates.getInstanceOf("setP");

      res.add("stat", visit(ctx.transitionLabelAlter()).render());
      String r = visit(ctx.expr()).render();
      if (r.length() != 0)
         res.add("stat", r);
      
      set.add("var", decl.get(ctx.transitionLabelAlter()));
      set.add("prop", "pos");
      set.add("value", decl.get(ctx.expr()));

      res.add("stat", set.render());

      return res;
   }

   private String curGrid = "";
   @Override
   public ST visitGridDef(advParser.GridDefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST ass = templates.getInstanceOf("assign");
      ST set = templates.getInstanceOf("setP");

      String var = newVar();
      curGrid = var;
      setVar(ctx.ID().getText(), var);
      ass.add("var", var);

      ST grid = templates.getInstanceOf("grid");
      res.add("stat",visit(ctx.expr()).render());
      grid.add("widthheigth", decl.get(ctx.expr()));
      grid.add("name","'"+ctx.ID().getText()+"'");
      ass.add("value", grid.render());

      res.add("stat", ass.render());

      set.add("var",curView);
      set.add("prop","grid");
      set.add("value",var);

      res.add("stat",set.render());

      curGrid = var;
      for (advParser.GridOptionsContext c : ctx.gridOptions()) {
         res.add("stat", visit(c).render());
      }

      return res;
   }

   @Override
   public ST visitGridOptions(advParser.GridOptionsContext ctx) {
      ST res = templates.getInstanceOf("setP");

      res.add("var", curGrid);
      res.add("prop", ctx.gridProperties().prop.getText());

      if (ctx.ID().size() != 0)
         for (TerminalNode n : ctx.ID())
            res.add("value", "'" + n.getText() + "'");
      else
         res.add("value", ctx.Number().getText());

      return res;
   }

   @Override
   public ST visitAnimationDef(advParser.AnimationDefContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST ass = templates.getInstanceOf("assign");
      ST anim = templates.getInstanceOf("animation");

      String var = newVar();
      setVar(ctx.ID().getText(), var);
      ass.add("var", var);

      for (advParser.ViewportDefContext vp : ctx.viewportDef()) {
         res.add("stat", visit(vp).render());
         anim.add("viewport", decl.get(vp).get(0));
      }

      ass.add("value", anim.render());
      res.add("stat", ass.render());

      for (advParser.ViewportOnContext vp : ctx.viewportOn()) {
         res.add("stat", visit(vp).render());
         ST addAnim = templates.getInstanceOf("add");
         addAnim.add("var", var);
         addAnim.add("value", decl.get(vp).get(0));
         res.add("stat", addAnim.render());
      }

      return res;
   }

   @Override
   public ST visitViewportDef(advParser.ViewportDefContext ctx) {
      ST ass = templates.getInstanceOf("assign");
      ST viewP = templates.getInstanceOf("viewPort");
      ST res = templates.getInstanceOf("stats");

      String var = newVar();
      setVar(ctx.ID(0).getText(), var);
      ass.add("var", var);
      viewP.add("view", getVar(ctx.ID(1).getText()));
      viewP.add("cornerBottom", ctx.expr(0).getText());
      viewP.add("cornerTop", ctx.expr(1).getText());
      ass.add("value", viewP.render());
      res.add("stat", ass.render());

      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      return res;
   }

   private boolean onViewport = false;
   @Override
   public ST visitViewportOn(advParser.ViewportOnContext ctx) {
      onViewport = true;
      ST viewP = templates.getInstanceOf("viewportInstructions");

      String var = newVar();
      setVar(ctx.ID().getText(), var);

      viewP.add("name", var);

      for (advParser.ViewportStatContext vp : ctx.viewportStat()) {
         viewP.add("instruction", visit(vp).render());
      }

      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);
      onViewport = false;
      return viewP;
   }

   private boolean onFor = false;
   @Override
   public ST visitCompound(advParser.CompoundContext ctx) {
      ST res = templates.getInstanceOf("stats");

      for (advParser.ViewportInstructionsShowElementContext c : ctx.viewportInstructionsShowElement()) {
         if (c.transition() != null) {
            ST show = templates.getInstanceOf("show");
            ST get = templates.getInstanceOf("get");

            get.add("var", "view");
            get.add("prop", "transition");
            get.add("value", "'" + c.transition().ID(0).getText() + "'");
            get.add("value", "'" + c.transition().ID(1).getText() + "'");
            show.add("element", get.render());
            res.add("stat", show.render());
         } else {
            ST get = templates.getInstanceOf("get");
            ST show = templates.getInstanceOf("show");

            get.add("var", "view");

            if(!onFor)
               get.add("value", "'" + c.ID().getText() + "'");
            else
               get.add("value",getVar( c.ID().getText() ));

            for (advParser.PropertyElementContext d : c.propertyElement()) {
               ST set = templates.getInstanceOf("setP");
               set.add("var", get.render());
               String prop = d.propertiesKeys().prop.getText();
               set.add("prop", prop);
               String value = "";
               if (d.ID().size() != 0) {
                  value += "'";
                  for (TerminalNode n : d.ID())
                     value += n.getText() + " ";
                  value += "'";
               } else
                  value += d.Number().getText();
               set.add("value", value);
               res.add("stat", set.render());
            }

            show.add("element", get.render());
            res.add("stat", show.render());
         }
      }
      return res;
   }

   @Override
   public ST visitSimple(advParser.SimpleContext ctx) {
      ST res = templates.getInstanceOf("stats");

      if (ctx.op.getText().equals("pause")) {
         ST pause = templates.getInstanceOf("pause");
         res.add("stat", pause.render());
      } else {
         ST show = templates.getInstanceOf("show");
         res.add("stat", show.render());
      }

      return res;
   }

   @Override
   public ST visitPlayDef(advParser.PlayDefContext ctx) {
      if(getVar(ctx.ID().getText()).equals(""))
         return null;
      ST res = templates.getInstanceOf("play");
      res.add("animation",getVar(ctx.ID().getText()));
      return res;
   }

   @Override
   public ST visitDecl(advParser.DeclContext ctx) {

      if (ctx.ID().size() != 0) {
         return null;
      }

      ST res = templates.getInstanceOf("stats");

      LinkedList<String> l = new LinkedList<>();

      for (advParser.AssignContext c : ctx.assign()) {
         res.add("stat", visit(c).render());
         l.add(decl.get(c).get(0));
      }

      decl.put(ctx, l);

      return res;
   }

   @Override
   public ST visitAlgebricOP(advParser.AlgebricOPContext ctx) {
      ST res = null;

      LinkedList<String> l = new LinkedList<>();

      if (ctx.decl() != null) {
         res = visit(ctx.decl());
         l = decl.get(ctx.decl());
      }

      if (ctx.assign() != null) {
         res = visit(ctx.assign());
         l = decl.get(ctx.assign());
      }

      decl.put(ctx, l);
      return res;
   }

   @Override
   public ST visitMultDivExpr(advParser.MultDivExprContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST binOP = templates.getInstanceOf("binaryOperation");

      res.add("stat", visit(ctx.expr(0)).render());
      res.add("stat", visit(ctx.expr(1)).render());

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      binOP.add("var", var);
      binOP.add("op", ctx.op.getText());

      binOP.add("e1", decl.get(ctx.expr(0)));
      binOP.add("e2", decl.get(ctx.expr(1)));

      res.add("stat", binOP.render());
      return res;
   }

   @Override
   public ST visitAndExpr(advParser.AndExprContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST binOP = templates.getInstanceOf("binaryOperation");

      res.add("stat", visit(ctx.expr(0)).render());
      res.add("stat", visit(ctx.expr(1)).render());

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      binOP.add("var", var);
      binOP.add("op", "&");

      binOP.add("e1", decl.get(ctx.expr(0)));
      binOP.add("e2", decl.get(ctx.expr(1)));

      res.add("stat", binOP.render());
      return res;
   }

   @Override
   public ST visitIDExpr(advParser.IDExprContext ctx) {
      ST res = templates.getInstanceOf("stats");
      LinkedList<String> l = new LinkedList<>();
      if(onViewport){
         ST get = templates.getInstanceOf("get");
         get.add("var","view");
         get.add("value","'"+ctx.ID().getText()+"'");
         l.add(get.render());
      }
      else
         l.add(getVar(ctx.ID().getText()));
      decl.put(ctx, l);
      return res;
   }

   @Override
   public ST visitPointExpr(advParser.PointExprContext ctx) {
      ST res = visit(ctx.point());

      decl.put(ctx, decl.get(ctx.point()));

      return res;
   }

   @Override
   public ST visitUnaryExpr(advParser.UnaryExprContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST unary = templates.getInstanceOf("unaryOperation");

      res.add("stat", visit(ctx.expr()));

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      unary.add("var", var);
      unary.add("op", ctx.op.getText());
      unary.add("value", decl.get(ctx.expr()));

      res.add("stat", unary.render());

      return res;
   }

   @Override
   public ST visitParanthesisExpr(advParser.ParanthesisExprContext ctx) {
      ST res = visit(ctx.expr());
      decl.put(ctx, decl.get(ctx.expr()));
      return res;
   }

   @Override
   public ST visitOrExpr(advParser.OrExprContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST binOP = templates.getInstanceOf("binaryOperation");

      res.add("stat", visit(ctx.expr(0)).render());
      res.add("stat", visit(ctx.expr(1)).render());

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      binOP.add("var", var);
      binOP.add("op", "|");

      binOP.add("e1", decl.get(ctx.expr(0)));
      binOP.add("e2", decl.get(ctx.expr(1)));

      res.add("stat", binOP.render());
      return res;
   }

   @Override
   public ST visitEqualsExpr(advParser.EqualsExprContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST binOP = templates.getInstanceOf("binaryOperation");

      res.add("stat", visit(ctx.expr(0)).render());
      res.add("stat", visit(ctx.expr(1)).render());

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      binOP.add("var", var);
      binOP.add("op", ctx.op.getText());

      binOP.add("e1", decl.get(ctx.expr(0)));
      binOP.add("e2", decl.get(ctx.expr(1)));

      res.add("stat", binOP.render());
      return res;
   }

   @Override
   public ST visitParanthesisIDExpr(advParser.ParanthesisIDExprContext ctx) {
      ST res = templates.getInstanceOf("assign");

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      res.add("var", var);

      ST g1 = templates.getInstanceOf("get");
      ST g2 = templates.getInstanceOf("get");

      g2.add("var", curView);
      g2.add("prop", "state");
      g2.add("value", "'" + ctx.ID().getText() + "'");
      g1.add("var", g2.render());
      g1.add("prop", "pos");

      res.add("value", g1.render());

      return res;
   }

   @Override
   public ST visitNumberExpr(advParser.NumberExprContext ctx) {
      ST res = templates.getInstanceOf("assign");

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      res.add("var", var);
      res.add("value", ctx.Number().getText());

      return res;
   }

   @Override
   public ST visitReadExpr(advParser.ReadExprContext ctx) {
      ST res = templates.getInstanceOf("assign");
      ST in = templates.getInstanceOf("read");

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      res.add("var", var);
      in.add("msg", ctx.STRING().getText());
      res.add("value", in.render());

      return res;
   }

   @Override
   public ST visitCompareExpr(advParser.CompareExprContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST binOP = templates.getInstanceOf("binaryOperation");

      res.add("stat", visit(ctx.expr(0)).render());
      res.add("stat", visit(ctx.expr(1)).render());

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      binOP.add("var", var);
      binOP.add("op", ctx.op.getText());

      binOP.add("e1", decl.get(ctx.expr(0)));
      binOP.add("e2", decl.get(ctx.expr(1)));

      res.add("stat", binOP.render());
      return res;
   }

   @Override
   public ST visitNotExpr(advParser.NotExprContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST unary = templates.getInstanceOf("unaryOperation");

      res.add("stat", visit(ctx.expr()));

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      unary.add("var", var);
      unary.add("op", "not");
      unary.add("value", decl.get(ctx.expr()));

      res.add("stat", unary.render());

      return res;
   }

   @Override
   public ST visitListExpr(advParser.ListExprContext ctx) {
      ST res = templates.getInstanceOf("assign");

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      res.add("var", var);
      res.add("value", visit(ctx.list()).render());

      return res;
   }

   @Override
   public ST visitAddSubExpr(advParser.AddSubExprContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST binOP = templates.getInstanceOf("binaryOperation");

      res.add("stat", visit(ctx.expr(0)).render());
      res.add("stat", visit(ctx.expr(1)).render());

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      binOP.add("var", var);
      binOP.add("op", ctx.op.getText());

      binOP.add("e1", decl.get(ctx.expr(0)));
      binOP.add("e2", decl.get(ctx.expr(1)));

      res.add("stat", binOP.render());
      return res;
   }

   @Override
   public ST visitAssign(advParser.AssignContext ctx) {
      ST res = visitChildren(ctx);

      decl.put(ctx, decl.get(ctx.expr()));
      setVar(ctx.ID().getText(), decl.get(ctx.expr()).get(0));

      return res;
   }

   @Override
   public ST visitList(advParser.ListContext ctx) {
      ST res = templates.getInstanceOf("array");

      for (TerminalNode c : ctx.ID()) {
         if(onViewport)
            res.add("elem", "'"+c.getText()+"'" );
         else
            res.add("elem", getVar(c.getText()));
      }

      return res;
   }

   @Override
   public ST visitPoint(advParser.PointContext ctx) {
      ST res = visitChildren(ctx);

      if (ctx.pointPol() != null)
         decl.put(ctx, decl.get(ctx.pointPol()));

      if (ctx.pointRect() != null)
         decl.put(ctx, decl.get(ctx.pointRect()));

      return res;
   }

   @Override
   public ST visitPointRect(advParser.PointRectContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST point = templates.getInstanceOf("point");

      for (advParser.ExprContext c : ctx.expr())
         res.add("stat", visit(c).render());

      point.add("x", decl.get(ctx.expr(0)).get(0));
      point.add("y", decl.get(ctx.expr(1)).get(0));

      ST ass = templates.getInstanceOf("assign");

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      ass.add("var", var);
      ass.add("value", point.render());

      res.add("stat", ass.render());
      return res;
   }

   @Override
   public ST visitPointPol(advParser.PointPolContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST point = templates.getInstanceOf("point");

      for (advParser.ExprContext c : ctx.expr())
         res.add("stat", visit(c).render());

      String degree = decl.get(ctx.expr(0)).get(0);
      String r = decl.get(ctx.expr(1)).get(0);
      point.add("x", r + "*cos(radians(" + degree + "))");
      point.add("y", r + "*sin(radians(" + degree + "))");

      ST ass = templates.getInstanceOf("assign");

      String var = newVar();
      LinkedList<String> l = new LinkedList<>();
      l.add(var);
      decl.put(ctx, l);

      ass.add("var", var);
      ass.add("value", point.render());

      res.add("stat", ass.render());

      return res;
   }

}
