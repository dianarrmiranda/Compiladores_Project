from antlr4 import *
from xAdvParser import xAdvParser
from xAdvVisitor import xAdvVisitor

class xAdvInterpreter(xAdvVisitor):
   def visitProgram(self, ctx:xAdvParser.ProgramContext):
      dic={"num":len(ctx.definitions())}
      for c in range (len(ctx.definitions())):
         dic[c]=(self.visit(ctx.definitions(c)))
      print(dic)
      return dic

   def visitDefinitions (self, ctx:xAdvParser.DefinitionsContext):
      thisCtx=None
      dic=dict()
      if ctx.importDef():
         thisCtx=ctx.importDef()
         dic={"type":"import"}
      if ctx.concreteDefinition():
         thisCtx=ctx.concreteDefinition()
      dic.update(self.visit(thisCtx))
      return dic
   
   def visitImportDef(self, ctx:xAdvParser.ImportDefContext):
      return {"ID":ctx.Value().getText()}

   def visitConcreteDefinition(self, ctx:xAdvParser.ConcreteDefinitionContext):
      if ctx.automatonStyle():
         thisCtx=ctx.automatonStyle
      if ctx.viewportStyle():
         thisCtx=ctx.viewportStyle
      return self.visit(thisCtx())
  
   def visitAutomatonStyle(self, ctx:xAdvParser.AutomatonStyleContext):
      dic={"type":"automaton"}
      val=0;
      if len(ctx.Value())>len(ctx.AutomatonProperty()):
         dic.update({"ID:":ctx.Value(0).getText()})
         val=val+1
      for c in range (len(ctx.AutomatonProperty())):
         dic.update({ctx.AutomatonProperty(c).getText():ctx.Value(val).getText()})
         val=val+1   

      return dic

   def visitViewportStyle(self, ctx:xAdvParser.ViewportStyleContext):
      dic={"type":"viewport"}
      val=0;
      if len(ctx.Value())>len(ctx.ViewportProperty()):
         dic.update({"ID:":ctx.Value(0).getText()})
         val=val+1
      for c in range (len(ctx.ViewportProperty())):
         dic.update({ctx.ViewportProperty(c).getText():ctx.Value(val).getText()})
         val=val+1   

      return dic


