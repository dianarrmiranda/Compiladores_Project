// Generated from adv.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link advParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface advVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link advParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(advParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(advParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#importStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStat(advParser.ImportStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#alphabetDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetDef(advParser.AlphabetDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#alphabetElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetElement(advParser.AlphabetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#automatonDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatonDef(advParser.AutomatonDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#automatonNFADef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatonNFADef(advParser.AutomatonNFADefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#automatonDFADef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatonDFADef(advParser.AutomatonDFADefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#automatonStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatonStat(advParser.AutomatonStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#automatonFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatonFor(advParser.AutomatonForContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#automatonWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatonWhile(advParser.AutomatonWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#automatonIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatonIf(advParser.AutomatonIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#automatonElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatonElse(advParser.AutomatonElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#stateDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateDef(advParser.StateDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#propertiesDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDef(advParser.PropertiesDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#propertyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyElement(advParser.PropertyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#transitionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionDef(advParser.TransitionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#transitionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionElement(advParser.TransitionElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewDef(advParser.ViewDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewStat(advParser.ViewStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewFor(advParser.ViewForContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewWhile(advParser.ViewWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewIf(advParser.ViewIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewElse(advParser.ViewElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#transitionRedefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionRedefine(advParser.TransitionRedefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#transitionPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionPoint(advParser.TransitionPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#transitionLabelAlter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionLabelAlter(advParser.TransitionLabelAlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#transitionLabelAlterWithComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionLabelAlterWithComma(advParser.TransitionLabelAlterWithCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(advParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#placeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceDef(advParser.PlaceDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDplaceElement}
	 * labeled alternative in {@link advParser#placeElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDplaceElement(advParser.IDplaceElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transitionplaceElement}
	 * labeled alternative in {@link advParser#placeElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionplaceElement(advParser.TransitionplaceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#gridDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGridDef(advParser.GridDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#gridOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGridOptions(advParser.GridOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#animationDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationDef(advParser.AnimationDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewportDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewportDef(advParser.ViewportDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewportOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewportOn(advParser.ViewportOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewportStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewportStat(advParser.ViewportStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewportWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewportWhile(advParser.ViewportWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewportIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewportIf(advParser.ViewportIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewportElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewportElse(advParser.ViewportElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewportFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewportFor(advParser.ViewportForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compound}
	 * labeled alternative in {@link advParser#viewportInstructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(advParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple}
	 * labeled alternative in {@link advParser#viewportInstructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple(advParser.SimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#viewportInstructionsShowElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewportInstructionsShowElement(advParser.ViewportInstructionsShowElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#playDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayDef(advParser.PlayDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(advParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#algebricOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgebricOP(advParser.AlgebricOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivExpr(advParser.MultDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(advParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDExpr(advParser.IDExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PointExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointExpr(advParser.PointExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(advParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParanthesisExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesisExpr(advParser.ParanthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(advParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualsExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpr(advParser.EqualsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParanthesisIDExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesisIDExpr(advParser.ParanthesisIDExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(advParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpr(advParser.ReadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(advParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(advParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(advParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link advParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(advParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(advParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(advParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(advParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#pointRect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointRect(advParser.PointRectContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#pointPol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointPol(advParser.PointPolContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(advParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#gridProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGridProperties(advParser.GridPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link advParser#propertiesKeys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesKeys(advParser.PropertiesKeysContext ctx);
}