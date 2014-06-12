package vb.stil.checker;

import vb.stil.StilException;
import vb.stil.tree.DeclNode;
import vb.stil.tree.EntityType;
import vb.stil.tree.Operator;
import vb.stil.tree.StilNode;

public class TypeChecker {

	/**
	 * Validate operand type of assignment expression
	 *
	 * @param declNode
	 * @param t1
	 * @return EntityType
	 * @throws StilException
	 */
	public EntityType validate(StilNode node, DeclNode declNode, EntityType t1) throws StilException {
		if (declNode.getEntityType() != t1) {
			throw new StilException(node, "operand type does not match variable type");
		}
		
		return t1;
	}

	/**
	 * Validate operand type of unary expression
	 *
	 * @param op
	 * @param t1
	 * @return EntityType
	 * @throws StilException
	 */
	public EntityType validate(StilNode node, Operator op, EntityType t1) throws StilException {
		EntityType result = null;

		if (op == Operator.PLUS || op == Operator.MINUS) {
			if (t1 != EntityType.INT) {
				throw new StilException(node, "operand has an invalid type");
			}

			result = EntityType.INT;
		} else if (op == Operator.NOT) {
			if (t1 != EntityType.BOOL) {
				throw new StilException(node, "operand has an invalid type");
			}

			result = EntityType.BOOL;
		}

		return result;
	}
	
	/**
	 * Validate operand types of binary expression
	 *
	 * @param op
	 * @param t1
	 * @param t2
	 * @return EntityType
	 * @throws StilException
	 */
	public EntityType validate(StilNode node, Operator op, EntityType t1, EntityType t2) throws StilException {
		EntityType result = null;

		if (op == Operator.OR || op == Operator.AND) {
			if (t1 != EntityType.BOOL) {
				throw new StilException(node, "left-hand side operand has an invalid type");
			}
			if (t2 != EntityType.BOOL) {
				throw new StilException(node, "right-hand side operand has an invalid type");
			}

			result = EntityType.BOOL;
		} else if (op == Operator.LT || op == Operator.LTE || op == Operator.GT || op == Operator.GTE) {
			if (t1 != EntityType.INT) {
				throw new StilException(node, "left-hand side operand has an invalid type");
			}
			if (t2 != EntityType.INT) {
				throw new StilException(node, "right-hand side operand has an invalid type");
			}

			result = EntityType.BOOL;
		} else if (op == Operator.EQ || op == Operator.NEQ) {
			if (t1 != EntityType.BOOL && t1 != EntityType.CHAR && t1 != EntityType.INT) {
				throw new StilException(node, "left-hand side operand has an invalid type");
			}
			
			if (t1 != t2) {
				throw new StilException(node, "right-hand side operand type must be the same as left-hand side operand type");
			}

			result = EntityType.BOOL;
		} else if (op == Operator.PLUS || op == Operator.MINUS || op == Operator.DIVIDE || op == Operator.MULTIPLY || op == Operator.MODULO) {
			if (t1 != EntityType.INT) {
				throw new StilException(node, "left-hand side operand has an invalid type");
			}
			if (t2 != EntityType.INT) {
				throw new StilException(node, "right-hand side operand has an invalid type");
			}

			result = EntityType.INT;
		}

		return result;
	}
}
