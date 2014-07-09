package vb.stil.codegenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import vb.stil.symtab.MachineEntry;
import vb.stil.symtab.MachineSymbolTable;
import vb.stil.symtab.SymbolTableException;
import vb.stil.tree.DeclNode;
import vb.stil.tree.ExprNode;
import vb.stil.tree.IdNode;
import vb.stil.tree.LiteralNode;
import vb.stil.tree.LogicExprNode;
import vb.stil.tree.Operator;
import vb.stil.tree.StilNode;

/**
 * Parses the decorated AST and generates code by utilising StringTemplates. This is mostly done by passing the root node, the
 * program then intelligently determines the structure of the child nodes.
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class CodeGenerator {
	/**
	 * Location of the StringTemplate group file
	 */
	private static final String groupFile = "src/vb/stil/codegenerator/jasmin.stg";
	
	protected STGroup templates;
	
	protected MachineSymbolTable symtab = new MachineSymbolTable();
	
	protected int currentLabelNumber = 0;
	
	/**
	 * Initialize a CodeGenerator using the specified StringTemplate group file
	 */
	public CodeGenerator() {
		templates = new STGroupFile(CodeGenerator.groupFile);
	}
	
	/**
	 * Generate StringTemplate for an assignment expression
	 *
	 * @param node
	 * @return ST StringTemplate
	 */
	public ST becomes(ExprNode node) {
		ST template = getTemplate("becomes");

		String id = node.getChild(0).getText(); // Retrieve the identifier name
		
		template.add("id", id);
		template.add("varnum", symtab.retrieve(id).getVarnum());
		template.add("expression", getChildST(node, 1));
		template.add("type", symtab.retrieve(id).getDeclNode().getEntityType().toString());
		
		return template;
	}

	/**
	 * Close scope of the symbol table
	 */
	public void closeScope() {
		symtab.closeScope();
	}
	
	/**
	 * Get the string representation of the entity type of the specified identifier
	 *
	 * @param id
	 * @return String Text representation of the entity type
	 */
	protected String getEntityTypeString(String id) {
		return symtab.retrieve(id).getDeclNode().getEntityType().getEntityTypeString();
	}
	
	/**
	 * Retrieve the next available label number and increment the current label number
	 *
	 * @return int Available label number
	 */
	protected int getNewLabelNumber() {
		return currentLabelNumber++;
	}
	
	/**
	 * Retrieve template from the group file for given name
	 *
	 * @param name
	 * @return ST StringTemplate
	 */
	protected ST getTemplate(String name) {
		return templates.getInstanceOf(name);
	}
	
	/**
	 * Get the assigned variable storage number of the specified identifier
	 *
	 * @param id
	 * @return
	 */
	protected Integer getVarnum(String id) {
		return symtab.retrieve(id).getVarnum();
	}
	
	/**
	 * Open scope of the symbol table
	 */
	public void openScope() {
		symtab.openScope();
	}
	
	/**
	 * Generate StringTemplate for all binary logic expressions
	 *
	 * @param node
	 * @return ST StringTemplate
	 */
	public ST processBinaryLogicExpression(LogicExprNode node) {
		ST template = null;
		Operator operator = node.getOperator();
		
		switch (operator) {
			case LT:
			case LTE:
			case GT:
			case GTE:
			case EQ:
			case NEQ:
				template = getTemplate("comparison");
				template.add("operator", operator.getTemplateName());
				template.add("label1", getNewLabelNumber());
				template.add("label2", getNewLabelNumber());
				break;
			case DIVIDE:
			case MINUS:
			case OR:
			case MODULO:
			case MULTIPLY:
			case PLUS:
			case AND:
				template = getTemplate("binary_operator");
				template.add("operator", operator.getTemplateName());
				break;
			default:
				template = getTemplate(operator.getTemplateName());
				break;
		}
		
		template.add("expr1", getChildST(node, 0));
		template.add("expr2", getChildST(node, 1));
		
		node.setST(template);
		
		return template;
	}
	
	/**
	 * Generate StringTemplate for a boolean
	 *
	 * @param v
	 * @return ST StringTemplate
	 */
	public ST processBoolLiteral(LiteralNode v) {
		ST template = getTemplate("boolLiteral");
		
		template.add("value", v.getText());
		
		return template;
	}
	
	/**
	 * Generate StringTemplate for a character literal
	 *
	 * @param v
	 * @return ST StringTemplate
	 */
	public ST processCharLiteral(LiteralNode v) {
		ST template = getTemplate("charLiteral");
		
		template.add("value", (int) v.getText().charAt(0));
		
		return template;
	}
	
	/**
	 * Generate StringTemplate for a compound expression
	 *
	 * @param node
	 * @return ST StringTemplate
	 */
	public ST processCompoundExpression(StilNode node) {
		ST template = getTemplate("compound_expression");
		
		for (int index = 0; index < node.getChildCount(); index++) {
			template.add("instructions", getChildST(node, index));
		}
		
		return template;
	}

	/**
	 * Generate StringTemplate for a constant declaration
	 *
	 * @param node
	 * @param id
	 * @return ST StringTemplate
	 */
	public ST processConstDeclaration(DeclNode node, IdNode id) {
		ST template = null;
		
		try {
			String idname = id.getText(); // Retrieve the identifier name
			
			symtab.enter(idname, new MachineEntry(node));
			
			template = getTemplate("becomes");
			template.add("id", id);
			template.add("varnum", symtab.retrieve(idname).getVarnum());
			template.add("expression", getChildST(node, 2));
			template.add("type", symtab.retrieve(idname).getDeclNode().getEntityType().toString());
		} catch (SymbolTableException e) {
			e.printStackTrace();
		}
		
		return template;
	}
	
	/**
	 * Generate StringTemplate for an identifier, automatically determining the storage location number
	 *
	 * @param node
	 * @return ST StringTemplate
	 */
	public ST processIdOperand(IdNode node) {
		String id = node.getText(); // Retrieve the identifier name
		
		ST template = getTemplate("idOperand");
		template.add("varnum", symtab.retrieve(id).getVarnum());
		template.add("id", id);
		template.add("type", symtab.retrieve(id).getDeclNode().getEntityType().toString());
		
		return template;
	}
	
	/**
	 * Generate StringTemplate for an if statement
	 *
	 * @param node
	 * @param ifInstructions
	 * @param elseInstructions
	 * @return ST StringTemplate
	 */
	public ST processIfStatement(StilNode node, List<ST> ifInstructions, List<ST> elseInstructions) {
		ST template = getTemplate("if_statement");

		template.add("expr", getChildST(node, 0));

		for (ST instruction : ifInstructions) {
			template.add("if_instructions", instruction);
		}
		
		for (ST instruction : elseInstructions) {
			template.add("else_instructions", instruction);
		}

		template.add("label1", getNewLabelNumber());
		template.add("label2", getNewLabelNumber());

		node.setST(template);

		return template;
	}
	
	/**
	 * Generate StringTemplate for an integer literal
	 *
	 * @param v
	 * @return ST StringTemplate
	 */
	public ST processIntLiteral(LiteralNode v) {
		ST template = getTemplate("intLiteral");
		
		template.add("value", v.getText());
		
		return template;
	}
	
	/**
	 * Generate StringTemplate for a print statement
	 *
	 * @param node
	 * @return ST StringTemplate
	 */
	public ST processPrintStatement(ExprNode node) {
		ST template = getTemplate("printMultiple");
		
		for (int index = 0; index < node.getChildCount(); index++) {
			ExprNode expression = (ExprNode) node.getChild(index);
			
			ST statement = null;
			statement = getTemplate("print");
			statement.add("expression", expression.getST());
			statement.add("type", expression.getEntityType().getEntityTypeString());
			
			template.add("statements", statement);
		}
		
		node.setST(template);
		
		return template;
	}
	
	/**
	 * Generate StringTemplate for the program
	 *
	 * @param node
	 * @return ST StringTemplate
	 */
	public ST processProgram(StilNode node, int numOps, int locals) {
		ST template = getTemplate("program");
		
		template.add("maxStackDepth", numOps);
		template.add("maxLocals", locals);
		
		for (int index = 0; index < node.getChildCount(); index++) {
			template.add("instructions", getChildST(node, index));
		}
		
		return template;
	}
	
	/**
	 * Generate StringTemplate for a read statement
	 *
	 * @param node
	 * @return ST StringTemplate
	 */
	public ST processReadStatement(ExprNode node) {
		ST template = getTemplate("readMultiple");
		
		ArrayList<HashMap<String, String>> vars = new ArrayList<>();

		for (Object varNode : node.getChildren()) {
			String id = ((StilNode) varNode).getText(); // Retrieve the identifier name

			HashMap<String, String> properties = new HashMap<>();

			properties.put("label1", "" + getNewLabelNumber());
			properties.put("label2", "" + getNewLabelNumber());
			properties.put("label3", "" + getNewLabelNumber());
			properties.put("type", getEntityTypeString(id));
			properties.put("varnum", "" + getVarnum(id));
			properties.put("id", id);

			vars.add(properties);
		}

		template.add("variables", vars);

		node.setST(template);
		
		return template;
	}
	
	/**
	 * Generate StringTemplate for unary logic expressions
	 *
	 * @param node
	 * @return ST StringTemplate
	 */
	public ST processUnaryLogicExpression(LogicExprNode node) {
		ST template = null;
		
		template = getTemplate(node.getOperator().getTemplateName());
		template.add("expr", getChildST(node, 0));
		
		if (node.getOperator() == Operator.NOT) {
			template.add("label1", getNewLabelNumber());
			template.add("label2", getNewLabelNumber());
		}
		
		node.setST(template);
		
		return template;
	}
	
	/**
	 * Generate StringTemplate for a variable declaration
	 *
	 * @param node
	 * @param id
	 * @return ST StringTemplate
	 */
	public ST processVarDeclaration(DeclNode node, IdNode id) {
		try {
			symtab.enter(id.getText(), new MachineEntry(node));
			
		} catch (SymbolTableException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Generate StringTemplate for a while statement
	 *
	 * @param node
	 * @param instructions
	 * @return ST StringTemplate
	 */
	public ST processWhileStatement(StilNode node, List<ST> instructions) {
		ST template = getTemplate("while_statement");

		template.add("expr", getChildST(node, 0));

		for (ST instruction : instructions) {
			template.add("instructions", instruction);
		}
		
		template.add("label1", getNewLabelNumber());
		template.add("label2", getNewLabelNumber());

		node.setST(template);

		return template;
	}
	
	/**
	 * Returns the StringTemplate of a child at specified position
	 *
	 * @param node
	 *            Root node
	 * @param index
	 *            Index of the child
	 * @return ST StringTemplate
	 */
	protected static ST getChildST(StilNode node, int index) {
		return ((StilNode) node.getChild(index)).getST();
	}
}
