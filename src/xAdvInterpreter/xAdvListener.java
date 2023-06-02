// Generated from xAdv.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xAdvParser}.
 */
public interface xAdvListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xAdvParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(xAdvParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAdvParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(xAdvParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAdvParser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(xAdvParser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAdvParser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(xAdvParser.DefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAdvParser#importDef}.
	 * @param ctx the parse tree
	 */
	void enterImportDef(xAdvParser.ImportDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAdvParser#importDef}.
	 * @param ctx the parse tree
	 */
	void exitImportDef(xAdvParser.ImportDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAdvParser#concreteDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConcreteDefinition(xAdvParser.ConcreteDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAdvParser#concreteDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConcreteDefinition(xAdvParser.ConcreteDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAdvParser#automatonStyle}.
	 * @param ctx the parse tree
	 */
	void enterAutomatonStyle(xAdvParser.AutomatonStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAdvParser#automatonStyle}.
	 * @param ctx the parse tree
	 */
	void exitAutomatonStyle(xAdvParser.AutomatonStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAdvParser#viewportStyle}.
	 * @param ctx the parse tree
	 */
	void enterViewportStyle(xAdvParser.ViewportStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAdvParser#viewportStyle}.
	 * @param ctx the parse tree
	 */
	void exitViewportStyle(xAdvParser.ViewportStyleContext ctx);
}