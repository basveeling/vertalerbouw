package vb.stil;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

@SuppressWarnings("serial")
public class StilException extends RecognitionException {
	private final String message;

	public StilException(String message) {
		super();
		this.message = message;
	}

	public StilException(Tree tree, String message) {
		super();
		this.message = tree.getText() + " (" + tree.getLine() + ":" + tree.getCharPositionInLine() + ") " + message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
