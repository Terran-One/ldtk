import { Parser } from '../../generated/Parser';
import { visit } from '../../generated/Visitor';
import { BaseTransformer, utils } from '../../src';
import { createTransformer, TransformerASTNodes } from '../../src/transform';
import { AST } from '../../src/transform/AST';

// type Nodes = TransformerASTNodes<typeof tf2>;

const src = `
import 'std'

sum args...
if args is Numbers:
{
  let result = 0
  for arg in args {
    result += arg
  }
  print result
  result
}
sum ...: NaN

print sum ...(process.argv as Numbers)
print \`foo\${sum(...(process.argv as Numbers))}bar\`
`

const parser = Parser.fromString(src);
const ast = AST.from(visit, parser.process())
  .transform('program', node => {
    const { rules } = node;
    const imports = rules.import_;
    const roots = rules.root;
    
    return {
      ...node,
      rules: {
        imports,
        roots,
      },
      children: [...imports, ...roots],
    }
  })
  .transform('import_', node => {
    return {
      ...node,
      module: node.tokens.String[0].text.substring(1, node.tokens.String[0].text.length-1),
    }
  })
  .transform('expr', node => {
    return {
      ...node,
      foo: 'bar',
    }
  })
console.log(ast.find('expr').map(expr => expr.foo).filter(foo => foo === 'bar').length)
utils.dump(src, ast.root);
