package CollectionExamples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		// add the elements
		ts.add("F");
		ts.add("E");
		ts.add("D");
		ts.add("C");
		ts.add("B");
		ts.add("A");
		
		// add the dulplicates.
		ts.add("A");
		System.out.println(ts);
		
		// geting the first value
		
		System.out.println("First value is :- "+ ts.first());
		System.out.println("Last value is :- "+ ts.last());
		
		// immediate elements
		
		String val= "C";   //D //B
		
		System.out.println("Higher member "+ ts.higher(val));
		System.out.println("Lower member "+ ts.lower(val));
		
		// removing first and last ==> poll
		ts.pollLast();
		System.out.println(ts);
		// iterate
		Iterator itr = ts.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
