/**
 * 
 */
package vb.stil.tree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * @author basveeling
 *
 */
public class StilNode extends CommonTree {
	
	/**
	 * 
	 */
	public StilNode() {
		super();
	}

	/**
	 * @param node
	 */
	public StilNode(CommonTree node) {
		super(node);
	}

	/**
	 * @param t
	 */
	public StilNode(Token t) {
		super(t);
	}

}
