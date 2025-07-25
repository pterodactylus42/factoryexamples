package worldwideburgercompany.beetlejuiceburgers;

import ubiquitousburgerstore.AbstractGenericBurgerFactory;

public class BeetlejuiceBeanBurgerFactory extends AbstractGenericBurgerFactory<BeetlejuiceBeanBurger> {

	@Override
	protected BeetlejuiceBeanBurger createBurger() {
		return new BeetlejuiceBeanBurger();
	}

}
