package MethodHiding;

public class demo1 extends demo {

	public void m1() {
		System.out.println("this is method m1 child class");
	}
	
	public static void m2() {
		System.out.println("this is static method m2 from child class");
	}
	
}
