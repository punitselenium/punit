package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Monu");
		ar.add("Monu");
		ar.add("Sonu");
		ar.add("Tonu");
		ar.add("Gonu");
		
		Iterator<String> it = ar.iterator();
		
		while (it.hasNext()) //
		{
			System.out.println(it.next());
		}
				
//		Different Ways to Iterate an ArrayList
		
/*
 a)		
		for( String name :ar )
		{
			System.out.println(name);
			
		}
b)
		for (int i = 0; i < ar.size(); i++) 
		{
			System.out.println(ar.get(i));
			
		}
	
*/		
	}

}
