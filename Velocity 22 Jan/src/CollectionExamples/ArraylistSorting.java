package CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSorting {
public static void main(String[] args) {
		
		// Sorting the string.
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("volksvagon");
		cars.add("bmw");
		cars.add("audi");
		cars.add("bullet");
		cars.add("mercedezbenz");
		// list of cars before sorting.
		System.out.println("Before Sorting "+cars);
		Collections.sort(cars);     // ascending order
		// after sorting
		System.out.println("After Sorting "+cars);
		// sorting cars in descending order
		Collections.sort(cars, Collections.reverseOrder());
		System.out.println("After Sorting in  descending "+cars);
	
	
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(50);
		numbers.add(15);
		numbers.add(25);
		numbers.add(58);
		numbers.add(105);
		numbers.add(5005);
	
		System.out.println(numbers);
	
		// ascending order
		Collections.sort(numbers);
		System.out.println(numbers);
	
		// descending order
		
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
	
	}
	
}
