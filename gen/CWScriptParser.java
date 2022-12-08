// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CWScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONTRACT=1, EXTENDS=2, IMPLEMENTS=3, INTERFACE=4, IMPORT=5, MUL=6, FROM=7, 
		StringLiteral=8, LPAREN=9, COMMA=10, RPAREN=11, AS=12, LBRACE=13, RBRACE=14, 
		ERROR=15, EVENT=16, STATE=17, COLON=18, LBRACK=19, RBRACK=20, INSTANTIATE=21, 
		EXEC=22, QUERY=23, MIGRATE=24, QUEST=25, AMP=26, LT=27, GT=28, D_COLON=29, 
		STRUCT=30, ENUM=31, TYPE=32, EQ=33, FN=34, ARROW=35, FAT_ARROW=36, EXECUTE_NOW=37, 
		EMIT=38, RETURN=39, FAIL=40, LET=41, PLUS_EQ=42, MINUS_EQ=43, MUL_EQ=44, 
		DIV_EQ=45, MOD_EQ=46, DOT=47, HASH=48, PLUS=49, MINUS=50, EXCLAM=51, POW=52, 
		DIV=53, MOD=54, LT_EQ=55, GT_EQ=56, EQEQ=57, NEQ=58, AND=59, OR=60, IntegerLiteral=61, 
		DecimalLiteral=62, TRUE=63, FALSE=64, IF=65, ELSE=66, FOR=67, IN=68, TIMES=69, 
		Ident=70, CWSPEC_LINE_COMMENT=71, CWSPEC_BLOCK_COMMENT=72;
	public static final int
		RULE_sourceFile = 0, RULE_topLevelStmt = 1, RULE_contractDefn = 2, RULE_interfaceDefn = 3, 
		RULE_importStmt = 4, RULE_importList = 5, RULE_importItem = 6, RULE_contractBody = 7, 
		RULE_interfaceBody = 8, RULE_contractItem = 9, RULE_interfaceItem = 10, 
		RULE_errorDefn = 11, RULE_errorDefnBlock = 12, RULE_errorDefnBlock_item = 13, 
		RULE_eventDefn = 14, RULE_eventDefnBlock = 15, RULE_eventDefnBlock_item = 16, 
		RULE_stateDefn = 17, RULE_stateDefnBlock = 18, RULE_stateDefnBlock_item = 19, 
		RULE_itemDefn = 20, RULE_mapDefn = 21, RULE_mapDefnKeys = 22, RULE_mapDefnKey = 23, 
		RULE_instantiateDefn = 24, RULE_instantiateDecl = 25, RULE_execDefn = 26, 
		RULE_execDefnBlock = 27, RULE_execDefnBlock_item = 28, RULE_execDecl = 29, 
		RULE_execDeclBlock = 30, RULE_execDeclBlock_item = 31, RULE_queryDefn = 32, 
		RULE_queryDefnBlock = 33, RULE_queryDefnBlock_item = 34, RULE_queryDecl = 35, 
		RULE_queryDeclBlock = 36, RULE_queryDeclBlock_item = 37, RULE_migrateDefn = 38, 
		RULE_migrateDecl = 39, RULE_enumVariant = 40, RULE_enumVariant_struct = 41, 
		RULE_enumVariant_tuple = 42, RULE_tupleMembers = 43, RULE_parenStructMembers = 44, 
		RULE_curlyStructMembers = 45, RULE_structMember = 46, RULE_typeExpr = 47, 
		RULE_typeParam = 48, RULE_pathList = 49, RULE_typePath = 50, RULE_typeDefn = 51, 
		RULE_structDefn = 52, RULE_enumDefn = 53, RULE_enumVariantList = 54, RULE_typeAliasDefn = 55, 
		RULE_namedFnDecl = 56, RULE_namedFnDefn = 57, RULE_fnDefn = 58, RULE_fnType = 59, 
		RULE_fnArgs = 60, RULE_fnArgList = 61, RULE_fnArg = 62, RULE_fnBody = 63, 
		RULE_stmt = 64, RULE_letStmt_ = 65, RULE_letLHS = 66, RULE_assignStmt_ = 67, 
		RULE_assignLHS = 68, RULE_innerAssign = 69, RULE_innerPath = 70, RULE_msg = 71, 
		RULE_expr = 72, RULE_val = 73, RULE_structVal_ = 74, RULE_structValMembers = 75, 
		RULE_structValMember = 76, RULE_ifExpr_ = 77, RULE_ifClause_ = 78, RULE_elseIfClauses = 79, 
		RULE_elseClause = 80, RULE_forStmt_ = 81, RULE_identList = 82, RULE_exprList = 83, 
		RULE_namedExprList = 84, RULE_namedExpr = 85, RULE_ident = 86, RULE_cwspec = 87, 
		RULE_reservedKeyword = 88;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "topLevelStmt", "contractDefn", "interfaceDefn", "importStmt", 
			"importList", "importItem", "contractBody", "interfaceBody", "contractItem", 
			"interfaceItem", "errorDefn", "errorDefnBlock", "errorDefnBlock_item", 
			"eventDefn", "eventDefnBlock", "eventDefnBlock_item", "stateDefn", "stateDefnBlock", 
			"stateDefnBlock_item", "itemDefn", "mapDefn", "mapDefnKeys", "mapDefnKey", 
			"instantiateDefn", "instantiateDecl", "execDefn", "execDefnBlock", "execDefnBlock_item", 
			"execDecl", "execDeclBlock", "execDeclBlock_item", "queryDefn", "queryDefnBlock", 
			"queryDefnBlock_item", "queryDecl", "queryDeclBlock", "queryDeclBlock_item", 
			"migrateDefn", "migrateDecl", "enumVariant", "enumVariant_struct", "enumVariant_tuple", 
			"tupleMembers", "parenStructMembers", "curlyStructMembers", "structMember", 
			"typeExpr", "typeParam", "pathList", "typePath", "typeDefn", "structDefn", 
			"enumDefn", "enumVariantList", "typeAliasDefn", "namedFnDecl", "namedFnDefn", 
			"fnDefn", "fnType", "fnArgs", "fnArgList", "fnArg", "fnBody", "stmt", 
			"letStmt_", "letLHS", "assignStmt_", "assignLHS", "innerAssign", "innerPath", 
			"msg", "expr", "val", "structVal_", "structValMembers", "structValMember", 
			"ifExpr_", "ifClause_", "elseIfClauses", "elseClause", "forStmt_", "identList", 
			"exprList", "namedExprList", "namedExpr", "ident", "cwspec", "reservedKeyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONTRACT", "EXTENDS", "IMPLEMENTS", "INTERFACE", "IMPORT", "MUL", 
			"FROM", "StringLiteral", "LPAREN", "COMMA", "RPAREN", "AS", "LBRACE", 
			"RBRACE", "ERROR", "EVENT", "STATE", "COLON", "LBRACK", "RBRACK", "INSTANTIATE", 
			"EXEC", "QUERY", "MIGRATE", "QUEST", "AMP", "LT", "GT", "D_COLON", "STRUCT", 
			"ENUM", "TYPE", "EQ", "FN", "ARROW", "FAT_ARROW", "EXECUTE_NOW", "EMIT", 
			"RETURN", "FAIL", "LET", "PLUS_EQ", "MINUS_EQ", "MUL_EQ", "DIV_EQ", "MOD_EQ", 
			"DOT", "HASH", "PLUS", "MINUS", "EXCLAM", "POW", "DIV", "MOD", "LT_EQ", 
			"GT_EQ", "EQEQ", "NEQ", "AND", "OR", "IntegerLiteral", "DecimalLiteral", 
			"TRUE", "FALSE", "IF", "ELSE", "FOR", "IN", "TIMES", "Ident", "CWSPEC_LINE_COMMENT", 
			"CWSPEC_BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CWScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceFileContext extends ParserRuleContext {
		public CwspecContext spec;
		public List<TopLevelStmtContext> topLevelStmt() {
			return getRuleContexts(TopLevelStmtContext.class);
		}
		public TopLevelStmtContext topLevelStmt(int i) {
			return getRuleContext(TopLevelStmtContext.class,i);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitSourceFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(178);
				((SourceFileContext)_localctx).spec = cwspec();
				}
				break;
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 50L) != 0 || _la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				{
				setState(181);
				topLevelStmt();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelStmtContext extends ParserRuleContext {
		public ContractDefnContext contractDefn() {
			return getRuleContext(ContractDefnContext.class,0);
		}
		public InterfaceDefnContext interfaceDefn() {
			return getRuleContext(InterfaceDefnContext.class,0);
		}
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public TopLevelStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTopLevelStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTopLevelStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTopLevelStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelStmtContext topLevelStmt() throws RecognitionException {
		TopLevelStmtContext _localctx = new TopLevelStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevelStmt);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				contractDefn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				interfaceDefn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				importStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContractDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public IdentContext name;
		public IdentListContext baseContracts;
		public IdentListContext interfaces;
		public TerminalNode CONTRACT() { return getToken(CWScriptParser.CONTRACT, 0); }
		public ContractBodyContext contractBody() {
			return getRuleContext(ContractBodyContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(CWScriptParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(CWScriptParser.IMPLEMENTS, 0); }
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public List<IdentListContext> identList() {
			return getRuleContexts(IdentListContext.class);
		}
		public IdentListContext identList(int i) {
			return getRuleContext(IdentListContext.class,i);
		}
		public ContractDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterContractDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitContractDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitContractDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefnContext contractDefn() throws RecognitionException {
		ContractDefnContext _localctx = new ContractDefnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_contractDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(192);
				((ContractDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(195);
			match(CONTRACT);
			{
			setState(196);
			((ContractDefnContext)_localctx).name = ident();
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(197);
				match(EXTENDS);
				setState(198);
				((ContractDefnContext)_localctx).baseContracts = identList();
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(201);
				match(IMPLEMENTS);
				{
				setState(202);
				((ContractDefnContext)_localctx).interfaces = identList();
				}
				}
			}

			setState(205);
			contractBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public IdentContext name;
		public IdentListContext baseInterfaces;
		public TerminalNode INTERFACE() { return getToken(CWScriptParser.INTERFACE, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(CWScriptParser.EXTENDS, 0); }
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public IdentListContext identList() {
			return getRuleContext(IdentListContext.class,0);
		}
		public InterfaceDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterInterfaceDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitInterfaceDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitInterfaceDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDefnContext interfaceDefn() throws RecognitionException {
		InterfaceDefnContext _localctx = new InterfaceDefnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interfaceDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(207);
				((InterfaceDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(210);
			match(INTERFACE);
			{
			setState(211);
			((InterfaceDefnContext)_localctx).name = ident();
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(212);
				match(EXTENDS);
				setState(213);
				((InterfaceDefnContext)_localctx).baseInterfaces = identList();
				}
			}

			setState(216);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtContext extends ParserRuleContext {
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
	 
		public ImportStmtContext() { }
		public void copyFrom(ImportStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemsStmtContext extends ImportStmtContext {
		public ImportListContext items;
		public Token fileName;
		public TerminalNode IMPORT() { return getToken(CWScriptParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(CWScriptParser.FROM, 0); }
		public TerminalNode StringLiteral() { return getToken(CWScriptParser.StringLiteral, 0); }
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CWScriptParser.COMMA, 0); }
		public ImportItemsStmtContext(ImportStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterImportItemsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitImportItemsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitImportItemsStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportAllStmtContext extends ImportStmtContext {
		public Token fileName;
		public TerminalNode IMPORT() { return getToken(CWScriptParser.IMPORT, 0); }
		public TerminalNode MUL() { return getToken(CWScriptParser.MUL, 0); }
		public TerminalNode FROM() { return getToken(CWScriptParser.FROM, 0); }
		public TerminalNode StringLiteral() { return getToken(CWScriptParser.StringLiteral, 0); }
		public ImportAllStmtContext(ImportStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterImportAllStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitImportAllStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitImportAllStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStmt);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ImportAllStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(IMPORT);
				setState(219);
				match(MUL);
				setState(220);
				match(FROM);
				{
				setState(221);
				((ImportAllStmtContext)_localctx).fileName = match(StringLiteral);
				}
				}
				break;
			case 2:
				_localctx = new ImportItemsStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(IMPORT);
				setState(231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					{
					setState(223);
					match(LPAREN);
					{
					setState(224);
					((ImportItemsStmtContext)_localctx).items = importList();
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(225);
						match(COMMA);
						}
					}

					setState(228);
					match(RPAREN);
					}
					}
					break;
				case CONTRACT:
				case EXTENDS:
				case IMPLEMENTS:
				case INTERFACE:
				case IMPORT:
				case FROM:
				case ERROR:
				case EVENT:
				case STATE:
				case INSTANTIATE:
				case EXEC:
				case QUERY:
				case MIGRATE:
				case STRUCT:
				case ENUM:
				case TYPE:
				case FN:
				case EMIT:
				case RETURN:
				case LET:
				case AND:
				case OR:
				case TRUE:
				case FALSE:
				case IF:
				case ELSE:
				case FOR:
				case IN:
				case TIMES:
				case Ident:
					{
					{
					setState(230);
					((ImportItemsStmtContext)_localctx).items = importList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233);
				match(FROM);
				{
				setState(234);
				((ImportItemsStmtContext)_localctx).fileName = match(StringLiteral);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportListContext extends ParserRuleContext {
		public ImportItemContext importItem;
		public List<ImportItemContext> importItems = new ArrayList<ImportItemContext>();
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(238);
			((ImportListContext)_localctx).importItem = importItem();
			((ImportListContext)_localctx).importItems.add(((ImportListContext)_localctx).importItem);
			}
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					match(COMMA);
					{
					setState(240);
					((ImportListContext)_localctx).importItem = importItem();
					((ImportListContext)_localctx).importItems.add(((ImportListContext)_localctx).importItem);
					}
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemContext extends ParserRuleContext {
		public IdentContext symbol;
		public IdentContext alias;
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode AS() { return getToken(CWScriptParser.AS, 0); }
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterImportItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitImportItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitImportItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			((ImportItemContext)_localctx).symbol = ident();
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(247);
				match(AS);
				setState(248);
				((ImportItemContext)_localctx).alias = ident();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContractBodyContext extends ParserRuleContext {
		public ContractItemContext items;
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<ContractItemContext> contractItem() {
			return getRuleContexts(ContractItemContext.class);
		}
		public ContractItemContext contractItem(int i) {
			return getRuleContext(ContractItemContext.class,i);
		}
		public ContractBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterContractBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitContractBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitContractBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractBodyContext contractBody() throws RecognitionException {
		ContractBodyContext _localctx = new ContractBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contractBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LBRACE);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & 216172782114538439L) != 0) {
				{
				{
				setState(252);
				((ContractBodyContext)_localctx).items = contractItem();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceItemContext items;
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<InterfaceItemContext> interfaceItem() {
			return getRuleContexts(InterfaceItemContext.class);
		}
		public InterfaceItemContext interfaceItem(int i) {
			return getRuleContext(InterfaceItemContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(LBRACE);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & 216172782114014151L) != 0) {
				{
				{
				setState(261);
				((InterfaceBodyContext)_localctx).items = interfaceItem();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContractItemContext extends ParserRuleContext {
		public TypeDefnContext typeDefn() {
			return getRuleContext(TypeDefnContext.class,0);
		}
		public FnDefnContext fnDefn() {
			return getRuleContext(FnDefnContext.class,0);
		}
		public ErrorDefnContext errorDefn() {
			return getRuleContext(ErrorDefnContext.class,0);
		}
		public ErrorDefnBlockContext errorDefnBlock() {
			return getRuleContext(ErrorDefnBlockContext.class,0);
		}
		public EventDefnContext eventDefn() {
			return getRuleContext(EventDefnContext.class,0);
		}
		public EventDefnBlockContext eventDefnBlock() {
			return getRuleContext(EventDefnBlockContext.class,0);
		}
		public StateDefnContext stateDefn() {
			return getRuleContext(StateDefnContext.class,0);
		}
		public StateDefnBlockContext stateDefnBlock() {
			return getRuleContext(StateDefnBlockContext.class,0);
		}
		public InstantiateDefnContext instantiateDefn() {
			return getRuleContext(InstantiateDefnContext.class,0);
		}
		public ExecDefnContext execDefn() {
			return getRuleContext(ExecDefnContext.class,0);
		}
		public ExecDefnBlockContext execDefnBlock() {
			return getRuleContext(ExecDefnBlockContext.class,0);
		}
		public QueryDefnContext queryDefn() {
			return getRuleContext(QueryDefnContext.class,0);
		}
		public QueryDefnBlockContext queryDefnBlock() {
			return getRuleContext(QueryDefnBlockContext.class,0);
		}
		public MigrateDefnContext migrateDefn() {
			return getRuleContext(MigrateDefnContext.class,0);
		}
		public ContractItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterContractItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitContractItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitContractItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractItemContext contractItem() throws RecognitionException {
		ContractItemContext _localctx = new ContractItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contractItem);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				typeDefn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				fnDefn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				errorDefn();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				errorDefnBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				eventDefn();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				eventDefnBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				stateDefn();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				stateDefnBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(277);
				instantiateDefn();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(278);
				execDefn();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(279);
				execDefnBlock();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(280);
				queryDefn();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(281);
				queryDefnBlock();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(282);
				migrateDefn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceItemContext extends ParserRuleContext {
		public TypeDefnContext typeDefn() {
			return getRuleContext(TypeDefnContext.class,0);
		}
		public ErrorDefnContext errorDefn() {
			return getRuleContext(ErrorDefnContext.class,0);
		}
		public ErrorDefnBlockContext errorDefnBlock() {
			return getRuleContext(ErrorDefnBlockContext.class,0);
		}
		public EventDefnContext eventDefn() {
			return getRuleContext(EventDefnContext.class,0);
		}
		public EventDefnBlockContext eventDefnBlock() {
			return getRuleContext(EventDefnBlockContext.class,0);
		}
		public StateDefnContext stateDefn() {
			return getRuleContext(StateDefnContext.class,0);
		}
		public StateDefnBlockContext stateDefnBlock() {
			return getRuleContext(StateDefnBlockContext.class,0);
		}
		public InstantiateDeclContext instantiateDecl() {
			return getRuleContext(InstantiateDeclContext.class,0);
		}
		public ExecDeclContext execDecl() {
			return getRuleContext(ExecDeclContext.class,0);
		}
		public ExecDeclBlockContext execDeclBlock() {
			return getRuleContext(ExecDeclBlockContext.class,0);
		}
		public QueryDeclContext queryDecl() {
			return getRuleContext(QueryDeclContext.class,0);
		}
		public QueryDeclBlockContext queryDeclBlock() {
			return getRuleContext(QueryDeclBlockContext.class,0);
		}
		public MigrateDeclContext migrateDecl() {
			return getRuleContext(MigrateDeclContext.class,0);
		}
		public InterfaceItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterInterfaceItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitInterfaceItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitInterfaceItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceItemContext interfaceItem() throws RecognitionException {
		InterfaceItemContext _localctx = new InterfaceItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceItem);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				typeDefn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				errorDefn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				errorDefnBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				eventDefn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(289);
				eventDefnBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(290);
				stateDefn();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(291);
				stateDefnBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(292);
				instantiateDecl();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(293);
				execDecl();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(294);
				execDeclBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(295);
				queryDecl();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(296);
				queryDeclBlock();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(297);
				migrateDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode ERROR() { return getToken(CWScriptParser.ERROR, 0); }
		public EnumVariant_structContext enumVariant_struct() {
			return getRuleContext(EnumVariant_structContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public ErrorDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterErrorDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitErrorDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitErrorDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorDefnContext errorDefn() throws RecognitionException {
		ErrorDefnContext _localctx = new ErrorDefnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_errorDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(300);
				((ErrorDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(303);
			match(ERROR);
			setState(304);
			enumVariant_struct();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorDefnBlockContext extends ParserRuleContext {
		public TerminalNode ERROR() { return getToken(CWScriptParser.ERROR, 0); }
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<ErrorDefnBlock_itemContext> errorDefnBlock_item() {
			return getRuleContexts(ErrorDefnBlock_itemContext.class);
		}
		public ErrorDefnBlock_itemContext errorDefnBlock_item(int i) {
			return getRuleContext(ErrorDefnBlock_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public ErrorDefnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDefnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterErrorDefnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitErrorDefnBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitErrorDefnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorDefnBlockContext errorDefnBlock() throws RecognitionException {
		ErrorDefnBlockContext _localctx = new ErrorDefnBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_errorDefnBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(ERROR);
			setState(307);
			match(LBRACE);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0) {
				{
				setState(308);
				errorDefnBlock_item();
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(309);
						match(COMMA);
						setState(310);
						errorDefnBlock_item();
						}
						} 
					}
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(316);
					match(COMMA);
					}
				}

				}
			}

			setState(321);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorDefnBlock_itemContext extends ParserRuleContext {
		public CwspecContext spec;
		public EnumVariant_structContext enumVariant_struct() {
			return getRuleContext(EnumVariant_structContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public ErrorDefnBlock_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDefnBlock_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterErrorDefnBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitErrorDefnBlock_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitErrorDefnBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorDefnBlock_itemContext errorDefnBlock_item() throws RecognitionException {
		ErrorDefnBlock_itemContext _localctx = new ErrorDefnBlock_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_errorDefnBlock_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(323);
				((ErrorDefnBlock_itemContext)_localctx).spec = cwspec();
				}
			}

			setState(326);
			enumVariant_struct();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode EVENT() { return getToken(CWScriptParser.EVENT, 0); }
		public EnumVariant_structContext enumVariant_struct() {
			return getRuleContext(EnumVariant_structContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public EventDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterEventDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitEventDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitEventDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefnContext eventDefn() throws RecognitionException {
		EventDefnContext _localctx = new EventDefnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eventDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(328);
				((EventDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(331);
			match(EVENT);
			setState(332);
			enumVariant_struct();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventDefnBlockContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(CWScriptParser.EVENT, 0); }
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<EventDefnBlock_itemContext> eventDefnBlock_item() {
			return getRuleContexts(EventDefnBlock_itemContext.class);
		}
		public EventDefnBlock_itemContext eventDefnBlock_item(int i) {
			return getRuleContext(EventDefnBlock_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public EventDefnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterEventDefnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitEventDefnBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitEventDefnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefnBlockContext eventDefnBlock() throws RecognitionException {
		EventDefnBlockContext _localctx = new EventDefnBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eventDefnBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(EVENT);
			setState(335);
			match(LBRACE);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0) {
				{
				setState(336);
				eventDefnBlock_item();
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337);
						match(COMMA);
						setState(338);
						eventDefnBlock_item();
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(344);
					match(COMMA);
					}
				}

				}
			}

			setState(349);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventDefnBlock_itemContext extends ParserRuleContext {
		public CwspecContext spec;
		public EnumVariant_structContext enumVariant_struct() {
			return getRuleContext(EnumVariant_structContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public EventDefnBlock_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefnBlock_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterEventDefnBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitEventDefnBlock_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitEventDefnBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefnBlock_itemContext eventDefnBlock_item() throws RecognitionException {
		EventDefnBlock_itemContext _localctx = new EventDefnBlock_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eventDefnBlock_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(351);
				((EventDefnBlock_itemContext)_localctx).spec = cwspec();
				}
			}

			setState(354);
			enumVariant_struct();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateDefnContext extends ParserRuleContext {
		public StateDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDefn; }
	 
		public StateDefnContext() { }
		public void copyFrom(StateDefnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateMapDefnContext extends StateDefnContext {
		public CwspecContext spec;
		public MapDefnContext map;
		public TerminalNode STATE() { return getToken(CWScriptParser.STATE, 0); }
		public MapDefnContext mapDefn() {
			return getRuleContext(MapDefnContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public StateMapDefnContext(StateDefnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStateMapDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStateMapDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStateMapDefn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateItemDefnContext extends StateDefnContext {
		public CwspecContext spec;
		public ItemDefnContext item;
		public TerminalNode STATE() { return getToken(CWScriptParser.STATE, 0); }
		public ItemDefnContext itemDefn() {
			return getRuleContext(ItemDefnContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public StateItemDefnContext(StateDefnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStateItemDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStateItemDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStateItemDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDefnContext stateDefn() throws RecognitionException {
		StateDefnContext _localctx = new StateDefnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stateDefn);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new StateItemDefnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
					{
					setState(356);
					((StateItemDefnContext)_localctx).spec = cwspec();
					}
				}

				setState(359);
				match(STATE);
				{
				setState(360);
				((StateItemDefnContext)_localctx).item = itemDefn();
				}
				}
				break;
			case 2:
				_localctx = new StateMapDefnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
					{
					setState(361);
					((StateMapDefnContext)_localctx).spec = cwspec();
					}
				}

				setState(364);
				match(STATE);
				setState(365);
				((StateMapDefnContext)_localctx).map = mapDefn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateDefnBlockContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(CWScriptParser.STATE, 0); }
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<StateDefnBlock_itemContext> stateDefnBlock_item() {
			return getRuleContexts(StateDefnBlock_itemContext.class);
		}
		public StateDefnBlock_itemContext stateDefnBlock_item(int i) {
			return getRuleContext(StateDefnBlock_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public StateDefnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDefnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStateDefnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStateDefnBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStateDefnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDefnBlockContext stateDefnBlock() throws RecognitionException {
		StateDefnBlockContext _localctx = new StateDefnBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stateDefnBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(STATE);
			setState(369);
			match(LBRACE);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0) {
				{
				setState(370);
				stateDefnBlock_item();
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(371);
						match(COMMA);
						setState(372);
						stateDefnBlock_item();
						}
						} 
					}
					setState(377);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(378);
					match(COMMA);
					}
				}

				}
			}

			setState(383);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateDefnBlock_itemContext extends ParserRuleContext {
		public StateDefnBlock_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDefnBlock_item; }
	 
		public StateDefnBlock_itemContext() { }
		public void copyFrom(StateDefnBlock_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateBlockItemDefnContext extends StateDefnBlock_itemContext {
		public CwspecContext spec;
		public ItemDefnContext item;
		public ItemDefnContext itemDefn() {
			return getRuleContext(ItemDefnContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public StateBlockItemDefnContext(StateDefnBlock_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStateBlockItemDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStateBlockItemDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStateBlockItemDefn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateBlockMapDefnContext extends StateDefnBlock_itemContext {
		public CwspecContext spec;
		public MapDefnContext map;
		public MapDefnContext mapDefn() {
			return getRuleContext(MapDefnContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public StateBlockMapDefnContext(StateDefnBlock_itemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStateBlockMapDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStateBlockMapDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStateBlockMapDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDefnBlock_itemContext stateDefnBlock_item() throws RecognitionException {
		StateDefnBlock_itemContext _localctx = new StateDefnBlock_itemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stateDefnBlock_item);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new StateBlockItemDefnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
					{
					setState(385);
					((StateBlockItemDefnContext)_localctx).spec = cwspec();
					}
				}

				{
				setState(388);
				((StateBlockItemDefnContext)_localctx).item = itemDefn();
				}
				}
				break;
			case 2:
				_localctx = new StateBlockMapDefnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
					{
					setState(389);
					((StateBlockMapDefnContext)_localctx).spec = cwspec();
					}
				}

				{
				setState(392);
				((StateBlockMapDefnContext)_localctx).map = mapDefn();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemDefnContext extends ParserRuleContext {
		public IdentContext key;
		public TypeExprContext valueType;
		public TerminalNode COLON() { return getToken(CWScriptParser.COLON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public ItemDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterItemDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitItemDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitItemDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemDefnContext itemDefn() throws RecognitionException {
		ItemDefnContext _localctx = new ItemDefnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_itemDefn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(395);
			((ItemDefnContext)_localctx).key = ident();
			}
			setState(396);
			match(COLON);
			{
			setState(397);
			((ItemDefnContext)_localctx).valueType = typeExpr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapDefnContext extends ParserRuleContext {
		public IdentContext key;
		public MapDefnKeysContext mapKeys;
		public TypeExprContext valueType;
		public TerminalNode COLON() { return getToken(CWScriptParser.COLON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MapDefnKeysContext mapDefnKeys() {
			return getRuleContext(MapDefnKeysContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public MapDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterMapDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitMapDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitMapDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapDefnContext mapDefn() throws RecognitionException {
		MapDefnContext _localctx = new MapDefnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mapDefn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(399);
			((MapDefnContext)_localctx).key = ident();
			}
			{
			setState(400);
			((MapDefnContext)_localctx).mapKeys = mapDefnKeys();
			}
			setState(401);
			match(COLON);
			{
			setState(402);
			((MapDefnContext)_localctx).valueType = typeExpr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapDefnKeysContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CWScriptParser.LBRACK, 0); }
		public List<MapDefnKeyContext> mapDefnKey() {
			return getRuleContexts(MapDefnKeyContext.class);
		}
		public MapDefnKeyContext mapDefnKey(int i) {
			return getRuleContext(MapDefnKeyContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(CWScriptParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public MapDefnKeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapDefnKeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterMapDefnKeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitMapDefnKeys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitMapDefnKeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapDefnKeysContext mapDefnKeys() throws RecognitionException {
		MapDefnKeysContext _localctx = new MapDefnKeysContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mapDefnKeys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(LBRACK);
			setState(405);
			mapDefnKey();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(406);
				match(COMMA);
				setState(407);
				mapDefnKey();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapDefnKeyContext extends ParserRuleContext {
		public IdentContext keyName;
		public TypeExprContext keyType;
		public TerminalNode COLON() { return getToken(CWScriptParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MapDefnKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapDefnKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterMapDefnKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitMapDefnKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitMapDefnKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapDefnKeyContext mapDefnKey() throws RecognitionException {
		MapDefnKeyContext _localctx = new MapDefnKeyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mapDefnKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(415);
				((MapDefnKeyContext)_localctx).keyName = ident();
				setState(416);
				match(COLON);
				}
				break;
			}
			{
			setState(420);
			((MapDefnKeyContext)_localctx).keyType = typeExpr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstantiateDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode INSTANTIATE() { return getToken(CWScriptParser.INSTANTIATE, 0); }
		public FnArgsContext fnArgs() {
			return getRuleContext(FnArgsContext.class,0);
		}
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public FnTypeContext fnType() {
			return getRuleContext(FnTypeContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public InstantiateDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiateDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterInstantiateDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitInstantiateDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitInstantiateDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstantiateDefnContext instantiateDefn() throws RecognitionException {
		InstantiateDefnContext _localctx = new InstantiateDefnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_instantiateDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(422);
				((InstantiateDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(425);
			match(INSTANTIATE);
			setState(426);
			fnArgs();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(427);
				fnType();
				}
			}

			setState(430);
			fnBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstantiateDeclContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode INSTANTIATE() { return getToken(CWScriptParser.INSTANTIATE, 0); }
		public FnArgsContext fnArgs() {
			return getRuleContext(FnArgsContext.class,0);
		}
		public FnTypeContext fnType() {
			return getRuleContext(FnTypeContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public InstantiateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiateDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterInstantiateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitInstantiateDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitInstantiateDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstantiateDeclContext instantiateDecl() throws RecognitionException {
		InstantiateDeclContext _localctx = new InstantiateDeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instantiateDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(432);
				((InstantiateDeclContext)_localctx).spec = cwspec();
				}
			}

			setState(435);
			match(INSTANTIATE);
			setState(436);
			fnArgs();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(437);
				fnType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode EXEC() { return getToken(CWScriptParser.EXEC, 0); }
		public NamedFnDefnContext namedFnDefn() {
			return getRuleContext(NamedFnDefnContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public ExecDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExecDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExecDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExecDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecDefnContext execDefn() throws RecognitionException {
		ExecDefnContext _localctx = new ExecDefnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_execDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(440);
				((ExecDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(443);
			match(EXEC);
			setState(444);
			namedFnDefn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecDefnBlockContext extends ParserRuleContext {
		public TerminalNode EXEC() { return getToken(CWScriptParser.EXEC, 0); }
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<ExecDefnBlock_itemContext> execDefnBlock_item() {
			return getRuleContexts(ExecDefnBlock_itemContext.class);
		}
		public ExecDefnBlock_itemContext execDefnBlock_item(int i) {
			return getRuleContext(ExecDefnBlock_itemContext.class,i);
		}
		public ExecDefnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execDefnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExecDefnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExecDefnBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExecDefnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecDefnBlockContext execDefnBlock() throws RecognitionException {
		ExecDefnBlockContext _localctx = new ExecDefnBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_execDefnBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(EXEC);
			setState(447);
			match(LBRACE);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0) {
				{
				{
				setState(448);
				execDefnBlock_item();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecDefnBlock_itemContext extends ParserRuleContext {
		public CwspecContext spec;
		public NamedFnDefnContext namedFnDefn() {
			return getRuleContext(NamedFnDefnContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public ExecDefnBlock_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execDefnBlock_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExecDefnBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExecDefnBlock_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExecDefnBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecDefnBlock_itemContext execDefnBlock_item() throws RecognitionException {
		ExecDefnBlock_itemContext _localctx = new ExecDefnBlock_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_execDefnBlock_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(456);
				((ExecDefnBlock_itemContext)_localctx).spec = cwspec();
				}
			}

			setState(459);
			namedFnDefn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecDeclContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode EXEC() { return getToken(CWScriptParser.EXEC, 0); }
		public NamedFnDeclContext namedFnDecl() {
			return getRuleContext(NamedFnDeclContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public ExecDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExecDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExecDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExecDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecDeclContext execDecl() throws RecognitionException {
		ExecDeclContext _localctx = new ExecDeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_execDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(461);
				((ExecDeclContext)_localctx).spec = cwspec();
				}
			}

			setState(464);
			match(EXEC);
			setState(465);
			namedFnDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecDeclBlockContext extends ParserRuleContext {
		public TerminalNode EXEC() { return getToken(CWScriptParser.EXEC, 0); }
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<ExecDeclBlock_itemContext> execDeclBlock_item() {
			return getRuleContexts(ExecDeclBlock_itemContext.class);
		}
		public ExecDeclBlock_itemContext execDeclBlock_item(int i) {
			return getRuleContext(ExecDeclBlock_itemContext.class,i);
		}
		public ExecDeclBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execDeclBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExecDeclBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExecDeclBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExecDeclBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecDeclBlockContext execDeclBlock() throws RecognitionException {
		ExecDeclBlockContext _localctx = new ExecDeclBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_execDeclBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(EXEC);
			setState(468);
			match(LBRACE);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0) {
				{
				{
				setState(469);
				execDeclBlock_item();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecDeclBlock_itemContext extends ParserRuleContext {
		public CwspecContext spec;
		public NamedFnDeclContext namedFnDecl() {
			return getRuleContext(NamedFnDeclContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public ExecDeclBlock_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execDeclBlock_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExecDeclBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExecDeclBlock_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExecDeclBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecDeclBlock_itemContext execDeclBlock_item() throws RecognitionException {
		ExecDeclBlock_itemContext _localctx = new ExecDeclBlock_itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_execDeclBlock_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(477);
				((ExecDeclBlock_itemContext)_localctx).spec = cwspec();
				}
			}

			setState(480);
			namedFnDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode QUERY() { return getToken(CWScriptParser.QUERY, 0); }
		public NamedFnDefnContext namedFnDefn() {
			return getRuleContext(NamedFnDefnContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public QueryDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterQueryDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitQueryDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitQueryDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryDefnContext queryDefn() throws RecognitionException {
		QueryDefnContext _localctx = new QueryDefnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_queryDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(482);
				((QueryDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(485);
			match(QUERY);
			setState(486);
			namedFnDefn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryDefnBlockContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(CWScriptParser.QUERY, 0); }
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<QueryDefnBlock_itemContext> queryDefnBlock_item() {
			return getRuleContexts(QueryDefnBlock_itemContext.class);
		}
		public QueryDefnBlock_itemContext queryDefnBlock_item(int i) {
			return getRuleContext(QueryDefnBlock_itemContext.class,i);
		}
		public QueryDefnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryDefnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterQueryDefnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitQueryDefnBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitQueryDefnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryDefnBlockContext queryDefnBlock() throws RecognitionException {
		QueryDefnBlockContext _localctx = new QueryDefnBlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_queryDefnBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(QUERY);
			setState(489);
			match(LBRACE);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0) {
				{
				{
				setState(490);
				queryDefnBlock_item();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryDefnBlock_itemContext extends ParserRuleContext {
		public CwspecContext spec;
		public NamedFnDefnContext namedFnDefn() {
			return getRuleContext(NamedFnDefnContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public QueryDefnBlock_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryDefnBlock_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterQueryDefnBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitQueryDefnBlock_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitQueryDefnBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryDefnBlock_itemContext queryDefnBlock_item() throws RecognitionException {
		QueryDefnBlock_itemContext _localctx = new QueryDefnBlock_itemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_queryDefnBlock_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(498);
				((QueryDefnBlock_itemContext)_localctx).spec = cwspec();
				}
			}

			setState(501);
			namedFnDefn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryDeclContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode QUERY() { return getToken(CWScriptParser.QUERY, 0); }
		public NamedFnDeclContext namedFnDecl() {
			return getRuleContext(NamedFnDeclContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public QueryDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterQueryDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitQueryDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitQueryDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryDeclContext queryDecl() throws RecognitionException {
		QueryDeclContext _localctx = new QueryDeclContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_queryDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(503);
				((QueryDeclContext)_localctx).spec = cwspec();
				}
			}

			setState(506);
			match(QUERY);
			setState(507);
			namedFnDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryDeclBlockContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(CWScriptParser.QUERY, 0); }
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<QueryDeclBlock_itemContext> queryDeclBlock_item() {
			return getRuleContexts(QueryDeclBlock_itemContext.class);
		}
		public QueryDeclBlock_itemContext queryDeclBlock_item(int i) {
			return getRuleContext(QueryDeclBlock_itemContext.class,i);
		}
		public QueryDeclBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryDeclBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterQueryDeclBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitQueryDeclBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitQueryDeclBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryDeclBlockContext queryDeclBlock() throws RecognitionException {
		QueryDeclBlockContext _localctx = new QueryDeclBlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_queryDeclBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(QUERY);
			setState(510);
			match(LBRACE);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0) {
				{
				{
				setState(511);
				queryDeclBlock_item();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryDeclBlock_itemContext extends ParserRuleContext {
		public CwspecContext spec;
		public NamedFnDeclContext namedFnDecl() {
			return getRuleContext(NamedFnDeclContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public QueryDeclBlock_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryDeclBlock_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterQueryDeclBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitQueryDeclBlock_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitQueryDeclBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryDeclBlock_itemContext queryDeclBlock_item() throws RecognitionException {
		QueryDeclBlock_itemContext _localctx = new QueryDeclBlock_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_queryDeclBlock_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(519);
				((QueryDeclBlock_itemContext)_localctx).spec = cwspec();
				}
			}

			setState(522);
			namedFnDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MigrateDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode MIGRATE() { return getToken(CWScriptParser.MIGRATE, 0); }
		public FnArgsContext fnArgs() {
			return getRuleContext(FnArgsContext.class,0);
		}
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public FnTypeContext fnType() {
			return getRuleContext(FnTypeContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public MigrateDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_migrateDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterMigrateDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitMigrateDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitMigrateDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MigrateDefnContext migrateDefn() throws RecognitionException {
		MigrateDefnContext _localctx = new MigrateDefnContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_migrateDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(524);
				((MigrateDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(527);
			match(MIGRATE);
			setState(528);
			fnArgs();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(529);
				fnType();
				}
			}

			setState(532);
			fnBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MigrateDeclContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode MIGRATE() { return getToken(CWScriptParser.MIGRATE, 0); }
		public FnArgsContext fnArgs() {
			return getRuleContext(FnArgsContext.class,0);
		}
		public FnTypeContext fnType() {
			return getRuleContext(FnTypeContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public MigrateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_migrateDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterMigrateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitMigrateDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitMigrateDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MigrateDeclContext migrateDecl() throws RecognitionException {
		MigrateDeclContext _localctx = new MigrateDeclContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_migrateDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(534);
				((MigrateDeclContext)_localctx).spec = cwspec();
				}
			}

			setState(537);
			match(MIGRATE);
			setState(538);
			fnArgs();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(539);
				fnType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumVariantContext extends ParserRuleContext {
		public EnumVariant_structContext enumVariant_struct() {
			return getRuleContext(EnumVariant_structContext.class,0);
		}
		public EnumVariant_tupleContext enumVariant_tuple() {
			return getRuleContext(EnumVariant_tupleContext.class,0);
		}
		public EnumVariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumVariant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterEnumVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitEnumVariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitEnumVariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumVariantContext enumVariant() throws RecognitionException {
		EnumVariantContext _localctx = new EnumVariantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_enumVariant);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				enumVariant_struct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				enumVariant_tuple();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumVariant_structContext extends ParserRuleContext {
		public IdentContext name;
		public ParenStructMembersContext parenStructMembers() {
			return getRuleContext(ParenStructMembersContext.class,0);
		}
		public CurlyStructMembersContext curlyStructMembers() {
			return getRuleContext(CurlyStructMembersContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public EnumVariant_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumVariant_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterEnumVariant_struct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitEnumVariant_struct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitEnumVariant_struct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumVariant_structContext enumVariant_struct() throws RecognitionException {
		EnumVariant_structContext _localctx = new EnumVariant_structContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enumVariant_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(546);
			((EnumVariant_structContext)_localctx).name = ident();
			}
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(547);
				parenStructMembers();
				}
				break;
			case LBRACE:
				{
				setState(548);
				curlyStructMembers();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumVariant_tupleContext extends ParserRuleContext {
		public IdentContext name;
		public TupleMembersContext members;
		public TupleMembersContext tupleMembers() {
			return getRuleContext(TupleMembersContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public EnumVariant_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumVariant_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterEnumVariant_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitEnumVariant_tuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitEnumVariant_tuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumVariant_tupleContext enumVariant_tuple() throws RecognitionException {
		EnumVariant_tupleContext _localctx = new EnumVariant_tupleContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_enumVariant_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(551);
			((EnumVariant_tupleContext)_localctx).name = ident();
			}
			setState(552);
			((EnumVariant_tupleContext)_localctx).members = tupleMembers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleMembersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public TupleMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTupleMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTupleMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTupleMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleMembersContext tupleMembers() throws RecognitionException {
		TupleMembersContext _localctx = new TupleMembersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tupleMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(LPAREN);
			setState(555);
			typeExpr(0);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(556);
				match(COMMA);
				setState(557);
				typeExpr(0);
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParenStructMembersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public ParenStructMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenStructMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterParenStructMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitParenStructMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitParenStructMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenStructMembersContext parenStructMembers() throws RecognitionException {
		ParenStructMembersContext _localctx = new ParenStructMembersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parenStructMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(LPAREN);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0) {
				{
				setState(566);
				structMember();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(567);
					match(COMMA);
					setState(568);
					structMember();
					}
					}
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(576);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CurlyStructMembersContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public CurlyStructMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curlyStructMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterCurlyStructMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitCurlyStructMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitCurlyStructMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurlyStructMembersContext curlyStructMembers() throws RecognitionException {
		CurlyStructMembersContext _localctx = new CurlyStructMembersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_curlyStructMembers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(LBRACE);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0) {
				{
				setState(579);
				structMember();
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(580);
						match(COMMA);
						setState(581);
						structMember();
						}
						} 
					}
					setState(586);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(587);
					match(COMMA);
					}
				}

				}
			}

			setState(592);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructMemberContext extends ParserRuleContext {
		public CwspecContext spec;
		public IdentContext name;
		public Token option;
		public TypeExprContext valueType;
		public TerminalNode COLON() { return getToken(CWScriptParser.COLON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public TerminalNode QUEST() { return getToken(CWScriptParser.QUEST, 0); }
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStructMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStructMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStructMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_structMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(594);
				((StructMemberContext)_localctx).spec = cwspec();
				}
			}

			{
			setState(597);
			((StructMemberContext)_localctx).name = ident();
			}
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUEST) {
				{
				setState(598);
				((StructMemberContext)_localctx).option = match(QUEST);
				}
			}

			setState(601);
			match(COLON);
			{
			setState(602);
			((StructMemberContext)_localctx).valueType = typeExpr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeExprContext extends ParserRuleContext {
		public TypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr; }
	 
		public TypeExprContext() { }
		public void copyFrom(TypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefTypeExprContext extends TypeExprContext {
		public TerminalNode AMP() { return getToken(CWScriptParser.AMP, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public RefTypeExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterRefTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitRefTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitRefTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamzdTypeExprContext extends TypeExprContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TypeParamContext typeParam() {
			return getRuleContext(TypeParamContext.class,0);
		}
		public ParamzdTypeExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterParamzdTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitParamzdTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitParamzdTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleTypeExprContext extends TypeExprContext {
		public TypeExprContext typeExpr;
		public List<TypeExprContext> members = new ArrayList<TypeExprContext>();
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public TupleTypeExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTupleTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTupleTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTupleTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortOptionTypeExprContext extends TypeExprContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode QUEST() { return getToken(CWScriptParser.QUEST, 0); }
		public ShortOptionTypeExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterShortOptionTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitShortOptionTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitShortOptionTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefnExprContext extends TypeExprContext {
		public TypeDefnContext typeDefn() {
			return getRuleContext(TypeDefnContext.class,0);
		}
		public TypeDefnExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTypeDefnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTypeDefnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTypeDefnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypePathExprContext extends TypeExprContext {
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TypePathExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTypePathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTypePathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTypePathExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortVecTypeExprContext extends TypeExprContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(CWScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CWScriptParser.RBRACK, 0); }
		public ShortVecTypeExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterShortVecTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitShortVecTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitShortVecTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExprContext typeExpr() throws RecognitionException {
		return typeExpr(0);
	}

	private TypeExprContext typeExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeExprContext _localctx = new TypeExprContext(_ctx, _parentState);
		TypeExprContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_typeExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				_localctx = new TypePathExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(605);
				typePath();
				}
				break;
			case 2:
				{
				_localctx = new TupleTypeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(606);
				match(LPAREN);
				{
				setState(607);
				((TupleTypeExprContext)_localctx).typeExpr = typeExpr(0);
				((TupleTypeExprContext)_localctx).members.add(((TupleTypeExprContext)_localctx).typeExpr);
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(608);
					match(COMMA);
					setState(609);
					((TupleTypeExprContext)_localctx).typeExpr = typeExpr(0);
					((TupleTypeExprContext)_localctx).members.add(((TupleTypeExprContext)_localctx).typeExpr);
					}
					}
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(615);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new RefTypeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(617);
				match(AMP);
				setState(618);
				typeExpr(2);
				}
				break;
			case 4:
				{
				_localctx = new TypeDefnExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(619);
				typeDefn();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(629);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						_localctx = new ParamzdTypeExprContext(new TypeExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_typeExpr);
						setState(622);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(623);
						typeParam();
						}
						break;
					case 2:
						{
						_localctx = new ShortOptionTypeExprContext(new TypeExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_typeExpr);
						setState(624);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(625);
						match(QUEST);
						}
						break;
					case 3:
						{
						_localctx = new ShortVecTypeExprContext(new TypeExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_typeExpr);
						setState(626);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(627);
						match(LBRACK);
						setState(628);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CWScriptParser.LT, 0); }
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(CWScriptParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public TypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(LT);
			setState(635);
			typeExpr(0);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(636);
				match(COMMA);
				setState(637);
				typeExpr(0);
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(643);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathListContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> D_COLON() { return getTokens(CWScriptParser.D_COLON); }
		public TerminalNode D_COLON(int i) {
			return getToken(CWScriptParser.D_COLON, i);
		}
		public PathListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterPathList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitPathList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitPathList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathListContext pathList() throws RecognitionException {
		PathListContext _localctx = new PathListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_pathList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(645);
			ident();
			}
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(646);
					match(D_COLON);
					setState(647);
					ident();
					}
					} 
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypePathContext extends ParserRuleContext {
		public Token root;
		public PathListContext pathList() {
			return getRuleContext(PathListContext.class,0);
		}
		public TerminalNode D_COLON() { return getToken(CWScriptParser.D_COLON, 0); }
		public TypePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTypePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTypePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTypePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathContext typePath() throws RecognitionException {
		TypePathContext _localctx = new TypePathContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typePath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==D_COLON) {
				{
				setState(653);
				((TypePathContext)_localctx).root = match(D_COLON);
				}
			}

			setState(656);
			pathList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefnContext extends ParserRuleContext {
		public StructDefnContext structDefn() {
			return getRuleContext(StructDefnContext.class,0);
		}
		public EnumDefnContext enumDefn() {
			return getRuleContext(EnumDefnContext.class,0);
		}
		public TypeAliasDefnContext typeAliasDefn() {
			return getRuleContext(TypeAliasDefnContext.class,0);
		}
		public TypeDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTypeDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTypeDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTypeDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefnContext typeDefn() throws RecognitionException {
		TypeDefnContext _localctx = new TypeDefnContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeDefn);
		try {
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				structDefn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				enumDefn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				typeAliasDefn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode STRUCT() { return getToken(CWScriptParser.STRUCT, 0); }
		public EnumVariantContext enumVariant() {
			return getRuleContext(EnumVariantContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public StructDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStructDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStructDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStructDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefnContext structDefn() throws RecognitionException {
		StructDefnContext _localctx = new StructDefnContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_structDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(663);
				((StructDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(666);
			match(STRUCT);
			setState(667);
			enumVariant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public IdentContext name;
		public TerminalNode ENUM() { return getToken(CWScriptParser.ENUM, 0); }
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public EnumVariantListContext enumVariantList() {
			return getRuleContext(EnumVariantListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public EnumDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterEnumDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitEnumDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitEnumDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefnContext enumDefn() throws RecognitionException {
		EnumDefnContext _localctx = new EnumDefnContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_enumDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(669);
				((EnumDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(672);
			match(ENUM);
			{
			setState(673);
			((EnumDefnContext)_localctx).name = ident();
			}
			setState(674);
			match(LBRACE);
			setState(675);
			enumVariantList();
			setState(676);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumVariantListContext extends ParserRuleContext {
		public List<EnumVariantContext> enumVariant() {
			return getRuleContexts(EnumVariantContext.class);
		}
		public EnumVariantContext enumVariant(int i) {
			return getRuleContext(EnumVariantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public EnumVariantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumVariantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterEnumVariantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitEnumVariantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitEnumVariantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumVariantListContext enumVariantList() throws RecognitionException {
		EnumVariantListContext _localctx = new EnumVariantListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_enumVariantList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 127L) != 0) {
				{
				setState(678);
				enumVariant();
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(680);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(679);
							match(COMMA);
							}
						}

						setState(682);
						enumVariant();
						}
						} 
					}
					setState(687);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(688);
					match(COMMA);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAliasDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public IdentContext name;
		public TypeExprContext typeValue;
		public TerminalNode TYPE() { return getToken(CWScriptParser.TYPE, 0); }
		public TerminalNode EQ() { return getToken(CWScriptParser.EQ, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public TypeAliasDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAliasDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTypeAliasDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTypeAliasDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTypeAliasDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasDefnContext typeAliasDefn() throws RecognitionException {
		TypeAliasDefnContext _localctx = new TypeAliasDefnContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeAliasDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(693);
				((TypeAliasDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(696);
			match(TYPE);
			{
			setState(697);
			((TypeAliasDefnContext)_localctx).name = ident();
			}
			setState(698);
			match(EQ);
			{
			setState(699);
			((TypeAliasDefnContext)_localctx).typeValue = typeExpr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedFnDeclContext extends ParserRuleContext {
		public IdentContext fnName;
		public FnArgsContext fnArgs() {
			return getRuleContext(FnArgsContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FnTypeContext fnType() {
			return getRuleContext(FnTypeContext.class,0);
		}
		public NamedFnDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFnDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterNamedFnDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitNamedFnDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitNamedFnDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFnDeclContext namedFnDecl() throws RecognitionException {
		NamedFnDeclContext _localctx = new NamedFnDeclContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_namedFnDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(701);
			((NamedFnDeclContext)_localctx).fnName = ident();
			}
			setState(702);
			fnArgs();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(703);
				fnType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedFnDefnContext extends ParserRuleContext {
		public IdentContext fnName;
		public FnArgsContext fnArgs() {
			return getRuleContext(FnArgsContext.class,0);
		}
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FnTypeContext fnType() {
			return getRuleContext(FnTypeContext.class,0);
		}
		public NamedFnDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFnDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterNamedFnDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitNamedFnDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitNamedFnDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFnDefnContext namedFnDefn() throws RecognitionException {
		NamedFnDefnContext _localctx = new NamedFnDefnContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_namedFnDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(706);
			((NamedFnDefnContext)_localctx).fnName = ident();
			}
			setState(707);
			fnArgs();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(708);
				fnType();
				}
			}

			setState(711);
			fnBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FnDefnContext extends ParserRuleContext {
		public CwspecContext spec;
		public TerminalNode FN() { return getToken(CWScriptParser.FN, 0); }
		public NamedFnDefnContext namedFnDefn() {
			return getRuleContext(NamedFnDefnContext.class,0);
		}
		public CwspecContext cwspec() {
			return getRuleContext(CwspecContext.class,0);
		}
		public FnDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterFnDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitFnDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitFnDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnDefnContext fnDefn() throws RecognitionException {
		FnDefnContext _localctx = new FnDefnContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fnDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) {
				{
				setState(713);
				((FnDefnContext)_localctx).spec = cwspec();
				}
			}

			setState(716);
			match(FN);
			setState(717);
			namedFnDefn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FnTypeContext extends ParserRuleContext {
		public TypeExprContext retType;
		public TerminalNode ARROW() { return getToken(CWScriptParser.ARROW, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public FnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterFnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitFnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitFnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnTypeContext fnType() throws RecognitionException {
		FnTypeContext _localctx = new FnTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(719);
			match(ARROW);
			setState(720);
			((FnTypeContext)_localctx).retType = typeExpr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FnArgsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public FnArgListContext fnArgList() {
			return getRuleContext(FnArgListContext.class,0);
		}
		public FnArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterFnArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitFnArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitFnArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnArgsContext fnArgs() throws RecognitionException {
		FnArgsContext _localctx = new FnArgsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_fnArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(LPAREN);
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 127L) != 0) {
				{
				setState(723);
				fnArgList();
				}
			}

			setState(726);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FnArgListContext extends ParserRuleContext {
		public List<FnArgContext> fnArg() {
			return getRuleContexts(FnArgContext.class);
		}
		public FnArgContext fnArg(int i) {
			return getRuleContext(FnArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public FnArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterFnArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitFnArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitFnArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnArgListContext fnArgList() throws RecognitionException {
		FnArgListContext _localctx = new FnArgListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fnArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			fnArg();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(729);
				match(COMMA);
				setState(730);
				fnArg();
				}
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FnArgContext extends ParserRuleContext {
		public IdentContext argName;
		public Token option;
		public TypeExprContext argType;
		public TerminalNode COLON() { return getToken(CWScriptParser.COLON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode QUEST() { return getToken(CWScriptParser.QUEST, 0); }
		public FnArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterFnArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitFnArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitFnArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnArgContext fnArg() throws RecognitionException {
		FnArgContext _localctx = new FnArgContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_fnArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(736);
			((FnArgContext)_localctx).argName = ident();
			}
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUEST) {
				{
				setState(737);
				((FnArgContext)_localctx).option = match(QUEST);
				}
			}

			setState(740);
			match(COLON);
			{
			setState(741);
			((FnArgContext)_localctx).argType = typeExpr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyContext extends ParserRuleContext {
		public FnBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBody; }
	 
		public FnBodyContext() { }
		public void copyFrom(FnBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalFnBodyContext extends FnBodyContext {
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public NormalFnBodyContext(FnBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterNormalFnBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitNormalFnBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitNormalFnBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFnBodyContext extends FnBodyContext {
		public TerminalNode FAT_ARROW() { return getToken(CWScriptParser.FAT_ARROW, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ArrowFnBodyContext(FnBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterArrowFnBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitArrowFnBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitArrowFnBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnBodyContext fnBody() throws RecognitionException {
		FnBodyContext _localctx = new FnBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_fnBody);
		int _la;
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new NormalFnBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(743);
				match(LBRACE);
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & -572515816756771906L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 127L) != 0) {
					{
					{
					setState(744);
					stmt();
					}
					}
					setState(749);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(750);
				match(RBRACE);
				}
				}
				break;
			case FAT_ARROW:
				_localctx = new ArrowFnBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(751);
				match(FAT_ARROW);
				setState(752);
				stmt();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FailStmtContext extends StmtContext {
		public TerminalNode FAIL() { return getToken(CWScriptParser.FAIL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FailStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterFailStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitFailStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitFailStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StmtContext {
		public IfExpr_Context ifExpr_() {
			return getRuleContext(IfExpr_Context.class,0);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmitStmtContext extends StmtContext {
		public TerminalNode EMIT() { return getToken(CWScriptParser.EMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EmitStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterEmitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitEmitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitEmitStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends StmtContext {
		public AssignStmt_Context assignStmt_() {
			return getRuleContext(AssignStmt_Context.class,0);
		}
		public AssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExecStmtContext extends StmtContext {
		public TerminalNode EXEC() { return getToken(CWScriptParser.EXEC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExecStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExecStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExecStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StmtContext {
		public ForStmt_Context forStmt_() {
			return getRuleContext(ForStmt_Context.class,0);
		}
		public ForStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StmtContext {
		public TerminalNode RETURN() { return getToken(CWScriptParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetStmtContext extends StmtContext {
		public LetStmt_Context letStmt_() {
			return getRuleContext(LetStmt_Context.class,0);
		}
		public LetStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterLetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitLetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitLetStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteNowStmtContext extends StmtContext {
		public TerminalNode EXECUTE_NOW() { return getToken(CWScriptParser.EXECUTE_NOW, 0); }
		public MsgContext msg() {
			return getRuleContext(MsgContext.class,0);
		}
		public ExecuteNowStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExecuteNowStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExecuteNowStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExecuteNowStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_stmt);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new LetStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				letStmt_();
				}
				break;
			case 2:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				assignStmt_();
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(757);
				ifExpr_();
				}
				break;
			case 4:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(758);
				forStmt_();
				}
				break;
			case 5:
				_localctx = new ExecStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(759);
				match(EXEC);
				setState(760);
				expr(0);
				}
				break;
			case 6:
				_localctx = new ExecuteNowStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(761);
				match(EXECUTE_NOW);
				setState(762);
				msg();
				}
				break;
			case 7:
				_localctx = new EmitStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(763);
				match(EMIT);
				setState(764);
				expr(0);
				}
				break;
			case 8:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(765);
				match(RETURN);
				setState(766);
				expr(0);
				}
				break;
			case 9:
				_localctx = new FailStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(767);
				match(FAIL);
				setState(768);
				expr(0);
				}
				break;
			case 10:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(769);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetStmt_Context extends ParserRuleContext {
		public TerminalNode LET() { return getToken(CWScriptParser.LET, 0); }
		public LetLHSContext letLHS() {
			return getRuleContext(LetLHSContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CWScriptParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetStmt_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStmt_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterLetStmt_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitLetStmt_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitLetStmt_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStmt_Context letStmt_() throws RecognitionException {
		LetStmt_Context _localctx = new LetStmt_Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_letStmt_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(LET);
			setState(773);
			letLHS();
			setState(774);
			match(EQ);
			setState(775);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetLHSContext extends ParserRuleContext {
		public LetLHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letLHS; }
	 
		public LetLHSContext() { }
		public void copyFrom(LetLHSContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructUnpackLHSContext extends LetLHSContext {
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public IdentListContext identList() {
			return getRuleContext(IdentListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public StructUnpackLHSContext(LetLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStructUnpackLHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStructUnpackLHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStructUnpackLHS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentLHSContext extends LetLHSContext {
		public TypeExprContext varType;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CWScriptParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public IdentLHSContext(LetLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIdentLHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIdentLHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIdentLHS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetLHSContext letLHS() throws RecognitionException {
		LetLHSContext _localctx = new LetLHSContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_letLHS);
		int _la;
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRACT:
			case EXTENDS:
			case IMPLEMENTS:
			case INTERFACE:
			case IMPORT:
			case FROM:
			case ERROR:
			case EVENT:
			case STATE:
			case INSTANTIATE:
			case EXEC:
			case QUERY:
			case MIGRATE:
			case STRUCT:
			case ENUM:
			case TYPE:
			case FN:
			case EMIT:
			case RETURN:
			case LET:
			case AND:
			case OR:
			case TRUE:
			case FALSE:
			case IF:
			case ELSE:
			case FOR:
			case IN:
			case TIMES:
			case Ident:
				_localctx = new IdentLHSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				ident();
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(778);
					match(COLON);
					setState(779);
					((IdentLHSContext)_localctx).varType = typeExpr(0);
					}
				}

				}
				break;
			case LBRACE:
				_localctx = new StructUnpackLHSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				match(LBRACE);
				setState(783);
				identList();
				setState(784);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmt_Context extends ParserRuleContext {
		public AssignLHSContext lhs;
		public Token assignOp;
		public ExprContext rhs;
		public AssignLHSContext assignLHS() {
			return getRuleContext(AssignLHSContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CWScriptParser.EQ, 0); }
		public TerminalNode PLUS_EQ() { return getToken(CWScriptParser.PLUS_EQ, 0); }
		public TerminalNode MINUS_EQ() { return getToken(CWScriptParser.MINUS_EQ, 0); }
		public TerminalNode MUL_EQ() { return getToken(CWScriptParser.MUL_EQ, 0); }
		public TerminalNode DIV_EQ() { return getToken(CWScriptParser.DIV_EQ, 0); }
		public TerminalNode MOD_EQ() { return getToken(CWScriptParser.MOD_EQ, 0); }
		public AssignStmt_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterAssignStmt_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitAssignStmt_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitAssignStmt_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmt_Context assignStmt_() throws RecognitionException {
		AssignStmt_Context _localctx = new AssignStmt_Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_assignStmt_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			((AssignStmt_Context)_localctx).lhs = assignLHS();
			setState(789);
			((AssignStmt_Context)_localctx).assignOp = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 136348031778816L) != 0) ) {
				((AssignStmt_Context)_localctx).assignOp = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(790);
			((AssignStmt_Context)_localctx).rhs = expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignLHSContext extends ParserRuleContext {
		public AssignLHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignLHS; }
	 
		public AssignLHSContext() { }
		public void copyFrom(AssignLHSContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateItemAssignLHSContext extends AssignLHSContext {
		public IdentContext key;
		public InnerAssignContext inner;
		public TerminalNode STATE() { return getToken(CWScriptParser.STATE, 0); }
		public TerminalNode DOT() { return getToken(CWScriptParser.DOT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public InnerAssignContext innerAssign() {
			return getRuleContext(InnerAssignContext.class,0);
		}
		public StateItemAssignLHSContext(AssignLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStateItemAssignLHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStateItemAssignLHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStateItemAssignLHS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentAssignLHSContext extends AssignLHSContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public IdentAssignLHSContext(AssignLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIdentAssignLHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIdentAssignLHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIdentAssignLHS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAssignLHSContext extends AssignLHSContext {
		public ExprContext obj;
		public IdentContext member;
		public TerminalNode DOT() { return getToken(CWScriptParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MemberAssignLHSContext(AssignLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterMemberAssignLHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitMemberAssignLHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitMemberAssignLHS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateMapAssignLHSContext extends AssignLHSContext {
		public IdentContext key;
		public ExprContext expr;
		public List<ExprContext> mapKeys = new ArrayList<ExprContext>();
		public InnerAssignContext inner;
		public TerminalNode STATE() { return getToken(CWScriptParser.STATE, 0); }
		public TerminalNode DOT() { return getToken(CWScriptParser.DOT, 0); }
		public TerminalNode LBRACK() { return getToken(CWScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CWScriptParser.RBRACK, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public InnerAssignContext innerAssign() {
			return getRuleContext(InnerAssignContext.class,0);
		}
		public StateMapAssignLHSContext(AssignLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStateMapAssignLHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStateMapAssignLHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStateMapAssignLHS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableAssignLHSContext extends AssignLHSContext {
		public ExprContext table;
		public ExprContext key;
		public TerminalNode LBRACK() { return getToken(CWScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CWScriptParser.RBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TableAssignLHSContext(AssignLHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTableAssignLHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTableAssignLHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTableAssignLHS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignLHSContext assignLHS() throws RecognitionException {
		AssignLHSContext _localctx = new AssignLHSContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assignLHS);
		int _la;
		try {
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				_localctx = new StateItemAssignLHSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				match(STATE);
				setState(793);
				match(DOT);
				setState(794);
				((StateItemAssignLHSContext)_localctx).key = ident();
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(795);
					((StateItemAssignLHSContext)_localctx).inner = innerAssign();
					}
				}

				}
				break;
			case 2:
				_localctx = new StateMapAssignLHSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				match(STATE);
				setState(799);
				match(DOT);
				setState(800);
				((StateMapAssignLHSContext)_localctx).key = ident();
				setState(801);
				match(LBRACK);
				{
				setState(802);
				((StateMapAssignLHSContext)_localctx).expr = expr(0);
				((StateMapAssignLHSContext)_localctx).mapKeys.add(((StateMapAssignLHSContext)_localctx).expr);
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(803);
					match(COMMA);
					setState(804);
					((StateMapAssignLHSContext)_localctx).expr = expr(0);
					((StateMapAssignLHSContext)_localctx).mapKeys.add(((StateMapAssignLHSContext)_localctx).expr);
					}
					}
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(810);
				match(RBRACK);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(811);
					((StateMapAssignLHSContext)_localctx).inner = innerAssign();
					}
				}

				}
				break;
			case 3:
				_localctx = new IdentAssignLHSContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(814);
				ident();
				}
				break;
			case 4:
				_localctx = new MemberAssignLHSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(815);
				((MemberAssignLHSContext)_localctx).obj = expr(0);
				setState(816);
				match(DOT);
				setState(817);
				((MemberAssignLHSContext)_localctx).member = ident();
				}
				break;
			case 5:
				_localctx = new TableAssignLHSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(819);
				((TableAssignLHSContext)_localctx).table = expr(0);
				setState(820);
				match(LBRACK);
				setState(821);
				((TableAssignLHSContext)_localctx).key = expr(0);
				setState(822);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerAssignContext extends ParserRuleContext {
		public InnerPathContext innerPath;
		public List<InnerPathContext> paths = new ArrayList<InnerPathContext>();
		public List<TerminalNode> DOT() { return getTokens(CWScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CWScriptParser.DOT, i);
		}
		public List<InnerPathContext> innerPath() {
			return getRuleContexts(InnerPathContext.class);
		}
		public InnerPathContext innerPath(int i) {
			return getRuleContext(InnerPathContext.class,i);
		}
		public InnerAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterInnerAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitInnerAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitInnerAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerAssignContext innerAssign() throws RecognitionException {
		InnerAssignContext _localctx = new InnerAssignContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_innerAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(826);
			match(DOT);
			setState(827);
			((InnerAssignContext)_localctx).innerPath = innerPath();
			((InnerAssignContext)_localctx).paths.add(((InnerAssignContext)_localctx).innerPath);
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(828);
				match(DOT);
				setState(829);
				((InnerAssignContext)_localctx).innerPath = innerPath();
				((InnerAssignContext)_localctx).paths.add(((InnerAssignContext)_localctx).innerPath);
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerPathContext extends ParserRuleContext {
		public IdentContext name;
		public ExprContext tableKey;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(CWScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CWScriptParser.RBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InnerPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterInnerPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitInnerPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitInnerPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerPathContext innerPath() throws RecognitionException {
		InnerPathContext _localctx = new InnerPathContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_innerPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(835);
			((InnerPathContext)_localctx).name = ident();
			}
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(836);
				match(LBRACK);
				setState(837);
				((InnerPathContext)_localctx).tableKey = expr(0);
				setState(838);
				match(RBRACK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MsgContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(CWScriptParser.HASH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CWScriptParser.DOT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public MsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterMsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitMsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitMsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgContext msg() throws RecognitionException {
		MsgContext _localctx = new MsgContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_msg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(HASH);
			setState(843);
			expr(0);
			setState(844);
			match(DOT);
			setState(845);
			ident();
			setState(846);
			match(LPAREN);
			setState(847);
			exprList();
			setState(848);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(CWScriptParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfExprContext extends ExprContext {
		public IfExpr_Context ifExpr_() {
			return getRuleContext(IfExpr_Context.class,0);
		}
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivModExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CWScriptParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CWScriptParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CWScriptParser.MOD, 0); }
		public MultDivModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterMultDivModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitMultDivModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitMultDivModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryExprContext extends ExprContext {
		public TerminalNode QUERY() { return getToken(CWScriptParser.QUERY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QueryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterQueryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitQueryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitQueryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosArgsFnCallExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public PosArgsFnCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterPosArgsFnCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitPosArgsFnCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitPosArgsFnCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValExprContext extends ExprContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ValExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterValExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitValExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitValExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(CWScriptParser.LT, 0); }
		public TerminalNode GT() { return getToken(CWScriptParser.GT, 0); }
		public TerminalNode LT_EQ() { return getToken(CWScriptParser.LT_EQ, 0); }
		public TerminalNode GT_EQ() { return getToken(CWScriptParser.GT_EQ, 0); }
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(CWScriptParser.POW, 0); }
		public ExpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CWScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CWScriptParser.MINUS, 0); }
		public TerminalNode EXCLAM() { return getToken(CWScriptParser.EXCLAM, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(CWScriptParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateMapAccessExprContext extends ExprContext {
		public IdentContext key;
		public ExprContext expr;
		public List<ExprContext> mapKeys = new ArrayList<ExprContext>();
		public TerminalNode STATE() { return getToken(CWScriptParser.STATE, 0); }
		public TerminalNode DOT() { return getToken(CWScriptParser.DOT, 0); }
		public TerminalNode LBRACK() { return getToken(CWScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CWScriptParser.RBRACK, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public StateMapAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStateMapAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStateMapAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStateMapAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateItemAccessExprContext extends ExprContext {
		public IdentContext key;
		public TerminalNode STATE() { return getToken(CWScriptParser.STATE, 0); }
		public TerminalNode DOT() { return getToken(CWScriptParser.DOT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StateItemAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStateItemAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStateItemAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStateItemAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQEQ() { return getToken(CWScriptParser.EQEQ, 0); }
		public TerminalNode NEQ() { return getToken(CWScriptParser.NEQ, 0); }
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedArgsFnCallExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public NamedExprListContext namedExprList() {
			return getRuleContext(NamedExprListContext.class,0);
		}
		public NamedArgsFnCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterNamedArgsFnCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitNamedArgsFnCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitNamedArgsFnCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableLookupExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(CWScriptParser.LBRACK, 0); }
		public TerminalNode COMMA() { return getToken(CWScriptParser.COMMA, 0); }
		public TerminalNode RBRACK() { return getToken(CWScriptParser.RBRACK, 0); }
		public TableLookupExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTableLookupExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTableLookupExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTableLookupExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CWScriptParser.DOT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MemberAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterMemberAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitMemberAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitMemberAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CWScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CWScriptParser.MINUS, 0); }
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupedExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public GroupedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterGroupedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitGroupedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitGroupedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				_localctx = new GroupedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(851);
				match(LPAREN);
				setState(852);
				expr(0);
				setState(853);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new StateItemAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(855);
				match(STATE);
				setState(856);
				match(DOT);
				setState(857);
				((StateItemAccessExprContext)_localctx).key = ident();
				}
				break;
			case 3:
				{
				_localctx = new StateMapAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(858);
				match(STATE);
				setState(859);
				match(DOT);
				setState(860);
				((StateMapAccessExprContext)_localctx).key = ident();
				setState(861);
				match(LBRACK);
				{
				setState(862);
				((StateMapAccessExprContext)_localctx).expr = expr(0);
				((StateMapAccessExprContext)_localctx).mapKeys.add(((StateMapAccessExprContext)_localctx).expr);
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(863);
					match(COMMA);
					setState(864);
					((StateMapAccessExprContext)_localctx).expr = expr(0);
					((StateMapAccessExprContext)_localctx).mapKeys.add(((StateMapAccessExprContext)_localctx).expr);
					}
					}
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(870);
				match(RBRACK);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(872);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(873);
				expr(11);
				}
				break;
			case 5:
				{
				_localctx = new IfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(874);
				ifExpr_();
				}
				break;
			case 6:
				{
				_localctx = new QueryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(875);
				match(QUERY);
				setState(876);
				expr(2);
				}
				break;
			case 7:
				{
				_localctx = new ValExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(877);
				val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(922);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						_localctx = new ExpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(880);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(881);
						match(POW);
						setState(882);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultDivModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(883);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(884);
						((MultDivModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 27021597764223040L) != 0) ) {
							((MultDivModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(885);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(886);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(887);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(888);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(889);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(890);
						((CompExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 108086391459545088L) != 0) ) {
							((CompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(891);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(892);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(893);
						((EqExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==NEQ) ) {
							((EqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(894);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(895);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(896);
						match(AND);
						setState(897);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(898);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(899);
						match(OR);
						setState(900);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new MemberAccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(901);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(902);
						match(DOT);
						setState(903);
						ident();
						}
						break;
					case 9:
						{
						_localctx = new TableLookupExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(904);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(905);
						match(LBRACK);
						setState(906);
						expr(0);
						setState(907);
						match(COMMA);
						setState(908);
						match(RBRACK);
						}
						break;
					case 10:
						{
						_localctx = new PosArgsFnCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(910);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(911);
						match(LPAREN);
						setState(913);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((_la) & ~0x3f) == 0 && ((1L << _la) & -572517053707353154L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 127L) != 0) {
							{
							setState(912);
							exprList();
							}
						}

						setState(915);
						match(RPAREN);
						}
						break;
					case 11:
						{
						_localctx = new NamedArgsFnCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(916);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(917);
						match(LPAREN);
						setState(919);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 127L) != 0) {
							{
							setState(918);
							namedExprList();
							}
						}

						setState(921);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueValContext extends ValContext {
		public TerminalNode TRUE() { return getToken(CWScriptParser.TRUE, 0); }
		public TrueValContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTrueVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTrueVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTrueVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructValContext extends ValContext {
		public StructVal_Context structVal_() {
			return getRuleContext(StructVal_Context.class,0);
		}
		public StructValContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStructVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStructVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStructVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleValContext extends ValContext {
		public TypePathContext tupleType;
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TupleValContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterTupleVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitTupleVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitTupleVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VecValContext extends ValContext {
		public TerminalNode LBRACK() { return getToken(CWScriptParser.LBRACK, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CWScriptParser.RBRACK, 0); }
		public VecValContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterVecVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitVecVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitVecVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseValContext extends ValContext {
		public TerminalNode FALSE() { return getToken(CWScriptParser.FALSE, 0); }
		public FalseValContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterFalseVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitFalseVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitFalseVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentValContext extends ValContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public IdentValContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIdentVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIdentVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIdentVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitValContext extends ValContext {
		public TerminalNode LPAREN() { return getToken(CWScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CWScriptParser.RPAREN, 0); }
		public UnitValContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterUnitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitUnitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitUnitVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValContext extends ValContext {
		public TerminalNode StringLiteral() { return getToken(CWScriptParser.StringLiteral, 0); }
		public StringValContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStringVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStringVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStringVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerValContext extends ValContext {
		public TerminalNode IntegerLiteral() { return getToken(CWScriptParser.IntegerLiteral, 0); }
		public IntegerValContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIntegerVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIntegerVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIntegerVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalValContext extends ValContext {
		public TerminalNode DecimalLiteral() { return getToken(CWScriptParser.DecimalLiteral, 0); }
		public DecimalValContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterDecimalVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitDecimalVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitDecimalVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_val);
		try {
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				_localctx = new UnitValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				match(LPAREN);
				setState(928);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new StructValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				structVal_();
				}
				break;
			case 3:
				_localctx = new TupleValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
				((TupleValContext)_localctx).tupleType = typePath();
				setState(931);
				match(LPAREN);
				setState(932);
				exprList();
				setState(933);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new VecValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(935);
				match(LBRACK);
				setState(936);
				exprList();
				setState(937);
				match(RBRACK);
				}
				break;
			case 5:
				_localctx = new StringValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(939);
				match(StringLiteral);
				}
				break;
			case 6:
				_localctx = new IntegerValContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(940);
				match(IntegerLiteral);
				}
				break;
			case 7:
				_localctx = new DecimalValContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(941);
				match(DecimalLiteral);
				}
				break;
			case 8:
				_localctx = new TrueValContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(942);
				match(TRUE);
				}
				break;
			case 9:
				_localctx = new FalseValContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(943);
				match(FALSE);
				}
				break;
			case 10:
				_localctx = new IdentValContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(944);
				ident();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructVal_Context extends ParserRuleContext {
		public TypePathContext structType;
		public StructValMembersContext members;
		public TerminalNode LBRACE() { return getToken(CWScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CWScriptParser.RBRACE, 0); }
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public StructValMembersContext structValMembers() {
			return getRuleContext(StructValMembersContext.class,0);
		}
		public StructVal_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structVal_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStructVal_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStructVal_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStructVal_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructVal_Context structVal_() throws RecognitionException {
		StructVal_Context _localctx = new StructVal_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_structVal_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(947);
			((StructVal_Context)_localctx).structType = typePath();
			}
			setState(948);
			match(LBRACE);
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 127L) != 0) {
				{
				setState(949);
				((StructVal_Context)_localctx).members = structValMembers();
				}
			}

			setState(952);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructValMembersContext extends ParserRuleContext {
		public List<StructValMemberContext> structValMember() {
			return getRuleContexts(StructValMemberContext.class);
		}
		public StructValMemberContext structValMember(int i) {
			return getRuleContext(StructValMemberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public StructValMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structValMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStructValMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStructValMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStructValMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructValMembersContext structValMembers() throws RecognitionException {
		StructValMembersContext _localctx = new StructValMembersContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_structValMembers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			structValMember();
			setState(959);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(955);
					match(COMMA);
					setState(956);
					structValMember();
					}
					} 
				}
				setState(961);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(962);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructValMemberContext extends ParserRuleContext {
		public IdentContext name;
		public ExprContext value;
		public TerminalNode COLON() { return getToken(CWScriptParser.COLON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StructValMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structValMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterStructValMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitStructValMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitStructValMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructValMemberContext structValMember() throws RecognitionException {
		StructValMemberContext _localctx = new StructValMemberContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_structValMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(965);
			((StructValMemberContext)_localctx).name = ident();
			setState(966);
			match(COLON);
			setState(967);
			((StructValMemberContext)_localctx).value = expr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfExpr_Context extends ParserRuleContext {
		public IfClause_Context ifClause_() {
			return getRuleContext(IfClause_Context.class,0);
		}
		public ElseIfClausesContext elseIfClauses() {
			return getRuleContext(ElseIfClausesContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIfExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIfExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIfExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpr_Context ifExpr_() throws RecognitionException {
		IfExpr_Context _localctx = new IfExpr_Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_ifExpr_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			ifClause_();
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(970);
				elseIfClauses();
				}
				break;
			}
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(973);
				elseClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfClause_Context extends ParserRuleContext {
		public IfClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifClause_; }
	 
		public IfClause_Context() { }
		public void copyFrom(IfClause_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfLetClauseContext extends IfClause_Context {
		public TerminalNode IF() { return getToken(CWScriptParser.IF, 0); }
		public LetStmt_Context letStmt_() {
			return getRuleContext(LetStmt_Context.class,0);
		}
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public IfLetClauseContext(IfClause_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIfLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIfLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIfLetClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfClauseContext extends IfClause_Context {
		public ExprContext predicate;
		public TerminalNode IF() { return getToken(CWScriptParser.IF, 0); }
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfClauseContext(IfClause_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIfClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfClause_Context ifClause_() throws RecognitionException {
		IfClause_Context _localctx = new IfClause_Context(_ctx, getState());
		enterRule(_localctx, 156, RULE_ifClause_);
		try {
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				_localctx = new IfClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				match(IF);
				{
				setState(977);
				((IfClauseContext)_localctx).predicate = expr(0);
				}
				setState(978);
				fnBody();
				}
				break;
			case 2:
				_localctx = new IfLetClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				match(IF);
				setState(981);
				letStmt_();
				setState(982);
				fnBody();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfClausesContext extends ParserRuleContext {
		public List<TerminalNode> ELSE() { return getTokens(CWScriptParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CWScriptParser.ELSE, i);
		}
		public List<IfClause_Context> ifClause_() {
			return getRuleContexts(IfClause_Context.class);
		}
		public IfClause_Context ifClause_(int i) {
			return getRuleContext(IfClause_Context.class,i);
		}
		public ElseIfClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterElseIfClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitElseIfClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitElseIfClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfClausesContext elseIfClauses() throws RecognitionException {
		ElseIfClausesContext _localctx = new ElseIfClausesContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_elseIfClauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(988); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(986);
					match(ELSE);
					setState(987);
					ifClause_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(990); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CWScriptParser.ELSE, 0); }
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(ELSE);
			setState(993);
			fnBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmt_Context extends ParserRuleContext {
		public ForStmt_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt_; }
	 
		public ForStmt_Context() { }
		public void copyFrom(ForStmt_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInStmtContext extends ForStmt_Context {
		public LetLHSContext item;
		public ExprContext iterItems;
		public TerminalNode FOR() { return getToken(CWScriptParser.FOR, 0); }
		public TerminalNode IN() { return getToken(CWScriptParser.IN, 0); }
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public LetLHSContext letLHS() {
			return getRuleContext(LetLHSContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForInStmtContext(ForStmt_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterForInStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitForInStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitForInStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForTimesStmtContext extends ForStmt_Context {
		public TerminalNode FOR() { return getToken(CWScriptParser.FOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(CWScriptParser.TIMES, 0); }
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public ForTimesStmtContext(ForStmt_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterForTimesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitForTimesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitForTimesStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmt_Context forStmt_() throws RecognitionException {
		ForStmt_Context _localctx = new ForStmt_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_forStmt_);
		try {
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				_localctx = new ForInStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				match(FOR);
				setState(996);
				((ForInStmtContext)_localctx).item = letLHS();
				setState(997);
				match(IN);
				setState(998);
				((ForInStmtContext)_localctx).iterItems = expr(0);
				setState(999);
				fnBody();
				}
				break;
			case 2:
				_localctx = new ForTimesStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				match(FOR);
				setState(1002);
				expr(0);
				setState(1003);
				match(TIMES);
				setState(1004);
				fnBody();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentListContext extends ParserRuleContext {
		public IdentContext ident;
		public List<IdentContext> symbols = new ArrayList<IdentContext>();
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public IdentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIdentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIdentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIdentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentListContext identList() throws RecognitionException {
		IdentListContext _localctx = new IdentListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_identList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1008);
			((IdentListContext)_localctx).ident = ident();
			((IdentListContext)_localctx).symbols.add(((IdentListContext)_localctx).ident);
			}
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1009);
				match(COMMA);
				{
				setState(1010);
				((IdentListContext)_localctx).ident = ident();
				((IdentListContext)_localctx).symbols.add(((IdentListContext)_localctx).ident);
				}
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			expr(0);
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1017);
				match(COMMA);
				setState(1018);
				expr(0);
				}
				}
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExprListContext extends ParserRuleContext {
		public List<NamedExprContext> namedExpr() {
			return getRuleContexts(NamedExprContext.class);
		}
		public NamedExprContext namedExpr(int i) {
			return getRuleContext(NamedExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CWScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CWScriptParser.COMMA, i);
		}
		public NamedExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterNamedExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitNamedExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitNamedExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExprListContext namedExprList() throws RecognitionException {
		NamedExprListContext _localctx = new NamedExprListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_namedExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			namedExpr();
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1025);
				match(COMMA);
				setState(1026);
				namedExpr();
				}
				}
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExprContext extends ParserRuleContext {
		public IdentContext name;
		public ExprContext value;
		public TerminalNode COLON() { return getToken(CWScriptParser.COLON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NamedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterNamedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitNamedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitNamedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExprContext namedExpr() throws RecognitionException {
		NamedExprContext _localctx = new NamedExprContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_namedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1032);
			((NamedExprContext)_localctx).name = ident();
			setState(1033);
			match(COLON);
			setState(1034);
			((NamedExprContext)_localctx).value = expr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(CWScriptParser.Ident, 0); }
		public ReservedKeywordContext reservedKeyword() {
			return getRuleContext(ReservedKeywordContext.class,0);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_ident);
		try {
			setState(1038);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				match(Ident);
				}
				break;
			case CONTRACT:
			case EXTENDS:
			case IMPLEMENTS:
			case INTERFACE:
			case IMPORT:
			case FROM:
			case ERROR:
			case EVENT:
			case STATE:
			case INSTANTIATE:
			case EXEC:
			case QUERY:
			case MIGRATE:
			case STRUCT:
			case ENUM:
			case TYPE:
			case FN:
			case EMIT:
			case RETURN:
			case LET:
			case AND:
			case OR:
			case TRUE:
			case FALSE:
			case IF:
			case ELSE:
			case FOR:
			case IN:
			case TIMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				reservedKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CwspecContext extends ParserRuleContext {
		public List<TerminalNode> CWSPEC_LINE_COMMENT() { return getTokens(CWScriptParser.CWSPEC_LINE_COMMENT); }
		public TerminalNode CWSPEC_LINE_COMMENT(int i) {
			return getToken(CWScriptParser.CWSPEC_LINE_COMMENT, i);
		}
		public List<TerminalNode> CWSPEC_BLOCK_COMMENT() { return getTokens(CWScriptParser.CWSPEC_BLOCK_COMMENT); }
		public TerminalNode CWSPEC_BLOCK_COMMENT(int i) {
			return getToken(CWScriptParser.CWSPEC_BLOCK_COMMENT, i);
		}
		public CwspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cwspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterCwspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitCwspec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitCwspec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CwspecContext cwspec() throws RecognitionException {
		CwspecContext _localctx = new CwspecContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_cwspec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1041); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1040);
					_la = _input.LA(1);
					if ( !(_la==CWSPEC_LINE_COMMENT || _la==CWSPEC_BLOCK_COMMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1043); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedKeywordContext extends ParserRuleContext {
		public TerminalNode CONTRACT() { return getToken(CWScriptParser.CONTRACT, 0); }
		public TerminalNode INTERFACE() { return getToken(CWScriptParser.INTERFACE, 0); }
		public TerminalNode IMPORT() { return getToken(CWScriptParser.IMPORT, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(CWScriptParser.IMPLEMENTS, 0); }
		public TerminalNode EXTENDS() { return getToken(CWScriptParser.EXTENDS, 0); }
		public TerminalNode ERROR() { return getToken(CWScriptParser.ERROR, 0); }
		public TerminalNode EVENT() { return getToken(CWScriptParser.EVENT, 0); }
		public TerminalNode INSTANTIATE() { return getToken(CWScriptParser.INSTANTIATE, 0); }
		public TerminalNode EXEC() { return getToken(CWScriptParser.EXEC, 0); }
		public TerminalNode QUERY() { return getToken(CWScriptParser.QUERY, 0); }
		public TerminalNode MIGRATE() { return getToken(CWScriptParser.MIGRATE, 0); }
		public TerminalNode FOR() { return getToken(CWScriptParser.FOR, 0); }
		public TerminalNode IN() { return getToken(CWScriptParser.IN, 0); }
		public TerminalNode FROM() { return getToken(CWScriptParser.FROM, 0); }
		public TerminalNode STATE() { return getToken(CWScriptParser.STATE, 0); }
		public TerminalNode TIMES() { return getToken(CWScriptParser.TIMES, 0); }
		public TerminalNode IF() { return getToken(CWScriptParser.IF, 0); }
		public TerminalNode FN() { return getToken(CWScriptParser.FN, 0); }
		public TerminalNode ELSE() { return getToken(CWScriptParser.ELSE, 0); }
		public TerminalNode AND() { return getToken(CWScriptParser.AND, 0); }
		public TerminalNode OR() { return getToken(CWScriptParser.OR, 0); }
		public TerminalNode TRUE() { return getToken(CWScriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CWScriptParser.FALSE, 0); }
		public TerminalNode LET() { return getToken(CWScriptParser.LET, 0); }
		public TerminalNode RETURN() { return getToken(CWScriptParser.RETURN, 0); }
		public TerminalNode STRUCT() { return getToken(CWScriptParser.STRUCT, 0); }
		public TerminalNode ENUM() { return getToken(CWScriptParser.ENUM, 0); }
		public TerminalNode TYPE() { return getToken(CWScriptParser.TYPE, 0); }
		public TerminalNode EMIT() { return getToken(CWScriptParser.EMIT, 0); }
		public ReservedKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).enterReservedKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CWScriptParserListener ) ((CWScriptParserListener)listener).exitReservedKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CWScriptParserVisitor ) return ((CWScriptParserVisitor<? extends T>)visitor).visitReservedKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedKeywordContext reservedKeyword() throws RecognitionException {
		ReservedKeywordContext _localctx = new ReservedKeywordContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_reservedKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -7493986731559780162L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 63L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 47:
			return typeExpr_sempred((TypeExprContext)_localctx, predIndex);
		case 72:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeExpr_sempred(TypeExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 13);
		case 13:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u0418\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0001\u0000\u0003\u0000"+
		"\u00b4\b\u0000\u0001\u0000\u0005\u0000\u00b7\b\u0000\n\u0000\f\u0000\u00ba"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00bf\b\u0001"+
		"\u0001\u0002\u0003\u0002\u00c2\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00c8\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00cc\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003\u00d1\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00d7"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00e3"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00e8\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ed\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00f2\b\u0005\n\u0005\f\u0005\u00f5"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00fa\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00fe\b\u0007\n\u0007\f\u0007\u0101"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b\u0107\b\b\n\b"+
		"\f\b\u010a\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u011c\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u012b\b\n\u0001"+
		"\u000b\u0003\u000b\u012e\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0138\b\f\n\f\f\f\u013b\t\f"+
		"\u0001\f\u0003\f\u013e\b\f\u0003\f\u0140\b\f\u0001\f\u0001\f\u0001\r\u0003"+
		"\r\u0145\b\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u014a\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0154\b\u000f\n\u000f\f\u000f\u0157\t\u000f"+
		"\u0001\u000f\u0003\u000f\u015a\b\u000f\u0003\u000f\u015c\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u0161\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0003\u0011\u0166\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u016b\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u016f"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0176\b\u0012\n\u0012\f\u0012\u0179\t\u0012\u0001\u0012\u0003\u0012"+
		"\u017c\b\u0012\u0003\u0012\u017e\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0003\u0013\u0183\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0187"+
		"\b\u0013\u0001\u0013\u0003\u0013\u018a\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0199\b\u0016\n\u0016\f\u0016\u019c\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01a3\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0003\u0018\u01a8\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u01ad\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0003"+
		"\u0019\u01b2\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01b7"+
		"\b\u0019\u0001\u001a\u0003\u001a\u01ba\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01c2\b\u001b"+
		"\n\u001b\f\u001b\u01c5\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0003"+
		"\u001c\u01ca\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0003\u001d\u01cf"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u01d7\b\u001e\n\u001e\f\u001e\u01da\t\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0003\u001f\u01df\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0003 \u01e4\b \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0005"+
		"!\u01ec\b!\n!\f!\u01ef\t!\u0001!\u0001!\u0001\"\u0003\"\u01f4\b\"\u0001"+
		"\"\u0001\"\u0001#\u0003#\u01f9\b#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0005$\u0201\b$\n$\f$\u0204\t$\u0001$\u0001$\u0001%\u0003%\u0209\b%"+
		"\u0001%\u0001%\u0001&\u0003&\u020e\b&\u0001&\u0001&\u0001&\u0003&\u0213"+
		"\b&\u0001&\u0001&\u0001\'\u0003\'\u0218\b\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u021d\b\'\u0001(\u0001(\u0003(\u0221\b(\u0001)\u0001)\u0001)\u0003"+
		")\u0226\b)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0005+\u022f"+
		"\b+\n+\f+\u0232\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u023a"+
		"\b,\n,\f,\u023d\t,\u0003,\u023f\b,\u0001,\u0001,\u0001-\u0001-\u0001-"+
		"\u0001-\u0005-\u0247\b-\n-\f-\u024a\t-\u0001-\u0003-\u024d\b-\u0003-\u024f"+
		"\b-\u0001-\u0001-\u0001.\u0003.\u0254\b.\u0001.\u0001.\u0003.\u0258\b"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005"+
		"/\u0263\b/\n/\f/\u0266\t/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u026d"+
		"\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0276\b/\n"+
		"/\f/\u0279\t/\u00010\u00010\u00010\u00010\u00050\u027f\b0\n0\f0\u0282"+
		"\t0\u00010\u00010\u00011\u00011\u00011\u00051\u0289\b1\n1\f1\u028c\t1"+
		"\u00012\u00032\u028f\b2\u00012\u00012\u00013\u00013\u00013\u00033\u0296"+
		"\b3\u00014\u00034\u0299\b4\u00014\u00014\u00014\u00015\u00035\u029f\b"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u00036\u02a9"+
		"\b6\u00016\u00056\u02ac\b6\n6\f6\u02af\t6\u00016\u00036\u02b2\b6\u0003"+
		"6\u02b4\b6\u00017\u00037\u02b7\b7\u00017\u00017\u00017\u00017\u00017\u0001"+
		"8\u00018\u00018\u00038\u02c1\b8\u00019\u00019\u00019\u00039\u02c6\b9\u0001"+
		"9\u00019\u0001:\u0003:\u02cb\b:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001<\u0001<\u0003<\u02d5\b<\u0001<\u0001<\u0001=\u0001=\u0001=\u0005"+
		"=\u02dc\b=\n=\f=\u02df\t=\u0001>\u0001>\u0003>\u02e3\b>\u0001>\u0001>"+
		"\u0001>\u0001?\u0001?\u0005?\u02ea\b?\n?\f?\u02ed\t?\u0001?\u0001?\u0001"+
		"?\u0003?\u02f2\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0303\b@\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0003B\u030d\bB\u0001"+
		"B\u0001B\u0001B\u0001B\u0003B\u0313\bB\u0001C\u0001C\u0001C\u0001C\u0001"+
		"D\u0001D\u0001D\u0001D\u0003D\u031d\bD\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0005D\u0326\bD\nD\fD\u0329\tD\u0001D\u0001D\u0003D\u032d"+
		"\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u0339\bD\u0001E\u0001E\u0001E\u0001E\u0005E\u033f\bE\nE\fE\u0342"+
		"\tE\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u0349\bF\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0005H\u0362\bH\nH\fH\u0365\tH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0003H\u036f\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u0392\bH\u0001"+
		"H\u0001H\u0001H\u0001H\u0003H\u0398\bH\u0001H\u0005H\u039b\bH\nH\fH\u039e"+
		"\tH\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u03b2"+
		"\bI\u0001J\u0001J\u0001J\u0003J\u03b7\bJ\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0005K\u03be\bK\nK\fK\u03c1\tK\u0001K\u0003K\u03c4\bK\u0001L\u0001L"+
		"\u0001L\u0001L\u0001M\u0001M\u0003M\u03cc\bM\u0001M\u0003M\u03cf\bM\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u03d9\bN\u0001"+
		"O\u0001O\u0004O\u03dd\bO\u000bO\fO\u03de\u0001P\u0001P\u0001P\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003"+
		"Q\u03ef\bQ\u0001R\u0001R\u0001R\u0005R\u03f4\bR\nR\fR\u03f7\tR\u0001S"+
		"\u0001S\u0001S\u0005S\u03fc\bS\nS\fS\u03ff\tS\u0001T\u0001T\u0001T\u0005"+
		"T\u0404\bT\nT\fT\u0407\tT\u0001U\u0001U\u0001U\u0001U\u0001V\u0001V\u0003"+
		"V\u040f\bV\u0001W\u0004W\u0412\bW\u000bW\fW\u0413\u0001X\u0001X\u0001"+
		"X\u0000\u0002^\u0090Y\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u0000\b\u0002\u0000!!*.\u0001\u000013\u0002\u0000"+
		"\u0006\u000656\u0001\u000012\u0002\u0000\u001b\u001c78\u0001\u00009:\u0001"+
		"\u0000GH\n\u0000\u0001\u0005\u0007\u0007\u000f\u0011\u0015\u0018\u001e"+
		" \"\"&\'));<?E\u0473\u0000\u00b3\u0001\u0000\u0000\u0000\u0002\u00be\u0001"+
		"\u0000\u0000\u0000\u0004\u00c1\u0001\u0000\u0000\u0000\u0006\u00d0\u0001"+
		"\u0000\u0000\u0000\b\u00ec\u0001\u0000\u0000\u0000\n\u00ee\u0001\u0000"+
		"\u0000\u0000\f\u00f6\u0001\u0000\u0000\u0000\u000e\u00fb\u0001\u0000\u0000"+
		"\u0000\u0010\u0104\u0001\u0000\u0000\u0000\u0012\u011b\u0001\u0000\u0000"+
		"\u0000\u0014\u012a\u0001\u0000\u0000\u0000\u0016\u012d\u0001\u0000\u0000"+
		"\u0000\u0018\u0132\u0001\u0000\u0000\u0000\u001a\u0144\u0001\u0000\u0000"+
		"\u0000\u001c\u0149\u0001\u0000\u0000\u0000\u001e\u014e\u0001\u0000\u0000"+
		"\u0000 \u0160\u0001\u0000\u0000\u0000\"\u016e\u0001\u0000\u0000\u0000"+
		"$\u0170\u0001\u0000\u0000\u0000&\u0189\u0001\u0000\u0000\u0000(\u018b"+
		"\u0001\u0000\u0000\u0000*\u018f\u0001\u0000\u0000\u0000,\u0194\u0001\u0000"+
		"\u0000\u0000.\u01a2\u0001\u0000\u0000\u00000\u01a7\u0001\u0000\u0000\u0000"+
		"2\u01b1\u0001\u0000\u0000\u00004\u01b9\u0001\u0000\u0000\u00006\u01be"+
		"\u0001\u0000\u0000\u00008\u01c9\u0001\u0000\u0000\u0000:\u01ce\u0001\u0000"+
		"\u0000\u0000<\u01d3\u0001\u0000\u0000\u0000>\u01de\u0001\u0000\u0000\u0000"+
		"@\u01e3\u0001\u0000\u0000\u0000B\u01e8\u0001\u0000\u0000\u0000D\u01f3"+
		"\u0001\u0000\u0000\u0000F\u01f8\u0001\u0000\u0000\u0000H\u01fd\u0001\u0000"+
		"\u0000\u0000J\u0208\u0001\u0000\u0000\u0000L\u020d\u0001\u0000\u0000\u0000"+
		"N\u0217\u0001\u0000\u0000\u0000P\u0220\u0001\u0000\u0000\u0000R\u0222"+
		"\u0001\u0000\u0000\u0000T\u0227\u0001\u0000\u0000\u0000V\u022a\u0001\u0000"+
		"\u0000\u0000X\u0235\u0001\u0000\u0000\u0000Z\u0242\u0001\u0000\u0000\u0000"+
		"\\\u0253\u0001\u0000\u0000\u0000^\u026c\u0001\u0000\u0000\u0000`\u027a"+
		"\u0001\u0000\u0000\u0000b\u0285\u0001\u0000\u0000\u0000d\u028e\u0001\u0000"+
		"\u0000\u0000f\u0295\u0001\u0000\u0000\u0000h\u0298\u0001\u0000\u0000\u0000"+
		"j\u029e\u0001\u0000\u0000\u0000l\u02b3\u0001\u0000\u0000\u0000n\u02b6"+
		"\u0001\u0000\u0000\u0000p\u02bd\u0001\u0000\u0000\u0000r\u02c2\u0001\u0000"+
		"\u0000\u0000t\u02ca\u0001\u0000\u0000\u0000v\u02cf\u0001\u0000\u0000\u0000"+
		"x\u02d2\u0001\u0000\u0000\u0000z\u02d8\u0001\u0000\u0000\u0000|\u02e0"+
		"\u0001\u0000\u0000\u0000~\u02f1\u0001\u0000\u0000\u0000\u0080\u0302\u0001"+
		"\u0000\u0000\u0000\u0082\u0304\u0001\u0000\u0000\u0000\u0084\u0312\u0001"+
		"\u0000\u0000\u0000\u0086\u0314\u0001\u0000\u0000\u0000\u0088\u0338\u0001"+
		"\u0000\u0000\u0000\u008a\u033a\u0001\u0000\u0000\u0000\u008c\u0343\u0001"+
		"\u0000\u0000\u0000\u008e\u034a\u0001\u0000\u0000\u0000\u0090\u036e\u0001"+
		"\u0000\u0000\u0000\u0092\u03b1\u0001\u0000\u0000\u0000\u0094\u03b3\u0001"+
		"\u0000\u0000\u0000\u0096\u03ba\u0001\u0000\u0000\u0000\u0098\u03c5\u0001"+
		"\u0000\u0000\u0000\u009a\u03c9\u0001\u0000\u0000\u0000\u009c\u03d8\u0001"+
		"\u0000\u0000\u0000\u009e\u03dc\u0001\u0000\u0000\u0000\u00a0\u03e0\u0001"+
		"\u0000\u0000\u0000\u00a2\u03ee\u0001\u0000\u0000\u0000\u00a4\u03f0\u0001"+
		"\u0000\u0000\u0000\u00a6\u03f8\u0001\u0000\u0000\u0000\u00a8\u0400\u0001"+
		"\u0000\u0000\u0000\u00aa\u0408\u0001\u0000\u0000\u0000\u00ac\u040e\u0001"+
		"\u0000\u0000\u0000\u00ae\u0411\u0001\u0000\u0000\u0000\u00b0\u0415\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0003\u00aeW\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0003\u0002\u0001\u0000\u00b6\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0001\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bf\u0003\u0004"+
		"\u0002\u0000\u00bc\u00bf\u0003\u0006\u0003\u0000\u00bd\u00bf\u0003\b\u0004"+
		"\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u0003\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c2\u0003\u00aeW\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0005\u0001\u0000\u0000\u00c4\u00c7\u0003\u00acV\u0000\u00c5"+
		"\u00c6\u0005\u0002\u0000\u0000\u00c6\u00c8\u0003\u00a4R\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0003\u0000\u0000\u00ca\u00cc"+
		"\u0003\u00a4R\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003"+
		"\u000e\u0007\u0000\u00ce\u0005\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003"+
		"\u00aeW\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0004"+
		"\u0000\u0000\u00d3\u00d6\u0003\u00acV\u0000\u00d4\u00d5\u0005\u0002\u0000"+
		"\u0000\u00d5\u00d7\u0003\u00a4R\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0003\u0010\b\u0000\u00d9\u0007\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005\u0005\u0000\u0000\u00db\u00dc\u0005\u0006\u0000\u0000\u00dc"+
		"\u00dd\u0005\u0007\u0000\u0000\u00dd\u00ed\u0005\b\u0000\u0000\u00de\u00e7"+
		"\u0005\u0005\u0000\u0000\u00df\u00e0\u0005\t\u0000\u0000\u00e0\u00e2\u0003"+
		"\n\u0005\u0000\u00e1\u00e3\u0005\n\u0000\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005\u000b\u0000\u0000\u00e5\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e8\u0003\n\u0005\u0000\u00e7\u00df\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0007\u0000\u0000\u00ea\u00eb\u0005\b\u0000\u0000"+
		"\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00da\u0001\u0000\u0000\u0000"+
		"\u00ec\u00de\u0001\u0000\u0000\u0000\u00ed\t\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f3\u0003\f\u0006\u0000\u00ef\u00f0\u0005\n\u0000\u0000\u00f0\u00f2"+
		"\u0003\f\u0006\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u000b\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f9\u0003\u00acV\u0000\u00f7\u00f8\u0005\f"+
		"\u0000\u0000\u00f8\u00fa\u0003\u00acV\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\r\u0001\u0000\u0000\u0000"+
		"\u00fb\u00ff\u0005\r\u0000\u0000\u00fc\u00fe\u0003\u0012\t\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005\u000e\u0000\u0000\u0103\u000f\u0001\u0000\u0000\u0000\u0104"+
		"\u0108\u0005\r\u0000\u0000\u0105\u0107\u0003\u0014\n\u0000\u0106\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b"+
		"\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0005\u000e\u0000\u0000\u010c\u0011\u0001\u0000\u0000\u0000\u010d\u011c"+
		"\u0003f3\u0000\u010e\u011c\u0003t:\u0000\u010f\u011c\u0003\u0016\u000b"+
		"\u0000\u0110\u011c\u0003\u0018\f\u0000\u0111\u011c\u0003\u001c\u000e\u0000"+
		"\u0112\u011c\u0003\u001e\u000f\u0000\u0113\u011c\u0003\"\u0011\u0000\u0114"+
		"\u011c\u0003$\u0012\u0000\u0115\u011c\u00030\u0018\u0000\u0116\u011c\u0003"+
		"4\u001a\u0000\u0117\u011c\u00036\u001b\u0000\u0118\u011c\u0003@ \u0000"+
		"\u0119\u011c\u0003B!\u0000\u011a\u011c\u0003L&\u0000\u011b\u010d\u0001"+
		"\u0000\u0000\u0000\u011b\u010e\u0001\u0000\u0000\u0000\u011b\u010f\u0001"+
		"\u0000\u0000\u0000\u011b\u0110\u0001\u0000\u0000\u0000\u011b\u0111\u0001"+
		"\u0000\u0000\u0000\u011b\u0112\u0001\u0000\u0000\u0000\u011b\u0113\u0001"+
		"\u0000\u0000\u0000\u011b\u0114\u0001\u0000\u0000\u0000\u011b\u0115\u0001"+
		"\u0000\u0000\u0000\u011b\u0116\u0001\u0000\u0000\u0000\u011b\u0117\u0001"+
		"\u0000\u0000\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u0013\u0001"+
		"\u0000\u0000\u0000\u011d\u012b\u0003f3\u0000\u011e\u012b\u0003\u0016\u000b"+
		"\u0000\u011f\u012b\u0003\u0018\f\u0000\u0120\u012b\u0003\u001c\u000e\u0000"+
		"\u0121\u012b\u0003\u001e\u000f\u0000\u0122\u012b\u0003\"\u0011\u0000\u0123"+
		"\u012b\u0003$\u0012\u0000\u0124\u012b\u00032\u0019\u0000\u0125\u012b\u0003"+
		":\u001d\u0000\u0126\u012b\u0003<\u001e\u0000\u0127\u012b\u0003F#\u0000"+
		"\u0128\u012b\u0003H$\u0000\u0129\u012b\u0003N\'\u0000\u012a\u011d\u0001"+
		"\u0000\u0000\u0000\u012a\u011e\u0001\u0000\u0000\u0000\u012a\u011f\u0001"+
		"\u0000\u0000\u0000\u012a\u0120\u0001\u0000\u0000\u0000\u012a\u0121\u0001"+
		"\u0000\u0000\u0000\u012a\u0122\u0001\u0000\u0000\u0000\u012a\u0123\u0001"+
		"\u0000\u0000\u0000\u012a\u0124\u0001\u0000\u0000\u0000\u012a\u0125\u0001"+
		"\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u0127\u0001"+
		"\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001"+
		"\u0000\u0000\u0000\u012b\u0015\u0001\u0000\u0000\u0000\u012c\u012e\u0003"+
		"\u00aeW\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u000f"+
		"\u0000\u0000\u0130\u0131\u0003R)\u0000\u0131\u0017\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0005\u000f\u0000\u0000\u0133\u013f\u0005\r\u0000\u0000\u0134"+
		"\u0139\u0003\u001a\r\u0000\u0135\u0136\u0005\n\u0000\u0000\u0136\u0138"+
		"\u0003\u001a\r\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013b\u0001"+
		"\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001"+
		"\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001"+
		"\u0000\u0000\u0000\u013c\u013e\u0005\n\u0000\u0000\u013d\u013c\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000"+
		"\u0000\u0000\u013f\u0134\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u000e"+
		"\u0000\u0000\u0142\u0019\u0001\u0000\u0000\u0000\u0143\u0145\u0003\u00ae"+
		"W\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0003R)\u0000\u0147"+
		"\u001b\u0001\u0000\u0000\u0000\u0148\u014a\u0003\u00aeW\u0000\u0149\u0148"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0010\u0000\u0000\u014c\u014d"+
		"\u0003R)\u0000\u014d\u001d\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u0010"+
		"\u0000\u0000\u014f\u015b\u0005\r\u0000\u0000\u0150\u0155\u0003 \u0010"+
		"\u0000\u0151\u0152\u0005\n\u0000\u0000\u0152\u0154\u0003 \u0010\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0158\u015a\u0005\n\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b"+
		"\u0150\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u000e\u0000\u0000\u015e"+
		"\u001f\u0001\u0000\u0000\u0000\u015f\u0161\u0003\u00aeW\u0000\u0160\u015f"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0003R)\u0000\u0163!\u0001\u0000"+
		"\u0000\u0000\u0164\u0166\u0003\u00aeW\u0000\u0165\u0164\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005\u0011\u0000\u0000\u0168\u016f\u0003(\u0014\u0000"+
		"\u0169\u016b\u0003\u00aeW\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0005\u0011\u0000\u0000\u016d\u016f\u0003*\u0015\u0000\u016e\u0165"+
		"\u0001\u0000\u0000\u0000\u016e\u016a\u0001\u0000\u0000\u0000\u016f#\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0005\u0011\u0000\u0000\u0171\u017d\u0005"+
		"\r\u0000\u0000\u0172\u0177\u0003&\u0013\u0000\u0173\u0174\u0005\n\u0000"+
		"\u0000\u0174\u0176\u0003&\u0013\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u0176\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000"+
		"\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017c\u0005\n\u0000\u0000\u017b"+
		"\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017e\u0001\u0000\u0000\u0000\u017d\u0172\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0005\u000e\u0000\u0000\u0180%\u0001\u0000\u0000\u0000\u0181\u0183"+
		"\u0003\u00aeW\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0182\u0183\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u018a\u0003"+
		"(\u0014\u0000\u0185\u0187\u0003\u00aeW\u0000\u0186\u0185\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188\u018a\u0003*\u0015\u0000\u0189\u0182\u0001\u0000\u0000\u0000"+
		"\u0189\u0186\u0001\u0000\u0000\u0000\u018a\'\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0003\u00acV\u0000\u018c\u018d\u0005\u0012\u0000\u0000\u018d\u018e"+
		"\u0003^/\u0000\u018e)\u0001\u0000\u0000\u0000\u018f\u0190\u0003\u00ac"+
		"V\u0000\u0190\u0191\u0003,\u0016\u0000\u0191\u0192\u0005\u0012\u0000\u0000"+
		"\u0192\u0193\u0003^/\u0000\u0193+\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0005\u0013\u0000\u0000\u0195\u019a\u0003.\u0017\u0000\u0196\u0197\u0005"+
		"\n\u0000\u0000\u0197\u0199\u0003.\u0017\u0000\u0198\u0196\u0001\u0000"+
		"\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019d\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u0014"+
		"\u0000\u0000\u019e-\u0001\u0000\u0000\u0000\u019f\u01a0\u0003\u00acV\u0000"+
		"\u01a0\u01a1\u0005\u0012\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a2\u019f\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0003^/\u0000\u01a5/"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003\u00aeW\u0000\u01a7\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9\u01aa\u0005\u0015\u0000\u0000\u01aa\u01ac\u0003"+
		"x<\u0000\u01ab\u01ad\u0003v;\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0003~?\u0000\u01af1\u0001\u0000\u0000\u0000\u01b0\u01b2"+
		"\u0003\u00aeW\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005"+
		"\u0015\u0000\u0000\u01b4\u01b6\u0003x<\u0000\u01b5\u01b7\u0003v;\u0000"+
		"\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b73\u0001\u0000\u0000\u0000\u01b8\u01ba\u0003\u00aeW\u0000\u01b9\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\u0016\u0000\u0000\u01bc\u01bd"+
		"\u0003r9\u0000\u01bd5\u0001\u0000\u0000\u0000\u01be\u01bf\u0005\u0016"+
		"\u0000\u0000\u01bf\u01c3\u0005\r\u0000\u0000\u01c0\u01c2\u00038\u001c"+
		"\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0005\u000e\u0000\u0000\u01c77\u0001\u0000\u0000\u0000"+
		"\u01c8\u01ca\u0003\u00aeW\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0003r9\u0000\u01cc9\u0001\u0000\u0000\u0000\u01cd\u01cf\u0003"+
		"\u00aeW\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005\u0016"+
		"\u0000\u0000\u01d1\u01d2\u0003p8\u0000\u01d2;\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0005\u0016\u0000\u0000\u01d4\u01d8\u0005\r\u0000\u0000\u01d5"+
		"\u01d7\u0003>\u001f\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u01da"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01d8"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u000e\u0000\u0000\u01dc=\u0001"+
		"\u0000\u0000\u0000\u01dd\u01df\u0003\u00aeW\u0000\u01de\u01dd\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0003p8\u0000\u01e1?\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e4\u0003\u00aeW\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u0005\u0017\u0000\u0000\u01e6\u01e7\u0003r9\u0000\u01e7A\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0005\u0017\u0000\u0000\u01e9\u01ed\u0005"+
		"\r\u0000\u0000\u01ea\u01ec\u0003D\"\u0000\u01eb\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005\u000e\u0000"+
		"\u0000\u01f1C\u0001\u0000\u0000\u0000\u01f2\u01f4\u0003\u00aeW\u0000\u01f3"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0003r9\u0000\u01f6E\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f9\u0003\u00aeW\u0000\u01f8\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0005\u0017\u0000\u0000\u01fb\u01fc\u0003p8\u0000"+
		"\u01fcG\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005\u0017\u0000\u0000\u01fe"+
		"\u0202\u0005\r\u0000\u0000\u01ff\u0201\u0003J%\u0000\u0200\u01ff\u0001"+
		"\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0001"+
		"\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0206\u0005"+
		"\u000e\u0000\u0000\u0206I\u0001\u0000\u0000\u0000\u0207\u0209\u0003\u00ae"+
		"W\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0003p8\u0000\u020b"+
		"K\u0001\u0000\u0000\u0000\u020c\u020e\u0003\u00aeW\u0000\u020d\u020c\u0001"+
		"\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0001"+
		"\u0000\u0000\u0000\u020f\u0210\u0005\u0018\u0000\u0000\u0210\u0212\u0003"+
		"x<\u0000\u0211\u0213\u0003v;\u0000\u0212\u0211\u0001\u0000\u0000\u0000"+
		"\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0003~?\u0000\u0215M\u0001\u0000\u0000\u0000\u0216\u0218"+
		"\u0003\u00aeW\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0217\u0218\u0001"+
		"\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0005"+
		"\u0018\u0000\u0000\u021a\u021c\u0003x<\u0000\u021b\u021d\u0003v;\u0000"+
		"\u021c\u021b\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000"+
		"\u021dO\u0001\u0000\u0000\u0000\u021e\u0221\u0003R)\u0000\u021f\u0221"+
		"\u0003T*\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u021f\u0001\u0000"+
		"\u0000\u0000\u0221Q\u0001\u0000\u0000\u0000\u0222\u0225\u0003\u00acV\u0000"+
		"\u0223\u0226\u0003X,\u0000\u0224\u0226\u0003Z-\u0000\u0225\u0223\u0001"+
		"\u0000\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226S\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0003\u00acV\u0000\u0228\u0229\u0003V+\u0000"+
		"\u0229U\u0001\u0000\u0000\u0000\u022a\u022b\u0005\t\u0000\u0000\u022b"+
		"\u0230\u0003^/\u0000\u022c\u022d\u0005\n\u0000\u0000\u022d\u022f\u0003"+
		"^/\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000"+
		"\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000"+
		"\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0005\u000b\u0000\u0000\u0234W\u0001\u0000\u0000\u0000"+
		"\u0235\u023e\u0005\t\u0000\u0000\u0236\u023b\u0003\\.\u0000\u0237\u0238"+
		"\u0005\n\u0000\u0000\u0238\u023a\u0003\\.\u0000\u0239\u0237\u0001\u0000"+
		"\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000"+
		"\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023f\u0001\u0000"+
		"\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u0236\u0001\u0000"+
		"\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000"+
		"\u0000\u0000\u0240\u0241\u0005\u000b\u0000\u0000\u0241Y\u0001\u0000\u0000"+
		"\u0000\u0242\u024e\u0005\r\u0000\u0000\u0243\u0248\u0003\\.\u0000\u0244"+
		"\u0245\u0005\n\u0000\u0000\u0245\u0247\u0003\\.\u0000\u0246\u0244\u0001"+
		"\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024c\u0001"+
		"\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024d\u0005"+
		"\n\u0000\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000"+
		"\u0000\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u0243\u0001\u0000"+
		"\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000"+
		"\u0000\u0000\u0250\u0251\u0005\u000e\u0000\u0000\u0251[\u0001\u0000\u0000"+
		"\u0000\u0252\u0254\u0003\u00aeW\u0000\u0253\u0252\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000"+
		"\u0255\u0257\u0003\u00acV\u0000\u0256\u0258\u0005\u0019\u0000\u0000\u0257"+
		"\u0256\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0005\u0012\u0000\u0000\u025a"+
		"\u025b\u0003^/\u0000\u025b]\u0001\u0000\u0000\u0000\u025c\u025d\u0006"+
		"/\uffff\uffff\u0000\u025d\u026d\u0003d2\u0000\u025e\u025f\u0005\t\u0000"+
		"\u0000\u025f\u0264\u0003^/\u0000\u0260\u0261\u0005\n\u0000\u0000\u0261"+
		"\u0263\u0003^/\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0266\u0001"+
		"\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0264\u0265\u0001"+
		"\u0000\u0000\u0000\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u0264\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u0005\u000b\u0000\u0000\u0268\u026d\u0001"+
		"\u0000\u0000\u0000\u0269\u026a\u0005\u001a\u0000\u0000\u026a\u026d\u0003"+
		"^/\u0002\u026b\u026d\u0003f3\u0000\u026c\u025c\u0001\u0000\u0000\u0000"+
		"\u026c\u025e\u0001\u0000\u0000\u0000\u026c\u0269\u0001\u0000\u0000\u0000"+
		"\u026c\u026b\u0001\u0000\u0000\u0000\u026d\u0277\u0001\u0000\u0000\u0000"+
		"\u026e\u026f\n\u0006\u0000\u0000\u026f\u0276\u0003`0\u0000\u0270\u0271"+
		"\n\u0004\u0000\u0000\u0271\u0276\u0005\u0019\u0000\u0000\u0272\u0273\n"+
		"\u0003\u0000\u0000\u0273\u0274\u0005\u0013\u0000\u0000\u0274\u0276\u0005"+
		"\u0014\u0000\u0000\u0275\u026e\u0001\u0000\u0000\u0000\u0275\u0270\u0001"+
		"\u0000\u0000\u0000\u0275\u0272\u0001\u0000\u0000\u0000\u0276\u0279\u0001"+
		"\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001"+
		"\u0000\u0000\u0000\u0278_\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000"+
		"\u0000\u0000\u027a\u027b\u0005\u001b\u0000\u0000\u027b\u0280\u0003^/\u0000"+
		"\u027c\u027d\u0005\n\u0000\u0000\u027d\u027f\u0003^/\u0000\u027e\u027c"+
		"\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e"+
		"\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0283"+
		"\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0284"+
		"\u0005\u001c\u0000\u0000\u0284a\u0001\u0000\u0000\u0000\u0285\u028a\u0003"+
		"\u00acV\u0000\u0286\u0287\u0005\u001d\u0000\u0000\u0287\u0289\u0003\u00ac"+
		"V\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u028c\u0001\u0000\u0000"+
		"\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000"+
		"\u0000\u028bc\u0001\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000"+
		"\u028d\u028f\u0005\u001d\u0000\u0000\u028e\u028d\u0001\u0000\u0000\u0000"+
		"\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\u0003b1\u0000\u0291e\u0001\u0000\u0000\u0000\u0292\u0296"+
		"\u0003h4\u0000\u0293\u0296\u0003j5\u0000\u0294\u0296\u0003n7\u0000\u0295"+
		"\u0292\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295"+
		"\u0294\u0001\u0000\u0000\u0000\u0296g\u0001\u0000\u0000\u0000\u0297\u0299"+
		"\u0003\u00aeW\u0000\u0298\u0297\u0001\u0000\u0000\u0000\u0298\u0299\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0005"+
		"\u001e\u0000\u0000\u029b\u029c\u0003P(\u0000\u029ci\u0001\u0000\u0000"+
		"\u0000\u029d\u029f\u0003\u00aeW\u0000\u029e\u029d\u0001\u0000\u0000\u0000"+
		"\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a1\u0005\u001f\u0000\u0000\u02a1\u02a2\u0003\u00acV\u0000\u02a2"+
		"\u02a3\u0005\r\u0000\u0000\u02a3\u02a4\u0003l6\u0000\u02a4\u02a5\u0005"+
		"\u000e\u0000\u0000\u02a5k\u0001\u0000\u0000\u0000\u02a6\u02ad\u0003P("+
		"\u0000\u02a7\u02a9\u0005\n\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ac\u0003P(\u0000\u02ab\u02a8\u0001\u0000\u0000\u0000\u02ac\u02af"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae"+
		"\u0001\u0000\u0000\u0000\u02ae\u02b1\u0001\u0000\u0000\u0000\u02af\u02ad"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b2\u0005\n\u0000\u0000\u02b1\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b4\u0001"+
		"\u0000\u0000\u0000\u02b3\u02a6\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001"+
		"\u0000\u0000\u0000\u02b4m\u0001\u0000\u0000\u0000\u02b5\u02b7\u0003\u00ae"+
		"W\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005 \u0000\u0000"+
		"\u02b9\u02ba\u0003\u00acV\u0000\u02ba\u02bb\u0005!\u0000\u0000\u02bb\u02bc"+
		"\u0003^/\u0000\u02bco\u0001\u0000\u0000\u0000\u02bd\u02be\u0003\u00ac"+
		"V\u0000\u02be\u02c0\u0003x<\u0000\u02bf\u02c1\u0003v;\u0000\u02c0\u02bf"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1q\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c3\u0003\u00acV\u0000\u02c3\u02c5\u0003x<"+
		"\u0000\u02c4\u02c6\u0003v;\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c8\u0003~?\u0000\u02c8s\u0001\u0000\u0000\u0000\u02c9\u02cb\u0003"+
		"\u00aeW\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000"+
		"\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005\"\u0000"+
		"\u0000\u02cd\u02ce\u0003r9\u0000\u02ceu\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d0\u0005#\u0000\u0000\u02d0\u02d1\u0003^/\u0000\u02d1w\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d4\u0005\t\u0000\u0000\u02d3\u02d5\u0003z=\u0000"+
		"\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005\u000b\u0000\u0000"+
		"\u02d7y\u0001\u0000\u0000\u0000\u02d8\u02dd\u0003|>\u0000\u02d9\u02da"+
		"\u0005\n\u0000\u0000\u02da\u02dc\u0003|>\u0000\u02db\u02d9\u0001\u0000"+
		"\u0000\u0000\u02dc\u02df\u0001\u0000\u0000\u0000\u02dd\u02db\u0001\u0000"+
		"\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de{\u0001\u0000\u0000"+
		"\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02e0\u02e2\u0003\u00acV\u0000"+
		"\u02e1\u02e3\u0005\u0019\u0000\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e5\u0005\u0012\u0000\u0000\u02e5\u02e6\u0003^/\u0000\u02e6}"+
		"\u0001\u0000\u0000\u0000\u02e7\u02eb\u0005\r\u0000\u0000\u02e8\u02ea\u0003"+
		"\u0080@\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02ea\u02ed\u0001\u0000"+
		"\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ee\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ee\u02f2\u0005\u000e\u0000\u0000\u02ef\u02f0\u0005$\u0000"+
		"\u0000\u02f0\u02f2\u0003\u0080@\u0000\u02f1\u02e7\u0001\u0000\u0000\u0000"+
		"\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f2\u007f\u0001\u0000\u0000\u0000"+
		"\u02f3\u0303\u0003\u0082A\u0000\u02f4\u0303\u0003\u0086C\u0000\u02f5\u0303"+
		"\u0003\u009aM\u0000\u02f6\u0303\u0003\u00a2Q\u0000\u02f7\u02f8\u0005\u0016"+
		"\u0000\u0000\u02f8\u0303\u0003\u0090H\u0000\u02f9\u02fa\u0005%\u0000\u0000"+
		"\u02fa\u0303\u0003\u008eG\u0000\u02fb\u02fc\u0005&\u0000\u0000\u02fc\u0303"+
		"\u0003\u0090H\u0000\u02fd\u02fe\u0005\'\u0000\u0000\u02fe\u0303\u0003"+
		"\u0090H\u0000\u02ff\u0300\u0005(\u0000\u0000\u0300\u0303\u0003\u0090H"+
		"\u0000\u0301\u0303\u0003\u0090H\u0000\u0302\u02f3\u0001\u0000\u0000\u0000"+
		"\u0302\u02f4\u0001\u0000\u0000\u0000\u0302\u02f5\u0001\u0000\u0000\u0000"+
		"\u0302\u02f6\u0001\u0000\u0000\u0000\u0302\u02f7\u0001\u0000\u0000\u0000"+
		"\u0302\u02f9\u0001\u0000\u0000\u0000\u0302\u02fb\u0001\u0000\u0000\u0000"+
		"\u0302\u02fd\u0001\u0000\u0000\u0000\u0302\u02ff\u0001\u0000\u0000\u0000"+
		"\u0302\u0301\u0001\u0000\u0000\u0000\u0303\u0081\u0001\u0000\u0000\u0000"+
		"\u0304\u0305\u0005)\u0000\u0000\u0305\u0306\u0003\u0084B\u0000\u0306\u0307"+
		"\u0005!\u0000\u0000\u0307\u0308\u0003\u0090H\u0000\u0308\u0083\u0001\u0000"+
		"\u0000\u0000\u0309\u030c\u0003\u00acV\u0000\u030a\u030b\u0005\u0012\u0000"+
		"\u0000\u030b\u030d\u0003^/\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030c"+
		"\u030d\u0001\u0000\u0000\u0000\u030d\u0313\u0001\u0000\u0000\u0000\u030e"+
		"\u030f\u0005\r\u0000\u0000\u030f\u0310\u0003\u00a4R\u0000\u0310\u0311"+
		"\u0005\u000e\u0000\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0309"+
		"\u0001\u0000\u0000\u0000\u0312\u030e\u0001\u0000\u0000\u0000\u0313\u0085"+
		"\u0001\u0000\u0000\u0000\u0314\u0315\u0003\u0088D\u0000\u0315\u0316\u0007"+
		"\u0000\u0000\u0000\u0316\u0317\u0003\u0090H\u0000\u0317\u0087\u0001\u0000"+
		"\u0000\u0000\u0318\u0319\u0005\u0011\u0000\u0000\u0319\u031a\u0005/\u0000"+
		"\u0000\u031a\u031c\u0003\u00acV\u0000\u031b\u031d\u0003\u008aE\u0000\u031c"+
		"\u031b\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d"+
		"\u0339\u0001\u0000\u0000\u0000\u031e\u031f\u0005\u0011\u0000\u0000\u031f"+
		"\u0320\u0005/\u0000\u0000\u0320\u0321\u0003\u00acV\u0000\u0321\u0322\u0005"+
		"\u0013\u0000\u0000\u0322\u0327\u0003\u0090H\u0000\u0323\u0324\u0005\n"+
		"\u0000\u0000\u0324\u0326\u0003\u0090H\u0000\u0325\u0323\u0001\u0000\u0000"+
		"\u0000\u0326\u0329\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000\u0000"+
		"\u0000\u0327\u0328\u0001\u0000\u0000\u0000\u0328\u032a\u0001\u0000\u0000"+
		"\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u032a\u032c\u0005\u0014\u0000"+
		"\u0000\u032b\u032d\u0003\u008aE\u0000\u032c\u032b\u0001\u0000\u0000\u0000"+
		"\u032c\u032d\u0001\u0000\u0000\u0000\u032d\u0339\u0001\u0000\u0000\u0000"+
		"\u032e\u0339\u0003\u00acV\u0000\u032f\u0330\u0003\u0090H\u0000\u0330\u0331"+
		"\u0005/\u0000\u0000\u0331\u0332\u0003\u00acV\u0000\u0332\u0339\u0001\u0000"+
		"\u0000\u0000\u0333\u0334\u0003\u0090H\u0000\u0334\u0335\u0005\u0013\u0000"+
		"\u0000\u0335\u0336\u0003\u0090H\u0000\u0336\u0337\u0005\u0014\u0000\u0000"+
		"\u0337\u0339\u0001\u0000\u0000\u0000\u0338\u0318\u0001\u0000\u0000\u0000"+
		"\u0338\u031e\u0001\u0000\u0000\u0000\u0338\u032e\u0001\u0000\u0000\u0000"+
		"\u0338\u032f\u0001\u0000\u0000\u0000\u0338\u0333\u0001\u0000\u0000\u0000"+
		"\u0339\u0089\u0001\u0000\u0000\u0000\u033a\u033b\u0005/\u0000\u0000\u033b"+
		"\u0340\u0003\u008cF\u0000\u033c\u033d\u0005/\u0000\u0000\u033d\u033f\u0003"+
		"\u008cF\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033f\u0342\u0001\u0000"+
		"\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000"+
		"\u0000\u0000\u0341\u008b\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000"+
		"\u0000\u0000\u0343\u0348\u0003\u00acV\u0000\u0344\u0345\u0005\u0013\u0000"+
		"\u0000\u0345\u0346\u0003\u0090H\u0000\u0346\u0347\u0005\u0014\u0000\u0000"+
		"\u0347\u0349\u0001\u0000\u0000\u0000\u0348\u0344\u0001\u0000\u0000\u0000"+
		"\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u008d\u0001\u0000\u0000\u0000"+
		"\u034a\u034b\u00050\u0000\u0000\u034b\u034c\u0003\u0090H\u0000\u034c\u034d"+
		"\u0005/\u0000\u0000\u034d\u034e\u0003\u00acV\u0000\u034e\u034f\u0005\t"+
		"\u0000\u0000\u034f\u0350\u0003\u00a6S\u0000\u0350\u0351\u0005\u000b\u0000"+
		"\u0000\u0351\u008f\u0001\u0000\u0000\u0000\u0352\u0353\u0006H\uffff\uffff"+
		"\u0000\u0353\u0354\u0005\t\u0000\u0000\u0354\u0355\u0003\u0090H\u0000"+
		"\u0355\u0356\u0005\u000b\u0000\u0000\u0356\u036f\u0001\u0000\u0000\u0000"+
		"\u0357\u0358\u0005\u0011\u0000\u0000\u0358\u0359\u0005/\u0000\u0000\u0359"+
		"\u036f\u0003\u00acV\u0000\u035a\u035b\u0005\u0011\u0000\u0000\u035b\u035c"+
		"\u0005/\u0000\u0000\u035c\u035d\u0003\u00acV\u0000\u035d\u035e\u0005\u0013"+
		"\u0000\u0000\u035e\u0363\u0003\u0090H\u0000\u035f\u0360\u0005\n\u0000"+
		"\u0000\u0360\u0362\u0003\u0090H\u0000\u0361\u035f\u0001\u0000\u0000\u0000"+
		"\u0362\u0365\u0001\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000"+
		"\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0366\u0001\u0000\u0000\u0000"+
		"\u0365\u0363\u0001\u0000\u0000\u0000\u0366\u0367\u0005\u0014\u0000\u0000"+
		"\u0367\u036f\u0001\u0000\u0000\u0000\u0368\u0369\u0007\u0001\u0000\u0000"+
		"\u0369\u036f\u0003\u0090H\u000b\u036a\u036f\u0003\u009aM\u0000\u036b\u036c"+
		"\u0005\u0017\u0000\u0000\u036c\u036f\u0003\u0090H\u0002\u036d\u036f\u0003"+
		"\u0092I\u0000\u036e\u0352\u0001\u0000\u0000\u0000\u036e\u0357\u0001\u0000"+
		"\u0000\u0000\u036e\u035a\u0001\u0000\u0000\u0000\u036e\u0368\u0001\u0000"+
		"\u0000\u0000\u036e\u036a\u0001\u0000\u0000\u0000\u036e\u036b\u0001\u0000"+
		"\u0000\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036f\u039c\u0001\u0000"+
		"\u0000\u0000\u0370\u0371\n\n\u0000\u0000\u0371\u0372\u00054\u0000\u0000"+
		"\u0372\u039b\u0003\u0090H\u000b\u0373\u0374\n\t\u0000\u0000\u0374\u0375"+
		"\u0007\u0002\u0000\u0000\u0375\u039b\u0003\u0090H\n\u0376\u0377\n\b\u0000"+
		"\u0000\u0377\u0378\u0007\u0003\u0000\u0000\u0378\u039b\u0003\u0090H\t"+
		"\u0379\u037a\n\u0007\u0000\u0000\u037a\u037b\u0007\u0004\u0000\u0000\u037b"+
		"\u039b\u0003\u0090H\b\u037c\u037d\n\u0006\u0000\u0000\u037d\u037e\u0007"+
		"\u0005\u0000\u0000\u037e\u039b\u0003\u0090H\u0007\u037f\u0380\n\u0005"+
		"\u0000\u0000\u0380\u0381\u0005;\u0000\u0000\u0381\u039b\u0003\u0090H\u0006"+
		"\u0382\u0383\n\u0004\u0000\u0000\u0383\u0384\u0005<\u0000\u0000\u0384"+
		"\u039b\u0003\u0090H\u0005\u0385\u0386\n\u000f\u0000\u0000\u0386\u0387"+
		"\u0005/\u0000\u0000\u0387\u039b\u0003\u00acV\u0000\u0388\u0389\n\u000e"+
		"\u0000\u0000\u0389\u038a\u0005\u0013\u0000\u0000\u038a\u038b\u0003\u0090"+
		"H\u0000\u038b\u038c\u0005\n\u0000\u0000\u038c\u038d\u0005\u0014\u0000"+
		"\u0000\u038d\u039b\u0001\u0000\u0000\u0000\u038e\u038f\n\r\u0000\u0000"+
		"\u038f\u0391\u0005\t\u0000\u0000\u0390\u0392\u0003\u00a6S\u0000\u0391"+
		"\u0390\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392"+
		"\u0393\u0001\u0000\u0000\u0000\u0393\u039b\u0005\u000b\u0000\u0000\u0394"+
		"\u0395\n\f\u0000\u0000\u0395\u0397\u0005\t\u0000\u0000\u0396\u0398\u0003"+
		"\u00a8T\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000"+
		"\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u039b\u0005\u000b"+
		"\u0000\u0000\u039a\u0370\u0001\u0000\u0000\u0000\u039a\u0373\u0001\u0000"+
		"\u0000\u0000\u039a\u0376\u0001\u0000\u0000\u0000\u039a\u0379\u0001\u0000"+
		"\u0000\u0000\u039a\u037c\u0001\u0000\u0000\u0000\u039a\u037f\u0001\u0000"+
		"\u0000\u0000\u039a\u0382\u0001\u0000\u0000\u0000\u039a\u0385\u0001\u0000"+
		"\u0000\u0000\u039a\u0388\u0001\u0000\u0000\u0000\u039a\u038e\u0001\u0000"+
		"\u0000\u0000\u039a\u0394\u0001\u0000\u0000\u0000\u039b\u039e\u0001\u0000"+
		"\u0000\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000"+
		"\u0000\u0000\u039d\u0091\u0001\u0000\u0000\u0000\u039e\u039c\u0001\u0000"+
		"\u0000\u0000\u039f\u03a0\u0005\t\u0000\u0000\u03a0\u03b2\u0005\u000b\u0000"+
		"\u0000\u03a1\u03b2\u0003\u0094J\u0000\u03a2\u03a3\u0003d2\u0000\u03a3"+
		"\u03a4\u0005\t\u0000\u0000\u03a4\u03a5\u0003\u00a6S\u0000\u03a5\u03a6"+
		"\u0005\u000b\u0000\u0000\u03a6\u03b2\u0001\u0000\u0000\u0000\u03a7\u03a8"+
		"\u0005\u0013\u0000\u0000\u03a8\u03a9\u0003\u00a6S\u0000\u03a9\u03aa\u0005"+
		"\u0014\u0000\u0000\u03aa\u03b2\u0001\u0000\u0000\u0000\u03ab\u03b2\u0005"+
		"\b\u0000\u0000\u03ac\u03b2\u0005=\u0000\u0000\u03ad\u03b2\u0005>\u0000"+
		"\u0000\u03ae\u03b2\u0005?\u0000\u0000\u03af\u03b2\u0005@\u0000\u0000\u03b0"+
		"\u03b2\u0003\u00acV\u0000\u03b1\u039f\u0001\u0000\u0000\u0000\u03b1\u03a1"+
		"\u0001\u0000\u0000\u0000\u03b1\u03a2\u0001\u0000\u0000\u0000\u03b1\u03a7"+
		"\u0001\u0000\u0000\u0000\u03b1\u03ab\u0001\u0000\u0000\u0000\u03b1\u03ac"+
		"\u0001\u0000\u0000\u0000\u03b1\u03ad\u0001\u0000\u0000\u0000\u03b1\u03ae"+
		"\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b1\u03b0"+
		"\u0001\u0000\u0000\u0000\u03b2\u0093\u0001\u0000\u0000\u0000\u03b3\u03b4"+
		"\u0003d2\u0000\u03b4\u03b6\u0005\r\u0000\u0000\u03b5\u03b7\u0003\u0096"+
		"K\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005\u000e\u0000"+
		"\u0000\u03b9\u0095\u0001\u0000\u0000\u0000\u03ba\u03bf\u0003\u0098L\u0000"+
		"\u03bb\u03bc\u0005\n\u0000\u0000\u03bc\u03be\u0003\u0098L\u0000\u03bd"+
		"\u03bb\u0001\u0000\u0000\u0000\u03be\u03c1\u0001\u0000\u0000\u0000\u03bf"+
		"\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c3\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c2"+
		"\u03c4\u0005\n\u0000\u0000\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c3\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c4\u0097\u0001\u0000\u0000\u0000\u03c5\u03c6"+
		"\u0003\u00acV\u0000\u03c6\u03c7\u0005\u0012\u0000\u0000\u03c7\u03c8\u0003"+
		"\u0090H\u0000\u03c8\u0099\u0001\u0000\u0000\u0000\u03c9\u03cb\u0003\u009c"+
		"N\u0000\u03ca\u03cc\u0003\u009eO\u0000\u03cb\u03ca\u0001\u0000\u0000\u0000"+
		"\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u03ce\u0001\u0000\u0000\u0000"+
		"\u03cd\u03cf\u0003\u00a0P\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce"+
		"\u03cf\u0001\u0000\u0000\u0000\u03cf\u009b\u0001\u0000\u0000\u0000\u03d0"+
		"\u03d1\u0005A\u0000\u0000\u03d1\u03d2\u0003\u0090H\u0000\u03d2\u03d3\u0003"+
		"~?\u0000\u03d3\u03d9\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005A\u0000"+
		"\u0000\u03d5\u03d6\u0003\u0082A\u0000\u03d6\u03d7\u0003~?\u0000\u03d7"+
		"\u03d9\u0001\u0000\u0000\u0000\u03d8\u03d0\u0001\u0000\u0000\u0000\u03d8"+
		"\u03d4\u0001\u0000\u0000\u0000\u03d9\u009d\u0001\u0000\u0000\u0000\u03da"+
		"\u03db\u0005B\u0000\u0000\u03db\u03dd\u0003\u009cN\u0000\u03dc\u03da\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000\u03de\u03dc\u0001"+
		"\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u009f\u0001"+
		"\u0000\u0000\u0000\u03e0\u03e1\u0005B\u0000\u0000\u03e1\u03e2\u0003~?"+
		"\u0000\u03e2\u00a1\u0001\u0000\u0000\u0000\u03e3\u03e4\u0005C\u0000\u0000"+
		"\u03e4\u03e5\u0003\u0084B\u0000\u03e5\u03e6\u0005D\u0000\u0000\u03e6\u03e7"+
		"\u0003\u0090H\u0000\u03e7\u03e8\u0003~?\u0000\u03e8\u03ef\u0001\u0000"+
		"\u0000\u0000\u03e9\u03ea\u0005C\u0000\u0000\u03ea\u03eb\u0003\u0090H\u0000"+
		"\u03eb\u03ec\u0005E\u0000\u0000\u03ec\u03ed\u0003~?\u0000\u03ed\u03ef"+
		"\u0001\u0000\u0000\u0000\u03ee\u03e3\u0001\u0000\u0000\u0000\u03ee\u03e9"+
		"\u0001\u0000\u0000\u0000\u03ef\u00a3\u0001\u0000\u0000\u0000\u03f0\u03f5"+
		"\u0003\u00acV\u0000\u03f1\u03f2\u0005\n\u0000\u0000\u03f2\u03f4\u0003"+
		"\u00acV\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f4\u03f7\u0001\u0000"+
		"\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000"+
		"\u0000\u0000\u03f6\u00a5\u0001\u0000\u0000\u0000\u03f7\u03f5\u0001\u0000"+
		"\u0000\u0000\u03f8\u03fd\u0003\u0090H\u0000\u03f9\u03fa\u0005\n\u0000"+
		"\u0000\u03fa\u03fc\u0003\u0090H\u0000\u03fb\u03f9\u0001\u0000\u0000\u0000"+
		"\u03fc\u03ff\u0001\u0000\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000"+
		"\u03fd\u03fe\u0001\u0000\u0000\u0000\u03fe\u00a7\u0001\u0000\u0000\u0000"+
		"\u03ff\u03fd\u0001\u0000\u0000\u0000\u0400\u0405\u0003\u00aaU\u0000\u0401"+
		"\u0402\u0005\n\u0000\u0000\u0402\u0404\u0003\u00aaU\u0000\u0403\u0401"+
		"\u0001\u0000\u0000\u0000\u0404\u0407\u0001\u0000\u0000\u0000\u0405\u0403"+
		"\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406\u00a9"+
		"\u0001\u0000\u0000\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0408\u0409"+
		"\u0003\u00acV\u0000\u0409\u040a\u0005\u0012\u0000\u0000\u040a\u040b\u0003"+
		"\u0090H\u0000\u040b\u00ab\u0001\u0000\u0000\u0000\u040c\u040f\u0005F\u0000"+
		"\u0000\u040d\u040f\u0003\u00b0X\u0000\u040e\u040c\u0001\u0000\u0000\u0000"+
		"\u040e\u040d\u0001\u0000\u0000\u0000\u040f\u00ad\u0001\u0000\u0000\u0000"+
		"\u0410\u0412\u0007\u0006\u0000\u0000\u0411\u0410\u0001\u0000\u0000\u0000"+
		"\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u0411\u0001\u0000\u0000\u0000"+
		"\u0413\u0414\u0001\u0000\u0000\u0000\u0414\u00af\u0001\u0000\u0000\u0000"+
		"\u0415\u0416\u0007\u0007\u0000\u0000\u0416\u00b1\u0001\u0000\u0000\u0000"+
		"x\u00b3\u00b8\u00be\u00c1\u00c7\u00cb\u00d0\u00d6\u00e2\u00e7\u00ec\u00f3"+
		"\u00f9\u00ff\u0108\u011b\u012a\u012d\u0139\u013d\u013f\u0144\u0149\u0155"+
		"\u0159\u015b\u0160\u0165\u016a\u016e\u0177\u017b\u017d\u0182\u0186\u0189"+
		"\u019a\u01a2\u01a7\u01ac\u01b1\u01b6\u01b9\u01c3\u01c9\u01ce\u01d8\u01de"+
		"\u01e3\u01ed\u01f3\u01f8\u0202\u0208\u020d\u0212\u0217\u021c\u0220\u0225"+
		"\u0230\u023b\u023e\u0248\u024c\u024e\u0253\u0257\u0264\u026c\u0275\u0277"+
		"\u0280\u028a\u028e\u0295\u0298\u029e\u02a8\u02ad\u02b1\u02b3\u02b6\u02c0"+
		"\u02c5\u02ca\u02d4\u02dd\u02e2\u02eb\u02f1\u0302\u030c\u0312\u031c\u0327"+
		"\u032c\u0338\u0340\u0348\u0363\u036e\u0391\u0397\u039a\u039c\u03b1\u03b6"+
		"\u03bf\u03c3\u03cb\u03ce\u03d8\u03de\u03ee\u03f5\u03fd\u0405\u040e\u0413";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}