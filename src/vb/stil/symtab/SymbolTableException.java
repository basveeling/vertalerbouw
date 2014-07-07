package vb.stil.symtab;

/**
 * Exception class for symbol table exceptions
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
@SuppressWarnings("serial")
public class SymbolTableException extends Exception {
	public SymbolTableException(String msg) {
		super(msg);
	}
}
