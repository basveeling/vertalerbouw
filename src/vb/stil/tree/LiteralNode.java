package vb.stil.tree;

import org.antlr.runtime.Token;

public class LiteralNode extends StilNode {
	protected EntityType entityType;

	public LiteralNode() {
		super();
	}
	
	public LiteralNode(LiteralNode node) {
		super(node);
	}
	
	public LiteralNode(Token t) {
		super(t);
	}
	
	public EntityType getEntityType() {
		return entityType;
	}
	
	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}
	
	@Override
	public LiteralNode dupNode() {
		return new LiteralNode(this);
	}
}
