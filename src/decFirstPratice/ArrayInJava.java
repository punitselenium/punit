package decFirstPratice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayInJava {

	public static void main(String[] args) {

		
		
		ArrayList<Integer > arrayList = new ArrayList<>();
		
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(3);

//		System.out.println(arrayList);
		
		for (int i = 0; i <arrayList.size() ; i++)
		{
			int i1=arrayList.get(i);
			System.out.println(i1);
			
		}
	}

}
