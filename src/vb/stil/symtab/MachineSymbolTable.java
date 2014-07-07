package vb.stil.symtab;

/**
 * Symbol table especially for use when generating code
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class MachineSymbolTable extends SymbolTable<MachineEntry> {
	/**
	 * Keeping track of the top height for the current scope to be able to assign variable storage numbers
	 */
	public int localTop = 0;

	/**
	 * @see SymbolTable#closeScope()
	 */
	@Override
	public void closeScope() {
		localTop -= scopeStack.peek().size();

		super.closeScope();
	}

	/**
	 * @see SymbolTable@enter()
	 */
	@Override
	public void enter(String id, MachineEntry entry) throws SymbolTableException {
		localTop += 1;

		super.enter(id, entry);

		entry.setVarnum(localTop);
	}

	/**
	 * @see SymbolTable@retrieve()
	 */
	@Override
	public MachineEntry retrieve(String id) {
		return super.retrieve(id);
	}

}
