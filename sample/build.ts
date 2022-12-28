import {lexerGrammar, parserGrammar} from "./grammar/CWScript.grammar";

import child_process from "child_process";
import path from "path";
import process from "process";
import fs from "fs";

// first generate the lexer and parser .g4 files

const grammarDir = path.join(__dirname, "gen-antlr");

if (!fs.existsSync(grammarDir)) {
	fs.mkdirSync(grammarDir);
}

const lexerFile = path.join(grammarDir, lexerGrammar.name + ".g4");
const parserFile = path.join(grammarDir, parserGrammar.name + ".g4");

fs.writeFileSync(lexerFile, lexerGrammar.toANTLR());
fs.writeFileSync(parserFile, parserGrammar.toANTLR());

let cmd = "antlr4ts";
let lexerArgs = ['-visitor', lexerFile, '-o', grammarDir];
let parserArgs = ['-visitor', parserFile, '-o', grammarDir, '-lib', grammarDir];
let child = child_process.spawn(cmd, lexerArgs);
child.on('exit', (code, signal) => {
	if (code) {
		console.error(`Failed to generate lexer: ${code}`);
		process.exit(code);
	}
	child = child_process.spawn(cmd, parserArgs);
	child.on('exit', (code, signal) => {
		if (code) {
			console.error(`Failed to generate parser: ${code}`);
			process.exit(code);
		}
	});
});


