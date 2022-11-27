package collectionInJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("a");
		hs.add("e");
		hs.add("a");
		hs.add("b");
		hs.add("e");
		hs.add("k");
		hs.add("b6");

		
		Iterator<String> it = hs.iterator();
	
		while (it.hasNext()) 
		{
			String string = it.next();
			
			System.out.println(string);
		}
		
	}

}
