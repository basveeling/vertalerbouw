package vb.stil.tree;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class ExprNode extends StilNode {
	protected EntityType entityType;

	public ExprNode() {
		super();
	}
	
	public ExprNode(ExprNode node) {
		super(node);
	}
	
	public ExprNode(Token t) {
		super(t);
	}

	public ExprNode(int tokenNumber) {
		super(new CommonToken(tokenNumber, ""));
	}

	public EntityType getEntityType() {
		return entityType;
	}
	
	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}
	
	@Override
	public ExprNode dupNode() {
		return new ExprNode(this);
	}
}
