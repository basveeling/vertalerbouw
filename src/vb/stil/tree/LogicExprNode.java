package vb.stil.tree;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class LogicExprNode extends ExprNode {
	private Operator operator;

	public LogicExprNode() {
		super();
	}
	
	public LogicExprNode(LogicExprNode node) {
		super(node);
	}
	
	public LogicExprNode(Token t) {
		super(t);
	}

	public LogicExprNode(int tokenNumber) {
		super(new CommonToken(tokenNumber, ""));
	}
	
	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	@Override
	public LogicExprNode dupNode() {
		return new LogicExprNode(this);
	}
	
}
