package simpleburgerstore;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("Hello Burgerstore World!");
		BurgerStore burgerStore = new BurgerStore();
		System.out.println("Do you want a burger (y, n)?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(input.equals("y")) {
			System.out.println("Okay, I'll prepare one for you.");
			Burger burger = burgerStore.getBurger();
			System.out.println("There you go. Here comes your burger ... " + burger);
			System.out.println("Enjoy your meal.");				
		}
		scanner.close();
	}

}
