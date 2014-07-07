package vb.stil.exceptions;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/**
 * Exception class for exceptions associated with the Stil compiler
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
@SuppressWarnings("serial")
public class StilException extends RecognitionException {
	private final String message;

	/**
	 * Handle Stil exception with given message
	 *
	 * @param message
	 *            Exception description
	 */
	public StilException(String message) {
		super();
		this.message = message;
	}

	/**
	 * Handle Stil exception with given message, plus injecting the ANTLR Tree to provide detailed error information (line
	 * numbers etc.)
	 *
	 * @param tree
	 *            Tree instance
	 * @param message
	 *            Exception description
	 */
	public StilException(Tree tree, String message) {
		super();
		this.message = tree.getText() + " (" + tree.getLine() + ":" + tree.getCharPositionInLine() + ") " + message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
