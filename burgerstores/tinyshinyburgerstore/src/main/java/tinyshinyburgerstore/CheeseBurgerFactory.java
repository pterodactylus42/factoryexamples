package tinyshinyburgerstore;

import tinyburgerstore.CheeseBurger;

public class CheeseBurgerFactory extends AbstractBurgerFactory {

	@Override
	protected CheeseBurger createBurger() {
		return new CheeseBurger();
	}

}
