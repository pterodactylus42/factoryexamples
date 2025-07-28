package worldwideburgercompany;

import simpleburgerstore.Burger;
import worldwideburgercompany.beverages.Drink;

public class Menu {
	
	Burger burger;
	Drink drink;
	
	public Menu(Burger burger, Drink drink) {
		this.burger = burger;
		this.drink = drink;
	}

	public Burger getBurger() {
		return burger;
	}

	public Drink getDrink() {
		return drink;
	}
	
}
