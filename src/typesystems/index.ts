import {init, Model} from "z3-solver";

async function main() {
	const {Context} = await init();
	const Z3 = Context('main');

}

main();
