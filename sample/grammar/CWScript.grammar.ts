import {ParserGrammar, LexerGrammar, $} from '../../src/grammar';
import {mode, push, not, choice} from '../../src/grammar';
import {SPACE, TAB, NL, CR, EOF} from '../../src/grammar';

export const lexerGrammar = new LexerGrammar("CWScriptLexer", {
	CONTRACT: `contract`,
	LBRACE: `{`,
	RBRACE: `}`,
	LPAREN: `(`,
	RPAREN: `)`,
	EXTENDS: `extends`,
	IMPLEMENTS: `implements`,
	IMPORT: `import`,
	FROM: `from`,
	MUL: `*`,
	AS: `as`,
	COMMA: `,`,

	Ident: $(['_', 'a-z', 'A-Z'], $(['_', 'a-z', 'A-Z', '0-9']).zeroOrMore()),

	WS: {
		pattern: $([SPACE, TAB, NL, CR]).oneOrMore(),
		channel: 'HIDDEN',
	},

	[mode('comment')]: {
		COMMENT_END: {
			pattern: '*/',
			popMode: true
		},
		OTHER: {
			pattern: not('*/'),
			skip: true
		}
	},
});

const T = lexerGrammar.getTokens();
export const parserGrammar = new ParserGrammar("CWScriptParser", lexerGrammar, {

	sourceFile: $(
		$("topLevelStmt").zeroOrMore(),
		EOF
	),

	topLevelStmt: $(
		"contractDefn"
	),

	contractDefn: $(
		T.CONTRACT,
		{name: $("ident")},
		$(T.EXTENDS, {baseContracts: $("identList")}).optional(),
		$(T.IMPLEMENTS, {interfaces: $("identList")}).optional(),
		"contractBody"
	),

	importStmt: {
		ImportAllStmt: $(T.IMPORT, T.MUL, T.FROM, {fileName: $("StringLiteral")}),
		ImportItemStmt: $(
			T.IMPORT,
			choice(
				$(T.LPAREN, {items: $("importList")}, T.COMMA.optional(), T.RPAREN),
				$({items: $("importList")})
			),
			T.FROM,
			{fileName: $("StringLiteral")}
		)
	},

	importList: $(
		{[push("importItems")]: $("importItem")},
		$('COMMA', {[push("importItems")]: $("importItem")}).zeroOrMore()
	),

	importItem: $(
		{symbol: $("ident")},
		$(T.AS, {alias: $("ident")}).optional()
	),

	contractBody: $(
		T.LBRACE,
		T.RBRACE,
	),

	ident: $(
		T.Ident,
	),

	identList: $(
		{[push("symbols")]: T.Ident},
		$(T.COMMA, {[push("symbols")]: T.Ident}).zeroOrMore()
	)

});
