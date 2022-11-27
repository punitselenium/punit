package naveenImportanProgram;

public class SwapTwoNo {

	public static void main(String[] args) {
		/*
		 * int x=10; int y =20;
		 * 
		 * System.out.println("X value is = " +x); System.out.println("y value is = "
		 * +y);
		 * 
		 * int temp =x; x=y;
		 * 
		 * 
		 * System.out.println("X value is = " +x); System.out.println("y value is = "
		 * +temp);
		 * 
		 * 
		 * 
		 * }
		 */

		int x = 10;
		int y = 20;

		System.out.println("X value is = " + x);
		System.out.println("y value is = " + y);

		x = x + y;// 30
		y = x - y;
		x = x - y;

		System.out.println("X value is = " + x);
		System.out.println("y value is = " + y);
	}
}
