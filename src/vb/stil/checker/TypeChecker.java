package vb.stil.checker;

import vb.stil.exceptions.StilException;
import vb.stil.symtab.IdEntry;
import vb.stil.symtab.SymbolTable;
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
	public DeclNode validateAssignmentExpression(StilNode node, StilNode id, EntityType t1, SymbolTable<IdEntry> symtab) throws StilException {
		IdEntry symbol = symtab.retrieve(id.getText());
		
		if (symbol == null) {
			throw new StilException(node, "use of undeclared identifier");
		}
		
		DeclNode declNode = symbol.getDeclNode();

		if (declNode.getEntityType() != t1) {
			throw new StilException(node, "operand type does not match variable type");
		}
		
		return declNode;
	}
	
	/**
	 * Validate operand type of constant assignment expression
	 *
	 * @param declNode
	 * @param t1
	 * @return EntityType
	 * @throws StilException
	 */
	public EntityType validateConstantAssignmentExpression(StilNode node, StilNode id, EntityType t1, SymbolTable<IdEntry> symtab) throws StilException {
		DeclNode declNode = validateAssignmentExpression(node, id, t1, symtab);
		
		if (!declNode.isConstant()) {
			throw new StilException(node, "identifier must be declared as variable");
		}
		
		return t1;
	}
	
	/**
	 * Validate operand type of variable assignment expression
	 *
	 * @param declNode
	 * @param t1
	 * @return EntityType
	 * @throws StilException
	 */
	public EntityType validateVariableAssignmentExpression(StilNode node, StilNode id, EntityType t1, SymbolTable<IdEntry> symtab) throws StilException {
		DeclNode declNode = validateAssignmentExpression(node, id, t1, symtab);
		
		if (!declNode.isVariable()) {
			throw new StilException(node, "identifier must be declared as variable");
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
	public EntityType validateLogicExpression(StilNode node, Operator op, EntityType t1) throws StilException {
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
	public EntityType validateLogicExpression(StilNode node, Operator op, EntityType t1, EntityType t2) throws StilException {
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
	
	/**
	 * Validate the type of a print statement parameter
	 *
	 * @param node
	 * @param type
	 * @return
	 * @throws StilException
	 */
	public EntityType validatePrintStatement(StilNode node, EntityType type) throws StilException {
		if (type == EntityType.VOID) {
			throw new StilException(node, "print expression parameters cannot return type void");
		}

		return type;
	}

	/**
	 * Validate the type of a print statement parameter, in the context of multiple parameters
	 *
	 * @param node
	 * @param type
	 * @return
	 * @throws StilException
	 */
	public EntityType validateMultiplePrintStatement(StilNode node, EntityType type) throws StilException {
		validatePrintStatement(node, type);

		return EntityType.VOID;
	}
}
