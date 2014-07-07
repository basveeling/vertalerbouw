package vb.stil.tree;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * Expression node for logic expressions. Adds an operator to expressions.
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class LogicExprNode extends ExprNode {
	private Operator operator;

	public LogicExprNode() {
		super();
	}
	
	public LogicExprNode(int tokenNumber) {
		super(new CommonToken(tokenNumber, ""));
	}
	
	public LogicExprNode(LogicExprNode node) {
		super(node);
	}

	public LogicExprNode(Token t) {
		super(t);
	}
	
	/**
	 * We must override this method to make sure ANTLR duplicates this node the right way
	 *
	 * @see StilNode#dupNode()
	 */
	@Override
	public LogicExprNode dupNode() {
		return new LogicExprNode(this);
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
}
