package vb.stil.symtab;

import vb.stil.tree.DeclNode;

public class IdEntry {
	protected DeclNode declNode;
	protected int level = -1;

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public DeclNode getDeclNode() {
		return declNode;
	}

	public void setDeclNode(DeclNode declNode) {
		this.declNode = declNode;
	}
}
