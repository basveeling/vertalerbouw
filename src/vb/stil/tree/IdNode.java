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
public class IdNode extends StilNode {
	/**
	 *
	 */
	public IdNode() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param node
	 */
	public IdNode(CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param t
	 */
	public IdNode(Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IdNode dupNode() {
		return new IdNode(this);
	}
}
