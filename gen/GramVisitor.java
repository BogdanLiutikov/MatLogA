// Generated from D:/Programming/Java/IJ/MatlogA\Gram.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(GramParser.ExpContext ctx);
}