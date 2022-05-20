package CollectionExamples;

import java.util.ListIterator;
import java.util.Vector;

public class VectorExamples {
	public static void main(String[] args) {
		Vector vec =new Vector();
		// add the elements
		vec.add('A');
		vec.add("PQR");
		vec.add(2);
		vec.add("Delhi");
		vec.add("Pune");
		vec.add(5000);
		
		System.out.println(vec);
		System.out.println(vec.capacity());
		
		vec.set(3, "XYZ");
		System.out.println(vec);
		
		vec.remove(5);
		System.out.println(vec);
		
		System.out.println("Checking the emptiness:- "+ vec.isEmpty());
		System.out.println("Checking the  size of vector :- " +vec.size());
		
		System.out.println(" the index of A "+ vec.indexOf('A'));
		
		System.out.println("Contains MEthod :- "+ vec.contains(2));
		
		System.out.println("to check the index :- "+ vec.get(1));
		
		
//		Iterator itr = vec.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
//		Enumeration en = vec.elements();
//		while (en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		}
		
		
		 ListIterator litr = vec.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		
	}
}
