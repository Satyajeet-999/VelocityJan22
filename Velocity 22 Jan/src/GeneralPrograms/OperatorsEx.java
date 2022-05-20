package GeneralPrograms;

public class OperatorsEx {
 public static void main(String[]args) {
	 int a=20;
	 int b=30;
	 //Arithmetic Operators(------ +,-,*,/,%-------)

	 System.out.println("Sum of a and b is: " +(a+b));
	 System.out.println("Difference of a and b is: "+(b-a));
	 System.out.println("Multiplication of a abd b is: "+(a*b));
	 System.out.println("Division of a and b is : "+(b/a));
	 System.out.println("Modulus of a and b is:"+(a%b));
	 
	//Relational Operators(-----<,>,==,<=,>=,!=-------)
	 
	 System.out.println("(a==b): " +(a==b));
	 System.out.println("(a>b):  "+(a>b));
	 System.out.println("(a<b):  "+(a<b));
	 System.out.println("(a<=b):  "+(a<=b));
	 System.out.println("(a>=b):"+(a>=b));
	 System.out.println("(a!=b): "+(a!=b));
	 
	//Logical Operators (----&&,||,!----)
	 
	 boolean x= true;
	 boolean y=false;
	 
	 System.out.println("AND: "+(x && y));
     System.out.println("OR: "+(x||y));	 
     System.out.println("NOT: "+(!x));
   
     System.out.println("NOT: "+(!y));
     
     //Increment and Decrement Operators (++,--)
     int c=10;
     int d=20;
     
     System.out.println("(c++: ): " +(c++));
	 System.out.println("(++c):  "+(++c)); 
	 System.out.println("(d--):  "+(d--));
	 System.out.println("(--d):  "+(--d));
	
     
}
}
