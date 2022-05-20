package MethodsObjects;

public class Calculation {
int x=10;
int y=20;
//Case-1 Method will not accept parameter and will not return any value
public void sum() {
	System.out.println(x+y);

}
//Case-2 Method will not accept parameter and will return the value
public int sum1() {
	return(x+y);	
}
//Case-3 Method will accept the parameter and will not return ant value
public void sum2(int a,int b) {
	System.out.println(a+b);
}

//Case-4 Method will accept the parameter and will return the value
public int sum3(int a1,int b1) {
	int c=a1+b1;
	return c;
}
public static void main(String[] args) {
	
	//Case-1 
	Calculation cal=new Calculation();
	cal.sum();
	 
	//Case-2
	Calculation cal1=new Calculation();
//int output=cal1.sum1();
System.out.println(cal1.sum1());
	
	//Case-3
	Calculation cal2=new Calculation();
	cal2.sum2(100,200);
	cal2.sum2(10,20);
	cal2.sum2(40,20);
	
	//Case-4
	Calculation cal3=new Calculation();
	System.out.println(cal3.sum3(500,200 ));
	
	
}
}
