import { TerminalNode } from 'antlr4ts/tree/TerminalNode';
import { Parser } from '../../generated/Parser';
import {
  ASTMap,
  ExprxASTNode,
  FnArgASTNode as FnArgASTNodeBase,
  StringInterpolationASTNode,
  VarArgsASTNode,
} from '../../generated/Visitor';
import { AST, ASTNodeBase, IOptionsASTNode, IRuleASTNode, IVirtualASTNode, Location, ParserRuleContext, tokensLocation, utils } from '../../src';
import { collectTokens, getCodeRange, groupBy, joinTokens, sortNodes, sortTokens } from '../../src/utils';

class FnArgASTNode implements IRuleASTNode {
  type = 'fnArg' as const;
  family = 'rule' as const;
  ctx: ParserRuleContext;
  name: string;
  variadic: boolean;
  defaultValue: ExprxASTNode | undefined;
  rules: Record<string, ASTNodeBase[]>;
  tokens: Record<string, TerminalNode[]>;
  children: ASTNodeBase[];
  location: Location;
  
  constructor(base: FnArgASTNodeBase | VarArgsASTNode) {
    // copy props
    this.ctx = base.ctx;
    this.tokens = base.tokens;
    this.rules = base.rules;
    this.children = base.children;
    this.location = base.location;
    
    // compute props
    this.name = base.tokens.Ident[0].text;
    this.variadic = base.type === 'varArgs';
    this.defaultValue = base.rules.exprx?.[0] as any;
  }
}

class TemplateStringPieceASTNode implements IRuleASTNode {
  type = 'templateStringPiece' as const;
  family = 'rule' as const;
  ctx: undefined;
  rules: Record<string, ASTNodeBase[]>;
  tokens: Record<string, TerminalNode[]>;
  children: ASTNodeBase[];
  location: Location;
  value: string;
  
  constructor(tokens: TerminalNode[]) {
    this.tokens = groupBy(tokens, t => t.symbol.type);
    this.rules = {};
    this.children = [];
    this.value = joinTokens(tokens).text;
    this.location = tokensLocation(tokens);
  }
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

// template strings are a bit weird, b/c tokens match individual characters rather than parts
// const tplstr = ast.find('templateString')[0];
// if (!tplstr) throw 'no template string found';
// if (tplstr.children.length !== 3) throw 'template string has wrong number of children';
// console.log('template string:', getSourceFromLocation(src, ast.find('templateString')[0]!.location));
utils.dump(src, ast.root);

export function parse(src: string) {
  const parser = Parser.fromString(src);
  const ast = new AST<ASTMap>(parser.process())
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
      array(node) {
        return {
          ...node,
          values: node.rules.exprx,
        }
      },
      fnArg(node) {
        return new FnArgASTNode(node);
      },
      varArgs(node) {
        return new FnArgASTNode(node);
      },
      literal(node) {
        return {
          ...node,
          primitive: ['BooleanLiteral', 'NumberLiteral', 'StringLiteral', 'TemplateStringLiteral', 'SymbolLiteral'].includes(node.option.type)
        }
      },
      templateString(node) {
        const tokenlist = sortTokens([...node.tokens.EscapeSequence, ...node.tokens.TplStringContent])
        const tokensublists = collectTokens(tokenlist);
        
        const strings = tokensublists.map(ts => new TemplateStringPieceASTNode(ts));
        const interpolations = node.rules.stringInterpolation as StringInterpolationASTNode[];
        const exprs = interpolations.map((n: StringInterpolationASTNode) => n.rules.exprx[0]); // cut out intermittent nodes
        
        return {
          ...node,
          rules: {
            strings,
            exprs,
          },
          children: sortNodes([...strings, ...exprs]),
        };
      },
    })
    .augment<{
      templateStringPiece: TemplateStringPieceASTNode,
    }>()
    .forget('cmdsep')
  return ast;
}
