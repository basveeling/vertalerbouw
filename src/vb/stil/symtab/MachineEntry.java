package vb.stil.symtab;

import vb.stil.tree.DeclNode;


public class MachineEntry extends IdEntry{
	private int varnum;

	public MachineEntry(DeclNode declNode) {
		super();
		this.declNode = declNode;
	}

	public int getVarnum() {
		return varnum;
	}

	public void setVarnum(int varnum) {
		this.varnum = varnum;
	}
}
