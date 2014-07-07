package vb.stil.tree;

import org.antlr.runtime.Token;

/**
 * Literal node.
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class LiteralNode extends ExprNode {
	public LiteralNode() {
		super();
	}

	public LiteralNode(LiteralNode node) {
		super(node);
	}

	public LiteralNode(Token t) {
		super(t);
	}

	/**
	 * We must override this method to make sure ANTLR duplicates this node the right way
	 *
	 * @see ExprNode#dupNode()
	 */
	@Override
	public LiteralNode dupNode() {
		return new LiteralNode(this);
	}
}
