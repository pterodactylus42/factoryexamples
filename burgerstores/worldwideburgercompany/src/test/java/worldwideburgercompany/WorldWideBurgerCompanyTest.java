package worldwideburgercompany;

import junit.framework.TestCase;
import simpleburgerstore.Burger;
import worldwideburgercompany.abrahamsburgers.AbrahamsChiliCheeseSpecialBurger;
import worldwideburgercompany.abrahamsburgers.AbrahamsCompany;
import worldwideburgercompany.abrahamsburgers.AbrahamsHealthFibreBurger;
import worldwideburgercompany.beetlejuiceburgers.BeetlejuiceBeanBurger;
import worldwideburgercompany.beetlejuiceburgers.BeetlejuiceCompany;
import worldwideburgercompany.beetlejuiceburgers.BeetlejuiceRoyaleWithCheeseBurger;
import worldwideburgercompany.beverages.AppleJuice;
import worldwideburgercompany.beverages.Cola;

public class WorldWideBurgerCompanyTest extends TestCase
{
	
	public void testAbrahamsBurgers() throws Exception {
		AbrahamsCompany abrahamsCompany = new AbrahamsCompany();
		Burger meatBurger = abrahamsCompany.getMeatBurger();
		assertTrue(meatBurger.getClass().equals(AbrahamsChiliCheeseSpecialBurger.class));
		Burger vegetarianBurger = abrahamsCompany.getVegetarianBurger();
		assertTrue(vegetarianBurger.getClass().equals(AbrahamsHealthFibreBurger.class));
	}

	public void testBeetlejuiceBurgers() throws Exception {
		BeetlejuiceCompany beetlejuiceCompany = new BeetlejuiceCompany();
		Burger meatBurger = beetlejuiceCompany.getMeatBurger();
		assertTrue(meatBurger.getClass().equals(BeetlejuiceRoyaleWithCheeseBurger.class));
		Burger vegetarianBurger = beetlejuiceCompany.getVegetarianBurger();
		assertTrue(vegetarianBurger.getClass().equals(BeetlejuiceBeanBurger.class));
	}
	
	public void testAbrahamsCompanyMenus() throws Exception {
		AbrahamsCompany abrahamsCompany = new AbrahamsCompany();
		Menu meatMenu = abrahamsCompany.getMeatMenu();
		assertTrue(meatMenu.getBurger().getClass().equals(AbrahamsChiliCheeseSpecialBurger.class));
		assertTrue(meatMenu.getDrink().getClass().equals(Cola.class));
		Menu veggieMenu = abrahamsCompany.getVeggieMenu();
		assertTrue(veggieMenu.getBurger().getClass().equals(AbrahamsHealthFibreBurger.class));
		assertTrue(veggieMenu.getDrink().getClass().equals(AppleJuice.class));
	}
	
	public void testBeetlejuiceCompanyMenus() throws Exception {
		BeetlejuiceCompany beetlejuiceCompany = new BeetlejuiceCompany();
		Menu meatMenu = beetlejuiceCompany.getMeatMenu();
		assertTrue(meatMenu.getBurger().getClass().equals(BeetlejuiceRoyaleWithCheeseBurger.class));
		assertTrue(meatMenu.getDrink().getClass().equals(Cola.class));
		Menu veggieMenu = beetlejuiceCompany.getVeggieMenu();
		assertTrue(veggieMenu.getBurger().getClass().equals(BeetlejuiceBeanBurger.class));
		assertTrue(veggieMenu.getDrink().getClass().equals(Cola.class));
	}

}
