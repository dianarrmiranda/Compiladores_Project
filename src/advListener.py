# Generated from adv.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .advParser import advParser
else:
    from advParser import advParser

# This class defines a complete listener for a parse tree produced by advParser.
class advListener(ParseTreeListener):

    # Enter a parse tree produced by advParser#program.
    def enterProgram(self, ctx:advParser.ProgramContext):
        pass

    # Exit a parse tree produced by advParser#program.
    def exitProgram(self, ctx:advParser.ProgramContext):
        pass


    # Enter a parse tree produced by advParser#stat.
    def enterStat(self, ctx:advParser.StatContext):
        pass

    # Exit a parse tree produced by advParser#stat.
    def exitStat(self, ctx:advParser.StatContext):
        pass


    # Enter a parse tree produced by advParser#importstat.
    def enterImportstat(self, ctx:advParser.ImportstatContext):
        pass

    # Exit a parse tree produced by advParser#importstat.
    def exitImportstat(self, ctx:advParser.ImportstatContext):
        pass


    # Enter a parse tree produced by advParser#alphabetDef.
    def enterAlphabetDef(self, ctx:advParser.AlphabetDefContext):
        pass

    # Exit a parse tree produced by advParser#alphabetDef.
    def exitAlphabetDef(self, ctx:advParser.AlphabetDefContext):
        pass


    # Enter a parse tree produced by advParser#alphabetElement.
    def enterAlphabetElement(self, ctx:advParser.AlphabetElementContext):
        pass

    # Exit a parse tree produced by advParser#alphabetElement.
    def exitAlphabetElement(self, ctx:advParser.AlphabetElementContext):
        pass


    # Enter a parse tree produced by advParser#automatonDef.
    def enterAutomatonDef(self, ctx:advParser.AutomatonDefContext):
        pass

    # Exit a parse tree produced by advParser#automatonDef.
    def exitAutomatonDef(self, ctx:advParser.AutomatonDefContext):
        pass


    # Enter a parse tree produced by advParser#automatonNFADef.
    def enterAutomatonNFADef(self, ctx:advParser.AutomatonNFADefContext):
        pass

    # Exit a parse tree produced by advParser#automatonNFADef.
    def exitAutomatonNFADef(self, ctx:advParser.AutomatonNFADefContext):
        pass


    # Enter a parse tree produced by advParser#automatonDFADef.
    def enterAutomatonDFADef(self, ctx:advParser.AutomatonDFADefContext):
        pass

    # Exit a parse tree produced by advParser#automatonDFADef.
    def exitAutomatonDFADef(self, ctx:advParser.AutomatonDFADefContext):
        pass


    # Enter a parse tree produced by advParser#automatonStat.
    def enterAutomatonStat(self, ctx:advParser.AutomatonStatContext):
        pass

    # Exit a parse tree produced by advParser#automatonStat.
    def exitAutomatonStat(self, ctx:advParser.AutomatonStatContext):
        pass


    # Enter a parse tree produced by advParser#automatonFor.
    def enterAutomatonFor(self, ctx:advParser.AutomatonForContext):
        pass

    # Exit a parse tree produced by advParser#automatonFor.
    def exitAutomatonFor(self, ctx:advParser.AutomatonForContext):
        pass


    # Enter a parse tree produced by advParser#automatonWhile.
    def enterAutomatonWhile(self, ctx:advParser.AutomatonWhileContext):
        pass

    # Exit a parse tree produced by advParser#automatonWhile.
    def exitAutomatonWhile(self, ctx:advParser.AutomatonWhileContext):
        pass


    # Enter a parse tree produced by advParser#automatonIf.
    def enterAutomatonIf(self, ctx:advParser.AutomatonIfContext):
        pass

    # Exit a parse tree produced by advParser#automatonIf.
    def exitAutomatonIf(self, ctx:advParser.AutomatonIfContext):
        pass


    # Enter a parse tree produced by advParser#automatonElse.
    def enterAutomatonElse(self, ctx:advParser.AutomatonElseContext):
        pass

    # Exit a parse tree produced by advParser#automatonElse.
    def exitAutomatonElse(self, ctx:advParser.AutomatonElseContext):
        pass


    # Enter a parse tree produced by advParser#stateDef.
    def enterStateDef(self, ctx:advParser.StateDefContext):
        pass

    # Exit a parse tree produced by advParser#stateDef.
    def exitStateDef(self, ctx:advParser.StateDefContext):
        pass


    # Enter a parse tree produced by advParser#propertiesDef.
    def enterPropertiesDef(self, ctx:advParser.PropertiesDefContext):
        pass

    # Exit a parse tree produced by advParser#propertiesDef.
    def exitPropertiesDef(self, ctx:advParser.PropertiesDefContext):
        pass


    # Enter a parse tree produced by advParser#propertyElement.
    def enterPropertyElement(self, ctx:advParser.PropertyElementContext):
        pass

    # Exit a parse tree produced by advParser#propertyElement.
    def exitPropertyElement(self, ctx:advParser.PropertyElementContext):
        pass


    # Enter a parse tree produced by advParser#transitionDef.
    def enterTransitionDef(self, ctx:advParser.TransitionDefContext):
        pass

    # Exit a parse tree produced by advParser#transitionDef.
    def exitTransitionDef(self, ctx:advParser.TransitionDefContext):
        pass


    # Enter a parse tree produced by advParser#transitionElement.
    def enterTransitionElement(self, ctx:advParser.TransitionElementContext):
        pass

    # Exit a parse tree produced by advParser#transitionElement.
    def exitTransitionElement(self, ctx:advParser.TransitionElementContext):
        pass


    # Enter a parse tree produced by advParser#viewDef.
    def enterViewDef(self, ctx:advParser.ViewDefContext):
        pass

    # Exit a parse tree produced by advParser#viewDef.
    def exitViewDef(self, ctx:advParser.ViewDefContext):
        pass


    # Enter a parse tree produced by advParser#viewStat.
    def enterViewStat(self, ctx:advParser.ViewStatContext):
        pass

    # Exit a parse tree produced by advParser#viewStat.
    def exitViewStat(self, ctx:advParser.ViewStatContext):
        pass


    # Enter a parse tree produced by advParser#viewFor.
    def enterViewFor(self, ctx:advParser.ViewForContext):
        pass

    # Exit a parse tree produced by advParser#viewFor.
    def exitViewFor(self, ctx:advParser.ViewForContext):
        pass


    # Enter a parse tree produced by advParser#viewWhile.
    def enterViewWhile(self, ctx:advParser.ViewWhileContext):
        pass

    # Exit a parse tree produced by advParser#viewWhile.
    def exitViewWhile(self, ctx:advParser.ViewWhileContext):
        pass


    # Enter a parse tree produced by advParser#viewIf.
    def enterViewIf(self, ctx:advParser.ViewIfContext):
        pass

    # Exit a parse tree produced by advParser#viewIf.
    def exitViewIf(self, ctx:advParser.ViewIfContext):
        pass


    # Enter a parse tree produced by advParser#viewElse.
    def enterViewElse(self, ctx:advParser.ViewElseContext):
        pass

    # Exit a parse tree produced by advParser#viewElse.
    def exitViewElse(self, ctx:advParser.ViewElseContext):
        pass


    # Enter a parse tree produced by advParser#transitionRedefine.
    def enterTransitionRedefine(self, ctx:advParser.TransitionRedefineContext):
        pass

    # Exit a parse tree produced by advParser#transitionRedefine.
    def exitTransitionRedefine(self, ctx:advParser.TransitionRedefineContext):
        pass


    # Enter a parse tree produced by advParser#transitionPoint.
    def enterTransitionPoint(self, ctx:advParser.TransitionPointContext):
        pass

    # Exit a parse tree produced by advParser#transitionPoint.
    def exitTransitionPoint(self, ctx:advParser.TransitionPointContext):
        pass


    # Enter a parse tree produced by advParser#transitionLabelAlter.
    def enterTransitionLabelAlter(self, ctx:advParser.TransitionLabelAlterContext):
        pass

    # Exit a parse tree produced by advParser#transitionLabelAlter.
    def exitTransitionLabelAlter(self, ctx:advParser.TransitionLabelAlterContext):
        pass


    # Enter a parse tree produced by advParser#transitionLabelAlterWithComma.
    def enterTransitionLabelAlterWithComma(self, ctx:advParser.TransitionLabelAlterWithCommaContext):
        pass

    # Exit a parse tree produced by advParser#transitionLabelAlterWithComma.
    def exitTransitionLabelAlterWithComma(self, ctx:advParser.TransitionLabelAlterWithCommaContext):
        pass


    # Enter a parse tree produced by advParser#transition.
    def enterTransition(self, ctx:advParser.TransitionContext):
        pass

    # Exit a parse tree produced by advParser#transition.
    def exitTransition(self, ctx:advParser.TransitionContext):
        pass


    # Enter a parse tree produced by advParser#placeDef.
    def enterPlaceDef(self, ctx:advParser.PlaceDefContext):
        pass

    # Exit a parse tree produced by advParser#placeDef.
    def exitPlaceDef(self, ctx:advParser.PlaceDefContext):
        pass


    # Enter a parse tree produced by advParser#IDplaceElement.
    def enterIDplaceElement(self, ctx:advParser.IDplaceElementContext):
        pass

    # Exit a parse tree produced by advParser#IDplaceElement.
    def exitIDplaceElement(self, ctx:advParser.IDplaceElementContext):
        pass


    # Enter a parse tree produced by advParser#transitionplaceElement.
    def enterTransitionplaceElement(self, ctx:advParser.TransitionplaceElementContext):
        pass

    # Exit a parse tree produced by advParser#transitionplaceElement.
    def exitTransitionplaceElement(self, ctx:advParser.TransitionplaceElementContext):
        pass


    # Enter a parse tree produced by advParser#gridDef.
    def enterGridDef(self, ctx:advParser.GridDefContext):
        pass

    # Exit a parse tree produced by advParser#gridDef.
    def exitGridDef(self, ctx:advParser.GridDefContext):
        pass


    # Enter a parse tree produced by advParser#gridOptions.
    def enterGridOptions(self, ctx:advParser.GridOptionsContext):
        pass

    # Exit a parse tree produced by advParser#gridOptions.
    def exitGridOptions(self, ctx:advParser.GridOptionsContext):
        pass


    # Enter a parse tree produced by advParser#animationDef.
    def enterAnimationDef(self, ctx:advParser.AnimationDefContext):
        pass

    # Exit a parse tree produced by advParser#animationDef.
    def exitAnimationDef(self, ctx:advParser.AnimationDefContext):
        pass


    # Enter a parse tree produced by advParser#viewportDef.
    def enterViewportDef(self, ctx:advParser.ViewportDefContext):
        pass

    # Exit a parse tree produced by advParser#viewportDef.
    def exitViewportDef(self, ctx:advParser.ViewportDefContext):
        pass


    # Enter a parse tree produced by advParser#viewportOn.
    def enterViewportOn(self, ctx:advParser.ViewportOnContext):
        pass

    # Exit a parse tree produced by advParser#viewportOn.
    def exitViewportOn(self, ctx:advParser.ViewportOnContext):
        pass


    # Enter a parse tree produced by advParser#viewportStat.
    def enterViewportStat(self, ctx:advParser.ViewportStatContext):
        pass

    # Exit a parse tree produced by advParser#viewportStat.
    def exitViewportStat(self, ctx:advParser.ViewportStatContext):
        pass


    # Enter a parse tree produced by advParser#viewportWhile.
    def enterViewportWhile(self, ctx:advParser.ViewportWhileContext):
        pass

    # Exit a parse tree produced by advParser#viewportWhile.
    def exitViewportWhile(self, ctx:advParser.ViewportWhileContext):
        pass


    # Enter a parse tree produced by advParser#viewportIf.
    def enterViewportIf(self, ctx:advParser.ViewportIfContext):
        pass

    # Exit a parse tree produced by advParser#viewportIf.
    def exitViewportIf(self, ctx:advParser.ViewportIfContext):
        pass


    # Enter a parse tree produced by advParser#viewportElse.
    def enterViewportElse(self, ctx:advParser.ViewportElseContext):
        pass

    # Exit a parse tree produced by advParser#viewportElse.
    def exitViewportElse(self, ctx:advParser.ViewportElseContext):
        pass


    # Enter a parse tree produced by advParser#viewportFor.
    def enterViewportFor(self, ctx:advParser.ViewportForContext):
        pass

    # Exit a parse tree produced by advParser#viewportFor.
    def exitViewportFor(self, ctx:advParser.ViewportForContext):
        pass


    # Enter a parse tree produced by advParser#compound.
    def enterCompound(self, ctx:advParser.CompoundContext):
        pass

    # Exit a parse tree produced by advParser#compound.
    def exitCompound(self, ctx:advParser.CompoundContext):
        pass


    # Enter a parse tree produced by advParser#simple.
    def enterSimple(self, ctx:advParser.SimpleContext):
        pass

    # Exit a parse tree produced by advParser#simple.
    def exitSimple(self, ctx:advParser.SimpleContext):
        pass


    # Enter a parse tree produced by advParser#viewportInstructionsShowElement.
    def enterViewportInstructionsShowElement(self, ctx:advParser.ViewportInstructionsShowElementContext):
        pass

    # Exit a parse tree produced by advParser#viewportInstructionsShowElement.
    def exitViewportInstructionsShowElement(self, ctx:advParser.ViewportInstructionsShowElementContext):
        pass


    # Enter a parse tree produced by advParser#playDef.
    def enterPlayDef(self, ctx:advParser.PlayDefContext):
        pass

    # Exit a parse tree produced by advParser#playDef.
    def exitPlayDef(self, ctx:advParser.PlayDefContext):
        pass


    # Enter a parse tree produced by advParser#decl.
    def enterDecl(self, ctx:advParser.DeclContext):
        pass

    # Exit a parse tree produced by advParser#decl.
    def exitDecl(self, ctx:advParser.DeclContext):
        pass


    # Enter a parse tree produced by advParser#algebricOP.
    def enterAlgebricOP(self, ctx:advParser.AlgebricOPContext):
        pass

    # Exit a parse tree produced by advParser#algebricOP.
    def exitAlgebricOP(self, ctx:advParser.AlgebricOPContext):
        pass


    # Enter a parse tree produced by advParser#MultDivExpr.
    def enterMultDivExpr(self, ctx:advParser.MultDivExprContext):
        pass

    # Exit a parse tree produced by advParser#MultDivExpr.
    def exitMultDivExpr(self, ctx:advParser.MultDivExprContext):
        pass


    # Enter a parse tree produced by advParser#AndExpr.
    def enterAndExpr(self, ctx:advParser.AndExprContext):
        pass

    # Exit a parse tree produced by advParser#AndExpr.
    def exitAndExpr(self, ctx:advParser.AndExprContext):
        pass


    # Enter a parse tree produced by advParser#IDExpr.
    def enterIDExpr(self, ctx:advParser.IDExprContext):
        pass

    # Exit a parse tree produced by advParser#IDExpr.
    def exitIDExpr(self, ctx:advParser.IDExprContext):
        pass


    # Enter a parse tree produced by advParser#PointExpr.
    def enterPointExpr(self, ctx:advParser.PointExprContext):
        pass

    # Exit a parse tree produced by advParser#PointExpr.
    def exitPointExpr(self, ctx:advParser.PointExprContext):
        pass


    # Enter a parse tree produced by advParser#UnaryExpr.
    def enterUnaryExpr(self, ctx:advParser.UnaryExprContext):
        pass

    # Exit a parse tree produced by advParser#UnaryExpr.
    def exitUnaryExpr(self, ctx:advParser.UnaryExprContext):
        pass


    # Enter a parse tree produced by advParser#ParanthesisExpr.
    def enterParanthesisExpr(self, ctx:advParser.ParanthesisExprContext):
        pass

    # Exit a parse tree produced by advParser#ParanthesisExpr.
    def exitParanthesisExpr(self, ctx:advParser.ParanthesisExprContext):
        pass


    # Enter a parse tree produced by advParser#OrExpr.
    def enterOrExpr(self, ctx:advParser.OrExprContext):
        pass

    # Exit a parse tree produced by advParser#OrExpr.
    def exitOrExpr(self, ctx:advParser.OrExprContext):
        pass


    # Enter a parse tree produced by advParser#EqualsExpr.
    def enterEqualsExpr(self, ctx:advParser.EqualsExprContext):
        pass

    # Exit a parse tree produced by advParser#EqualsExpr.
    def exitEqualsExpr(self, ctx:advParser.EqualsExprContext):
        pass


    # Enter a parse tree produced by advParser#ParanthesisIDExpr.
    def enterParanthesisIDExpr(self, ctx:advParser.ParanthesisIDExprContext):
        pass

    # Exit a parse tree produced by advParser#ParanthesisIDExpr.
    def exitParanthesisIDExpr(self, ctx:advParser.ParanthesisIDExprContext):
        pass


    # Enter a parse tree produced by advParser#NumberExpr.
    def enterNumberExpr(self, ctx:advParser.NumberExprContext):
        pass

    # Exit a parse tree produced by advParser#NumberExpr.
    def exitNumberExpr(self, ctx:advParser.NumberExprContext):
        pass


    # Enter a parse tree produced by advParser#ReadExpr.
    def enterReadExpr(self, ctx:advParser.ReadExprContext):
        pass

    # Exit a parse tree produced by advParser#ReadExpr.
    def exitReadExpr(self, ctx:advParser.ReadExprContext):
        pass


    # Enter a parse tree produced by advParser#CompareExpr.
    def enterCompareExpr(self, ctx:advParser.CompareExprContext):
        pass

    # Exit a parse tree produced by advParser#CompareExpr.
    def exitCompareExpr(self, ctx:advParser.CompareExprContext):
        pass


    # Enter a parse tree produced by advParser#NotExpr.
    def enterNotExpr(self, ctx:advParser.NotExprContext):
        pass

    # Exit a parse tree produced by advParser#NotExpr.
    def exitNotExpr(self, ctx:advParser.NotExprContext):
        pass


    # Enter a parse tree produced by advParser#ListExpr.
    def enterListExpr(self, ctx:advParser.ListExprContext):
        pass

    # Exit a parse tree produced by advParser#ListExpr.
    def exitListExpr(self, ctx:advParser.ListExprContext):
        pass


    # Enter a parse tree produced by advParser#AddSubExpr.
    def enterAddSubExpr(self, ctx:advParser.AddSubExprContext):
        pass

    # Exit a parse tree produced by advParser#AddSubExpr.
    def exitAddSubExpr(self, ctx:advParser.AddSubExprContext):
        pass


    # Enter a parse tree produced by advParser#assign.
    def enterAssign(self, ctx:advParser.AssignContext):
        pass

    # Exit a parse tree produced by advParser#assign.
    def exitAssign(self, ctx:advParser.AssignContext):
        pass


    # Enter a parse tree produced by advParser#list.
    def enterList(self, ctx:advParser.ListContext):
        pass

    # Exit a parse tree produced by advParser#list.
    def exitList(self, ctx:advParser.ListContext):
        pass


    # Enter a parse tree produced by advParser#point.
    def enterPoint(self, ctx:advParser.PointContext):
        pass

    # Exit a parse tree produced by advParser#point.
    def exitPoint(self, ctx:advParser.PointContext):
        pass


    # Enter a parse tree produced by advParser#pointRect.
    def enterPointRect(self, ctx:advParser.PointRectContext):
        pass

    # Exit a parse tree produced by advParser#pointRect.
    def exitPointRect(self, ctx:advParser.PointRectContext):
        pass


    # Enter a parse tree produced by advParser#pointPol.
    def enterPointPol(self, ctx:advParser.PointPolContext):
        pass

    # Exit a parse tree produced by advParser#pointPol.
    def exitPointPol(self, ctx:advParser.PointPolContext):
        pass


    # Enter a parse tree produced by advParser#type.
    def enterType(self, ctx:advParser.TypeContext):
        pass

    # Exit a parse tree produced by advParser#type.
    def exitType(self, ctx:advParser.TypeContext):
        pass


    # Enter a parse tree produced by advParser#gridProperties.
    def enterGridProperties(self, ctx:advParser.GridPropertiesContext):
        pass

    # Exit a parse tree produced by advParser#gridProperties.
    def exitGridProperties(self, ctx:advParser.GridPropertiesContext):
        pass


    # Enter a parse tree produced by advParser#propertiesKeys.
    def enterPropertiesKeys(self, ctx:advParser.PropertiesKeysContext):
        pass

    # Exit a parse tree produced by advParser#propertiesKeys.
    def exitPropertiesKeys(self, ctx:advParser.PropertiesKeysContext):
        pass



del advParser