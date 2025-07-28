package worldwideburgercompany;

import simpleburgerstore.Burger;

public interface Company {
	Burger getVegetarianBurger();
	Burger getMeatBurger();
	Menu getVeggieMenu();
	Menu getMeatMenu();
}
