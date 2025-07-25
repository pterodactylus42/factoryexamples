package worldwideburgercompany.beetlejuiceburgers;

import ubiquitousburgerstore.AbstractGenericBurgerFactory;

public class BeetlejuiceRoyaleWithCheeseBurgerFactory extends AbstractGenericBurgerFactory<BeetlejuiceRoyaleWithCheeseBurger> {

	@Override
	protected BeetlejuiceRoyaleWithCheeseBurger createBurger() {
		return new BeetlejuiceRoyaleWithCheeseBurger();
	}

}
