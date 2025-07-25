package worldwideburgercompany.beetlejuiceburgers;

import simpleburgerstore.Burger;
import worldwideburgercompany.Company;

/**
 * This Company uses the ubiquitous burgerstore
 */
public class BeetlejuiceCompany implements Company {
	
	BeetlejuiceBeanBurgerFactory beetlejuiceBeanBurgerFactory;
	BeetlejuiceRoyaleWithCheeseBurgerFactory beetlejuiceRoyaleWithCheeseBurgerFactory;
	
	public BeetlejuiceCompany() {
		beetlejuiceBeanBurgerFactory = new BeetlejuiceBeanBurgerFactory();
		beetlejuiceRoyaleWithCheeseBurgerFactory = new BeetlejuiceRoyaleWithCheeseBurgerFactory();
	}

	@Override
	public Burger getVegetarianBurger() {
		return beetlejuiceBeanBurgerFactory.create();
	}

	@Override
	public Burger getMeatBurger() {
		return beetlejuiceRoyaleWithCheeseBurgerFactory.create();
	}

}
