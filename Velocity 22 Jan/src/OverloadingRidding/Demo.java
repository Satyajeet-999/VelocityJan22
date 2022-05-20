package OverloadingRidding;

public class Demo {
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(int a, double b) {
		System.out.println(a+b);
	}
	
	public void sum(double a, double b) {
		System.out.println(a+b);
	}
	
	public void sum(double a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(double a, double b,double c) {
		System.out.println(a+b+c);
	}
	
	
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.sum(10, 20);
		d.sum(10.5, 10.5);
		d.sum(10.5, 10);
		d.sum(10, 10.5);
		d.sum(10.5, 5.5, 5.5);
	}
	
	
}
