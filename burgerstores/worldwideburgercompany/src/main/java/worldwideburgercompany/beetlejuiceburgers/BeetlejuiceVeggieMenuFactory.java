package worldwideburgercompany.beetlejuiceburgers;

import worldwideburgercompany.Menu;
import worldwideburgercompany.MenuFactory;
import worldwideburgercompany.beverages.Cola;

public class BeetlejuiceVeggieMenuFactory implements MenuFactory {
	
	BeetlejuiceBeanBurgerFactory beetlejuiceBeanBurgerFactory = new BeetlejuiceBeanBurgerFactory();

	@Override
	public Menu create() {
		BeetlejuiceBeanBurger burger = beetlejuiceBeanBurgerFactory.create();
		Cola cola = new Cola();
		return new Menu(burger, cola);
	}

}
