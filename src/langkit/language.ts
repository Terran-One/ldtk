
interface Antlrable {
  toAntlr(): string;
}

/** Unified formal language grammar specialized for programming languages, primarily CWScript. */
export default class Grammar {
  constructor(public name: string, public ext: string) {}
}
