package naveenImportanProgram;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		String s = "This#string%contains^special*characters&/";
		
		s= s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);
	}

}
