package vb.stil.tree;

import org.antlr.runtime.Token;

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
	
	@Override
	public LiteralNode dupNode() {
		return new LiteralNode(this);
	}
}
