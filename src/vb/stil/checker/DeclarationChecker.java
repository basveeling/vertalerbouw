package vb.stil.checker;

import vb.stil.exceptions.StilException;
import vb.stil.symtab.IdEntry;
import vb.stil.symtab.SymbolTable;
import vb.stil.symtab.SymbolTableException;
import vb.stil.tree.DeclNode;
import vb.stil.tree.EntityType;
import vb.stil.tree.StilNode;

public class DeclarationChecker {
	/**
	 * Process a declaration by registering relevant properties
	 *
	 * @param node
	 * @param type
	 * @param id
	 * @param symtab
	 * @param kind
	 * @throws StilException
	 */
	public void processDeclaration(DeclNode node, StilNode id, EntityType type, DeclNode.Kind kind, SymbolTable<IdEntry> symtab) throws StilException {
		node.setEntityType(type);
		node.setKind(kind);

		try {
			IdEntry entry = new IdEntry();
			
			entry.setLevel(symtab.currentLevel());
			entry.setDeclNode(node);
			
			symtab.enter(id.getText(), entry);
		} catch (SymbolTableException e) {
			throw new StilException(node, e.getMessage());
		}
	}

	/**
	 * Process a constant declaration by registering relevant properties
	 *
	 * @param node
	 * @param type
	 * @param id
	 * @param symtab
	 * @throws StilException
	 */
	public void processConstantDeclaration(StilNode node, StilNode id, EntityType type, SymbolTable<IdEntry> symtab) throws StilException {
		processDeclaration((DeclNode) node, id, type, DeclNode.Kind.CONST, symtab);
	}

	/**
	 * Process a variable declaration by registering relevant properties
	 *
	 * @param node
	 * @param type
	 * @param id
	 * @param symtab
	 * @throws StilException
	 */
	public void processVariableDeclaration(StilNode node, StilNode id, EntityType type, SymbolTable<IdEntry> symtab) throws StilException {
		processDeclaration((DeclNode) node, id, type, DeclNode.Kind.VAR, symtab);
	}

	/**
	 * Validate the declaration and retrieves the type of the given identifier
	 *
	 * @param node
	 * @param id
	 * @param symtab
	 * @return
	 * @throws StilException
	 */
	public EntityType retrieveDeclaration(StilNode node, StilNode id, SymbolTable<IdEntry> symtab) throws StilException {
		IdEntry symbol = symtab.retrieve(id.getText());
		
		if (symbol == null) {
			throw new StilException(node, "use of undeclared identifier");
		}
		
		return symbol.getDeclNode().getEntityType();
	}

	/**
	 * Validate the declaration and retrieves the type of the given identifier, in the context of multiple parameters
	 *
	 * @param node
	 * @param id
	 * @param symtab
	 * @return
	 * @throws StilException
	 */
	public EntityType retrieveMultipleDeclaration(StilNode node, StilNode id, SymbolTable<IdEntry> symtab) throws StilException {
		retrieveDeclaration(node, id, symtab);
		
		return EntityType.VOID;
	}
}
