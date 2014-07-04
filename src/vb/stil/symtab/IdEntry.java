package vb.stil.symtab;

import vb.stil.tree.DeclNode;

public class IdEntry {
	protected DeclNode declNode;
	protected int level = -1;
	protected boolean assigned = false;
	
	public boolean isAssigned() {
		return assigned;
	}
	
	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}
	
	public int getLevel() {
		return level;
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
