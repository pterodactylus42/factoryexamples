package tinyburgerstore;

public class CheeseBurger implements TinyBurger {

	@Override
	public void make() {
		getBun();
		getPattie();
		getCheese();
	}

	@Override
	public void getBun() {
		System.out.println("getting a toasted bun somewhere");
	}

	@Override
	public void getPattie() {
		System.out.println("getting a grilled pattie");
	}

	@Override
	public void getCheese() {
		System.out.println("getting cheese");
	}

	@Override
	public void getChili() {
		// unused
	}

}
