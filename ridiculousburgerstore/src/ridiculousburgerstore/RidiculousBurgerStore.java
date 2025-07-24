package ridiculousburgerstore;

public class RidiculousBurgerStore {

	public static void main(String[] args) {
		System.out.println("Hello Burgerstore World!");
		System.out.println("Do you want a burger (y, n)?");
		String input = System.console().readLine();
		if(input.equals("y")) {
			System.out.println("Okay, I'll prepare one for you.");
			Burger burger = new Burger();
			burger.setBun(true);
			burger.setPattie(true);
			System.out.println("Do you want cheese (y, n)?");
			input = System.console().readLine();
			if(input.equals("y")) {
				System.out.println("putting on cheese ...");
				burger.setCheese(true);
			}
			System.out.println("Do you want chili (y, n)?");
			input = System.console().readLine();
			if(input.equals("y")) {
				System.out.println("putting on chili ...");
				burger.setChili(true);
			}
			System.out.println("There you go. Here comes your burger with ...");
			if(burger.hasBun()) {
				System.out.println("a bun");				
			}
			if(burger.hasPattie()) {
				System.out.println("a pattie");				
			}
			if(burger.hasCheese()) {
				System.out.println("some cheese");				
			}
			if(burger.hasChili()) {
				System.out.println("some chili");				
			}
			System.out.println("Enjoy your meal.");				
		}
	}
	
	static class Burger {
		private boolean pattie;
		private boolean bun;
		private boolean cheese;
		private boolean chili;
		
		public boolean hasPattie() {
			return pattie;
		}
		public void setPattie(boolean pattie) {
			this.pattie = pattie;
		}
		public boolean hasBun() {
			return bun;
		}
		public void setBun(boolean bun) {
			this.bun = bun;
		}
		public boolean hasCheese() {
			return cheese;
		}
		public void setCheese(boolean cheese) {
			this.cheese = cheese;
		}
		public boolean hasChili() {
			return chili;
		}
		public void setChili(boolean chili) {
			this.chili = chili;
		}
		
	}

}
