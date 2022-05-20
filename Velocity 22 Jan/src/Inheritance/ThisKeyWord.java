package Inheritance;

public class ThisKeyWord {

	// decalaration global
	int a;
	int b;
	
	public void getvalues(int a, int b) {   // local variables
		this.a=a;
		this.b=b;
	}
	
	public void display() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		ThisKeyWord tk = new ThisKeyWord();
		tk.getvalues(15, 20);
		tk.display();
	}
	
}
