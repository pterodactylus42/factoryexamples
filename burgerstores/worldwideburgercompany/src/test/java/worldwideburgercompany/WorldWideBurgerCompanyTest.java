package worldwideburgercompany;

import junit.framework.TestCase;
import simpleburgerstore.Burger;
import worldwideburgercompany.abrahamsburgers.AbrahamsChiliCheeseSpecialBurger;
import worldwideburgercompany.abrahamsburgers.AbrahamsCompany;
import worldwideburgercompany.abrahamsburgers.AbrahamsHealthFibreBurger;
import worldwideburgercompany.beetlejuiceburgers.BeetlejuiceBeanBurger;
import worldwideburgercompany.beetlejuiceburgers.BeetlejuiceCompany;
import worldwideburgercompany.beetlejuiceburgers.BeetlejuiceRoyaleWithCheeseBurger;

public class WorldWideBurgerCompanyTest extends TestCase
{
	
	public void testAbrahamsBurgerStore() throws Exception {
		AbrahamsCompany abrahamsCompany = new AbrahamsCompany();
		Burger meatBurger = abrahamsCompany.getMeatBurger();
		assertTrue(meatBurger.getClass().equals(AbrahamsChiliCheeseSpecialBurger.class));
		Burger vegetarianBurger = abrahamsCompany.getVegetarianBurger();
		assertTrue(vegetarianBurger.getClass().equals(AbrahamsHealthFibreBurger.class));
	}

	public void testBeetlejuiceBurgerStore() throws Exception {
		BeetlejuiceCompany beetlejuiceCompany = new BeetlejuiceCompany();
		Burger meatBurger = beetlejuiceCompany.getMeatBurger();
		assertTrue(meatBurger.getClass().equals(BeetlejuiceRoyaleWithCheeseBurger.class));
		Burger vegetarianBurger = beetlejuiceCompany.getVegetarianBurger();
		assertTrue(vegetarianBurger.getClass().equals(BeetlejuiceBeanBurger.class));
	}

}
