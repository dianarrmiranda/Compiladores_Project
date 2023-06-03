@SuppressWarnings("CheckReturnValue")
public class xAdvVisitorr extends xAdvBaseVisitor<-python> {

   @Override public -python visitProgram(xAdvParser.ProgramContext ctx) {
      -python res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public -python visitDefinitions(xAdvParser.DefinitionsContext ctx) {
      -python res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public -python visitImportDef(xAdvParser.ImportDefContext ctx) {
      -python res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public -python visitConcreteDefinition(xAdvParser.ConcreteDefinitionContext ctx) {
      -python res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public -python visitAutomatonStyle(xAdvParser.AutomatonStyleContext ctx) {
      -python res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public -python visitViewportStyle(xAdvParser.ViewportStyleContext ctx) {
      -python res = null;
      return visitChildren(ctx);
      //return res;
   }
}
