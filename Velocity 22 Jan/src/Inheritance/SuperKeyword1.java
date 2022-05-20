package Inheritance;

public class SuperKeyword1 extends SuperKeyword  {
	int a=20;
	public void display() {
		int a =30;
		System.out.println(a);   // local varible of same class 10
		System.out.println(this.a); // global variable of the same class 20
		System.out.println(super.a); // global varible or immediate parent class 30
		
		// to perform some actions  
		
		System.out.println(a+this.a);
		System.out.println(this.a+super.a);
		System.out.println(a+super.a);
	}
	

	public static void main(String[] args) {
		SuperKeyword1 s1= new SuperKeyword1();
		s1.display();
	}
}
