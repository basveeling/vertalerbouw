/**
 *
 */
package vb.stil.tree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

/**
 * @author basveeling
 *
 */
public class StilNodeAdaptor extends CommonTreeAdaptor {
	
	@Override
	public Object create(Token token) {
		return new StilNode(token);
	}

	@Override
	public Object dupNode(Object t) {
		if (null == t) {
			return null;
		}
		return create(((StilNode) t).token);
	}
	
	@Override
	public Token getToken(Object t) {
		if (t instanceof StilNode) {
			return ((StilNode) t).getToken();
		}
		return null;
	}
	
}
