package worldwideburgercompany.abrahamsburgers;

public class AbrahamsHealthFibreBurger implements HealthyBurger {

	@Override
	public void make() {
		getBun();
		getVegetarianPatty();
		addFibreThings();
	}

	@Override
	public void getBun() {
		System.out.println("getting a toasted bun somewhere");
	}

	private void addFibreThings() {
		System.out.println("adding healthy scrunchies");
	}

	@Override
	public void getVegetarianPatty() {
		System.out.println("getting a grilled vegetarian pattie");
	}

	@Override
	public void getNutritionFacts() {
		System.out.println("it is really good for you");
	}

	@Override
	public void getPattie() {
		// necessary due to inheritance
	}

}
