package naveenImportanProgram;

public class ReverseInteger {

	public static void main(String[] args) {

		int no = 12345;
		int rev = 0;
		System.out.println(no);

		while (no != 0) {
			
			rev = rev * 10 + no % 10;
			no = no / 10;

		}
		System.out.println("Rev No is ="+rev);
	}

}
