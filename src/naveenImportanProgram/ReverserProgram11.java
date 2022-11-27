package naveenImportanProgram;

public class ReverserProgram11 {

	public static void main(String[] args) {

		String job = "India";
		int count = job.length();

		System.out.println(count);

		String rev = "";

		for (int i = count- 1; i >= 0; i--) {

			rev = rev + job.charAt(i);
		}

		System.out.println(rev);
		
		StringBuffer sf = new StringBuffer(job);
		StringBuffer tk =sf.reverse();
		
		System.out.println(tk);
		
	}
	
	

}
