package tinyshinyburgerstore;

import simpleburgerstore.SimpleBurger;

public class SimpleShinyBurgerFactory extends AbstractBurgerFactory {

	@Override
	protected SimpleBurger createBurger() {
		return new SimpleBurger();
	}

}
