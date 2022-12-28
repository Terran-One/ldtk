lexer grammar CWScriptLexer;

CONTRACT: 'contract';
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
IMPORT: 'import';
FROM: 'from';
MUL: '*';
AS: 'as';
COMMA: ',';
QUOTE: '"';
StringLiteral: '"' (~('"'))*? '"';
Ident: [_a-zA-Z] ([_a-zA-Z0-9])*?;
WS: ([ \t\n\r])+ -> channel(HIDDEN);

mode comment;
COMMENT_END: '*/' -> popMode;
OTHER: ('.')+ -> skip;
