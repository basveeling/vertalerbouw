package vb.stil.tree;

import org.antlr.runtime.Token;

// TODO: Remove?
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

	@Override
	public IdNode dupNode() {
		return new IdNode(this);
	}
}
