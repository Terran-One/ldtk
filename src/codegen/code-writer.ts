import { CodeBlockWriter } from "ts-morph";

type Writable = string | number | ((writer: CodeWriter) => void);
type WritableWithIndex = string | number | ((writer: CodeWriter, index: number) => void);

export interface ObjectWriter {
  writer: CodeWriter;
  lineSep: string;
  write(prop: number | Writable, value: Writable): void;
}

/** A collection of helpful code writing methods */
export class CodeWriter {
  constructor(public writer: CodeBlockWriter) {}
  
  /** Write `thing` to the code, or invoke a callback for more complex writing operations. */
  write(thing: Writable) {
    if (typeof thing === 'function') {
      thing(this);
    } else {
      this.writer.write(thing+'');
    }
    return this;
  }
  
  /** Shorthand for `write(thing).nl()` */
  writeline(thing: string | ((writer: CodeWriter) => void)) {
    return this.write(thing).nl();
  }
  
  /** Enter a new code block (e.g. for regular control flow or JS object literals) */
  block(cb: (writer: CodeWriter) => void) {
    const { writer } = this;
    writer.write('{').newLine();
    writer.indent(() => cb(this));
    writer.write('}');
    return this;
  }
  
  /** Indent all code written by the callback  */
  indent(cb: (writer: CodeWriter) => void) {
    this.writer.indent(() => cb(this));
    return this;
  }
  
  /** Write `count` new lines */
  nl(count = 1) {
    times(count, () => this.writer.newLine());
    return this;
  }
  
  /** Write a property as part of an enclosing JS object literal. If possible, write without quotes. */
  prop(prop: string | number) {
    if (typeof prop === 'number' || prop.match(/^[a-zA-Z_][a-zA-Z0-9_]*$/))
      this.writer.write(prop+'');
    else
      this.writer.quote(prop);
    return this;
  }
  
  /** Write an object literal */
  obj(cb: (writer: ObjectWriter) => void) {
    let linesep = ',', written = false;
    
    this.block(() => {
      cb({
        writer: this,
        write: (prop, value) => {
          written = true;
          
          if (typeof prop === 'string' || typeof prop === 'number') {
            this.prop(prop);
          } else {
            prop(this);
          }
          this.write(': ').write(value).writeline(linesep);
          return this;
        },
        
        get lineSep() { return linesep },
        set lineSep(value: string) {
          if (written) throw Error('Cannot change line separator once the first line has been written');
          linesep = value;
        },
      })
    });
    
    return this;
  }
  
  /** Surround the given thing in quotes */
  quote(text: string | number) {
    this.writer.quote(text+'');
    return this;
  }
  
  /** Write many things in sequence to the code, with an optional separator which defaults to ' ' */
  join(thing: WritableWithIndex[]): this;
  join(sep: string, thing: WritableWithIndex[]): this;
  join(...args: any[]) {
    let sep = ' ', thing: WritableWithIndex[];
    if (args.length === 1) [thing] = args;
    else [sep, thing] = args;
    
    thing.forEach((curr, i) => {
      if (i > 0)
        this.write(sep);
      
      if (typeof curr === 'function') {
        curr(this, i);
      } else {
        this.write(curr+'');
      }
    });
    
    return this;
  }
}

const times = <T>(count: number, cb: (index: number) => T) =>
  new Array(count).fill(0).map((_, i) => cb(i));
