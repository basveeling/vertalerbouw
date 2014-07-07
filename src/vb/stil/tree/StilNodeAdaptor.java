package vb.stil.tree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

/**
 * Adaptor for creating Stil nodes.
 *
 * @author Bas Veeling
 * @author Jarno van Leeuwen
 * @version 7-7-2014
 */
public class StilNodeAdaptor extends CommonTreeAdaptor {
	
	/**
	 * We must override this method to make sure ANTLR creates nodes of the right type
	 *
	 * @see CommonTreeAdaptor#create()
	 */
	@Override
	public Object create(Token token) {
		return new StilNode(token);
	}
	
	/**
	 * We must override this method to make sure ANTLR duplicates nodes the right way
	 *
	 * @see CommonTreeAdaptor#dupNode()
	 */
	@Override
	public Object dupNode(Object t) {
		if (null == t) {
			return null;
		}
		return create(((StilNode) t).token);
	}

	/**
	 * We must override this method to make sure ANTLR retrieves the token of StilNodes the right way
	 *
	 * @see CommonTreeAdaptor#getToken()
	 */
	@Override
	public Token getToken(Object t) {
		if (t instanceof StilNode) {
			return ((StilNode) t).getToken();
		}
		return null;
	}

}
