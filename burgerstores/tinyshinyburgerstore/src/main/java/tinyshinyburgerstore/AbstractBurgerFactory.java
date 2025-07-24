package tinyshinyburgerstore;

import simpleburgerstore.Burger;
import simpleburgerstore.BurgerFactory;

public abstract class AbstractBurgerFactory implements BurgerFactory {
	
	public Burger create() {
		Burger burger = createBurger();
		burger.make();
		return burger;		
	}
	
	protected abstract Burger createBurger();
	
}
