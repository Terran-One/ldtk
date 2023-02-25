import Lexer from '../../src/langkit/lexer'

const lexer = Lexer.create('ToyLexer', $ => {
  const { T, l } = $;
  
  return {
    CommentBlockSlash: $.rule('/*', $.or(T.CommentBlockSlash, $.any).star.lazy, '*/').channel('comment'),
    CommentBlockPound: $.rule('###', $.any.plus.lazy, '###').channel('comment'),
    
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
    
    InterpolationEnd: $.rule('}').popMode.where(state => state.tplDepth > 0),
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
    
    Comment: $.rule($.or('#', '//'), $.not([l`\r\n`]).star, [l`\r\n`]).skip,
    DOTS3: '...',
    DOTS2: '..',
    DOT: '.',
    
    WS: $.rule($([l` \t`]).plus).skip,
    NL: $([l`\r\n`]).plus,
    POUND: '#',
    
    String: $.or(
      $("'", $.or(T.EscapeSequence, $.any).star, "'"),
      $('"', $.or(T.EscapeSequence, $.any).star, '"'),
    ),
    Tick: $.rule('`').pushMode('TemplateString').exec(state => state.tplDepth++),
    EscapeSequence: $('\\', $.any),
  }
})
.mode('TemplateString', $ => {
  const { T } = $;
  return {
    TickInside: $.rule('`').popMode.type('Tick').exec(state => state.tplDepth--),
    EscapeSequenceInside: $.rule(T.EscapeSequence).type('EscapeSequence'),
    InterpolationStart: $.rule('${').pushMode('Interpolation'),
    TplStringContent: $.any,
  }
})
.build()

export default lexer;
