package worldwideburgercompany.abrahamsburgers;

import worldwideburgercompany.Menu;
import worldwideburgercompany.MenuFactory;
import worldwideburgercompany.beverages.AppleJuice;

public class AbrahamsVeggieMenuFactory implements MenuFactory {

	AbrahamsHealthFibreBurgerFactory abrahamsHealthFibreBurgerFactory;

	public AbrahamsVeggieMenuFactory() {
		abrahamsHealthFibreBurgerFactory = new AbrahamsHealthFibreBurgerFactory();
	}
	
	@Override
	public Menu create() {
		AbrahamsHealthFibreBurger burger = abrahamsHealthFibreBurgerFactory.create();
		AppleJuice juice = new AppleJuice();
		return new Menu(burger, juice);
	}

}
