package vb.stil.tree;

/**
 * All possible expression operators.
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public enum Operator {
	OR, AND, LT, LTE, GT, GTE, EQ, NEQ, PLUS, MINUS, DIVIDE, MULTIPLY, MODULO, NOT, UNARY_PLUS, UNARY_MINUS;

	/**
	 * Retrieve the corresponding StringTemplate name
	 *
	 * @return String
	 */
	public String getTemplateName() {
		return toString().toLowerCase();
	}
}
