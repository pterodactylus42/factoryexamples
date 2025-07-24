package ubiquitousburgerstore;

import tinyburgerstore.ChiliCheeseBurger;

public class ChiliCheeseBurgerFactory extends AbstractGenericBurgerFactory<ChiliCheeseBurger> {

	@Override
	protected ChiliCheeseBurger createBurger() {
		return new ChiliCheeseBurger();
	}

}
