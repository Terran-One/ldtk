import {Project, StructureKind} from "ts-morph";
import {GrammarParser} from './parser';

function camel2pascal(str: string): string {
	return str[0].toUpperCase() + str.slice(1);
}

export class Codegen {
	public static generateASTNodes(grammar: string) {
		let grammarAST = GrammarParser.parse(grammar);
		let project = new Project();
		let src = project.createSourceFile("ast-nodes.ts", "", {overwrite: true});

		// get all the rule names
		grammarAST.rules.forEach(rule =>  {
			// analyze the rule
			let { alts } = rule.rule;
			// for each alternative, extract the labeled elements
			alts.forEach(alt => {
				alt.elements.filter(e =>  !== undefined)
			});
		});

		src.formatText();
		src.saveSync();
	}
}
