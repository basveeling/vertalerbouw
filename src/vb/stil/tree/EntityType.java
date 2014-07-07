package vb.stil.tree;

/**
 * All possible entity types
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public enum EntityType {
	BOOL, CHAR, INT, VOID;
	
	/**
	 * Return the string representation of an entity type
	 *
	 * @return String
	 */
	public String getEntityTypeString() {
		return toString().toLowerCase();
	}
}
