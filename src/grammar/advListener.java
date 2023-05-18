// Generated from adv.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link advParser}.
 */
public interface advListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link advParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(advParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(advParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(advParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(advParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#importstat}.
	 * @param ctx the parse tree
	 */
	void enterImportstat(advParser.ImportstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#importstat}.
	 * @param ctx the parse tree
	 */
	void exitImportstat(advParser.ImportstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#alphabetDef}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetDef(advParser.AlphabetDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#alphabetDef}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetDef(advParser.AlphabetDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#alphabetElement}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetElement(advParser.AlphabetElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#alphabetElement}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetElement(advParser.AlphabetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#automatonDef}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonDef(advParser.AutomatonDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#automatonDef}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonDef(advParser.AutomatonDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#automatonNFADef}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonNFADef(advParser.AutomatonNFADefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#automatonNFADef}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonNFADef(advParser.AutomatonNFADefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#automatonDFADef}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonDFADef(advParser.AutomatonDFADefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#automatonDFADef}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonDFADef(advParser.AutomatonDFADefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#automatonStat}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonStat(advParser.AutomatonStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#automatonStat}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonStat(advParser.AutomatonStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#automatonFor}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonFor(advParser.AutomatonForContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#automatonFor}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonFor(advParser.AutomatonForContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#automatonWhile}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonWhile(advParser.AutomatonWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#automatonWhile}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonWhile(advParser.AutomatonWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#automatonIf}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonIf(advParser.AutomatonIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#automatonIf}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonIf(advParser.AutomatonIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#stateDef}.
	 * @param ctx the parse tree
	 */
	void enterStateDef(advParser.StateDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#stateDef}.
	 * @param ctx the parse tree
	 */
	void exitStateDef(advParser.StateDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#propertiesDef}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDef(advParser.PropertiesDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#propertiesDef}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDef(advParser.PropertiesDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#propertyElement}.
	 * @param ctx the parse tree
	 */
	void enterPropertyElement(advParser.PropertyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#propertyElement}.
	 * @param ctx the parse tree
	 */
	void exitPropertyElement(advParser.PropertyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#transitionDef}.
	 * @param ctx the parse tree
	 */
	void enterTransitionDef(advParser.TransitionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#transitionDef}.
	 * @param ctx the parse tree
	 */
	void exitTransitionDef(advParser.TransitionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#transitionElement}.
	 * @param ctx the parse tree
	 */
	void enterTransitionElement(advParser.TransitionElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#transitionElement}.
	 * @param ctx the parse tree
	 */
	void exitTransitionElement(advParser.TransitionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewDef}.
	 * @param ctx the parse tree
	 */
	void enterViewDef(advParser.ViewDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewDef}.
	 * @param ctx the parse tree
	 */
	void exitViewDef(advParser.ViewDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewStat}.
	 * @param ctx the parse tree
	 */
	void enterViewStat(advParser.ViewStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewStat}.
	 * @param ctx the parse tree
	 */
	void exitViewStat(advParser.ViewStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewFor}.
	 * @param ctx the parse tree
	 */
	void enterViewFor(advParser.ViewForContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewFor}.
	 * @param ctx the parse tree
	 */
	void exitViewFor(advParser.ViewForContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewWhile}.
	 * @param ctx the parse tree
	 */
	void enterViewWhile(advParser.ViewWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewWhile}.
	 * @param ctx the parse tree
	 */
	void exitViewWhile(advParser.ViewWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewIf}.
	 * @param ctx the parse tree
	 */
	void enterViewIf(advParser.ViewIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewIf}.
	 * @param ctx the parse tree
	 */
	void exitViewIf(advParser.ViewIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#transitionRedefine}.
	 * @param ctx the parse tree
	 */
	void enterTransitionRedefine(advParser.TransitionRedefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#transitionRedefine}.
	 * @param ctx the parse tree
	 */
	void exitTransitionRedefine(advParser.TransitionRedefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#transitionPoint}.
	 * @param ctx the parse tree
	 */
	void enterTransitionPoint(advParser.TransitionPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#transitionPoint}.
	 * @param ctx the parse tree
	 */
	void exitTransitionPoint(advParser.TransitionPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#transitionLabelAlter}.
	 * @param ctx the parse tree
	 */
	void enterTransitionLabelAlter(advParser.TransitionLabelAlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#transitionLabelAlter}.
	 * @param ctx the parse tree
	 */
	void exitTransitionLabelAlter(advParser.TransitionLabelAlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(advParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(advParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#placeDef}.
	 * @param ctx the parse tree
	 */
	void enterPlaceDef(advParser.PlaceDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#placeDef}.
	 * @param ctx the parse tree
	 */
	void exitPlaceDef(advParser.PlaceDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#placeElement}.
	 * @param ctx the parse tree
	 */
	void enterPlaceElement(advParser.PlaceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#placeElement}.
	 * @param ctx the parse tree
	 */
	void exitPlaceElement(advParser.PlaceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#gridDef}.
	 * @param ctx the parse tree
	 */
	void enterGridDef(advParser.GridDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#gridDef}.
	 * @param ctx the parse tree
	 */
	void exitGridDef(advParser.GridDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#gridOptions}.
	 * @param ctx the parse tree
	 */
	void enterGridOptions(advParser.GridOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#gridOptions}.
	 * @param ctx the parse tree
	 */
	void exitGridOptions(advParser.GridOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#animationDef}.
	 * @param ctx the parse tree
	 */
	void enterAnimationDef(advParser.AnimationDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#animationDef}.
	 * @param ctx the parse tree
	 */
	void exitAnimationDef(advParser.AnimationDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewportDef}.
	 * @param ctx the parse tree
	 */
	void enterViewportDef(advParser.ViewportDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewportDef}.
	 * @param ctx the parse tree
	 */
	void exitViewportDef(advParser.ViewportDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewportOn}.
	 * @param ctx the parse tree
	 */
	void enterViewportOn(advParser.ViewportOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewportOn}.
	 * @param ctx the parse tree
	 */
	void exitViewportOn(advParser.ViewportOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewportStat}.
	 * @param ctx the parse tree
	 */
	void enterViewportStat(advParser.ViewportStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewportStat}.
	 * @param ctx the parse tree
	 */
	void exitViewportStat(advParser.ViewportStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewportWhile}.
	 * @param ctx the parse tree
	 */
	void enterViewportWhile(advParser.ViewportWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewportWhile}.
	 * @param ctx the parse tree
	 */
	void exitViewportWhile(advParser.ViewportWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewportIf}.
	 * @param ctx the parse tree
	 */
	void enterViewportIf(advParser.ViewportIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewportIf}.
	 * @param ctx the parse tree
	 */
	void exitViewportIf(advParser.ViewportIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewportFor}.
	 * @param ctx the parse tree
	 */
	void enterViewportFor(advParser.ViewportForContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewportFor}.
	 * @param ctx the parse tree
	 */
	void exitViewportFor(advParser.ViewportForContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewportInstructions}.
	 * @param ctx the parse tree
	 */
	void enterViewportInstructions(advParser.ViewportInstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewportInstructions}.
	 * @param ctx the parse tree
	 */
	void exitViewportInstructions(advParser.ViewportInstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#viewportInstructionsShowElement}.
	 * @param ctx the parse tree
	 */
	void enterViewportInstructionsShowElement(advParser.ViewportInstructionsShowElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#viewportInstructionsShowElement}.
	 * @param ctx the parse tree
	 */
	void exitViewportInstructionsShowElement(advParser.ViewportInstructionsShowElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#playDef}.
	 * @param ctx the parse tree
	 */
	void enterPlayDef(advParser.PlayDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#playDef}.
	 * @param ctx the parse tree
	 */
	void exitPlayDef(advParser.PlayDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(advParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(advParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#algebricOP}.
	 * @param ctx the parse tree
	 */
	void enterAlgebricOP(advParser.AlgebricOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#algebricOP}.
	 * @param ctx the parse tree
	 */
	void exitAlgebricOP(advParser.AlgebricOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(advParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(advParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(advParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(advParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIDExpr(advParser.IDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIDExpr(advParser.IDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PointExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPointExpr(advParser.PointExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PointExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPointExpr(advParser.PointExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(advParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(advParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParanthesisExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesisExpr(advParser.ParanthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParanthesisExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesisExpr(advParser.ParanthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(advParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(advParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpr(advParser.EqualsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpr(advParser.EqualsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParanthesisIDExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesisIDExpr(advParser.ParanthesisIDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParanthesisIDExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesisIDExpr(advParser.ParanthesisIDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(advParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(advParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadExpr(advParser.ReadExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadExpr(advParser.ReadExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(advParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(advParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(advParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(advParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(advParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(advParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(advParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(advParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(advParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(advParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(advParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(advParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(advParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(advParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#pointRect}.
	 * @param ctx the parse tree
	 */
	void enterPointRect(advParser.PointRectContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#pointRect}.
	 * @param ctx the parse tree
	 */
	void exitPointRect(advParser.PointRectContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#pointPol}.
	 * @param ctx the parse tree
	 */
	void enterPointPol(advParser.PointPolContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#pointPol}.
	 * @param ctx the parse tree
	 */
	void exitPointPol(advParser.PointPolContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(advParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(advParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#gridProperties}.
	 * @param ctx the parse tree
	 */
	void enterGridProperties(advParser.GridPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#gridProperties}.
	 * @param ctx the parse tree
	 */
	void exitGridProperties(advParser.GridPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link advParser#propertiesKeys}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesKeys(advParser.PropertiesKeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link advParser#propertiesKeys}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesKeys(advParser.PropertiesKeysContext ctx);
}