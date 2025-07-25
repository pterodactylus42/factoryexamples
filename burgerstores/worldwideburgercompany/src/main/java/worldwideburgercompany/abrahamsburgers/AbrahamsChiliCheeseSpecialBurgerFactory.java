package worldwideburgercompany.abrahamsburgers;

import ubiquitousburgerstore.AbstractGenericBurgerFactory;

public class AbrahamsChiliCheeseSpecialBurgerFactory extends AbstractGenericBurgerFactory<AbrahamsChiliCheeseSpecialBurger> {

	@Override
	protected AbrahamsChiliCheeseSpecialBurger createBurger() {
		return new AbrahamsChiliCheeseSpecialBurger();
	}

}
