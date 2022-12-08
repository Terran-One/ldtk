import {readFileSync} from 'fs';
import {Codegen} from "./src/codegen";

const file = readFileSync('./CWScriptParser.g4');
Codegen.generateASTNodes(file.toString());

