package naveenMultipleProgram;

public class ReverseStringJava {

	public static void main(String[] args) {

		String name = "Sunday";
		int nameLength = name.length();
		
		System.out.println("Name Length is :- "+nameLength);
		
		String rev ="";
		
		for (int i = nameLength-1; i >=0; i--)
		{
			rev =  rev + name.charAt(i);
		}
	
		System.out.println(rev);

		StringBuffer sf = new StringBuffer("Sunday");
		StringBuffer nammereve = sf.reverse();
		
		System.out.println(nammereve);
		
		for (int i = 10; i >= 1; i--) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print(j);
			}
			System.out.println();

		}


	}
	
	
	

}
