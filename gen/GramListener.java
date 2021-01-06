// Generated from D:/Programming/Java/IJ/MatlogA\Gram.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramParser}.
 */
public interface GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(GramParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(GramParser.ExpContext ctx);
}