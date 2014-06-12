package vb.stil.tree;

import org.antlr.runtime.Token;

public class ExpressionNode extends StilNode {
	public ExpressionNode() {
		super();
	}
	
	public ExpressionNode(ExpressionNode node) {
		super(node);
	}
	
	public ExpressionNode(Token t) {
		super(t);
	}

	@Override
	public ExpressionNode dupNode() {
		return new ExpressionNode(this);
	}
}
