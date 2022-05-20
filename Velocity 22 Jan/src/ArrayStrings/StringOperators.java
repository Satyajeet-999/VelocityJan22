package ArrayStrings;

public class StringOperators {
	public static void main(String[] args) {
		
	
	
	String s= "Velocity";
	String s1= "Velociity";
	String s2= " Welcome to Home ";
	
	// To caluclte the length.
	System.out.println("The Length is "+ s.length());
	
	// Uppercase ==> To convert string in uppercase.
	System.out.println("The Uppercase is "+ s.toUpperCase());
	
	// Lowercase
	System.out.println("The Lowercase is "+ s.toLowerCase());
	
	// char at ==> the character at specific index.
	System.out.println("The character at 3rd index " +s.charAt(3));
	
	// indexof ==> it will return index of secific character.
	System.out.println("The index of i is "+ s.indexOf("i"));
	
	// lastindexof
	System.out.println("The last index of i is "+ s1.lastIndexOf("i"));
	
	// trim 
	System.out.println("The String s2 before trimming "+ s2);
	System.out.println(" The String s2 after triming "+ s2.trim());
	


	//Comparision Operators	
	
	
	String a="Velocity";
	String a1 ="VELOCITY";
	String a2= "Veloc";
	
	// equals. // its a case sensitive.  // True /false.
	System.out.println(s.equals(a1));
	
	// equalsingnorecase:- 
	System.out.println(a1.equalsIgnoreCase(a));
	
	// contains.
	System.out.println(a.contains(a2));
	
	// isempty();
	System.out.println("Checking the emptyness "+ a.isEmpty());

	String s4= "abc";
	String s5= "xyz";
	// concats.
	System.out.println("The Concatinated string is "+ s4.concat(s5));
	
	// stratswith
	System.out.println("The Strats with Method "+ s2.startsWith("ab"));
	
	// endswith
	System.out.println("The ends with Method "+ s4.endsWith("bc"));
	
	String s6= "Welcome to Jaava";
	
	
	System.out.println("****************************************************");
	// replace
	System.out.println("The Replace "+ s6.replace("a", " "));
	
	
	// substring
	System.out.println("****************************************************");
	System.out.println("The Substring with start index only "+ s.substring(3));
	System.out.println("The Suv=bstring with Start and end index "+ s.substring(3, 6));
	
	
	// Reverse String

			String Original="abcdef";
			String reverse="";
			
			System.out.println(Original.length());
			
			for (int i=Original.length()-1;i>=0;i--)
			{
				reverse=reverse+Original.charAt(i);
			}
			
			System.out.println("The Reverse String is "+ reverse);


	// Palindrome String

			String Original1= "abcba";
			String Reverse="";
			
			for (int i= Original1.length()-1; i>=0;i--) {
				Reverse=Reverse+Original1.charAt(i);
			}
			System.out.println(Reverse);
		
			//System.out.println(Original.equals(Reverse)); // true // false
			
			if(Original1.equals(Reverse)) {
				System.out.println("The entered String is Palindrome");
			}else {
				System.out.println("The entered String is not Palindrome");
			}
	}
	

}
