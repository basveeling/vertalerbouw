package vb.stil.symtab;

public class MachineSymbolTable extends SymbolTable<MachineEntry> {
	public int localTop = 0;

	public MachineSymbolTable() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void closeScope() {
		localTop -= scopeStack.peek().size();
		super.closeScope();
	}

	@Override
	public void enter(String id, MachineEntry entry)
			throws SymbolTableException {
		localTop += 1;
		super.enter(id, entry);
		entry.setVarnum(localTop);
	}

	@Override
	public MachineEntry retrieve(String id) {
		return super.retrieve(id);
	}

}
