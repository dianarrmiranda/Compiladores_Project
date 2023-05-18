// Generated from xAdv.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xAdvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xAdvVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link xAdvParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(xAdvParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAdvParser#importDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDef(xAdvParser.ImportDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAdvParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(xAdvParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAdvParser#automatonStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatonStyle(xAdvParser.AutomatonStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAdvParser#viewportStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewportStyle(xAdvParser.ViewportStyleContext ctx);
}