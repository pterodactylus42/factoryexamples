package worldwideburgercompany.abrahamsburgers;

import worldwideburgercompany.Menu;
import worldwideburgercompany.MenuFactory;
import worldwideburgercompany.beverages.Cola;

public class AbrahamsMeatMenuFactory implements MenuFactory {

	AbrahamsChiliCheeseSpecialBurgerFactory abrahamsChiliCheeseSpecialBurgerFactory;

	public AbrahamsMeatMenuFactory() {
		abrahamsChiliCheeseSpecialBurgerFactory = new AbrahamsChiliCheeseSpecialBurgerFactory();
	}
	
	@Override
	public Menu create() {
		AbrahamsChiliCheeseSpecialBurger burger = abrahamsChiliCheeseSpecialBurgerFactory.create();
		Cola cola = new Cola();
		return new Menu(burger, cola);
	}

}
