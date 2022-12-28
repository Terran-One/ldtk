// Generated from /Users/william/IdeaProjects/ldtk/sample/gen-antlr/CWScriptParser.g4 by ANTLR 4.9.0-SNAPSHOT


import { ATN } from "antlr4ts/atn/ATN";
import { ATNDeserializer } from "antlr4ts/atn/ATNDeserializer";
import { FailedPredicateException } from "antlr4ts/FailedPredicateException";
import { NotNull } from "antlr4ts/Decorators";
import { NoViableAltException } from "antlr4ts/NoViableAltException";
import { Override } from "antlr4ts/Decorators";
import { Parser } from "antlr4ts/Parser";
import { ParserRuleContext } from "antlr4ts/ParserRuleContext";
import { ParserATNSimulator } from "antlr4ts/atn/ParserATNSimulator";
import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";
import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";
import { RecognitionException } from "antlr4ts/RecognitionException";
import { RuleContext } from "antlr4ts/RuleContext";
//import { RuleVersion } from "antlr4ts/RuleVersion";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import { Token } from "antlr4ts/Token";
import { TokenStream } from "antlr4ts/TokenStream";
import { Vocabulary } from "antlr4ts/Vocabulary";
import { VocabularyImpl } from "antlr4ts/VocabularyImpl";

import * as Utils from "antlr4ts/misc/Utils";

import { CWScriptParserListener } from "./CWScriptParserListener";
import { CWScriptParserVisitor } from "./CWScriptParserVisitor";


export class CWScriptParser extends Parser {
	public static readonly CONTRACT = 1;
	public static readonly LBRACE = 2;
	public static readonly RBRACE = 3;
	public static readonly LPAREN = 4;
	public static readonly RPAREN = 5;
	public static readonly EXTENDS = 6;
	public static readonly IMPLEMENTS = 7;
	public static readonly IMPORT = 8;
	public static readonly FROM = 9;
	public static readonly MUL = 10;
	public static readonly AS = 11;
	public static readonly COMMA = 12;
	public static readonly QUOTE = 13;
	public static readonly StringLiteral = 14;
	public static readonly Ident = 15;
	public static readonly WS = 16;
	public static readonly COMMENT_END = 17;
	public static readonly OTHER = 18;
	public static readonly RULE_sourceFile = 0;
	public static readonly RULE_topLevelStmt = 1;
	public static readonly RULE_contractDefn = 2;
	public static readonly RULE_importStmt = 3;
	public static readonly RULE_importList = 4;
	public static readonly RULE_importItem = 5;
	public static readonly RULE_contractBody = 6;
	public static readonly RULE_ident = 7;
	public static readonly RULE_identList = 8;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"sourceFile", "topLevelStmt", "contractDefn", "importStmt", "importList", 
		"importItem", "contractBody", "ident", "identList",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "'contract'", "'{'", "'}'", "'('", "')'", "'extends'", "'implements'", 
		"'import'", "'from'", "'*'", "'as'", "','", "'\"'", undefined, undefined, 
		undefined, "'*/'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "CONTRACT", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "EXTENDS", 
		"IMPLEMENTS", "IMPORT", "FROM", "MUL", "AS", "COMMA", "QUOTE", "StringLiteral", 
		"Ident", "WS", "COMMENT_END", "OTHER",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(CWScriptParser._LITERAL_NAMES, CWScriptParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return CWScriptParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "CWScriptParser.g4"; }

