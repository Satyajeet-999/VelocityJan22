package MethodsObjects;

public class ClaculatorMain {
	public static void main(String[] args) {
		
Calculator cal = new Calculator();
	
	System.out.println(cal.getsum(200, 300));
	System.out.println(cal.getDifference(500, 250));
	System.out.println(cal.getMultiplication(10, 20));
	System.out.println(cal.getDivision(50, 10));
	System.out.println(cal.getsumthree(10, 10, 10));
}

}
