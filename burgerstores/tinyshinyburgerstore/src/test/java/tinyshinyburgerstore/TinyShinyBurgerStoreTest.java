package tinyshinyburgerstore;

import junit.framework.TestCase;
import simpleburgerstore.Burger;
import simpleburgerstore.SimpleBurger;
import tinyburgerstore.CheeseBurger;
import tinyburgerstore.ChiliCheeseBurger;

public class TinyShinyBurgerStoreTest extends TestCase
{
	public void testTinyShinyBurgerStore() throws Exception {
		System.out.println("Ordering a SimpleBurger:");
		SimpleShinyBurgerFactory simpleBurgerFactory = new SimpleShinyBurgerFactory();
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
