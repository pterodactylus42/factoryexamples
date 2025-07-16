package simpleburgerstore;

public class SimpleBurgerFactory implements BurgerFactory {

	@Override
	public Burger create() {
		SimpleBurger simpleBurger = new SimpleBurger();
		simpleBurger.make();
		return simpleBurger;
	}

}
