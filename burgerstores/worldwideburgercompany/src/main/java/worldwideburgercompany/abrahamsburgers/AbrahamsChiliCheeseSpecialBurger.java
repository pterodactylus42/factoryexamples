package worldwideburgercompany.abrahamsburgers;

import simpleburgerstore.Burger;

public class AbrahamsChiliCheeseSpecialBurger implements Burger {

	@Override
	public void make() {
		getBun();
		getPattie();
		addChiliCheeseSpecial();
	}

	@Override
	public void getBun() {
		System.out.println("getting a toasted bun somewhere");
	}

	@Override
	public void getPattie() {
		System.out.println("getting a grilled meat pattie");
	}
	
	private void addChiliCheeseSpecial() {
		System.out.println("adding chili cheese special");
	}

}
