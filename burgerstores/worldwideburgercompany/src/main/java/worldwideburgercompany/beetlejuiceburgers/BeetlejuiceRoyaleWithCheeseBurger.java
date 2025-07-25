package worldwideburgercompany.beetlejuiceburgers;

import simpleburgerstore.Burger;

public class BeetlejuiceRoyaleWithCheeseBurger implements Burger {

	@Override
	public void make() {
		getBun();
		getPattie();
		addSpicySauceAndCheese();
	}

	@Override
	public void getBun() {
		System.out.println("getting a toasted bun somewhere");
	}

	@Override
	public void getPattie() {
		System.out.println("getting a grilled meat pattie");
	}
	
	private void addSpicySauceAndCheese() {
		System.out.println("adding spicy sauce and a huge amount of cheese");
	}

}
