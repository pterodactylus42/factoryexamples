package simpleburgerstore;

public class SimpleBurger implements Burger {

	@Override
	public void make() {
		System.out.println("getting a toasted bun somewhere");
		System.out.println("getting a grilled pattie");
		System.out.println("putting things together");
	}

}
