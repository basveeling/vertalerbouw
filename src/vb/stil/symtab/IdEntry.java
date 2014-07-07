package vb.stil.symtab;

import vb.stil.tree.DeclNode;

/**
 * An identifier entry for use in the symbol table
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class IdEntry {
	protected boolean assigned = false;
	protected DeclNode declNode;
	protected int isAssignedOnLevel = Integer.MAX_VALUE;
	protected int level = -1;

	/**
	 * Retrieve the declaration node of this identifier
	 *
	 * @return DeclNode
	 */
	public DeclNode getDeclNode() {
		return declNode;
	}
	
	/**
	 * Get the level of the scope wherein the identifier is declared
	 *
	 * @return int
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Check if the identifier has been assigned a value at the given scope level
	 *
	 * @param currentLevel
	 * @return boolean
	 */
	public boolean isAssignedForScope(int currentLevel) {
		return assigned && isAssignedOnLevel <= currentLevel;
	}
	
	/**
	 * Flag the identifier as assigned for given scope level, automatically marking the identifier as assigned for higher scope
	 * levels
	 *
	 * @param currentLevel
	 */
	public void setAssignedForScope(int currentLevel) {
		assigned = true;
		isAssignedOnLevel = Math.min(currentLevel, isAssignedOnLevel);
	}
	
	/**
	 * Set the node where this identifier has been declared
	 *
	 * @param declNode
	 */
	public void setDeclNode(DeclNode declNode) {
		this.declNode = declNode;
	}
	
	/**
	 * Set the scope level wherein this identifier has been declared
	 *
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 * Mark the identifier unassigned where necessary after closing a scope
	 *
	 * @param newLevel
	 */
	public void setUnassignedForScope(int newLevel) {
		if (newLevel < isAssignedOnLevel) {
			assigned = false;
			isAssignedOnLevel = Integer.MAX_VALUE;
		}
	}
}
