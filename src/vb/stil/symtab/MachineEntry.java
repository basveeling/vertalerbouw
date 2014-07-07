package vb.stil.symtab;

import vb.stil.tree.DeclNode;

/**
 * An identifier entry for use in the symbol table when generating machine code
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class MachineEntry extends IdEntry {
	private int varnum;
	
	/**
	 * Initialise a MachineEntry and injecting the declaration node
	 *
	 * @param declNode
	 */
	public MachineEntry(DeclNode declNode) {
		super();
		this.declNode = declNode;
	}
	
	/**
	 * Get the variable storage number
	 *
	 * @return
	 */
	public int getVarnum() {
		return varnum;
	}
	
	/**
	 * Set the variable storage number
	 * 
	 * @param varnum
	 */
	public void setVarnum(int varnum) {
		this.varnum = varnum;
	}
}
