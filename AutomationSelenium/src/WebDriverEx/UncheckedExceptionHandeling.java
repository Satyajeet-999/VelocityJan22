package WebDriverEx;

public class UncheckedExceptionHandeling {
	public static void main(String[] args) {
		
	
	System.out.println("Entered int the Class");
	System.out.println("Entered int the Main Method");
	
	// uncheked exception.
	
	// Example 1:-  Arithmatic Exception
			int a =50;
		try {
		System.out.println(a/0);
			}catch (Exception e) {  
			e.printStackTrace();
			}
	
	// Example 2:-  NullPointer Exception
	//		String s= null;
	//		try {
	//		System.out.println(s.length());
	//		}catch(Exception e) {
	//			e.printStackTrace();
	//		}
	
	// Example 3:-  Numberformat Exception
	
	//		String a="1583";
	//		try {
	//		int i = Integer.parseInt(a);
	//		System.out.println(i);
	//		}catch(ArithmeticException e) {
	//			e.printStackTrace();
	//		}catch(Exception e) {
	//			e.printStackTrace();
	//		}
	
	// Example 4:-  ArrayoutofBound Exception
	
	//		int a[] = new int[5];
	//		a[10]= 500;
	
	System.out.println("exist from the Main Method");
	System.out.println("exist from the Class");
}
}
