package vb.stil.codegenerator;

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
import vb.stil.tree.StilNode;

public class CodeGenerator {
	private static final String groupFile = "src/vb/stil/codegenerator/jasmin.stg";

	protected STGroup templates;
	protected MachineSymbolTable symtab = new MachineSymbolTable();
	
	protected int currentLabelNumber = 0;

	public CodeGenerator() {
		templates = new STGroupFile(CodeGenerator.groupFile);
		symtab.openScope();
	}

	protected ST getTemplate(String name) {
		return templates.getInstanceOf(name);
	}

	public ST charLiteral(LiteralNode v) {
		ST template = getTemplate("charLiteral");

		template.add("value", v.getText());

		return template;
	}

	public ST intLiteral(LiteralNode v) {
		ST template = getTemplate("intLiteral");

		template.add("value", v.getText());

		return template;
	}

	public ST processBinaryLogicExpression(LogicExprNode node) {
		ST template = null;

		template = getTemplate(node.getOperator().getTemplateName());
		template.add("expr1", getChildST(node, 0));
		template.add("expr2", getChildST(node, 1));

		// some operators require labels to operate
		switch (node.getOperator()) {
			case LT:
				template.add("label1", getLabel());
				template.add("label2", getLabel());
				break;
			default:
				break;
		}

		node.setST(template);

		return template;
	}

	public ST varDeclaration(DeclNode node, IdNode id) {
		try {
			symtab.enter(id.getText(), new MachineEntry(node));

		} catch (SymbolTableException e) {
			e.printStackTrace();
		}

		return null;
	}

	public ST constDeclaration(DeclNode node, IdNode id) {
		ST template = null;

		try {
			String idname = id.getText(); // Retrieve the identifier name

			symtab.enter(idname, new MachineEntry(node));

			template = getTemplate("becomes");
			template.add("id", id);
			template.add("varnum", symtab.retrieve(idname).getVarnum());
			template.add("expression", getChildST(node, 2));
		} catch (SymbolTableException e) {
			e.printStackTrace();
		}
		
		return template;
	}

	public ST becomes(ExprNode node) {
		ST template = getTemplate("becomes");
		String id = node.getChild(0).getText(); // Retrieve the identifier name

		template.add("id", id);
		template.add("varnum", symtab.retrieve(id).getVarnum());
		template.add("expression", getChildST(node, 1));

		return template;
	}

	public ST idOperand(IdNode node) {
		String id = node.getText(); // Retrieve the identifier name

		ST template = getTemplate("idOperand");
		template.add("varnum", symtab.retrieve(id).getVarnum());
		template.add("type", symtab.retrieve(id).getDeclNode().getEntityType().toString());

		return template;
	}

	public ST processUnaryLogicExpression(LogicExprNode node) {
		ST template = null;

		template = getTemplate(node.getOperator().getTemplateName());
		template.add("expr1", getChildST(node, 0));

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

	public ST processPrintStatement(ExprNode node) {
		ST template = getTemplate("printMultiple");

		for (int index = 0; index < node.getChildCount(); index++) {
			ExprNode expression = (ExprNode) node.getChild(index);

			ST statement = null;

			switch (expression.getEntityType()) {
				case CHAR:
					statement = getTemplate("printChar");
					statement.add("expression", expression.getST());
					break;
				case INT:
					statement = getTemplate("printInt");
					statement.add("expression", expression.getST());
					break;
				default:
					break;
			}

			template.add("statements", statement);
		}
		node.setST(template);

		return template;
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
	
	protected int getLabel() {
		return currentLabelNumber++;
	}
}
