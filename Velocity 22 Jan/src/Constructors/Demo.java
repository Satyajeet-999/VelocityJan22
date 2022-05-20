package Constructors;

public class Demo {
	int a;
	String str;
	
	Demo(){
		System.out.println("This is zero argument constructor.");
		a=10;
		str="velocity";
	}
	
	Demo(int c,String d){
		System.out.println("This is with argument constructor");
		a=c;
		str =d;
	}
	
	Demo(String d, int c){
		System.out.println("This is with argument constructor");
		a=c;
		str =d;
	}
	public void test() {
		System.out.println(a);
		System.out.println(str);
	}
}
