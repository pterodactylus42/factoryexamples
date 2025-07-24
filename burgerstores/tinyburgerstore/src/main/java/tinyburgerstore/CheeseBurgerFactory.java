package tinyburgerstore;

import simpleburgerstore.Burger;
import simpleburgerstore.BurgerFactory;

public class CheeseBurgerFactory implements BurgerFactory {

	@Override
	public Burger create() {
		CheeseBurger cheeseBurger = new CheeseBurger();
		cheeseBurger.make();
		return cheeseBurger;
	}

}
