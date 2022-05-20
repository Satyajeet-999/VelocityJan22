package CollectionExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(15);  // 0
		ll.add("ABC"); //1
		ll.add('c');  //2
		ll.add(15);   //3  
		
		// to see the elements
		System.out.println(ll);
		System.out.println("Containts method "+ll.contains('Z'));
		ll.add(2, "PQR");
		System.out.println(ll);
		ll.remove("PQR");
		System.out.println(ll);
		// checking the size
		System.out.println("the size  is " + ll.size());
		System.out.println(ll.get(1));
		// iterate it.
		Iterator itr = ll.iterator();
		
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
		
		
		//  these methods are not available arraylist or vector 
		// getfirst, getlast, add first, add last, removefirst, removelastt
		
		
		System.out.println("the first element is " + ll.getFirst());
		System.out.println("the last element is " + ll.getLast());
		ll.addFirst("java");
		ll.addLast("python");
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}
}
