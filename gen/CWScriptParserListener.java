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
	 * Enter a parse tree produced by {@link CWScriptParser#interfaceDefn}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefn(CWScriptParser.InterfaceDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#interfaceDefn}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefn(CWScriptParser.InterfaceDefnContext ctx);
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
	 * Enter a parse tree produced by the {@code ImportItemsStmt}
	 * labeled alternative in {@link CWScriptParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportItemsStmt(CWScriptParser.ImportItemsStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportItemsStmt}
	 * labeled alternative in {@link CWScriptParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportItemsStmt(CWScriptParser.ImportItemsStmtContext ctx);
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
	 * Enter a parse tree produced by {@link CWScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(CWScriptParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(CWScriptParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#contractItem}.
	 * @param ctx the parse tree
	 */
	void enterContractItem(CWScriptParser.ContractItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#contractItem}.
	 * @param ctx the parse tree
	 */
	void exitContractItem(CWScriptParser.ContractItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#interfaceItem}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceItem(CWScriptParser.InterfaceItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#interfaceItem}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceItem(CWScriptParser.InterfaceItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#errorDefn}.
	 * @param ctx the parse tree
	 */
	void enterErrorDefn(CWScriptParser.ErrorDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#errorDefn}.
	 * @param ctx the parse tree
	 */
	void exitErrorDefn(CWScriptParser.ErrorDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#errorDefnBlock}.
	 * @param ctx the parse tree
	 */
	void enterErrorDefnBlock(CWScriptParser.ErrorDefnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#errorDefnBlock}.
	 * @param ctx the parse tree
	 */
	void exitErrorDefnBlock(CWScriptParser.ErrorDefnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#errorDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void enterErrorDefnBlock_item(CWScriptParser.ErrorDefnBlock_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#errorDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void exitErrorDefnBlock_item(CWScriptParser.ErrorDefnBlock_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#eventDefn}.
	 * @param ctx the parse tree
	 */
	void enterEventDefn(CWScriptParser.EventDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#eventDefn}.
	 * @param ctx the parse tree
	 */
	void exitEventDefn(CWScriptParser.EventDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#eventDefnBlock}.
	 * @param ctx the parse tree
	 */
	void enterEventDefnBlock(CWScriptParser.EventDefnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#eventDefnBlock}.
	 * @param ctx the parse tree
	 */
	void exitEventDefnBlock(CWScriptParser.EventDefnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#eventDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void enterEventDefnBlock_item(CWScriptParser.EventDefnBlock_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#eventDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void exitEventDefnBlock_item(CWScriptParser.EventDefnBlock_itemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateItemDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefn}.
	 * @param ctx the parse tree
	 */
	void enterStateItemDefn(CWScriptParser.StateItemDefnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateItemDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefn}.
	 * @param ctx the parse tree
	 */
	void exitStateItemDefn(CWScriptParser.StateItemDefnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateMapDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefn}.
	 * @param ctx the parse tree
	 */
	void enterStateMapDefn(CWScriptParser.StateMapDefnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateMapDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefn}.
	 * @param ctx the parse tree
	 */
	void exitStateMapDefn(CWScriptParser.StateMapDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#stateDefnBlock}.
	 * @param ctx the parse tree
	 */
	void enterStateDefnBlock(CWScriptParser.StateDefnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#stateDefnBlock}.
	 * @param ctx the parse tree
	 */
	void exitStateDefnBlock(CWScriptParser.StateDefnBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateBlockItemDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void enterStateBlockItemDefn(CWScriptParser.StateBlockItemDefnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateBlockItemDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void exitStateBlockItemDefn(CWScriptParser.StateBlockItemDefnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateBlockMapDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void enterStateBlockMapDefn(CWScriptParser.StateBlockMapDefnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateBlockMapDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void exitStateBlockMapDefn(CWScriptParser.StateBlockMapDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#itemDefn}.
	 * @param ctx the parse tree
	 */
	void enterItemDefn(CWScriptParser.ItemDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#itemDefn}.
	 * @param ctx the parse tree
	 */
	void exitItemDefn(CWScriptParser.ItemDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#mapDefn}.
	 * @param ctx the parse tree
	 */
	void enterMapDefn(CWScriptParser.MapDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#mapDefn}.
	 * @param ctx the parse tree
	 */
	void exitMapDefn(CWScriptParser.MapDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#mapDefnKeys}.
	 * @param ctx the parse tree
	 */
	void enterMapDefnKeys(CWScriptParser.MapDefnKeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#mapDefnKeys}.
	 * @param ctx the parse tree
	 */
	void exitMapDefnKeys(CWScriptParser.MapDefnKeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#mapDefnKey}.
	 * @param ctx the parse tree
	 */
	void enterMapDefnKey(CWScriptParser.MapDefnKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#mapDefnKey}.
	 * @param ctx the parse tree
	 */
	void exitMapDefnKey(CWScriptParser.MapDefnKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#instantiateDefn}.
	 * @param ctx the parse tree
	 */
	void enterInstantiateDefn(CWScriptParser.InstantiateDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#instantiateDefn}.
	 * @param ctx the parse tree
	 */
	void exitInstantiateDefn(CWScriptParser.InstantiateDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#instantiateDecl}.
	 * @param ctx the parse tree
	 */
	void enterInstantiateDecl(CWScriptParser.InstantiateDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#instantiateDecl}.
	 * @param ctx the parse tree
	 */
	void exitInstantiateDecl(CWScriptParser.InstantiateDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#execDefn}.
	 * @param ctx the parse tree
	 */
	void enterExecDefn(CWScriptParser.ExecDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#execDefn}.
	 * @param ctx the parse tree
	 */
	void exitExecDefn(CWScriptParser.ExecDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#execDefnBlock}.
	 * @param ctx the parse tree
	 */
	void enterExecDefnBlock(CWScriptParser.ExecDefnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#execDefnBlock}.
	 * @param ctx the parse tree
	 */
	void exitExecDefnBlock(CWScriptParser.ExecDefnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#execDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void enterExecDefnBlock_item(CWScriptParser.ExecDefnBlock_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#execDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void exitExecDefnBlock_item(CWScriptParser.ExecDefnBlock_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#execDecl}.
	 * @param ctx the parse tree
	 */
	void enterExecDecl(CWScriptParser.ExecDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#execDecl}.
	 * @param ctx the parse tree
	 */
	void exitExecDecl(CWScriptParser.ExecDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#execDeclBlock}.
	 * @param ctx the parse tree
	 */
	void enterExecDeclBlock(CWScriptParser.ExecDeclBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#execDeclBlock}.
	 * @param ctx the parse tree
	 */
	void exitExecDeclBlock(CWScriptParser.ExecDeclBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#execDeclBlock_item}.
	 * @param ctx the parse tree
	 */
	void enterExecDeclBlock_item(CWScriptParser.ExecDeclBlock_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#execDeclBlock_item}.
	 * @param ctx the parse tree
	 */
	void exitExecDeclBlock_item(CWScriptParser.ExecDeclBlock_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#queryDefn}.
	 * @param ctx the parse tree
	 */
	void enterQueryDefn(CWScriptParser.QueryDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#queryDefn}.
	 * @param ctx the parse tree
	 */
	void exitQueryDefn(CWScriptParser.QueryDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#queryDefnBlock}.
	 * @param ctx the parse tree
	 */
	void enterQueryDefnBlock(CWScriptParser.QueryDefnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#queryDefnBlock}.
	 * @param ctx the parse tree
	 */
	void exitQueryDefnBlock(CWScriptParser.QueryDefnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#queryDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void enterQueryDefnBlock_item(CWScriptParser.QueryDefnBlock_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#queryDefnBlock_item}.
	 * @param ctx the parse tree
	 */
	void exitQueryDefnBlock_item(CWScriptParser.QueryDefnBlock_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#queryDecl}.
	 * @param ctx the parse tree
	 */
	void enterQueryDecl(CWScriptParser.QueryDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#queryDecl}.
	 * @param ctx the parse tree
	 */
	void exitQueryDecl(CWScriptParser.QueryDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#queryDeclBlock}.
	 * @param ctx the parse tree
	 */
	void enterQueryDeclBlock(CWScriptParser.QueryDeclBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#queryDeclBlock}.
	 * @param ctx the parse tree
	 */
	void exitQueryDeclBlock(CWScriptParser.QueryDeclBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#queryDeclBlock_item}.
	 * @param ctx the parse tree
	 */
	void enterQueryDeclBlock_item(CWScriptParser.QueryDeclBlock_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#queryDeclBlock_item}.
	 * @param ctx the parse tree
	 */
	void exitQueryDeclBlock_item(CWScriptParser.QueryDeclBlock_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#migrateDefn}.
	 * @param ctx the parse tree
	 */
	void enterMigrateDefn(CWScriptParser.MigrateDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#migrateDefn}.
	 * @param ctx the parse tree
	 */
	void exitMigrateDefn(CWScriptParser.MigrateDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#migrateDecl}.
	 * @param ctx the parse tree
	 */
	void enterMigrateDecl(CWScriptParser.MigrateDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#migrateDecl}.
	 * @param ctx the parse tree
	 */
	void exitMigrateDecl(CWScriptParser.MigrateDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#enumVariant}.
	 * @param ctx the parse tree
	 */
	void enterEnumVariant(CWScriptParser.EnumVariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#enumVariant}.
	 * @param ctx the parse tree
	 */
	void exitEnumVariant(CWScriptParser.EnumVariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#enumVariant_struct}.
	 * @param ctx the parse tree
	 */
	void enterEnumVariant_struct(CWScriptParser.EnumVariant_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#enumVariant_struct}.
	 * @param ctx the parse tree
	 */
	void exitEnumVariant_struct(CWScriptParser.EnumVariant_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#enumVariant_tuple}.
	 * @param ctx the parse tree
	 */
	void enterEnumVariant_tuple(CWScriptParser.EnumVariant_tupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#enumVariant_tuple}.
	 * @param ctx the parse tree
	 */
	void exitEnumVariant_tuple(CWScriptParser.EnumVariant_tupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#tupleMembers}.
	 * @param ctx the parse tree
	 */
	void enterTupleMembers(CWScriptParser.TupleMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#tupleMembers}.
	 * @param ctx the parse tree
	 */
	void exitTupleMembers(CWScriptParser.TupleMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#parenStructMembers}.
	 * @param ctx the parse tree
	 */
	void enterParenStructMembers(CWScriptParser.ParenStructMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#parenStructMembers}.
	 * @param ctx the parse tree
	 */
	void exitParenStructMembers(CWScriptParser.ParenStructMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#curlyStructMembers}.
	 * @param ctx the parse tree
	 */
	void enterCurlyStructMembers(CWScriptParser.CurlyStructMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#curlyStructMembers}.
	 * @param ctx the parse tree
	 */
	void exitCurlyStructMembers(CWScriptParser.CurlyStructMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#structMember}.
	 * @param ctx the parse tree
	 */
	void enterStructMember(CWScriptParser.StructMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#structMember}.
	 * @param ctx the parse tree
	 */
	void exitStructMember(CWScriptParser.StructMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RefTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterRefTypeExpr(CWScriptParser.RefTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RefTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitRefTypeExpr(CWScriptParser.RefTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamzdTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterParamzdTypeExpr(CWScriptParser.ParamzdTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamzdTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitParamzdTypeExpr(CWScriptParser.ParamzdTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeExpr(CWScriptParser.TupleTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeExpr(CWScriptParser.TupleTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShortOptionTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterShortOptionTypeExpr(CWScriptParser.ShortOptionTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShortOptionTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitShortOptionTypeExpr(CWScriptParser.ShortOptionTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeDefnExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefnExpr(CWScriptParser.TypeDefnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDefnExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefnExpr(CWScriptParser.TypeDefnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypePathExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypePathExpr(CWScriptParser.TypePathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypePathExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypePathExpr(CWScriptParser.TypePathExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShortVecTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterShortVecTypeExpr(CWScriptParser.ShortVecTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShortVecTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitShortVecTypeExpr(CWScriptParser.ShortVecTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void enterTypeParam(CWScriptParser.TypeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void exitTypeParam(CWScriptParser.TypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#pathList}.
	 * @param ctx the parse tree
	 */
	void enterPathList(CWScriptParser.PathListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#pathList}.
	 * @param ctx the parse tree
	 */
	void exitPathList(CWScriptParser.PathListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#typePath}.
	 * @param ctx the parse tree
	 */
	void enterTypePath(CWScriptParser.TypePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#typePath}.
	 * @param ctx the parse tree
	 */
	void exitTypePath(CWScriptParser.TypePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#typeDefn}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefn(CWScriptParser.TypeDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#typeDefn}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefn(CWScriptParser.TypeDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#structDefn}.
	 * @param ctx the parse tree
	 */
	void enterStructDefn(CWScriptParser.StructDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#structDefn}.
	 * @param ctx the parse tree
	 */
	void exitStructDefn(CWScriptParser.StructDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#enumDefn}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefn(CWScriptParser.EnumDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#enumDefn}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefn(CWScriptParser.EnumDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#enumVariantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumVariantList(CWScriptParser.EnumVariantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#enumVariantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumVariantList(CWScriptParser.EnumVariantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#typeAliasDefn}.
	 * @param ctx the parse tree
	 */
	void enterTypeAliasDefn(CWScriptParser.TypeAliasDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#typeAliasDefn}.
	 * @param ctx the parse tree
	 */
	void exitTypeAliasDefn(CWScriptParser.TypeAliasDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#namedFnDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamedFnDecl(CWScriptParser.NamedFnDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#namedFnDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamedFnDecl(CWScriptParser.NamedFnDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#namedFnDefn}.
	 * @param ctx the parse tree
	 */
	void enterNamedFnDefn(CWScriptParser.NamedFnDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#namedFnDefn}.
	 * @param ctx the parse tree
	 */
	void exitNamedFnDefn(CWScriptParser.NamedFnDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#fnDefn}.
	 * @param ctx the parse tree
	 */
	void enterFnDefn(CWScriptParser.FnDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#fnDefn}.
	 * @param ctx the parse tree
	 */
	void exitFnDefn(CWScriptParser.FnDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#fnType}.
	 * @param ctx the parse tree
	 */
	void enterFnType(CWScriptParser.FnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#fnType}.
	 * @param ctx the parse tree
	 */
	void exitFnType(CWScriptParser.FnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#fnArgs}.
	 * @param ctx the parse tree
	 */
	void enterFnArgs(CWScriptParser.FnArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#fnArgs}.
	 * @param ctx the parse tree
	 */
	void exitFnArgs(CWScriptParser.FnArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#fnArgList}.
	 * @param ctx the parse tree
	 */
	void enterFnArgList(CWScriptParser.FnArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#fnArgList}.
	 * @param ctx the parse tree
	 */
	void exitFnArgList(CWScriptParser.FnArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#fnArg}.
	 * @param ctx the parse tree
	 */
	void enterFnArg(CWScriptParser.FnArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#fnArg}.
	 * @param ctx the parse tree
	 */
	void exitFnArg(CWScriptParser.FnArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalFnBody}
	 * labeled alternative in {@link CWScriptParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void enterNormalFnBody(CWScriptParser.NormalFnBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalFnBody}
	 * labeled alternative in {@link CWScriptParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void exitNormalFnBody(CWScriptParser.NormalFnBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFnBody}
	 * labeled alternative in {@link CWScriptParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFnBody(CWScriptParser.ArrowFnBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFnBody}
	 * labeled alternative in {@link CWScriptParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFnBody(CWScriptParser.ArrowFnBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(CWScriptParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(CWScriptParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(CWScriptParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(CWScriptParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CWScriptParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CWScriptParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(CWScriptParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(CWScriptParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExecStmt(CWScriptParser.ExecStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExecStmt(CWScriptParser.ExecStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecuteNowStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExecuteNowStmt(CWScriptParser.ExecuteNowStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecuteNowStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExecuteNowStmt(CWScriptParser.ExecuteNowStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmitStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterEmitStmt(CWScriptParser.EmitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmitStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitEmitStmt(CWScriptParser.EmitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(CWScriptParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(CWScriptParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FailStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFailStmt(CWScriptParser.FailStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FailStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFailStmt(CWScriptParser.FailStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(CWScriptParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(CWScriptParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#letStmt_}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt_(CWScriptParser.LetStmt_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#letStmt_}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt_(CWScriptParser.LetStmt_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentLHS}
	 * labeled alternative in {@link CWScriptParser#letLHS}.
	 * @param ctx the parse tree
	 */
	void enterIdentLHS(CWScriptParser.IdentLHSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentLHS}
	 * labeled alternative in {@link CWScriptParser#letLHS}.
	 * @param ctx the parse tree
	 */
	void exitIdentLHS(CWScriptParser.IdentLHSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructUnpackLHS}
	 * labeled alternative in {@link CWScriptParser#letLHS}.
	 * @param ctx the parse tree
	 */
	void enterStructUnpackLHS(CWScriptParser.StructUnpackLHSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructUnpackLHS}
	 * labeled alternative in {@link CWScriptParser#letLHS}.
	 * @param ctx the parse tree
	 */
	void exitStructUnpackLHS(CWScriptParser.StructUnpackLHSContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#assignStmt_}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt_(CWScriptParser.AssignStmt_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#assignStmt_}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt_(CWScriptParser.AssignStmt_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code StateItemAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void enterStateItemAssignLHS(CWScriptParser.StateItemAssignLHSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateItemAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void exitStateItemAssignLHS(CWScriptParser.StateItemAssignLHSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateMapAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void enterStateMapAssignLHS(CWScriptParser.StateMapAssignLHSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateMapAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void exitStateMapAssignLHS(CWScriptParser.StateMapAssignLHSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void enterIdentAssignLHS(CWScriptParser.IdentAssignLHSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void exitIdentAssignLHS(CWScriptParser.IdentAssignLHSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void enterMemberAssignLHS(CWScriptParser.MemberAssignLHSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void exitMemberAssignLHS(CWScriptParser.MemberAssignLHSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void enterTableAssignLHS(CWScriptParser.TableAssignLHSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 */
	void exitTableAssignLHS(CWScriptParser.TableAssignLHSContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#innerAssign}.
	 * @param ctx the parse tree
	 */
	void enterInnerAssign(CWScriptParser.InnerAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#innerAssign}.
	 * @param ctx the parse tree
	 */
	void exitInnerAssign(CWScriptParser.InnerAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#innerPath}.
	 * @param ctx the parse tree
	 */
	void enterInnerPath(CWScriptParser.InnerPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#innerPath}.
	 * @param ctx the parse tree
	 */
	void exitInnerPath(CWScriptParser.InnerPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#msg}.
	 * @param ctx the parse tree
	 */
	void enterMsg(CWScriptParser.MsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#msg}.
	 * @param ctx the parse tree
	 */
	void exitMsg(CWScriptParser.MsgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(CWScriptParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(CWScriptParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(CWScriptParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(CWScriptParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivModExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivModExpr(CWScriptParser.MultDivModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivModExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivModExpr(CWScriptParser.MultDivModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QueryExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpr(CWScriptParser.QueryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpr(CWScriptParser.QueryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosArgsFnCallExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPosArgsFnCallExpr(CWScriptParser.PosArgsFnCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosArgsFnCallExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPosArgsFnCallExpr(CWScriptParser.PosArgsFnCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValExpr(CWScriptParser.ValExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValExpr(CWScriptParser.ValExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(CWScriptParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(CWScriptParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpExpr(CWScriptParser.ExpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpExpr(CWScriptParser.ExpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(CWScriptParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(CWScriptParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(CWScriptParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(CWScriptParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateMapAccessExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStateMapAccessExpr(CWScriptParser.StateMapAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateMapAccessExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStateMapAccessExpr(CWScriptParser.StateMapAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateItemAccessExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStateItemAccessExpr(CWScriptParser.StateItemAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateItemAccessExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStateItemAccessExpr(CWScriptParser.StateItemAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(CWScriptParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(CWScriptParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedArgsFnCallExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgsFnCallExpr(CWScriptParser.NamedArgsFnCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedArgsFnCallExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgsFnCallExpr(CWScriptParser.NamedArgsFnCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableLookupExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTableLookupExpr(CWScriptParser.TableLookupExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableLookupExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTableLookupExpr(CWScriptParser.TableLookupExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpr(CWScriptParser.MemberAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpr(CWScriptParser.MemberAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(CWScriptParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(CWScriptParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupedExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGroupedExpr(CWScriptParser.GroupedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupedExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGroupedExpr(CWScriptParser.GroupedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void enterUnitVal(CWScriptParser.UnitValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void exitUnitVal(CWScriptParser.UnitValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void enterStructVal(CWScriptParser.StructValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void exitStructVal(CWScriptParser.StructValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void enterTupleVal(CWScriptParser.TupleValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void exitTupleVal(CWScriptParser.TupleValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VecVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVecVal(CWScriptParser.VecValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VecVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVecVal(CWScriptParser.VecValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void enterStringVal(CWScriptParser.StringValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void exitStringVal(CWScriptParser.StringValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void enterIntegerVal(CWScriptParser.IntegerValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void exitIntegerVal(CWScriptParser.IntegerValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void enterDecimalVal(CWScriptParser.DecimalValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void exitDecimalVal(CWScriptParser.DecimalValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void enterTrueVal(CWScriptParser.TrueValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void exitTrueVal(CWScriptParser.TrueValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void enterFalseVal(CWScriptParser.FalseValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void exitFalseVal(CWScriptParser.FalseValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void enterIdentVal(CWScriptParser.IdentValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 */
	void exitIdentVal(CWScriptParser.IdentValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#structVal_}.
	 * @param ctx the parse tree
	 */
	void enterStructVal_(CWScriptParser.StructVal_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#structVal_}.
	 * @param ctx the parse tree
	 */
	void exitStructVal_(CWScriptParser.StructVal_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#structValMembers}.
	 * @param ctx the parse tree
	 */
	void enterStructValMembers(CWScriptParser.StructValMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#structValMembers}.
	 * @param ctx the parse tree
	 */
	void exitStructValMembers(CWScriptParser.StructValMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#structValMember}.
	 * @param ctx the parse tree
	 */
	void enterStructValMember(CWScriptParser.StructValMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#structValMember}.
	 * @param ctx the parse tree
	 */
	void exitStructValMember(CWScriptParser.StructValMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#ifExpr_}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr_(CWScriptParser.IfExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#ifExpr_}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr_(CWScriptParser.IfExpr_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code IfClause}
	 * labeled alternative in {@link CWScriptParser#ifClause_}.
	 * @param ctx the parse tree
	 */
	void enterIfClause(CWScriptParser.IfClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfClause}
	 * labeled alternative in {@link CWScriptParser#ifClause_}.
	 * @param ctx the parse tree
	 */
	void exitIfClause(CWScriptParser.IfClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfLetClause}
	 * labeled alternative in {@link CWScriptParser#ifClause_}.
	 * @param ctx the parse tree
	 */
	void enterIfLetClause(CWScriptParser.IfLetClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfLetClause}
	 * labeled alternative in {@link CWScriptParser#ifClause_}.
	 * @param ctx the parse tree
	 */
	void exitIfLetClause(CWScriptParser.IfLetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#elseIfClauses}.
	 * @param ctx the parse tree
	 */
	void enterElseIfClauses(CWScriptParser.ElseIfClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#elseIfClauses}.
	 * @param ctx the parse tree
	 */
	void exitElseIfClauses(CWScriptParser.ElseIfClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(CWScriptParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(CWScriptParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStmt}
	 * labeled alternative in {@link CWScriptParser#forStmt_}.
	 * @param ctx the parse tree
	 */
	void enterForInStmt(CWScriptParser.ForInStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStmt}
	 * labeled alternative in {@link CWScriptParser#forStmt_}.
	 * @param ctx the parse tree
	 */
	void exitForInStmt(CWScriptParser.ForInStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForTimesStmt}
	 * labeled alternative in {@link CWScriptParser#forStmt_}.
	 * @param ctx the parse tree
	 */
	void enterForTimesStmt(CWScriptParser.ForTimesStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForTimesStmt}
	 * labeled alternative in {@link CWScriptParser#forStmt_}.
	 * @param ctx the parse tree
	 */
	void exitForTimesStmt(CWScriptParser.ForTimesStmtContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CWScriptParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CWScriptParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#namedExprList}.
	 * @param ctx the parse tree
	 */
	void enterNamedExprList(CWScriptParser.NamedExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#namedExprList}.
	 * @param ctx the parse tree
	 */
	void exitNamedExprList(CWScriptParser.NamedExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#namedExpr}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpr(CWScriptParser.NamedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#namedExpr}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpr(CWScriptParser.NamedExprContext ctx);
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
	 * Enter a parse tree produced by {@link CWScriptParser#cwspec}.
	 * @param ctx the parse tree
	 */
	void enterCwspec(CWScriptParser.CwspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#cwspec}.
	 * @param ctx the parse tree
	 */
	void exitCwspec(CWScriptParser.CwspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWScriptParser#reservedKeyword}.
	 * @param ctx the parse tree
	 */
	void enterReservedKeyword(CWScriptParser.ReservedKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWScriptParser#reservedKeyword}.
	 * @param ctx the parse tree
	 */
	void exitReservedKeyword(CWScriptParser.ReservedKeywordContext ctx);
}