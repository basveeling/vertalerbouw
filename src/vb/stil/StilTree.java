/**
 * 
 */
package vb.stil;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * @author basveeling
 *
 */
public class StilTree extends CommonTree {
	
	/**
	 * 
	 */
	public StilTree() {
		super();
	}

	/**
	 * @param node
	 */
	public StilTree(CommonTree node) {
		super(node);
	}

	/**
	 * @param t
	 */
	public StilTree(Token t) {
		super(t);
	}

}
