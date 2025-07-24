package ubiquitousburgerstore;

import simpleburgerstore.Burger;
import simpleburgerstore.BurgerFactory;

/**
 * This Factory gives you typesafe Burgers. Compare {@link tinyshinyburgerstore.TinyShinyBurgerStoreTest} and {@link ubiquitousburgerstore.UbiquitousBurgerStoreTest} to see how.
 * @see Burger
 * @param <B>
 */
public abstract class AbstractGenericBurgerFactory<B extends Burger> implements BurgerFactory {
	
	@Override
	public B create() {
		B burger = createBurger();
		burger.make();
		return burger;		
	}
	
	protected abstract B createBurger();
	
}
