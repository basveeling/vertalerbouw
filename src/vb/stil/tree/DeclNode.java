package vb.stil.tree;

import org.antlr.runtime.Token;

public class DeclNode extends StilNode {
	public static final int CONST = 0;
	public static final int VAR = 1;
	
	protected int kind = -1;

	public DeclNode() {
		super();
	}
	
	public DeclNode(DeclNode node) {
		super(node);
	}
	
	public DeclNode(Token t) {
		super(t);
	}
	
	public int getKind() {
		return kind;
	}
	
	public void setKind(int kind) {
		this.kind = kind;
	}
	
	public boolean isVariable() {
		return this.kind == DeclNode.VAR;
	}
	
	@Override
	public DeclNode dupNode() {
		return new DeclNode(this);
	}
}