	// @Override
	public get ruleNames(): string[] { return CWScriptParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return CWScriptParser._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(CWScriptParser._ATN, this);
	}
	// @RuleVersion(0)
	public sourceFile(): SourceFileContext {
		let _localctx: SourceFileContext = new SourceFileContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, CWScriptParser.RULE_sourceFile);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 21;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 0, this._ctx);
			while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1 + 1) {
					{
					{
					this.state = 18;
					this.topLevelStmt();
					}
					}
				}
				this.state = 23;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 0, this._ctx);
			}
			this.state = 24;
			this.match(CWScriptParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public topLevelStmt(): TopLevelStmtContext {
		let _localctx: TopLevelStmtContext = new TopLevelStmtContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, CWScriptParser.RULE_topLevelStmt);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 26;
			this.contractDefn();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public contractDefn(): ContractDefnContext {
		let _localctx: ContractDefnContext = new ContractDefnContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, CWScriptParser.RULE_contractDefn);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 28;
			this.match(CWScriptParser.CONTRACT);
			{
			this.state = 29;
			_localctx._name = this.ident();
			}
			this.state = 32;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === CWScriptParser.EXTENDS) {
				{
				this.state = 30;
				this.match(CWScriptParser.EXTENDS);
				{
				this.state = 31;
				_localctx._baseContracts = this.identList();
				}
				}
			}

			this.state = 36;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === CWScriptParser.IMPLEMENTS) {
				{
				this.state = 34;
				this.match(CWScriptParser.IMPLEMENTS);
				{
				this.state = 35;
				_localctx._interfaces = this.identList();
				}
				}
			}

			this.state = 38;
			this.contractBody();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public importStmt(): ImportStmtContext {
		let _localctx: ImportStmtContext = new ImportStmtContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, CWScriptParser.RULE_importStmt);
		let _la: number;
		try {
			this.state = 58;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 5, this._ctx) ) {
			case 1:
				_localctx = new ImportAllStmtContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 40;
				this.match(CWScriptParser.IMPORT);
				this.state = 41;
				this.match(CWScriptParser.MUL);
				this.state = 42;
				this.match(CWScriptParser.FROM);
				{
				this.state = 43;
				(_localctx as ImportAllStmtContext)._fileName = this.match(CWScriptParser.StringLiteral);
				}
				}
				break;

			case 2:
				_localctx = new ImportItemStmtContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 44;
				this.match(CWScriptParser.IMPORT);
				this.state = 53;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case CWScriptParser.LPAREN:
					{
					this.state = 45;
					this.match(CWScriptParser.LPAREN);
					{
					this.state = 46;
					(_localctx as ImportItemStmtContext)._items = this.importList();
					}
					this.state = 48;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === CWScriptParser.COMMA) {
						{
						this.state = 47;
						this.match(CWScriptParser.COMMA);
						}
					}

					this.state = 50;
					this.match(CWScriptParser.RPAREN);
					}
					break;
				case CWScriptParser.Ident:
					{
					{
					this.state = 52;
					(_localctx as ImportItemStmtContext)._items = this.importList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 55;
				this.match(CWScriptParser.FROM);
				{
				this.state = 56;
				(_localctx as ImportItemStmtContext)._fileName = this.match(CWScriptParser.StringLiteral);
				}
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public importList(): ImportListContext {
		let _localctx: ImportListContext = new ImportListContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, CWScriptParser.RULE_importList);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 60;
			_localctx._importItem = this.importItem();
			_localctx._importItems.push(_localctx._importItem);
			}
			this.state = 65;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 6, this._ctx);
			while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1 + 1) {
					{
					{
					this.state = 61;
					this.match(CWScriptParser.COMMA);
					{
					this.state = 62;
					_localctx._importItem = this.importItem();
					_localctx._importItems.push(_localctx._importItem);
					}
					}
					}
				}
				this.state = 67;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 6, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public importItem(): ImportItemContext {
		let _localctx: ImportItemContext = new ImportItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, CWScriptParser.RULE_importItem);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 68;
			_localctx._symbol = this.ident();
			}
			this.state = 71;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === CWScriptParser.AS) {
				{
				this.state = 69;
				this.match(CWScriptParser.AS);
				{
				this.state = 70;
				_localctx._alias = this.ident();
				}
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public contractBody(): ContractBodyContext {
		let _localctx: ContractBodyContext = new ContractBodyContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, CWScriptParser.RULE_contractBody);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 73;
			this.match(CWScriptParser.LBRACE);
			this.state = 74;
			this.match(CWScriptParser.RBRACE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public ident(): IdentContext {
		let _localctx: IdentContext = new IdentContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, CWScriptParser.RULE_ident);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 76;
			this.match(CWScriptParser.Ident);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public identList(): IdentListContext {
		let _localctx: IdentListContext = new IdentListContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, CWScriptParser.RULE_identList);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 78;
			_localctx._Ident = this.match(CWScriptParser.Ident);
			_localctx._symbols.push(_localctx._Ident);
			}
			this.state = 83;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 8, this._ctx);
			while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1 + 1) {
					{
					{
					this.state = 79;
					this.match(CWScriptParser.COMMA);
					{
					this.state = 80;
					_localctx._Ident = this.match(CWScriptParser.Ident);
					_localctx._symbols.push(_localctx._Ident);
					}
					}
					}
				}
				this.state = 85;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 8, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public static readonly _serializedATN: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03\x14Y\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x03\x02\x07\x02\x16\n\x02\f\x02\x0E" +
		"\x02\x19\v\x02\x03\x02\x03\x02\x03\x03\x03\x03\x03\x04\x03\x04\x03\x04" +
		"\x03\x04\x05\x04#\n\x04\x03\x04\x03\x04\x05\x04\'\n\x04\x03\x04\x03\x04" +
		"\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x05\x05" +
		"3\n\x05\x03\x05\x03\x05\x03\x05\x05\x058\n\x05\x03\x05\x03\x05\x03\x05" +
		"\x05\x05=\n\x05\x03\x06\x03\x06\x03\x06\x07\x06B\n\x06\f\x06\x0E\x06E" +
		"\v\x06\x03\x07\x03\x07\x03\x07\x05\x07J\n\x07\x03\b\x03\b\x03\b\x03\t" +
		"\x03\t\x03\n\x03\n\x03\n\x07\nT\n\n\f\n\x0E\nW\v\n\x03\n\x05\x17CU\x02" +
		"\x02\v\x02\x02\x04\x02\x06\x02\b\x02\n\x02\f\x02\x0E\x02\x10\x02\x12\x02" +
		"\x02\x02\x02X\x02\x17\x03\x02\x02\x02\x04\x1C\x03\x02\x02\x02\x06\x1E" +
		"\x03\x02\x02\x02\b<\x03\x02\x02\x02\n>\x03\x02\x02\x02\fF\x03\x02\x02" +
		"\x02\x0EK\x03\x02\x02\x02\x10N\x03\x02\x02\x02\x12P\x03\x02\x02\x02\x14" +
		"\x16\x05\x04\x03\x02\x15\x14\x03\x02\x02\x02\x16\x19\x03\x02\x02\x02\x17" +
		"\x18\x03\x02\x02\x02\x17\x15\x03\x02\x02\x02\x18\x1A\x03\x02\x02\x02\x19" +
		"\x17\x03\x02\x02\x02\x1A\x1B\x07\x02\x02\x03\x1B\x03\x03\x02\x02\x02\x1C" +
		"\x1D\x05\x06\x04\x02\x1D\x05\x03\x02\x02\x02\x1E\x1F\x07\x03\x02\x02\x1F" +
		"\"\x05\x10\t\x02 !\x07\b\x02\x02!#\x05\x12\n\x02\" \x03\x02\x02\x02\"" +
		"#\x03\x02\x02\x02#&\x03\x02\x02\x02$%\x07\t\x02\x02%\'\x05\x12\n\x02&" +
		"$\x03\x02\x02\x02&\'\x03\x02\x02\x02\'(\x03\x02\x02\x02()\x05\x0E\b\x02" +
		")\x07\x03\x02\x02\x02*+\x07\n\x02\x02+,\x07\f\x02\x02,-\x07\v\x02\x02" +
		"-=\x07\x10\x02\x02.7\x07\n\x02\x02/0\x07\x06\x02\x0202\x05\n\x06\x021" +
		"3\x07\x0E\x02\x0221\x03\x02\x02\x0223\x03\x02\x02\x0234\x03\x02\x02\x02" +
		"45\x07\x07\x02\x0258\x03\x02\x02\x0268\x05\n\x06\x027/\x03\x02\x02\x02" +
		"76\x03\x02\x02\x0289\x03\x02\x02\x029:\x07\v\x02\x02:;\x07\x10\x02\x02" +
		";=\x03\x02\x02\x02<*\x03\x02\x02\x02<.\x03\x02\x02\x02=\t\x03\x02\x02" +
		"\x02>C\x05\f\x07\x02?@\x07\x0E\x02\x02@B\x05\f\x07\x02A?\x03\x02\x02\x02" +
		"BE\x03\x02\x02\x02CD\x03\x02\x02\x02CA\x03\x02\x02\x02D\v\x03\x02\x02" +
		"\x02EC\x03\x02\x02\x02FI\x05\x10\t\x02GH\x07\r\x02\x02HJ\x05\x10\t\x02" +
		"IG\x03\x02\x02\x02IJ\x03\x02\x02\x02J\r\x03\x02\x02\x02KL\x07\x04\x02" +
		"\x02LM\x07\x05\x02\x02M\x0F\x03\x02\x02\x02NO\x07\x11\x02\x02O\x11\x03" +
		"\x02\x02\x02PU\x07\x11\x02\x02QR\x07\x0E\x02\x02RT\x07\x11\x02\x02SQ\x03" +
		"\x02\x02\x02TW\x03\x02\x02\x02UV\x03\x02\x02\x02US\x03\x02\x02\x02V\x13" +
		"\x03\x02\x02\x02WU\x03\x02\x02\x02\v\x17\"&27<CIU";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!CWScriptParser.__ATN) {
			CWScriptParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(CWScriptParser._serializedATN));
		}

		return CWScriptParser.__ATN;
	}

}

