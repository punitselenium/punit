package collectionInJava;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {

//		LinkedList<String> l1 = new LinkedList<String>();
		List<String > l1 = new LinkedList<String>();
		
		l1.add("Punit");
		l1.add("Monu");
		
		System.out.println(l1);
		
		l1.removeAll(l1);
		
		System.out.println(l1);
		
		
	}

}
