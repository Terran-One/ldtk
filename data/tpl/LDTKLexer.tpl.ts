import { CharStream } from 'antlr4ts';
import { Lexer } from 'antlr4ts/Lexer';

export abstract class LDTKLexer extends Lexer {
  ['@ldtk_state@']: any = {};
  
  constructor(input: CharStream) {
    super(input);
    this.ldtk_init();
  }
  
  // GENERATED - DO NOT TOUCH
  ldtk_init() {}
}
