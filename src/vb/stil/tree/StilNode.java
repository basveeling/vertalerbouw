package vb.stil.tree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.stringtemplate.v4.ST;

/**
 * Super node for the Stil language. Adds functionality to keep the StringTemplate corresponding to a node.
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class StilNode extends CommonTree {
	
	/**
	 * StringTemplate holder
	 */
	private ST st = null;

	/**
	 * Construct a StilNode
	 */
	public StilNode() {
		super();
	}

	/**
	 * Construct a StilNode
	 *
	 * @param node
	 *            CommonTree node
	 */
	public StilNode(CommonTree node) {
		super(node);
	}

	/**
	 * Construct a StilNode
	 *
	 * @param t
	 */
	public StilNode(Token t) {
		super(t);
	}
	
	public ST getST() {
		return st;
	}
	
	public void setST(ST st) {
		this.st = st;
	}
	
	/**
	 * We must override this method to make sure ANTLR duplicates this node the right way
	 *
	 * @see CommonTree#dupNode()
	 */
	@Override
	public StilNode dupNode() {
		return new StilNode(this);
	}

}
