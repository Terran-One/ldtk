import {ParserGrammar, LexerGrammar, $, _} from '../../src/grammar';
import {mode, push, not, choice} from '../../src/grammar';
import {SPACE, TAB, NL, CR, EOF, WILD} from '../../src/grammar';

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
	QUOTE: `"`,

	StringLiteral: $(`"`, not(`"`).zeroOrMore(), `"`),

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
			pattern: WILD.oneOrMore(),
			skip: true
		}
	},
});

const T = lexerGrammar.getTokens();
export const parserGrammar = new ParserGrammar("CWScriptParser", lexerGrammar, {

	sourceFile: $(
		_("topLevelStmt").zeroOrMore(),
		EOF
	),

	topLevelStmt: _("contractDefn"),

	contractDefn: $(
		T.CONTRACT,
		{name: _("ident")},
		$(T.EXTENDS, {baseContracts: _("identList")}).optional(),
		$(T.IMPLEMENTS, {interfaces: _("identList")}).optional(),
		_("contractBody")
	),

	importStmt: {
		ImportAllStmt: $(T.IMPORT, T.MUL, T.FROM, {fileName: T.StringLiteral}),
		ImportItemStmt: $(
			T.IMPORT,
			choice(
				$(T.LPAREN, {items: _("importList")}, T.COMMA.optional(), T.RPAREN),
				{items: _("importList")}
			),
			T.FROM,
			{fileName: $(_("StringLiteral"))}
		)
	},

	importList: $(
		{[push("importItems")]: _("importItem")},
		$(T.COMMA, {[push("importItems")]: _("importItem")}).zeroOrMore()
	),

	importItem: $(
		{symbol: _("ident")},
		$(T.AS, {alias: _("ident")}).optional()
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
