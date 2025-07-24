package tinyburgerstore;

import junit.framework.TestCase;
import simpleburgerstore.Burger;
import simpleburgerstore.SimpleBurger;
import simpleburgerstore.SimpleBurgerFactory;

public class TinyBurgerStoreTest extends TestCase
{
	public void testTinyBurgerStore() throws Exception {
		System.out.println("Ordering a SimpleBurger:");
		SimpleBurgerFactory simpleBurgerFactory = new SimpleBurgerFactory();
		Burger burger = simpleBurgerFactory.create();
		assertTrue(burger.getClass().equals(SimpleBurger.class));
		
		System.out.println("Ordering a CheeseBurger:");
		CheeseBurgerFactory cheeseBurgerFactory = new CheeseBurgerFactory();
		burger = cheeseBurgerFactory.create();
		assertTrue(burger.getClass().equals(CheeseBurger.class));
		
		System.out.println("Ordering a ChiliCheeseBurger:");
		ChiliCheeseBurgerFactory chiliCheeseBurgerFactory = new ChiliCheeseBurgerFactory();
		burger = chiliCheeseBurgerFactory.create();
		assertTrue(burger.getClass().equals(ChiliCheeseBurger.class));
	}

}
