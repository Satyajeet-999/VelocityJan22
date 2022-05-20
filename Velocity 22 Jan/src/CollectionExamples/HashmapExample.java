package CollectionExamples;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
	public static void main(String[] args) {
		// declare the hashmap.
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		// to add the data hasmap ==> put.
			hm.put(101, "ABC");
			hm.put(105, "xyz");
			hm.put(98,"PQAESDJHB");
			hm.put(102, "PQR");
			hm.put(103, "LMN");
			System.out.println(hm);
			// add one more element:- you have to use next key. 
			// modify
			hm.put(102, "XYZ");
			System.out.println(hm);
			// remove the element
			hm.remove(102,"XYZ");
			System.out.println(hm);
		
			// to read hashmap.
			for (Map.Entry m:hm.entrySet()) {
				System.out.println(m.getKey()+ "  "+ m.getValue());
			}		
	}
}
