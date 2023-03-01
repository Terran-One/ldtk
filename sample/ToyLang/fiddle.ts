import { Parser } from '../../generated/Parser';
import { BaseTransformer, utils } from '../../src';
import { createTransformer, TransformerASTNodes } from '../../src/transform';

type Nodes = TransformerASTNodes<typeof tf2>;

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

const tf1raw = createTransformer(parser._visit, {
  import_(node) {
    let source = node.tokens.String[0].text;
    source = source.substring(1, source.length-1);
    
    return {
      ...node,
      module: source,
    }
  }
});
const tf1 = BaseTransformer.from(parser._visit, tf1raw);

const tf2raw = createTransformer(tf1, {
  program(node) {
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
  },
  
  tuple(node) {
    const values = node.rules.expr;
    return {
      ...node,
      values,
    }
  },
});
const tf2 = BaseTransformer.from(tf1, tf2raw);

const findNodes = utils.createNodeFinder(tf2);

const ast = tf2.transform(tf1.transform(parser.process()));
console.log(findNodes('import_', ast)[0].module)
utils.dump(src, ast);
