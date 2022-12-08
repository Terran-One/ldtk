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
	 * Visit a parse tree produced by {@link CWScriptParser#interfaceDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDefn(CWScriptParser.InterfaceDefnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportAllStmt}
	 * labeled alternative in {@link CWScriptParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAllStmt(CWScriptParser.ImportAllStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportItemsStmt}
	 * labeled alternative in {@link CWScriptParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItemsStmt(CWScriptParser.ImportItemsStmtContext ctx);
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
	 * Visit a parse tree produced by {@link CWScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(CWScriptParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#contractItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractItem(CWScriptParser.ContractItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#interfaceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceItem(CWScriptParser.InterfaceItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#errorDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorDefn(CWScriptParser.ErrorDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#errorDefnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorDefnBlock(CWScriptParser.ErrorDefnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#errorDefnBlock_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorDefnBlock_item(CWScriptParser.ErrorDefnBlock_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#eventDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDefn(CWScriptParser.EventDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#eventDefnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDefnBlock(CWScriptParser.EventDefnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#eventDefnBlock_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDefnBlock_item(CWScriptParser.EventDefnBlock_itemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateItemDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateItemDefn(CWScriptParser.StateItemDefnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateMapDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMapDefn(CWScriptParser.StateMapDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#stateDefnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateDefnBlock(CWScriptParser.StateDefnBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateBlockItemDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefnBlock_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateBlockItemDefn(CWScriptParser.StateBlockItemDefnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateBlockMapDefn}
	 * labeled alternative in {@link CWScriptParser#stateDefnBlock_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateBlockMapDefn(CWScriptParser.StateBlockMapDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#itemDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemDefn(CWScriptParser.ItemDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#mapDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapDefn(CWScriptParser.MapDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#mapDefnKeys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapDefnKeys(CWScriptParser.MapDefnKeysContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#mapDefnKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapDefnKey(CWScriptParser.MapDefnKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#instantiateDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiateDefn(CWScriptParser.InstantiateDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#instantiateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiateDecl(CWScriptParser.InstantiateDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#execDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecDefn(CWScriptParser.ExecDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#execDefnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecDefnBlock(CWScriptParser.ExecDefnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#execDefnBlock_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecDefnBlock_item(CWScriptParser.ExecDefnBlock_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#execDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecDecl(CWScriptParser.ExecDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#execDeclBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecDeclBlock(CWScriptParser.ExecDeclBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#execDeclBlock_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecDeclBlock_item(CWScriptParser.ExecDeclBlock_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#queryDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryDefn(CWScriptParser.QueryDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#queryDefnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryDefnBlock(CWScriptParser.QueryDefnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#queryDefnBlock_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryDefnBlock_item(CWScriptParser.QueryDefnBlock_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#queryDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryDecl(CWScriptParser.QueryDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#queryDeclBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryDeclBlock(CWScriptParser.QueryDeclBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#queryDeclBlock_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryDeclBlock_item(CWScriptParser.QueryDeclBlock_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#migrateDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMigrateDefn(CWScriptParser.MigrateDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#migrateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMigrateDecl(CWScriptParser.MigrateDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#enumVariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumVariant(CWScriptParser.EnumVariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#enumVariant_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumVariant_struct(CWScriptParser.EnumVariant_structContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#enumVariant_tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumVariant_tuple(CWScriptParser.EnumVariant_tupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#tupleMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleMembers(CWScriptParser.TupleMembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#parenStructMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenStructMembers(CWScriptParser.ParenStructMembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#curlyStructMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurlyStructMembers(CWScriptParser.CurlyStructMembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#structMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructMember(CWScriptParser.StructMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RefTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefTypeExpr(CWScriptParser.RefTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamzdTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamzdTypeExpr(CWScriptParser.ParamzdTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleTypeExpr(CWScriptParser.TupleTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortOptionTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortOptionTypeExpr(CWScriptParser.ShortOptionTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDefnExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefnExpr(CWScriptParser.TypeDefnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypePathExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePathExpr(CWScriptParser.TypePathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortVecTypeExpr}
	 * labeled alternative in {@link CWScriptParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortVecTypeExpr(CWScriptParser.ShortVecTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#typeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParam(CWScriptParser.TypeParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#pathList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathList(CWScriptParser.PathListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#typePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePath(CWScriptParser.TypePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#typeDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefn(CWScriptParser.TypeDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#structDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefn(CWScriptParser.StructDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#enumDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefn(CWScriptParser.EnumDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#enumVariantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumVariantList(CWScriptParser.EnumVariantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#typeAliasDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasDefn(CWScriptParser.TypeAliasDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#namedFnDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFnDecl(CWScriptParser.NamedFnDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#namedFnDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFnDefn(CWScriptParser.NamedFnDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#fnDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnDefn(CWScriptParser.FnDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#fnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnType(CWScriptParser.FnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#fnArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnArgs(CWScriptParser.FnArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#fnArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnArgList(CWScriptParser.FnArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#fnArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnArg(CWScriptParser.FnArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalFnBody}
	 * labeled alternative in {@link CWScriptParser#fnBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFnBody(CWScriptParser.NormalFnBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFnBody}
	 * labeled alternative in {@link CWScriptParser#fnBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFnBody(CWScriptParser.ArrowFnBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt(CWScriptParser.LetStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(CWScriptParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CWScriptParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(CWScriptParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExecStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecStmt(CWScriptParser.ExecStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExecuteNowStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteNowStmt(CWScriptParser.ExecuteNowStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmitStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStmt(CWScriptParser.EmitStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(CWScriptParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FailStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailStmt(CWScriptParser.FailStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link CWScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(CWScriptParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#letStmt_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt_(CWScriptParser.LetStmt_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentLHS}
	 * labeled alternative in {@link CWScriptParser#letLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentLHS(CWScriptParser.IdentLHSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructUnpackLHS}
	 * labeled alternative in {@link CWScriptParser#letLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructUnpackLHS(CWScriptParser.StructUnpackLHSContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#assignStmt_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt_(CWScriptParser.AssignStmt_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code StateItemAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateItemAssignLHS(CWScriptParser.StateItemAssignLHSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateMapAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMapAssignLHS(CWScriptParser.StateMapAssignLHSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentAssignLHS(CWScriptParser.IdentAssignLHSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAssignLHS(CWScriptParser.MemberAssignLHSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableAssignLHS}
	 * labeled alternative in {@link CWScriptParser#assignLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAssignLHS(CWScriptParser.TableAssignLHSContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#innerAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerAssign(CWScriptParser.InnerAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#innerPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerPath(CWScriptParser.InnerPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#msg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsg(CWScriptParser.MsgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(CWScriptParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(CWScriptParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDivModExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivModExpr(CWScriptParser.MultDivModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QueryExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpr(CWScriptParser.QueryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosArgsFnCallExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosArgsFnCallExpr(CWScriptParser.PosArgsFnCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExpr(CWScriptParser.ValExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(CWScriptParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpExpr(CWScriptParser.ExpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(CWScriptParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(CWScriptParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateMapAccessExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMapAccessExpr(CWScriptParser.StateMapAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateItemAccessExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateItemAccessExpr(CWScriptParser.StateItemAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(CWScriptParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedArgsFnCallExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgsFnCallExpr(CWScriptParser.NamedArgsFnCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableLookupExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLookupExpr(CWScriptParser.TableLookupExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessExpr(CWScriptParser.MemberAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(CWScriptParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupedExpr}
	 * labeled alternative in {@link CWScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupedExpr(CWScriptParser.GroupedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitVal(CWScriptParser.UnitValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructVal(CWScriptParser.StructValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleVal(CWScriptParser.TupleValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VecVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVecVal(CWScriptParser.VecValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVal(CWScriptParser.StringValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerVal(CWScriptParser.IntegerValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalVal(CWScriptParser.DecimalValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueVal(CWScriptParser.TrueValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseVal(CWScriptParser.FalseValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentVal}
	 * labeled alternative in {@link CWScriptParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentVal(CWScriptParser.IdentValContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#structVal_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructVal_(CWScriptParser.StructVal_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#structValMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructValMembers(CWScriptParser.StructValMembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#structValMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructValMember(CWScriptParser.StructValMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#ifExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr_(CWScriptParser.IfExpr_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code IfClause}
	 * labeled alternative in {@link CWScriptParser#ifClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClause(CWScriptParser.IfClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfLetClause}
	 * labeled alternative in {@link CWScriptParser#ifClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLetClause(CWScriptParser.IfLetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#elseIfClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfClauses(CWScriptParser.ElseIfClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(CWScriptParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInStmt}
	 * labeled alternative in {@link CWScriptParser#forStmt_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStmt(CWScriptParser.ForInStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForTimesStmt}
	 * labeled alternative in {@link CWScriptParser#forStmt_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForTimesStmt(CWScriptParser.ForTimesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#identList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentList(CWScriptParser.IdentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(CWScriptParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#namedExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExprList(CWScriptParser.NamedExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#namedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpr(CWScriptParser.NamedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(CWScriptParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#cwspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCwspec(CWScriptParser.CwspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWScriptParser#reservedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedKeyword(CWScriptParser.ReservedKeywordContext ctx);
}