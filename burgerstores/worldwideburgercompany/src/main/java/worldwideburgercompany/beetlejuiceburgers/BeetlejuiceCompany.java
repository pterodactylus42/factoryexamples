package worldwideburgercompany.beetlejuiceburgers;

import simpleburgerstore.Burger;
import worldwideburgercompany.Company;
import worldwideburgercompany.Menu;

/**
 * This Company uses the ubiquitous burgerstore. 
 * It sells only Cola with the menus.
 */
public class BeetlejuiceCompany implements Company {
	
	BeetlejuiceBeanBurgerFactory beetlejuiceBeanBurgerFactory;
	BeetlejuiceRoyaleWithCheeseBurgerFactory beetlejuiceRoyaleWithCheeseBurgerFactory;
	BeetlejuiceMeatMenuFactory beetlejuiceMeatMenuFactory = new BeetlejuiceMeatMenuFactory();
	BeetlejuiceVeggieMenuFactory beetlejuiceVeggieMenuFactory = new BeetlejuiceVeggieMenuFactory();
	
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

	@Override
	public Menu getVeggieMenu() {
		return beetlejuiceVeggieMenuFactory.create();
	}

	@Override
	public Menu getMeatMenu() {
		return beetlejuiceMeatMenuFactory.create();
	}

}
