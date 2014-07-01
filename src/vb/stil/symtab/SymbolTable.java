package vb.stil.symtab;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class SymbolTable<Entry extends IdEntry> {
	
	private int currentLevel = 0;
	
	private final Map<String, Stack<Entry>> symtab;
	private final Stack<List<String>> scopeStack;
	
	public SymbolTable() {
		this.currentLevel = -1;
		this.symtab = new TreeMap<>();
		this.scopeStack = new Stack<>();
	}
	
	public void openScope() {
		currentLevel++;
		scopeStack.push(new ArrayList<String>());
	}

	public void closeScope() {
		if (currentLevel > -1) {
			currentLevel--;
			
			for (String identifier : scopeStack.pop()) {
				symtab.get(identifier).pop();
			}
		}
	}
	
	public int currentLevel() {
		return currentLevel;
	}
	
	public void enter(String id, Entry entry) throws SymbolTableException {
		List<String> top = scopeStack.pop();

		if (top.contains(id)) {
			scopeStack.push(top);
			throw new SymbolTableException("Entry already declared on current level");
		}

		entry.setLevel(currentLevel);
		
		Stack<Entry> entryStack = symtab.get(id);
		
		if (entryStack == null) {
			Stack<Entry> newStack = new Stack<>();
			
			newStack.push(entry);
			
			symtab.put(id, newStack);
		} else {
			entryStack.push(entry);
		}

		top.add(id);
		
		scopeStack.push(top);
	}

	public Entry retrieve(String id) {
		Entry result = null;
		
		Stack<Entry> entryStack = symtab.get(id);
		
		if (entryStack != null && !entryStack.empty()) {
			result = entryStack.peek();
		}
		
		return result;
	}
}
