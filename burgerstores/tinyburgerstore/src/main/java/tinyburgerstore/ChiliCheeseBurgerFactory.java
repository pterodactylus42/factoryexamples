package tinyburgerstore;

import simpleburgerstore.Burger;
import simpleburgerstore.BurgerFactory;

public class ChiliCheeseBurgerFactory implements BurgerFactory {

	@Override
	public Burger create() {
		ChiliCheeseBurger chiliCheeseBurger = new ChiliCheeseBurger();
		chiliCheeseBurger.make();
		return chiliCheeseBurger;
	}

}
