package worldwideburgercompany.beetlejuiceburgers;

import simpleburgerstore.Burger;

public class BeetlejuiceBeanBurger implements Burger {

	@Override
	public void make() {
		getBun();
		getPattie();
		addFibreThings();
	}

	@Override
	public void getBun() {
		System.out.println("getting a toasted bun somewhere");
	}

	@Override
	public void getPattie() {
		System.out.println("getting a grilled vegetarian soybean pattie");
	}
	
	private void addFibreThings() {
		System.out.println("adding healthy scrunchies");
	}

}
