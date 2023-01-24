import { CodeBlockWriter, WriterFunction } from "ts-morph";

type Writable = string | WriterFunction;

export interface ObjectWriter {
  write(prop: number | Writable, value: Writable): void;
}

interface WriteObjectOptions {
  /** Separator between lines of the object. For a standard JS object, use ',' (default). For TS types, typically use ';'. */
  lineSeparator?: string;
}

export function writeObject(writer: CodeBlockWriter, cb: (writer: ObjectWriter) => void, opts: WriteObjectOptions = {}) {
  const { lineSeparator = ',' } = opts;
  
  if (!writer.getLastChar()?.match(/^\s+$/))
    writer.write(' ');
  
  writer.write('{').newLine();
  writer.indent(() => { cb({
    write(prop, value) {
      if (typeof prop === 'string' || typeof prop === 'number') {
        writeProp(writer, prop);
        writer.write(': ');
      } else {
        prop(writer);
      }
      
      if (typeof value === 'string')
        writer.write(value);
      else
        value(writer);
      
      writer.write(lineSeparator).newLine();
      return this;
    },
  }) });
  writer.write('}');
}

/** Convenience method for `writeObject` with preceding 'type ${name} = ' code */
export function writeType(writer: CodeBlockWriter, name: string, cb: (writer: ObjectWriter) => void) {
  writer.write(`type ${name} = `);
  writeObject(writer, cb, { lineSeparator: ';' });
}

function writeProp(writer: CodeBlockWriter, prop: string | number) {
  if (typeof prop === 'number' || prop.match(/^[a-zA-Z_][a-zA-Z0-9_]*$/))
    writer.write(prop+'');
  else
    writer.quote(prop);
}
