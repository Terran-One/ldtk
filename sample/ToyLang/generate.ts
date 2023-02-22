import parser from './toylang.parser';
import { generate } from '../../src';

(async()=>{
  await generate(parser, { pkm: 'yarn' });
})();
