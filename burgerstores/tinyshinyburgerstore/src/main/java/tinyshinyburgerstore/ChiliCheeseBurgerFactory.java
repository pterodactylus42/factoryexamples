package tinyshinyburgerstore;

import tinyburgerstore.ChiliCheeseBurger;

public class ChiliCheeseBurgerFactory extends AbstractBurgerFactory {

	@Override
	protected ChiliCheeseBurger createBurger() {
		return new ChiliCheeseBurger();
	}

}
