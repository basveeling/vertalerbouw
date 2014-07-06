package vb.stil.tree;

import org.antlr.runtime.Token;

public class DeclNode extends StilNode {
	public enum Kind {
		CONST, VAR
	}

	protected Kind kind;
	protected EntityType entityType;
	
	public DeclNode() {
		super();
	}

	public DeclNode(DeclNode node) {
		super(node);
	}

	public DeclNode(Token t) {
		super(t);
	}

	public EntityType getEntityType() {
		return entityType;
	}
	public String getEntityTypeString() {
		return entityType.toString().toLowerCase();
	}
	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public boolean isConstant() {
		return kind == Kind.CONST;
	}

	public boolean isVariable() {
		return kind == Kind.VAR;
	}

	@Override
	public DeclNode dupNode() {
		return new DeclNode(this);
	}
}
