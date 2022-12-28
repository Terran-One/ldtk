// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CWScriptParser}.
 */
public interface CWScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(CWScriptParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(CWScriptParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#topLevelStmt}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelStmt(CWScriptParser.TopLevelStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#topLevelStmt}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelStmt(CWScriptParser.TopLevelStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#contractDefn}.
	 * @param ctx the parse tree
	 */
	void enterContractDefn(CWScriptParser.ContractDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#contractDefn}.
	 * @param ctx the parse tree
	 */
	void exitContractDefn(CWScriptParser.ContractDefnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportAllStmt}
	 * labeled alternative in {@link CWScriptParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportAllStmt(CWScriptParser.ImportAllStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportAllStmt}
	 * labeled alternative in {@link CWScriptParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportAllStmt(CWScriptParser.ImportAllStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportItemStmt}
	 * labeled alternative in {@link CWScriptParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportItemStmt(CWScriptParser.ImportItemStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportItemStmt}
	 * labeled alternative in {@link CWScriptParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportItemStmt(CWScriptParser.ImportItemStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(CWScriptParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(CWScriptParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(CWScriptParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(CWScriptParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#contractBody}.
	 * @param ctx the parse tree
	 */
	void enterContractBody(CWScriptParser.ContractBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#contractBody}.
	 * @param ctx the parse tree
	 */
	void exitContractBody(CWScriptParser.ContractBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(CWScriptParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(CWScriptParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#identList}.
	 * @param ctx the parse tree
	 */
	void enterIdentList(CWScriptParser.IdentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#identList}.
	 * @param ctx the parse tree
	 */
	void exitIdentList(CWScriptParser.IdentListContext ctx);
}