import {Project, StructureKind} from "ts-morph";
import {GrammarParser} from './parser';
import * as AST from './ast';

function camel2pascal(str: string): string {
	return str[0].toUpperCase() + str.slice(1);
}

export class Codegen {
	public static generateASTNodes(grammar: string) {
		let grammarAST = GrammarParser.parse(grammar);
		let project = new Project();
		let src = project.createSourceFile("ast-nodes.ts", "", {overwrite: true});

		// get all the rule names
		grammarAST.rules.forEach(rule => {
			console.log(rule.name);
			// analyze the rule
			let {alts} = rule.rule;
			// for each alternative, extract the labeled elements
			let labeledElems = alts.descendantsWhere(
				node => node instanceof AST.LabeledElement && node.label !== undefined
			) as AST.LabeledElement[];
			// for each labeled element, extract the label and the type
			labeledElems.forEach(elem => {
				console.log(`\t${elem.label}`);
			});
		});


		src.formatText();
		src.saveSync();
	}
}
