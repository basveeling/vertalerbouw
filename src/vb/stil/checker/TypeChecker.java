package vb.stil.checker;

import vb.stil.exceptions.StilException;
import vb.stil.symtab.IdEntry;
import vb.stil.symtab.SymbolTable;
import vb.stil.tree.DeclNode;
import vb.stil.tree.EntityType;
import vb.stil.tree.ExprNode;
import vb.stil.tree.LogicExprNode;
import vb.stil.tree.Operator;
import vb.stil.tree.StilNode;

/**
 * Validates and calculates the type of entities and decorates the AST.
 *
 * @author Jarno van Leeuwen
 * @author Bas Veeling
 */
public class TypeChecker {
	
	/**
	 * Process assignment expression, validating operand type
	 *
	 * @param declNode
	 * @param t1
	 * @return EntityType
	 * @throws StilException
	 */
	public EntityType processAssignmentExpression(ExprNode node, StilNode id, EntityType t1, SymbolTable<IdEntry> symtab) throws StilException {
		IdEntry symbol = symtab.retrieve(id.getText());

		if (symbol == null) {
			throw new StilException(node, "use of undeclared identifier");
		}

		DeclNode declNode = symbol.getDeclNode();
		
		if (declNode.getEntityType() != t1) {
			throw new StilException(node, "operand type does not match variable type");
		}

		if (!declNode.isVariable()) {
			throw new StilException(node, "identifier must be declared as variable");
		}
		
		node.setEntityType(t1);

		return t1;
	}
	
	/**
	 * Process unary expression, validating operand type
	 *
	 * @param op
	 * @param t1
	 * @return EntityType
	 * @throws StilException
	 */
	public EntityType processLogicExpression(LogicExprNode node, Operator op, EntityType t1) throws StilException {
		EntityType result = null;
		
		node.setOperator(op);
		
		if (op == Operator.UNARY_PLUS || op == Operator.UNARY_MINUS) {
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
		
		node.setEntityType(result);
		
		return result;
	}

	/**
	 * Process binary expression, validating operand types
	 *
	 * @param op
	 * @param t1
	 * @param t2
	 * @return EntityType
	 * @throws StilException
	 */
	public EntityType processLogicExpression(LogicExprNode node, Operator op, EntityType t1, EntityType t2) throws StilException {
		EntityType result = null;

		node.setOperator(op);
		
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
		
		node.setEntityType(result);
		
		return result;
	}

	/**
	 * Process print statement, validating the type of a parameter
	 *
	 * @param node
	 * @param type
	 * @return
	 * @throws StilException
	 */
	public EntityType processPrintStatement(ExprNode node, EntityType type) throws StilException {
		if (type == EntityType.VOID) {
			throw new StilException(node, "print expression parameters cannot return type void");
		}

		node.setEntityType(type);

		return type;
	}
	
	/**
	 * Process print statement in the context of multiple parameters, validating the type of a parameter
	 *
	 * @param node
	 * @param type
	 * @return
	 * @throws StilException
	 */
	public EntityType processMultiplePrintStatement(ExprNode node, EntityType type) throws StilException {
		processPrintStatement(node, type);

		EntityType result = EntityType.VOID;

		node.setEntityType(result);
		
		return result;
	}
}
