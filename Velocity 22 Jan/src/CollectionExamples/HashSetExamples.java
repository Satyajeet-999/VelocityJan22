package CollectionExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExamples {
	public static void main(String[] args) {
		HashSet  <String> s = new HashSet <String>();
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		s.add("five");
		s.add("one");
		s.add(null);
		System.out.println(s);
		
		ArrayList <String> al = new ArrayList <String>();
		al.add("five");
		al.add("six");
		al.add("seven");
		al.add("eight");
		al.add("nine");
		al.add("ten");
		System.out.println(al);
		s.addAll(al);
		System.out.println(s);
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
