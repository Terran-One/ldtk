import { TerminalNode } from 'antlr4ts/tree/TerminalNode';
import { FnArgContext, VarArgsContext } from '../../generated/antlr/ToyParser';
import { Parser } from '../../generated/Parser';
import { ExprxASTNode, visit } from '../../generated/Visitor';
import { utils } from '../../src';
import { AST } from '../../src/transform/AST';

type FnArgASTNode = {
  type: 'fnArg';
  family: 'rule';
  ctx: FnArgContext | VarArgsContext;
  name: string;
  variadic: boolean;
  defaultValue: ExprxASTNode | undefined;
  children: never[];
}

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

const ast = parse(src);
console.log(ast.findDeep('expr').map(expr => expr.foo).filter(foo => foo === 'bar').length)
const root = ast.root.rules.roots[1];
if (root.option.type !== 'ExprxRoot') throw Error('nope');

const exprx = root.option.rules.exprx[0];
if (exprx.option.type !== 'ExprExprx') throw Error('nope');

console.log(exprx.option.rules.expr[0].foo);
console.log(ast.findDeep('fnArg')[0].variadic);

const literal = ast.findDeep('literal')[0];
if (literal) {
  console.log(`${literal.option.type} is primitive: ${literal.primitive}`);
} else {
  console.log('no literal found');
}

// template strings are a bit weird, b/c tokens match individual characters rather than parts
const tplstr = ast.findDeep('templateString')[0];
if (!tplstr) throw 'no template string found';
if (tplstr.children.length !== 1) throw 'template string has wrong number of children';
console.log('template string:', ast.findDeep('templateString')[0].ctx.text);

export function parse(src: string) {
  const parser = Parser.fromString(src);
  const ast = AST.from(visit, parser.process())
    .transform({
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
      import_(node) {
        return {
          ...node,
          module: node.tokens.String[0].text.substring(1, node.tokens.String[0].text.length-1),
        }
      },
      expr(node) {
        return {
          ...node,
          foo: 'bar',
        }
      },
      array(node) {
        return {
          ...node,
          values: node.rules.exprx,
        }
      },
      fnArg(node): FnArgASTNode {
        return {
          type: 'fnArg',
          family: 'rule',
          ctx: node.ctx,
          name: node.tokens.Ident[0].text,
          variadic: false,
          defaultValue: node.rules.exprx[0],
          children: [],
        }
      },
      varArgs(node): FnArgASTNode {
        return {
          type: 'fnArg',
          family: 'rule',
          ctx: node.ctx,
          name: node.tokens.Ident[0].text,
          variadic: true,
          defaultValue: undefined,
          children: [],
        }
      },
      literal(node) {
        return {
          ...node,
          primitive: ['BooleanLiteral', 'NumberLiteral', 'StringLiteral', 'TemplateStringLiteral', 'SymbolLiteral'].includes(node.option.type)
        }
      },
      templateString(node) {
        return {
          type: 'templateString',
          family: 'rule',
          ctx: node.ctx,
          parts: node.tokens.TplStringContent.concat(node.tokens.EscapeSequence)
            .sort((a, b) => a.symbol.startIndex - b.symbol.startIndex),
          children: node.rules.stringInterpolation.map(n => n.rules.exprx[0]), // cut out intermittent nodes
        }
      },
    })
  return ast;
}

function stripQuotes(text: TerminalNode) {
  return text.text.substring(1, text.text.length-1);
}
