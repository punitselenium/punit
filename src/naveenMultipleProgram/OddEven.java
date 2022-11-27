package naveenMultipleProgram;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please provide the no = ");
		int no = input.nextInt();

		if (no % 2 == 0) {
			System.out.println("No is even = " + no);

		} else {

			System.out.println("This is odd no = " + no);

		}
	}

}
