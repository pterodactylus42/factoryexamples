package ubiquitousburgerstore;

import tinyburgerstore.CheeseBurger;

public class CheeseBurgerFactory extends AbstractGenericBurgerFactory<CheeseBurger> {

	@Override
	protected CheeseBurger createBurger() {
		return new CheeseBurger();
	}

}
