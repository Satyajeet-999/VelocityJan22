package OverloadingRidding;

public class MainMethodOverloading {
	public static void main(int x) {
		System.out.println("Single argumented main method "+ x);
	}
	
	public static void main(int x, int y) {
		
		System.out.println(" Two integer argumented main method "+ (x+y));
	}
	
	public void main(int x, int y, int z) {
		
		System.out.println(" Three integer argumented main method "+ (x+y+z));
	}
	
	
	public static void main(String[] args) {
	
		MainMethodOverloading mo = new MainMethodOverloading();
		main(15);
		main(10, 20);
		mo.main(15, 15, 15);
	}
	
}
