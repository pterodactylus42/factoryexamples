package tinyburgerstore;

public class ChiliCheeseBurger implements TinyBurger {

	@Override
	public void make() {
		getBun();
		getPattie();
		getCheese();
		getChili();
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
		System.out.println("getting hot chili");
	}

}