export class SourceFileContext extends ParserRuleContext {
	public EOF(): TerminalNode { return this.getToken(CWScriptParser.EOF, 0); }
	public topLevelStmt(): TopLevelStmtContext[];
	public topLevelStmt(i: number): TopLevelStmtContext;
	public topLevelStmt(i?: number): TopLevelStmtContext | TopLevelStmtContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TopLevelStmtContext);
		} else {
			return this.getRuleContext(i, TopLevelStmtContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CWScriptParser.RULE_sourceFile; }
	// @Override
	public enterRule(listener: CWScriptParserListener): void {
		if (listener.enterSourceFile) {
			listener.enterSourceFile(this);
		}
	}
	// @Override
	public exitRule(listener: CWScriptParserListener): void {
		if (listener.exitSourceFile) {
			listener.exitSourceFile(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CWScriptParserVisitor<Result>): Result {
		if (visitor.visitSourceFile) {
			return visitor.visitSourceFile(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TopLevelStmtContext extends ParserRuleContext {
	public contractDefn(): ContractDefnContext {
		return this.getRuleContext(0, ContractDefnContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CWScriptParser.RULE_topLevelStmt; }
	// @Override
	public enterRule(listener: CWScriptParserListener): void {
		if (listener.enterTopLevelStmt) {
			listener.enterTopLevelStmt(this);
		}
	}
	// @Override
	public exitRule(listener: CWScriptParserListener): void {
		if (listener.exitTopLevelStmt) {
			listener.exitTopLevelStmt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CWScriptParserVisitor<Result>): Result {
		if (visitor.visitTopLevelStmt) {
			return visitor.visitTopLevelStmt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ContractDefnContext extends ParserRuleContext {
	public _name!: IdentContext;
	public _baseContracts!: IdentListContext;
	public _interfaces!: IdentListContext;
	public CONTRACT(): TerminalNode { return this.getToken(CWScriptParser.CONTRACT, 0); }
	public contractBody(): ContractBodyContext {
		return this.getRuleContext(0, ContractBodyContext);
	}
	public ident(): IdentContext | undefined {
		return this.tryGetRuleContext(0, IdentContext);
	}
	public EXTENDS(): TerminalNode | undefined { return this.tryGetToken(CWScriptParser.EXTENDS, 0); }
	public IMPLEMENTS(): TerminalNode | undefined { return this.tryGetToken(CWScriptParser.IMPLEMENTS, 0); }
	public identList(): IdentListContext[];
	public identList(i: number): IdentListContext;
	public identList(i?: number): IdentListContext | IdentListContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdentListContext);
		} else {
			return this.getRuleContext(i, IdentListContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CWScriptParser.RULE_contractDefn; }
	// @Override
	public enterRule(listener: CWScriptParserListener): void {
		if (listener.enterContractDefn) {
			listener.enterContractDefn(this);
		}
	}
	// @Override
	public exitRule(listener: CWScriptParserListener): void {
		if (listener.exitContractDefn) {
			listener.exitContractDefn(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CWScriptParserVisitor<Result>): Result {
		if (visitor.visitContractDefn) {
			return visitor.visitContractDefn(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ImportStmtContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CWScriptParser.RULE_importStmt; }
	public copyFrom(ctx: ImportStmtContext): void {
		super.copyFrom(ctx);
	}
}
export class ImportAllStmtContext extends ImportStmtContext {
	public _fileName!: Token;
	public IMPORT(): TerminalNode { return this.getToken(CWScriptParser.IMPORT, 0); }
	public MUL(): TerminalNode { return this.getToken(CWScriptParser.MUL, 0); }
	public FROM(): TerminalNode { return this.getToken(CWScriptParser.FROM, 0); }
	public StringLiteral(): TerminalNode | undefined { return this.tryGetToken(CWScriptParser.StringLiteral, 0); }
	constructor(ctx: ImportStmtContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CWScriptParserListener): void {
		if (listener.enterImportAllStmt) {
			listener.enterImportAllStmt(this);
		}
	}
	// @Override
	public exitRule(listener: CWScriptParserListener): void {
		if (listener.exitImportAllStmt) {
			listener.exitImportAllStmt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CWScriptParserVisitor<Result>): Result {
		if (visitor.visitImportAllStmt) {
			return visitor.visitImportAllStmt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ImportItemStmtContext extends ImportStmtContext {
	public _items!: ImportListContext;
	public _fileName!: Token;
	public IMPORT(): TerminalNode { return this.getToken(CWScriptParser.IMPORT, 0); }
	public FROM(): TerminalNode { return this.getToken(CWScriptParser.FROM, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(CWScriptParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(CWScriptParser.RPAREN, 0); }
	public StringLiteral(): TerminalNode | undefined { return this.tryGetToken(CWScriptParser.StringLiteral, 0); }
	public importList(): ImportListContext | undefined {
		return this.tryGetRuleContext(0, ImportListContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(CWScriptParser.COMMA, 0); }
	constructor(ctx: ImportStmtContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CWScriptParserListener): void {
		if (listener.enterImportItemStmt) {
			listener.enterImportItemStmt(this);
		}
	}
	// @Override
	public exitRule(listener: CWScriptParserListener): void {
		if (listener.exitImportItemStmt) {
			listener.exitImportItemStmt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CWScriptParserVisitor<Result>): Result {
		if (visitor.visitImportItemStmt) {
			return visitor.visitImportItemStmt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ImportListContext extends ParserRuleContext {
	public _importItem!: ImportItemContext;
	public _importItems: ImportItemContext[] = [];
	public importItem(): ImportItemContext[];
	public importItem(i: number): ImportItemContext;
	public importItem(i?: number): ImportItemContext | ImportItemContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ImportItemContext);
		} else {
			return this.getRuleContext(i, ImportItemContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CWScriptParser.COMMA);
		} else {
			return this.getToken(CWScriptParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CWScriptParser.RULE_importList; }
	// @Override
	public enterRule(listener: CWScriptParserListener): void {
		if (listener.enterImportList) {
			listener.enterImportList(this);
		}
	}
	// @Override
	public exitRule(listener: CWScriptParserListener): void {
		if (listener.exitImportList) {
			listener.exitImportList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CWScriptParserVisitor<Result>): Result {
		if (visitor.visitImportList) {
			return visitor.visitImportList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ImportItemContext extends ParserRuleContext {
	public _symbol!: IdentContext;
	public _alias!: IdentContext;
	public ident(): IdentContext[];
	public ident(i: number): IdentContext;
	public ident(i?: number): IdentContext | IdentContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdentContext);
		} else {
			return this.getRuleContext(i, IdentContext);
		}
	}
	public AS(): TerminalNode | undefined { return this.tryGetToken(CWScriptParser.AS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CWScriptParser.RULE_importItem; }
	// @Override
	public enterRule(listener: CWScriptParserListener): void {
		if (listener.enterImportItem) {
			listener.enterImportItem(this);
		}
	}
	// @Override
	public exitRule(listener: CWScriptParserListener): void {
		if (listener.exitImportItem) {
			listener.exitImportItem(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CWScriptParserVisitor<Result>): Result {
		if (visitor.visitImportItem) {
			return visitor.visitImportItem(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ContractBodyContext extends ParserRuleContext {
	public LBRACE(): TerminalNode { return this.getToken(CWScriptParser.LBRACE, 0); }
	public RBRACE(): TerminalNode { return this.getToken(CWScriptParser.RBRACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CWScriptParser.RULE_contractBody; }
	// @Override
	public enterRule(listener: CWScriptParserListener): void {
		if (listener.enterContractBody) {
			listener.enterContractBody(this);
		}
	}
	// @Override
	public exitRule(listener: CWScriptParserListener): void {
		if (listener.exitContractBody) {
			listener.exitContractBody(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CWScriptParserVisitor<Result>): Result {
		if (visitor.visitContractBody) {
			return visitor.visitContractBody(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentContext extends ParserRuleContext {
	public Ident(): TerminalNode { return this.getToken(CWScriptParser.Ident, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CWScriptParser.RULE_ident; }
	// @Override
	public enterRule(listener: CWScriptParserListener): void {
		if (listener.enterIdent) {
			listener.enterIdent(this);
		}
	}
	// @Override
	public exitRule(listener: CWScriptParserListener): void {
		if (listener.exitIdent) {
			listener.exitIdent(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CWScriptParserVisitor<Result>): Result {
		if (visitor.visitIdent) {
			return visitor.visitIdent(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentListContext extends ParserRuleContext {
	public _Ident!: Token;
	public _symbols: Token[] = [];
	public Ident(): TerminalNode[];
	public Ident(i: number): TerminalNode;
	public Ident(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CWScriptParser.Ident);
		} else {
			return this.getToken(CWScriptParser.Ident, i);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CWScriptParser.COMMA);
		} else {
			return this.getToken(CWScriptParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CWScriptParser.RULE_identList; }
	// @Override
	public enterRule(listener: CWScriptParserListener): void {
		if (listener.enterIdentList) {
			listener.enterIdentList(this);
		}
	}
	// @Override
	public exitRule(listener: CWScriptParserListener): void {
		if (listener.exitIdentList) {
			listener.exitIdentList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CWScriptParserVisitor<Result>): Result {
		if (visitor.visitIdentList) {
			return visitor.visitIdentList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


