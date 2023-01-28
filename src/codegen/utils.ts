import child_process from 'child_process';
import fs from 'fs/promises';
import path from 'path';

export const DIR = 'generated';

export type SpawnPKM = 'none' | 'yarn' | 'npm' | undefined;

type SpawnResult = {
	code: number | null;
	signal: string | null;
}

export const spawn = (cmd: string, args: string[], pkm?: SpawnPKM) => new Promise<SpawnResult>(async (resolve, reject) => {
	pkm = pkm || await getDefaultPKM();
	
	switch (pkm) {
		case 'none': break;
		case 'npm':
			args = ['run', cmd, ...args];
			cmd = 'npm';
			break;
		case 'yarn':
			args = [cmd, ...args];
			cmd = 'yarn';
			break;
	}
	
	const child = child_process.spawn(cmd, args, { stdio: 'inherit' });
	child.on('exit', (code, signal) => {
		resolve({
			code,
			signal,
		});
	})
	child.on('error', reject);
});

async function getDefaultPKM(): Promise<SpawnPKM & string> {
  const cwd = process.cwd();
  const filesExist = await Promise.all([
    fileExists(path.join(cwd, 'yarn.lock')),
    fileExists(path.join(cwd, 'package-lock.json')),
  ]);
  
  if (filesExist[0])
    return 'yarn';
  if (filesExist[1])
    return 'npm';
  return 'none';
}

/** Find this project's root folder by ascending the file hierarchy and searching for the first package.json occurrence */
export async function projectRoot(): Promise<string> {
	let curr = path.resolve(__dirname);
	while (curr !== '/') {
		switch (await fileExists(path.join(curr, 'package.json'))) {
			case 'file':
				return curr;
			case 'dir':
				throw Error("Project's package.json is a directory!?");
			case 'no':
				curr = path.dirname(curr);
				break;
		}
	}
	throw Error("Project's package.json not found");
}

/** Get the project's template directory */
export const tplDir = async () => path.join(await projectRoot(), 'data', 'tpl');

type FileExistsResult = 'file' | 'dir' | 'no';

export async function fileExists(filepath: string): Promise<FileExistsResult> {
	try {
		const stat = await fs.stat(filepath);
		return stat.isDirectory() ? 'dir' : 'file';
	} catch {
		return 'no';
	}
}

export const contextName = (ruleName: string) => `${capitalize(ruleName)}Context`;
export const astNodeName = (ruleName: string) => `${capitalize(ruleName)}ASTNode`;
export const capitalize = (s: string) => s[0].toUpperCase() + s.substring(1);
