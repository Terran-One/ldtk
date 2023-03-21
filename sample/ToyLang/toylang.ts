import { Grammar, Rule, match as m, $ } from '../../src/langkit';

// arguments: name of the language, file extensions
const lang = new Grammar('ToyLang', ['toy', 'tls']);

lang.useSignificantWhitespaces(false);
lang.useStatementSeparator(';', '\r?\n');

// repository of rules, which will need to be referred to in scopes
// rules can also refer to each other
lang.rules({
  'import':
    $.rule`import <import.default> from <import.path>`
    .scopes('keyword.control.import', 'meta.import'),
  'import.default':
    $.rule`<Ident> (as <Ident>)?`
    .scopes('meta.import.default'),
  'import.named':
    $.rule`'{' ${$.list(m`<Ident> (as <Ident>)?`, [','])} '}'`
    .scopes('meta.import.named'),
  'import.path':
    $.rule`<String>`
    .scopes('meta.import.path'),
  'String':
    new Rule($.or(
      m`"'" (<EscapeSequence> | ~[\\']) "'"`,
      m`'"' (<EscapeSequence> | ~[\\"]) '"'`,
    ))
})

// .scope.global is a special scope which always exists
lang.scope.global('import', 'struct', 'variable', 'function');
// custom scope for function blocks
lang.scope.function('block');
