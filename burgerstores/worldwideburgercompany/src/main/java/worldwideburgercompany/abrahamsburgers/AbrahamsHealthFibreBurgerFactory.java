package worldwideburgercompany.abrahamsburgers;

import simpleburgerstore.BurgerFactory;

public class AbrahamsHealthFibreBurgerFactory implements BurgerFactory {

	@Override
	public AbrahamsHealthFibreBurger create() {
		AbrahamsHealthFibreBurger burger = new AbrahamsHealthFibreBurger();
		burger.make();
		return burger;		
	}

}
