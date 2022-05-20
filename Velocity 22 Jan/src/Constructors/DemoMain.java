package Constructors;

public class DemoMain {
public static void main(String[] args) {
	Demo d = new Demo();
	d.test();
	
	Demo d1= new Demo(100, "22th jan batch");
	d1.test();
	
	Demo d2 = new Demo("ABCD",25);
	d2.test();
	
}
}

