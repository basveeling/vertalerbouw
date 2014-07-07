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

public class CodeGenerator {
	private static final String groupFile = "src/vb/stil/codegenerator/jasmin.stg";

	protected STGroup templates;

	protected MachineSymbolTable symtab = new MachineSymbolTable();

	protected int currentLabelNumber = 0;

	public CodeGenerator() {
		templates = new STGroupFile(CodeGenerator.groupFile);
	}

	public ST becomes(ExprNode node) {
		ST template = getTemplate("becomes");
		String id = node.getChild(0).getText(); // Retrieve the identifier name

		template.add("id", id);
		template.add("varnum", symtab.retrieve(id).getVarnum());
		template.add("expression", getChildST(node, 1));
		template.add("type", symtab.retrieve(id).getDeclNode().getEntityType().toString());

		return template;
	}

	public void closeScope() {
		symtab.closeScope();
	}

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

	protected int getNewLabelNumber() {
		return currentLabelNumber++;
	}

	protected ST getTemplate(String name) {
		return templates.getInstanceOf(name);
	}

	public void openScope() {
		symtab.openScope();
	}

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

	public ST processBoolLiteral(LiteralNode v) {
		ST template = getTemplate("boolLiteral");

		template.add("value", v.getText());

		return template;
	}

	public ST processCharLiteral(LiteralNode v) {
		ST template = getTemplate("charLiteral");

		template.add("value", (int) v.getText().charAt(0));

		return template;
	}

	public ST processCompoundExpression(StilNode node) {
		ST template = getTemplate("compound_expression");

		for (int index = 0; index < node.getChildCount(); index++) {
			template.add("instructions", getChildST(node, index));
		}

		return template;
	}

	public ST processIdOperand(IdNode node) {
		String id = node.getText(); // Retrieve the identifier name

		ST template = getTemplate("idOperand");
		template.add("varnum", symtab.retrieve(id).getVarnum());
		template.add("id", id);
		template.add("type", symtab.retrieve(id).getDeclNode().getEntityType().toString());

		return template;
	}

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

	public ST processIntLiteral(LiteralNode v) {
		ST template = getTemplate("intLiteral");

		template.add("value", v.getText());

		return template;
	}

	public ST processPrintStatement(ExprNode node) {
		ST template = getTemplate("printMultiple");

		for (int index = 0; index < node.getChildCount(); index++) {
			ExprNode expression = (ExprNode) node.getChild(index);

			ST statement = null;
			statement = getTemplate("print");
			statement.add("expression", expression.getST());
			statement.add("type", expression.getEntityTypeString());

			template.add("statements", statement);
		}

		node.setST(template);

		return template;
	}

	public ST processReadStatement(ExprNode node) {
		ST template = getTemplate("readMultiple");

		ArrayList<HashMap<String, String>> vars = new ArrayList<>();
		
		for (Object varNode : node.getChildren()) {
			String id = ((StilNode) varNode).getText(); // Retrieve the identifier name
			HashMap<String, String> properties = new HashMap<>();
			properties.put("label", "" + getNewLabelNumber());
			properties.put("type", getEntityTypeString(id));
			properties.put("varnum", "" + getVarnum(id));
			properties.put("id", id);
			vars.add(properties);
		}
		
		template.add("variables", vars);
		template.add("localtop", symtab.localTop + 1);

		node.setST(template);

		return template;
	}

	public ST processProgram(StilNode node) {
		ST template = getTemplate("program");

		for (int index = 0; index < node.getChildCount(); index++) {
			template.add("instructions", getChildST(node, index));
		}

		return template;
	}

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

	public ST processVarDeclaration(DeclNode node, IdNode id) {
		try {
			symtab.enter(id.getText(), new MachineEntry(node));

		} catch (SymbolTableException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * Returns the StringTemplate of a child
	 *
	 * @param node
	 *            Root node
	 * @param index
	 *            Index of the child
	 * @return
	 */
	protected static ST getChildST(StilNode node, int index) {
		return ((StilNode) node.getChild(index)).getST();
	}

	protected String getEntityTypeString(String id) {
		return symtab.retrieve(id).getDeclNode().getEntityTypeString();
	}

	protected Integer getVarnum(String id) {
		return symtab.retrieve(id).getVarnum();
	}
}
