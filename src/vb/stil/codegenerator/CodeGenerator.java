package vb.stil.codegenerator;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import vb.stil.tree.ExprNode;
import vb.stil.tree.LiteralNode;
import vb.stil.tree.LogicExprNode;
import vb.stil.tree.StilNode;

public class CodeGenerator {
	private static final String groupFile = "src/vb/stil/codegenerator/jasmin.stg";

	protected STGroup templates;
	
	public CodeGenerator() {
		templates = new STGroupFile(CodeGenerator.groupFile);
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

		node.setST(template);

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

			index++;
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
}
