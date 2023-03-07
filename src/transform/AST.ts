import type { ASTNodeBase, Defined, IOptionsASTNode, IRuleASTNode } from '../types';

type AnyASTMap = Record<string, ASTNodeBase>;
type TransformerMap<M extends AnyASTMap = any> = {
  [K in keyof M]?: (node: M[K]) => ASTNodeBase;
}

type ASTMapFromTransformer<T extends TransformerMap<any>> = {
  [K in keyof T]: ReturnType<Defined<T[K]>>;
}

export type ASTNodeMap<T> = T extends AST<infer M> ? M : {};
export type ASTNodes<T> = ASTNodeMap<T>[keyof ASTNodeMap<T>];

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
    const transformed = new Map<ASTNodeBase, ASTNodeBase>();
    
    function inner(node: ASTNodeBase) {
      if (transformed.has(node))
        return transformed.get(node)!;
      transformed.set(node, node);
      
      if (node.type in transformer) {
        const newNode = transformer[node.type]!(node as any);
        transformed.set(node, newNode);
        node = newNode;
      }
      return transformGeneric(node);
    }
    
    function transformGeneric(_node: ASTNodeBase) {
      if (_node.family === 'options') {
        const node = _node as IOptionsASTNode;
        node.children = [node.option = inner(node.option) as any];
      } else {
        const node = _node as IRuleASTNode;
        node.rules = Object.fromEntries(
          Object.entries(node.rules).map(
            ([key, value]) =>
              [key, value.map(child => inner(child))]
          )
        );
        node.children = node.children.map(c => inner(c));
      }
      return _node;
    }
    
    this.root = inner(this.root);
    return this as any;
  }
  
  /** Introduce a new AST node to the tracking map. */
  augment<M2 extends AnyASTMap>(): AST<Omit<M, keyof M2> & M2> {
    return this as any;
  }
  
  /** Drop an old AST node from the tracking map. */
  forget<Type extends keyof M>(...types: Type[]): AST<Omit<M, Type>> {
    return this as any;
  }
  
  /** Find a nested node deep within the hierarchy of the given `type`. */
  find<Type extends keyof M>(type: Type): M[Type][] {
    return this.findBy(node => node.type === type) as any;
  }
  
  /** Find all nested nodes of given `type` before any nested occurrence of `before` nodes. The root
   * node of this AST itself is not a valid `before` node for the search termination.
   */
  findBefore<Type extends keyof M>(type: Type, before: keyof M): M[Type][] {
    const result = new Set<ASTNodeBase>();
    let first = true;
    
    function inner(node: ASTNodeBase) {
      if (!first && node.type === before)
        return result;
      first = false;
      
      if (node.type === type)
        result.add(node);
      node.children.forEach(inner);
      return result;
    }
    inner(this.root);
    
    return [...result] as any;
  }
  
  /** Find all deeply nested nodes matching the given `predicate`. */
  findBy(predicate: (node: ASTNodeBase) => boolean): ASTNodeBase[] {
    const result = new Set<ASTNodeBase>();
    this.traverse(node => {
      if (predicate(node))
        result.add(node);
    });
    return [...result] as any;
  }
  
  /** Depth-first traversal of the AST */
  traverse(callback: (node: ASTNodeBase) => void) {
    function inner(node: ASTNodeBase) {
      callback(node);
      node.children.forEach(inner);
    }
    inner(this.root);
  }
}
