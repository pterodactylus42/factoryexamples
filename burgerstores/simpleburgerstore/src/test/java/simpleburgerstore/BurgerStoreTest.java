package simpleburgerstore;

import junit.framework.TestCase;

public class BurgerStoreTest extends TestCase {
	
	public void testSimpleBurgerFactory() throws Exception {
		SimpleBurgerFactory simpleBurgerFactory = new SimpleBurgerFactory();
		assertNotNull(simpleBurgerFactory);
		Burger burger = simpleBurgerFactory.create();
		assertNotNull(burger);
	}

	public void testBurgerStore() throws Exception {
		BurgerStore burgerStore = new BurgerStore();
		Burger burger = burgerStore.getBurger();
		assertNotNull(burger);
		assertTrue(burger instanceof SimpleBurger);
	}

}
