// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CWScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONTRACT=1, LBRACE=2, RBRACE=3, LPAREN=4, RPAREN=5, EXTENDS=6, IMPLEMENTS=7, 
		IMPORT=8, FROM=9, MUL=10, AS=11, COMMA=12, QUOTE=13, StringLiteral=14, 
		Ident=15, WS=16, COMMENT_END=17, OTHER=18;
	public static final int
		comment=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "comment"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONTRACT", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "EXTENDS", "IMPLEMENTS", 
			"IMPORT", "FROM", "MUL", "AS", "COMMA", "QUOTE", "StringLiteral", "Ident", 
			"WS", "COMMENT_END", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'contract'", "'{'", "'}'", "'('", "')'", "'extends'", "'implements'", 
			"'import'", "'from'", "'*'", "'as'", "','", "'\"'", null, null, null, 
			"'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONTRACT", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "EXTENDS", 
			"IMPLEMENTS", "IMPORT", "FROM", "MUL", "AS", "COMMA", "QUOTE", "StringLiteral", 
			"Ident", "WS", "COMMENT_END", "OTHER"
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


	public CWScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CWScriptLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u0082\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000"+
		"\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003"+
		"\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006"+
		"\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002"+
		"\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0005\rb\b\r\n\r\f\re\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000ek\b\u000e\n\u000e\f\u000en\t\u000e\u0001"+
		"\u000f\u0004\u000fq\b\u000f\u000b\u000f\f\u000fr\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0004\u0011}\b\u0011\u000b\u0011\f\u0011~\u0001\u0011\u0001\u0011\u0002"+
		"cl\u0000\u0012\u0002\u0001\u0004\u0002\u0006\u0003\b\u0004\n\u0005\f\u0006"+
		"\u000e\u0007\u0010\b\u0012\t\u0014\n\u0016\u000b\u0018\f\u001a\r\u001c"+
		"\u000e\u001e\u000f \u0010\"\u0011$\u0012\u0002\u0000\u0001\u0004\u0001"+
		"\u0000\"\"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r "+
		" \u0084\u0000\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001\u0000\u0000"+
		"\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000\u0000\u0000"+
		"\u0000\n\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000\u0000\u0000\u0000"+
		"\u000e\u0001\u0000\u0000\u0000\u0000\u0010\u0001\u0000\u0000\u0000\u0000"+
		"\u0012\u0001\u0000\u0000\u0000\u0000\u0014\u0001\u0000\u0000\u0000\u0000"+
		"\u0016\u0001\u0000\u0000\u0000\u0000\u0018\u0001\u0000\u0000\u0000\u0000"+
		"\u001a\u0001\u0000\u0000\u0000\u0000\u001c\u0001\u0000\u0000\u0000\u0000"+
		"\u001e\u0001\u0000\u0000\u0000\u0000 \u0001\u0000\u0000\u0000\u0001\""+
		"\u0001\u0000\u0000\u0000\u0001$\u0001\u0000\u0000\u0000\u0002&\u0001\u0000"+
		"\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000"+
		"\b3\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000\u0000\f7\u0001\u0000"+
		"\u0000\u0000\u000e?\u0001\u0000\u0000\u0000\u0010J\u0001\u0000\u0000\u0000"+
		"\u0012Q\u0001\u0000\u0000\u0000\u0014V\u0001\u0000\u0000\u0000\u0016X"+
		"\u0001\u0000\u0000\u0000\u0018[\u0001\u0000\u0000\u0000\u001a]\u0001\u0000"+
		"\u0000\u0000\u001c_\u0001\u0000\u0000\u0000\u001eh\u0001\u0000\u0000\u0000"+
		" p\u0001\u0000\u0000\u0000\"v\u0001\u0000\u0000\u0000$|\u0001\u0000\u0000"+
		"\u0000&\'\u0005c\u0000\u0000\'(\u0005o\u0000\u0000()\u0005n\u0000\u0000"+
		")*\u0005t\u0000\u0000*+\u0005r\u0000\u0000+,\u0005a\u0000\u0000,-\u0005"+
		"c\u0000\u0000-.\u0005t\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005"+
		"{\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0005}\u0000\u00002\u0007"+
		"\u0001\u0000\u0000\u000034\u0005(\u0000\u00004\t\u0001\u0000\u0000\u0000"+
		"56\u0005)\u0000\u00006\u000b\u0001\u0000\u0000\u000078\u0005e\u0000\u0000"+
		"89\u0005x\u0000\u00009:\u0005t\u0000\u0000:;\u0005e\u0000\u0000;<\u0005"+
		"n\u0000\u0000<=\u0005d\u0000\u0000=>\u0005s\u0000\u0000>\r\u0001\u0000"+
		"\u0000\u0000?@\u0005i\u0000\u0000@A\u0005m\u0000\u0000AB\u0005p\u0000"+
		"\u0000BC\u0005l\u0000\u0000CD\u0005e\u0000\u0000DE\u0005m\u0000\u0000"+
		"EF\u0005e\u0000\u0000FG\u0005n\u0000\u0000GH\u0005t\u0000\u0000HI\u0005"+
		"s\u0000\u0000I\u000f\u0001\u0000\u0000\u0000JK\u0005i\u0000\u0000KL\u0005"+
		"m\u0000\u0000LM\u0005p\u0000\u0000MN\u0005o\u0000\u0000NO\u0005r\u0000"+
		"\u0000OP\u0005t\u0000\u0000P\u0011\u0001\u0000\u0000\u0000QR\u0005f\u0000"+
		"\u0000RS\u0005r\u0000\u0000ST\u0005o\u0000\u0000TU\u0005m\u0000\u0000"+
		"U\u0013\u0001\u0000\u0000\u0000VW\u0005*\u0000\u0000W\u0015\u0001\u0000"+
		"\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005s\u0000\u0000Z\u0017\u0001\u0000"+
		"\u0000\u0000[\\\u0005,\u0000\u0000\\\u0019\u0001\u0000\u0000\u0000]^\u0005"+
		"\"\u0000\u0000^\u001b\u0001\u0000\u0000\u0000_c\u0005\"\u0000\u0000`b"+
		"\b\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fg\u0005\"\u0000\u0000g\u001d\u0001\u0000"+
		"\u0000\u0000hl\u0007\u0001\u0000\u0000ik\u0007\u0002\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000m\u001f\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000oq\u0007\u0003\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0006\u000f\u0000\u0000u!\u0001\u0000\u0000"+
		"\u0000vw\u0005*\u0000\u0000wx\u0005/\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0006\u0010\u0001\u0000z#\u0001\u0000\u0000\u0000{}\u0005.\u0000\u0000"+
		"|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0006\u0011\u0002\u0000\u0081%\u0001\u0000\u0000\u0000\u0006"+
		"\u0000\u0001clr~\u0003\u0000\u0001\u0000\u0004\u0000\u0000\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}