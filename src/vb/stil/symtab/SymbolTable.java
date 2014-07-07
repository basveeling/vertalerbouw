package vb.stil.symtab;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/**
 * A symbol table for keeping track of declared identifiers and their scope
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class SymbolTable<Entry extends IdEntry> {
	
	private int currentLevel = 0;
	
	protected final Map<String, Stack<Entry>> symtab;

	/**
	 * A scope stack is introduced for improved performance when closing a scope
	 */
	protected final Stack<List<String>> scopeStack;
	
	/**
	 * Initialise a symbol table
	 */
	public SymbolTable() {
		this.currentLevel = -1;
		this.symtab = new TreeMap<>();
		this.scopeStack = new Stack<>();
	}
	
	/**
	 * Open a new scope
	 */
	public void openScope() {
		currentLevel++;
		scopeStack.push(new ArrayList<String>());
	}
	
	/**
	 * Close the current scope, deleting declarations and updating assignment statuses accordingly
	 */
	public void closeScope() {
		if (currentLevel > -1) {
			currentLevel--;
			
			for (String identifier : scopeStack.pop()) {
				symtab.get(identifier).pop();
			}
			
			for (String identifier : symtab.keySet()) {
				Stack<Entry> identifierStack = symtab.get(identifier);
				if (identifierStack.size() > 0) {
					identifierStack.peek().setUnassignedForScope(currentLevel);
				}
			}
		}
	}
	
	/**
	 * Retrieve the current scope level
	 *
	 * @return int
	 */
	public int currentLevel() {
		return currentLevel;
	}
	
	/**
	 * Add an identifier and the corresponding entry object to the symbol table at the current scope level
	 *
	 * @param id
	 * @param entry
	 * @throws SymbolTableException
	 *             Entry already declared on current scope level
	 */
	public void enter(String id, Entry entry) throws SymbolTableException {
		List<String> top = scopeStack.peek();
		
		if (top.contains(id)) {
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
	}
	
	/**
	 * Retrieve the entry object corresponding to the given identifier at the nearest scope
	 *
	 * @param id
	 * @return Entry
	 */
	public Entry retrieve(String id) {
		Entry result = null;
		
		Stack<Entry> entryStack = symtab.get(id);
		
		if (entryStack != null && !entryStack.empty()) {
			result = entryStack.peek();
		}
		
		return result;
	}
}
