package decFirstPratice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithString {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		name.add("aam");
		name.add("bam");
		name.add("cam");

		System.out.println("Original insertion array list order: " + name);

		name.add(0, "B");
		name.add("A");
		System.out.println("After adding duplicate element, ArrayList insertion order ");
		name.remove(1);
		Iterator<String> itr = name.iterator();

		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}

	}

}
