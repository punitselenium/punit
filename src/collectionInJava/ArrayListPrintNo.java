package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPrintNo {

	public static void main(String[] args) {

		List<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(1);

		ar1.add(2);

		ar1.add(6);

		ar1.add(5);
		
		
// Iterator interface provides the facility of iterating the elements in a forward direction only.
		
		Iterator<Integer> itr = ar1.iterator();
		
		while (itr.hasNext())
		{
		System.out.println(itr.next());
			
		}
		
		ar1.remove(2);
		System.out.println(ar1);

	}

}
