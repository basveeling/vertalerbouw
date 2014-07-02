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
import vb.stil.tree.StilNode;

public class CodeGenerator {
	private static final String groupFile = "src/vb/stil/codegenerator/jasmin.stg";

	protected STGroup templates;
	protected MachineSymbolTable symtab = new MachineSymbolTable();

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

	public ST program(StilNode node) {
		ST template = getTemplate("program");

		for (int index = 0; index < node.getChildCount(); index++) {
			StilNode expression = (StilNode) node.getChild(index);

			template.add("instructions", expression.getST());
		}

		return template;
	}

	public ST varDeclaration(DeclNode node,IdNode id) {
		try {
			symtab.enter(id.getText(), new MachineEntry(node));

		} catch (SymbolTableException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ST becomes(ExprNode node) {
		ST template = getTemplate("becomes");
		String id = node.getChild(0).getText(); //Retrieve the identifier name

		template.add("id",id);
		template.add("varnum",symtab.retrieve(id).getVarnum());
		template.add("expression",((ExprNode) node.getChild(1)).getST());

		return template;
	}


	public ST idOperand(IdNode node) {
		ST template = getTemplate("idOperand");
		String id = node.getText(); //Retrieve the identifier name
		template.add("varnum", symtab.retrieve(id).getVarnum());
		template.add("type", symtab.retrieve(id).getDeclNode().getEntityType().toString());

		return template;
	}
	public ST printStatement(ExprNode node) {
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

		return template;
	}
}
