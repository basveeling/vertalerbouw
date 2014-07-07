package vb.stil.symtab;

import vb.stil.tree.DeclNode;

public class IdEntry {
	protected DeclNode declNode;
	protected int level = -1;
	protected boolean assigned = false;
	protected int isAssignedOnLevel = Integer.MAX_VALUE;

	public boolean isAssignedForScope(int currentLevel) {
		return assigned && isAssignedOnLevel <= currentLevel;
	}

	public void setAssignedForScope(int currentLevel) {
		assigned = true;
		isAssignedOnLevel = Math.min(currentLevel, isAssignedOnLevel);
	}
	
	public void setUnassignedForScope(int newLevel) {
		if (newLevel < isAssignedOnLevel) {
			assigned = false;
			isAssignedOnLevel = Integer.MAX_VALUE;
		}
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
