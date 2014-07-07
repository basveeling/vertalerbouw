package vb.stil.tree;

import org.antlr.runtime.Token;

/**
 * Identifier node.
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class IdNode extends ExprNode {
	public IdNode() {
		super();
	}
	
	public IdNode(IdNode node) {
		super(node);
	}
	
	public IdNode(Token t) {
		super(t);
	}
	
	/**
	 * We must override this method to make sure ANTLR duplicates this node the right way
	 *
	 * @see StilNode#dupNode()
	 */
	@Override
	public IdNode dupNode() {
		return new IdNode(this);
	}
}
