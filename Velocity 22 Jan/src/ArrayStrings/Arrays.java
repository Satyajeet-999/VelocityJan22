package ArrayStrings;

public class Arrays {
	public static void main(String[] args) {
		
	
	// Single dimensional Array. (n-1)
	
	// declare the array.
	int a[]=new int [6];
	
	// add the values in the array
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
	
	// how  to check the size/capacity/lenth of array
	System.out.println("The Size of the array is "+ a.length);
	
	// how to read single value in array.
	System.out.println(a[2]);
	
	// how to read all values in the array.
	for (int i=0; i<a.length;i++) {
		System.out.println(a[i]);
	}
	int a1 [] [] = new int [3] [2]; // array declaration
	// inserting the values.
	a1[0] [0] =100;
	a1[0] [1] = 200;
	a1[1] [0] =300;
	a1[1] [1] = 400;
	a1[2] [0] =500;
	a1[2] [1] = 600;
	
	// find out the size 
	
	System.out.println("The Number of Rows "+ a.length );
	System.out.println("The Number of Columns "+ a1[0].length);
	// Program to read array.
	
	for (int i=0; i<a1.length;i++) {
		for (int j=0;j<a1[i].length;j++) {
			System.out.print(a1[i][j] +" ");
		}
		System.out.println();
	}
	

	}
}
