package naveenImportanProgram;

public class ReverseStringProgram {

	public static void main(String[] args) {

		String name = "Hellow Word";

		int len = name.length();
		
		System.out.println("Total No of Chara -: "+len);
		System.out.println("======================================="+"First Method"+"===================================");

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		
		}
		System.out.println(rev); 
		
		System.out.println("======================================="+"2nd Method"+"===================================");
		
		StringBuffer sf = new StringBuffer(name);
		
		System.out.println(sf.reverse());

	}

}
