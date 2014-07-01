package vb.stil.codegenerator;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import vb.stil.tree.LiteralNode;

public abstract class CodeGenerator {
	protected final STGroup templates;
	
	public CodeGenerator(String groupFilePath) {
		templates = new STGroupFile(groupFilePath);
	}

	protected ST getTemplate(String name) {
		return templates.getInstanceOf(name);
	}

	public abstract ST intLiteral(LiteralNode v);
	
	public abstract ST printStatement();
	
	public abstract ST program();
}
