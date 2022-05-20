package Inheritance;

public class ThiskeywordExample {
	int a =10;
	public void test() {
		int a =20;
		System.out.println(a);       // local variable 20
		System.out.println(this.a);  // global variable 10
	}
	public static void main(String[] args) {
		
		ThiskeywordExample tk = new ThiskeywordExample();
		tk.test();
	}
}
