# Language Development Toolkit

**Utility library for language implementation in TypeScript.**

The **Language Development Toolkit (LDTK)** is a utility library that simplifies the process of implementing a
programming language in TypeScript. LDTK provides tools and abstractions for common tasks that arise when creating a new
language, allowing developers to focus on the unique aspects of their language rather than reinventing the wheel.

## Included Tools

- `syntax-tree` -- a base recursive tree implementation with traversal algorithms you extend to define an CST or
  AST
- `parser-gen` -- a generator that reads in an ANTLR grammar and creates a parser implementation that outputs a CST
- `symbol-table` -- a basic symbol table implementation for resolving bindings in an environment with nested scopes
- `typesystems` -- a library for defining type systems with algorithms for type checking and inference
- `tree-viz` -- a visual tool for navigating `syntax-tree` structures
