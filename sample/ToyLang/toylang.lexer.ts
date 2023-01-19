import Lexer from '../../src/langkit/lexer'

const lexer = Lexer.create('ToyLexer', $ => {
  const { T, l } = $;
  
  return {
    BlockCommentSlash: $.rule(`/*`).skip().pushMode('BLOCK_COMMENT_SLASH'),
    BlockCommentPound: $.rule('###', $.any.plus.lazy, '###').skip(),
    
    IMPORT: 'import',
    IF: 'if',
    ELSE: 'else',
    IN: 'in',
    LET: 'let',
    TRUE: 'true',
    FALSE: 'false',
    FOR: 'for',
    WHILE: 'while',
    RETURN: 'return',
    
    LPAREN: '(',
    RPAREN: ')',
    LBRACE: '{',
    RBRACE: '}',
    LBRACK: '[',
    RBRACK: ']',
    COLON: ':',
    SEMIC: ';',
    COMMA: ',',
    LOGAND: '&&',
    LOGOR: '||',
    AND: '&',
    BAR: '|',
    HAT: '^',
    SLIM_ARROW: '->',
    FAT_ARROW: '=>',
    EQ: '==',
    NEQ: '!=',
    LTE: '<=',
    LT: '<',
    GTE: '>=',
    GT: '>',
    ASSIGNOP: $($.or(T.PLUS, T.DASH, T.STAR, T.SLASH), '='),
    ASSIGN: '=',
    PLUS: '+',
    DASH: '-',
    STAR: '*',
    EXCL: '!',
    TILDE: '~',
    SLASH: '/',
    PERCENT: '%',
    
    Dec: $.frag($(['0-9']).plus),
    Number: $.or(
      $(T.Dec, '.', T.Dec, $('e', T.Dec).optional),
      $('.', T.Dec, $('e', T.Dec).optional),
      $(T.Dec, $('.').optional, $('e', T.Dec).optional),
      $(T.Dec, '//', T.Dec),
    ),
    Ident: $(['A-Za-z_'], $(['A-Za-z_0-9']).star),
    
    Comment: $.rule($.or('#', '//'), $.not([l`\r\n`]).star, [l`\r\n`]).skip(),
    DOTS3: '...',
    DOTS2: '..',
    DOT: '.',
    
    WS: $.rule($([l` \t`]).plus).skip(),
    NL: $([l`\r\n`]).plus,
    POUND: '#',
    
    String1: $.rule("'").pushMode('STRING1'),
    String2: $.rule('"').pushMode('STRING2'),
  }
})
.mode('BLOCK_COMMENT_SLASH', $ => ({
  BlockCommentEscape: $.rule('\\', $.any).skip(),
  BlockCommentNest: $.rule('/*').skip().pushMode('BLOCK_COMMENT_SLASH'),
  BlockCommentEnd: $.rule('*/').skip().popMode(),
  BlockCommentContent: $.rule($.any.plus.lazy).skip(),
}))
.mode('STRING1', $ => ({
  String1Escape: $('\\', $.any),
  String1End: $.rule("'").popMode(),
  String1Content: $($.any.plus.lazy),
}))
.mode('STRING2', $ => ({
  String2Escape: $('\\', $.any),
  String2End: $.rule('"').popMode(),
  String2Content: $($.any.plus.lazy),
}))
.build()

export default lexer;
