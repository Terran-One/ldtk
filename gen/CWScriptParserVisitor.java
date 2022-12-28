// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CWScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CWScriptParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(CWScriptParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#topLevelStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelStmt(CWScriptParser.TopLevelStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#contractDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractDefn(CWScriptParser.ContractDefnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportAllStmt}
	 * labeled alternative in {@link CWScriptParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAllStmt(CWScriptParser.ImportAllStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportItemStmt}
	 * labeled alternative in {@link CWScriptParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItemStmt(CWScriptParser.ImportItemStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(CWScriptParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItem(CWScriptParser.ImportItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#contractBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractBody(CWScriptParser.ContractBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(CWScriptParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#identList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentList(CWScriptParser.IdentListContext ctx);
}