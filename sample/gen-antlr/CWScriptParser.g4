parser grammar CWScriptParser;

options { tokenVocab = CWScriptLexer; }

sourceFile: (topLevelStmt)*? EOF;
topLevelStmt: contractDefn;
contractDefn: CONTRACT (name = ident) (EXTENDS (baseContracts = identList))? (IMPLEMENTS (interfaces = identList))? contractBody;
importStmt: IMPORT MUL FROM (fileName = StringLiteral) # ImportAllStmt | IMPORT (LPAREN (items = importList) (COMMA)? RPAREN | (items = importList)) FROM (fileName = StringLiteral) # ImportItemStmt;
importList: (importItems += importItem) (COMMA (importItems += importItem))*?;
importItem: (symbol = ident) (AS (alias = ident))?;
contractBody: LBRACE RBRACE;
ident: Ident;
identList: (symbols += Ident) (COMMA (symbols += Ident))*?;
