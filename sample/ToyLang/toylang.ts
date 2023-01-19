import fs from 'fs/promises'
import lexer from './toylang.lexer'
import parser from './toylang.parser'

Promise.all([
  fs.writeFile('tmp/ToyLexer.g4', lexer.toAntlr()),
  fs.writeFile('tmp/ToyParser.g4', parser.toAntlr()),
]);
