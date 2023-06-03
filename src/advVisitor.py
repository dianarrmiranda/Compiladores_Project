# Generated from adv.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .advParser import advParser
else:
    from advParser import advParser

# This class defines a complete generic visitor for a parse tree produced by advParser.

class advVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by advParser#program.
    def visitProgram(self, ctx:advParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#stat.
    def visitStat(self, ctx:advParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#importstat.
    def visitImportstat(self, ctx:advParser.ImportstatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#alphabetDef.
    def visitAlphabetDef(self, ctx:advParser.AlphabetDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#alphabetElement.
    def visitAlphabetElement(self, ctx:advParser.AlphabetElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#automatonDef.
    def visitAutomatonDef(self, ctx:advParser.AutomatonDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#automatonNFADef.
    def visitAutomatonNFADef(self, ctx:advParser.AutomatonNFADefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#automatonDFADef.
    def visitAutomatonDFADef(self, ctx:advParser.AutomatonDFADefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#automatonStat.
    def visitAutomatonStat(self, ctx:advParser.AutomatonStatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#automatonFor.
    def visitAutomatonFor(self, ctx:advParser.AutomatonForContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#automatonWhile.
    def visitAutomatonWhile(self, ctx:advParser.AutomatonWhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#automatonIf.
    def visitAutomatonIf(self, ctx:advParser.AutomatonIfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#automatonElse.
    def visitAutomatonElse(self, ctx:advParser.AutomatonElseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#stateDef.
    def visitStateDef(self, ctx:advParser.StateDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#propertiesDef.
    def visitPropertiesDef(self, ctx:advParser.PropertiesDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#propertyElement.
    def visitPropertyElement(self, ctx:advParser.PropertyElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#transitionDef.
    def visitTransitionDef(self, ctx:advParser.TransitionDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#transitionElement.
    def visitTransitionElement(self, ctx:advParser.TransitionElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewDef.
    def visitViewDef(self, ctx:advParser.ViewDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewStat.
    def visitViewStat(self, ctx:advParser.ViewStatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewFor.
    def visitViewFor(self, ctx:advParser.ViewForContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewWhile.
    def visitViewWhile(self, ctx:advParser.ViewWhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewIf.
    def visitViewIf(self, ctx:advParser.ViewIfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewElse.
    def visitViewElse(self, ctx:advParser.ViewElseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#transitionRedefine.
    def visitTransitionRedefine(self, ctx:advParser.TransitionRedefineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#transitionPoint.
    def visitTransitionPoint(self, ctx:advParser.TransitionPointContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#transitionLabelAlter.
    def visitTransitionLabelAlter(self, ctx:advParser.TransitionLabelAlterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#transitionLabelAlterWithComma.
    def visitTransitionLabelAlterWithComma(self, ctx:advParser.TransitionLabelAlterWithCommaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#transition.
    def visitTransition(self, ctx:advParser.TransitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#placeDef.
    def visitPlaceDef(self, ctx:advParser.PlaceDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#IDplaceElement.
    def visitIDplaceElement(self, ctx:advParser.IDplaceElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#transitionplaceElement.
    def visitTransitionplaceElement(self, ctx:advParser.TransitionplaceElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#gridDef.
    def visitGridDef(self, ctx:advParser.GridDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#gridOptions.
    def visitGridOptions(self, ctx:advParser.GridOptionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#animationDef.
    def visitAnimationDef(self, ctx:advParser.AnimationDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewportDef.
    def visitViewportDef(self, ctx:advParser.ViewportDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewportOn.
    def visitViewportOn(self, ctx:advParser.ViewportOnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewportStat.
    def visitViewportStat(self, ctx:advParser.ViewportStatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewportWhile.
    def visitViewportWhile(self, ctx:advParser.ViewportWhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewportIf.
    def visitViewportIf(self, ctx:advParser.ViewportIfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewportElse.
    def visitViewportElse(self, ctx:advParser.ViewportElseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewportFor.
    def visitViewportFor(self, ctx:advParser.ViewportForContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#compound.
    def visitCompound(self, ctx:advParser.CompoundContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#simple.
    def visitSimple(self, ctx:advParser.SimpleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#viewportInstructionsShowElement.
    def visitViewportInstructionsShowElement(self, ctx:advParser.ViewportInstructionsShowElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#playDef.
    def visitPlayDef(self, ctx:advParser.PlayDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#decl.
    def visitDecl(self, ctx:advParser.DeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#algebricOP.
    def visitAlgebricOP(self, ctx:advParser.AlgebricOPContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#MultDivExpr.
    def visitMultDivExpr(self, ctx:advParser.MultDivExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#AndExpr.
    def visitAndExpr(self, ctx:advParser.AndExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#IDExpr.
    def visitIDExpr(self, ctx:advParser.IDExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#PointExpr.
    def visitPointExpr(self, ctx:advParser.PointExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#UnaryExpr.
    def visitUnaryExpr(self, ctx:advParser.UnaryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#ParanthesisExpr.
    def visitParanthesisExpr(self, ctx:advParser.ParanthesisExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#OrExpr.
    def visitOrExpr(self, ctx:advParser.OrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#EqualsExpr.
    def visitEqualsExpr(self, ctx:advParser.EqualsExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#ParanthesisIDExpr.
    def visitParanthesisIDExpr(self, ctx:advParser.ParanthesisIDExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#NumberExpr.
    def visitNumberExpr(self, ctx:advParser.NumberExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#ReadExpr.
    def visitReadExpr(self, ctx:advParser.ReadExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#CompareExpr.
    def visitCompareExpr(self, ctx:advParser.CompareExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#NotExpr.
    def visitNotExpr(self, ctx:advParser.NotExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#ListExpr.
    def visitListExpr(self, ctx:advParser.ListExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#AddSubExpr.
    def visitAddSubExpr(self, ctx:advParser.AddSubExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#assign.
    def visitAssign(self, ctx:advParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#list.
    def visitList(self, ctx:advParser.ListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#point.
    def visitPoint(self, ctx:advParser.PointContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#pointRect.
    def visitPointRect(self, ctx:advParser.PointRectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#pointPol.
    def visitPointPol(self, ctx:advParser.PointPolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#type.
    def visitType(self, ctx:advParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#gridProperties.
    def visitGridProperties(self, ctx:advParser.GridPropertiesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by advParser#propertiesKeys.
    def visitPropertiesKeys(self, ctx:advParser.PropertiesKeysContext):
        return self.visitChildren(ctx)



del advParser