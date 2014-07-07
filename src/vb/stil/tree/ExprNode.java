package vb.stil.tree;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * Expression node. Subclass of StilNode with added properties for the entity type, since all expressions yield a type.
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class ExprNode extends StilNode {
	protected EntityType entityType;

	public ExprNode() {
		super();
	}
	
	public ExprNode(ExprNode node) {
		super(node);
	}
	
	/**
	 * Added functionality to be able to construct a node using only the token number
	 *
	 * @param tokenNumber
	 *            the token number
	 */
	public ExprNode(int tokenNumber) {
		super(new CommonToken(tokenNumber, ""));
	}

	public ExprNode(Token t) {
		super(t);
	}

	/**
	 * We must override this method to make sure ANTLR duplicates this node the right way
	 *
	 * @see StilNode#dupNode()
	 */
	@Override
	public ExprNode dupNode() {
		return new ExprNode(this);
	}
	
	public EntityType getEntityType() {
		return entityType;
	}
	
	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}
}
