/**
 *
 */
package vb.stil.tree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.stringtemplate.v4.ST;

/**
 * @author basveeling
 *
 */
public class StilNode extends CommonTree {

	/**
	 * StringTemplate holder
	 */
	private ST st = null;
	
	/**
	 *
	 */
	public StilNode() {
		super();
	}
	
	/**
	 * @param node
	 */
	public StilNode(CommonTree node) {
		super(node);
	}
	
	/**
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

	@Override
	public StilNode dupNode() {
		return new StilNode(this);
	}
	
}
