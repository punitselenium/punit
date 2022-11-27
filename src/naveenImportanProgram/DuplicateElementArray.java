package naveenImportanProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementArray {

	public static void main(String[] args) {

		String names[] = { "Java", "JavaScript", "ruby", "Java", "python", "ruby" };
		
		List<String > store = new ArrayList<String>();
		
		for (String name : names) 
		{
			if (store.add(name)==true)
			{
				System.out.println(name);
				
			}
			
		}
	}

}
