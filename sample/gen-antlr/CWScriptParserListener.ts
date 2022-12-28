// Generated from /Users/william/IdeaProjects/ldtk/sample/gen-antlr/CWScriptParser.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

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
 * This interface defines a complete listener for a parse tree produced by
 * `CWScriptParser`.
 */
export interface CWScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the `ImportAllStmt`
	 * labeled alternative in `CWScriptParser.importStmt`.
	 * @param ctx the parse tree
	 */
	enterImportAllStmt?: (ctx: ImportAllStmtContext) => void;
	/**
	 * Exit a parse tree produced by the `ImportAllStmt`
	 * labeled alternative in `CWScriptParser.importStmt`.
	 * @param ctx the parse tree
	 */
	exitImportAllStmt?: (ctx: ImportAllStmtContext) => void;

	/**
	 * Enter a parse tree produced by the `ImportItemStmt`
	 * labeled alternative in `CWScriptParser.importStmt`.
	 * @param ctx the parse tree
	 */
	enterImportItemStmt?: (ctx: ImportItemStmtContext) => void;
	/**
	 * Exit a parse tree produced by the `ImportItemStmt`
	 * labeled alternative in `CWScriptParser.importStmt`.
	 * @param ctx the parse tree
	 */
	exitImportItemStmt?: (ctx: ImportItemStmtContext) => void;

	/**
	 * Enter a parse tree produced by `CWScriptParser.sourceFile`.
	 * @param ctx the parse tree
	 */
	enterSourceFile?: (ctx: SourceFileContext) => void;
	/**
	 * Exit a parse tree produced by `CWScriptParser.sourceFile`.
	 * @param ctx the parse tree
	 */
	exitSourceFile?: (ctx: SourceFileContext) => void;

	/**
	 * Enter a parse tree produced by `CWScriptParser.topLevelStmt`.
	 * @param ctx the parse tree
	 */
	enterTopLevelStmt?: (ctx: TopLevelStmtContext) => void;
	/**
	 * Exit a parse tree produced by `CWScriptParser.topLevelStmt`.
	 * @param ctx the parse tree
	 */
	exitTopLevelStmt?: (ctx: TopLevelStmtContext) => void;

	/**
	 * Enter a parse tree produced by `CWScriptParser.contractDefn`.
	 * @param ctx the parse tree
	 */
	enterContractDefn?: (ctx: ContractDefnContext) => void;
	/**
	 * Exit a parse tree produced by `CWScriptParser.contractDefn`.
	 * @param ctx the parse tree
	 */
	exitContractDefn?: (ctx: ContractDefnContext) => void;

	/**
	 * Enter a parse tree produced by `CWScriptParser.importStmt`.
	 * @param ctx the parse tree
	 */
	enterImportStmt?: (ctx: ImportStmtContext) => void;
	/**
	 * Exit a parse tree produced by `CWScriptParser.importStmt`.
	 * @param ctx the parse tree
	 */
	exitImportStmt?: (ctx: ImportStmtContext) => void;

	/**
	 * Enter a parse tree produced by `CWScriptParser.importList`.
	 * @param ctx the parse tree
	 */
	enterImportList?: (ctx: ImportListContext) => void;
	/**
	 * Exit a parse tree produced by `CWScriptParser.importList`.
	 * @param ctx the parse tree
	 */
	exitImportList?: (ctx: ImportListContext) => void;

	/**
	 * Enter a parse tree produced by `CWScriptParser.importItem`.
	 * @param ctx the parse tree
	 */
	enterImportItem?: (ctx: ImportItemContext) => void;
	/**
	 * Exit a parse tree produced by `CWScriptParser.importItem`.
	 * @param ctx the parse tree
	 */
	exitImportItem?: (ctx: ImportItemContext) => void;

	/**
	 * Enter a parse tree produced by `CWScriptParser.contractBody`.
	 * @param ctx the parse tree
	 */
	enterContractBody?: (ctx: ContractBodyContext) => void;
	/**
	 * Exit a parse tree produced by `CWScriptParser.contractBody`.
	 * @param ctx the parse tree
	 */
	exitContractBody?: (ctx: ContractBodyContext) => void;

	/**
	 * Enter a parse tree produced by `CWScriptParser.ident`.
	 * @param ctx the parse tree
	 */
	enterIdent?: (ctx: IdentContext) => void;
	/**
	 * Exit a parse tree produced by `CWScriptParser.ident`.
	 * @param ctx the parse tree
	 */
	exitIdent?: (ctx: IdentContext) => void;

	/**
	 * Enter a parse tree produced by `CWScriptParser.identList`.
	 * @param ctx the parse tree
	 */
	enterIdentList?: (ctx: IdentListContext) => void;
	/**
	 * Exit a parse tree produced by `CWScriptParser.identList`.
	 * @param ctx the parse tree
	 */
	exitIdentList?: (ctx: IdentListContext) => void;
}

