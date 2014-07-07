package vb.stil.tree;

import org.antlr.runtime.Token;

/**
 * Declaration node. Subclass of StilNode with added properties for the declaration kind and entity type.
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
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
	
	/**
	 * We must override this method to make sure ANTLR duplicates this node the right way
	 *
	 * @see StilNode#dupNode()
	 */
	@Override
	public DeclNode dupNode() {
		return new DeclNode(this);
	}
	
	public EntityType getEntityType() {
		return entityType;
	}
	
	public Kind getKind() {
		return kind;
	}
	
	/**
	 * Checks if the declaration is a constant declaration
	 *
	 * @return boolean
	 */
	public boolean isConstant() {
		return kind == Kind.CONST;
	}
	
	/**
	 * Checks if the declaration is a variable declaration
	 *
	 * @return boolean
	 */
	public boolean isVariable() {
		return kind == Kind.VAR;
	}
	
	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}
	
	public void setKind(Kind kind) {
		this.kind = kind;
	}
}
