import type { ASTNodeBase, Defined, IOptionsASTNode, IRuleASTNode } from '../types';

type AnyASTMap = Record<string, ASTNodeBase>;
type TransformerMap<M extends AnyASTMap = any> = {
  [K in keyof M]?: (node: M[K]) => ASTNodeBase;
}

type ASTMapFromTransformer<T extends TransformerMap<any>> = {
  [K in keyof T]: ReturnType<Defined<T[K]>>;
}

/** Abstract representation of an entire AST, wrapped around an `ASTNodeBase` root.
 * 
 * The type argument `M` is the *"tracking map"*, which is a mapping of AST node names to their
 * respective AST node types.
 * 
 * The `transform` method recursively transforms all nodes of a given type, and replaces the
 * respective AST node type in the tracking map. The `augment` and `forget` methods do not alter
 * the AST at runtime, but instead are convenient methods for altering the tracking map.
 */
export class AST<M extends AnyASTMap = AnyASTMap> {
  constructor(public root: ASTNodeBase) {}
  
  /** Transform existing AST nodes, replacing their respective type from the tracking map. */
  transform<M2 extends TransformerMap<M>>(transformer: M2): AST<Omit<M, keyof M2> & ASTMapFromTransformer<M2>> {
    this.root = this._inner_transform(this.root, transformer);
    return this as any;
  }
  
  protected _inner_transform(
    node: ASTNodeBase,
    transformer: TransformerMap,
    transformed = new Map<ASTNodeBase, ASTNodeBase>(),
  ) {
    if (transformed.has(node))
      return transformed.get(node)!;
    transformed.set(node, node);
    
    if (node.type in transformer) {
      const newNode = transformer[node.type]!(node);
      transformed.set(node, newNode);
      node = newNode;
    }
    return this._generic_transform(node, transformer, transformed);
  }
  
  protected _generic_transform(_node: ASTNodeBase, transformer: TransformerMap, transformed: Map<ASTNodeBase, ASTNodeBase>) {
    if (_node.family === 'options') {
      const node = _node as IOptionsASTNode;
      node.children = [node.option = this._inner_transform(node.option, transformer, transformed) as any];
    } else {
      const node = _node as IRuleASTNode;
      node.rules = Object.fromEntries(
        Object.entries(node.rules).map(
          ([key, value]) =>
            [key, value.map(child => this._inner_transform(child, transformer, transformed))]
        )
      );
      node.children = node.children.map(c => this._inner_transform(c, transformer, transformed));
    }
    return _node;
  }
  
  /** Introduce a new AST node to the tracking map. */
  augment<M2 extends AnyASTMap>(): AST<Omit<M, keyof M2> & M2> {
    return this as any;
  }
  
  /** Drop an old AST node from the tracking map. */
  forget<Type extends keyof M>(...types: Type[]): AST<Omit<M, Type>> {
    return this as any;
  }
  
  find<Type extends keyof M>(type: Type): M[Type][] {
    return [...this._find(this.root, type)] as any;
  }
  
  protected _find(node: ASTNodeBase, type: keyof M, result = new Set<ASTNodeBase>()) {
    if (node.type === type) {
      result.add(node);
    }
    node.children.forEach(child => this._find(child, type, result));
    return result;
  }
}
