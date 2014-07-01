package vb.stil.codegenerator;

import org.stringtemplate.v4.ST;

import vb.stil.tree.LiteralNode;

public class JasminCodeGenerator extends CodeGenerator {
	private static final String groupFile = "src/vb/stil/codegenerator/jasmin.stg";

	public JasminCodeGenerator() {
		super(JasminCodeGenerator.groupFile);
	}
	
	@Override
	public ST intLiteral(LiteralNode v) {
		ST template = getTemplate("intLiteral");

		template.add("value", v.getText());
		
		return template;
	}

	@Override
	public ST program() {
		return getTemplate("jasminFile");
	}
	
	@Override
	public ST printStatement() {
		return getTemplate("printMultiple");
	}

	// Only for testing StringTemplate mechanics
	// TODO: remove
	public static void main(String[] args) {
		CodeGenerator gen = new JasminCodeGenerator();
		
		ST program = gen.getTemplate("jasminFile");

		program.add("maxStackDepth", 102);
		program.add("maxLocals", 100);

		ST intLiteral = gen.getTemplate("intLiteral");

		intLiteral.add("value", 2);

		program.add("instructions", intLiteral.render());
		
		System.out.println(program.render());
	}
}
