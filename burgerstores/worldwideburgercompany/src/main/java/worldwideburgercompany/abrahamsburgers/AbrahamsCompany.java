package worldwideburgercompany.abrahamsburgers;

import simpleburgerstore.Burger;
import worldwideburgercompany.Company;
import worldwideburgercompany.Menu;

/**
 * This Company wants to launch a whole new Product line with healthy burgers. 
 * So it has two different Factory setups: 
 * One that directly uses the AbstractGenericBurgerFactory and produces a Burger that belongs to the interface Burger. 
 * The other uses the new HealthyBurger. A completely independent new interface for the HealthyBurger would cause Problems with the Company interface, 
 * which implies that every Burger should comply with the Burger interface.
 * So the HealthyBurger extends Burger, and therefore has the unneeded getPattie.
 * It sells different drinks with the menus.
 */
public class AbrahamsCompany implements Company {
	
	AbrahamsHealthFibreBurgerFactory abrahamsHealthFibreBurgerFactory;
	AbrahamsChiliCheeseSpecialBurgerFactory abrahamsChiliCheeseSpecialBurgerFactory;
	AbrahamsMeatMenuFactory abrahamsMeatMenuFactory;
	AbrahamsVeggieMenuFactory abrahamsVeggieMenuFactory;

	public AbrahamsCompany() {
		abrahamsHealthFibreBurgerFactory = new AbrahamsHealthFibreBurgerFactory();
		abrahamsChiliCheeseSpecialBurgerFactory = new AbrahamsChiliCheeseSpecialBurgerFactory();
		abrahamsMeatMenuFactory = new AbrahamsMeatMenuFactory();
		abrahamsVeggieMenuFactory = new AbrahamsVeggieMenuFactory();
	}
	
	@Override
	public HealthyBurger getVegetarianBurger() {
		return abrahamsHealthFibreBurgerFactory.create();
	}

	@Override
	public Burger getMeatBurger() {
		return abrahamsChiliCheeseSpecialBurgerFactory.create();
	}

	@Override
	public Menu getVeggieMenu() {
		return abrahamsVeggieMenuFactory.create();
	}

	@Override
	public Menu getMeatMenu() {
		return abrahamsMeatMenuFactory.create();
	}

}
