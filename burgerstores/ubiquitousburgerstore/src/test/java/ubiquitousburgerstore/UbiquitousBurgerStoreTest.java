package ubiquitousburgerstore;

import junit.framework.TestCase;
import simpleburgerstore.SimpleBurger;
import tinyburgerstore.CheeseBurger;
import tinyburgerstore.ChiliCheeseBurger;

public class UbiquitousBurgerStoreTest extends TestCase
{
	
	public void testUbiquitousBurgerStore() throws Exception {
		System.out.println("Ordering a SimpleBurger:");
		SimpleBurgerFactory simpleBurgerFactory = new SimpleBurgerFactory();
		SimpleBurger simpleBurger = simpleBurgerFactory.create();
		assertNotNull(simpleBurger);
		
		System.out.println("Ordering a CheeseBurger:");
		CheeseBurgerFactory cheeseBurgerFactory = new CheeseBurgerFactory();
		CheeseBurger cheeseBurger = cheeseBurgerFactory.create();
		assertNotNull(cheeseBurger);
		
		System.out.println("Ordering a ChiliCheeseBurger:");
		ChiliCheeseBurgerFactory chiliCheeseBurgerFactory = new ChiliCheeseBurgerFactory();
		ChiliCheeseBurger chiliCheeseBurger = chiliCheeseBurgerFactory.create();
		assertNotNull(chiliCheeseBurger);
	}

}
