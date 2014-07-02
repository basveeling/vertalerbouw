package vb.stil.tree;

public enum Operator {
	OR, AND, LT, LTE, GT, GTE, EQ, NEQ, PLUS, MINUS, DIVIDE, MULTIPLY, MODULO, NOT, UNARY_PLUS, UNARY_MINUS;

	public String getTemplateName() {
		return toString().toLowerCase();
	}
}
