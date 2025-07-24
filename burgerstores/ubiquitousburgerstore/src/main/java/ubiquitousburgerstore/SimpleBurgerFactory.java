package ubiquitousburgerstore;

import simpleburgerstore.SimpleBurger;

public class SimpleBurgerFactory extends AbstractGenericBurgerFactory<SimpleBurger> {

	@Override
	protected SimpleBurger createBurger() {
		return new SimpleBurger();
	}

}
