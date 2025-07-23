package simpleburgerstore;

public class SimpleBurger implements Burger {

	@Override
	public void make() {
		getBun();
		getPattie();
		putTogether();
	}

	@Override
	public void getBun() {
		System.out.println("getting a toasted bun somewhere");
	}

	@Override
	public void getPattie() {
		System.out.println("getting a grilled pattie");
	}
	
	private void putTogether() {
		System.out.println("putting things together");		
	}

}
