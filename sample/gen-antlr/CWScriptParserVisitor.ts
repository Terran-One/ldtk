// Generated from /Users/william/IdeaProjects/ldtk/sample/gen-antlr/CWScriptParser.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { ImportAllStmtContext } from "./CWScriptParser";
import { ImportItemStmtContext } from "./CWScriptParser";
import { SourceFileContext } from "./CWScriptParser";
import { TopLevelStmtContext } from "./CWScriptParser";
import { ContractDefnContext } from "./CWScriptParser";
import { ImportStmtContext } from "./CWScriptParser";
import { ImportListContext } from "./CWScriptParser";
import { ImportItemContext } from "./CWScriptParser";
import { ContractBodyContext } from "./CWScriptParser";
import { IdentContext } from "./CWScriptParser";
import { IdentListContext } from "./CWScriptParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `CWScriptParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface CWScriptParserVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by the `ImportAllStmt`
	 * labeled alternative in `CWScriptParser.importStmt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImportAllStmt?: (ctx: ImportAllStmtContext) => Result;

	/**
	 * Visit a parse tree produced by the `ImportItemStmt`
	 * labeled alternative in `CWScriptParser.importStmt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImportItemStmt?: (ctx: ImportItemStmtContext) => Result;

	/**
	 * Visit a parse tree produced by `CWScriptParser.sourceFile`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSourceFile?: (ctx: SourceFileContext) => Result;

	/**
	 * Visit a parse tree produced by `CWScriptParser.topLevelStmt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTopLevelStmt?: (ctx: TopLevelStmtContext) => Result;

	/**
	 * Visit a parse tree produced by `CWScriptParser.contractDefn`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitContractDefn?: (ctx: ContractDefnContext) => Result;

	/**
	 * Visit a parse tree produced by `CWScriptParser.importStmt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImportStmt?: (ctx: ImportStmtContext) => Result;

	/**
	 * Visit a parse tree produced by `CWScriptParser.importList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImportList?: (ctx: ImportListContext) => Result;

	/**
	 * Visit a parse tree produced by `CWScriptParser.importItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImportItem?: (ctx: ImportItemContext) => Result;

	/**
	 * Visit a parse tree produced by `CWScriptParser.contractBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitContractBody?: (ctx: ContractBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `CWScriptParser.ident`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdent?: (ctx: IdentContext) => Result;

	/**
	 * Visit a parse tree produced by `CWScriptParser.identList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentList?: (ctx: IdentListContext) => Result;
}

