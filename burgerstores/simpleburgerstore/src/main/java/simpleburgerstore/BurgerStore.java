package simpleburgerstore;

public class BurgerStore {
	private BurgerFactory burgerFactory;
	
	BurgerStore() {
		this.burgerFactory = new SimpleBurgerFactory();
	}
	
	Burger getBurger() {
		Burger burger = burgerFactory.create();
		return burger;
	}
}
