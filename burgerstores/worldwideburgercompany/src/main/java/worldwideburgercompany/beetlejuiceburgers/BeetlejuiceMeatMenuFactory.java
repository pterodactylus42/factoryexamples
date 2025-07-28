package worldwideburgercompany.beetlejuiceburgers;

import worldwideburgercompany.Menu;
import worldwideburgercompany.MenuFactory;
import worldwideburgercompany.beverages.Cola;

public class BeetlejuiceMeatMenuFactory implements MenuFactory {
	
	BeetlejuiceRoyaleWithCheeseBurgerFactory beetlejuiceRoyaleWithCheeseBurgerFactory = new BeetlejuiceRoyaleWithCheeseBurgerFactory();

	@Override
	public Menu create() {
		BeetlejuiceRoyaleWithCheeseBurger burger = beetlejuiceRoyaleWithCheeseBurgerFactory.create();
		Cola cola = new Cola();
		return new Menu(burger, cola);
	}

}
