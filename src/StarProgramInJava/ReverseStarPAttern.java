package StarProgramInJava;

import java.util.Scanner;

public class ReverseStarPAttern {

	public static void main(String[] args) {
//
//		for (int i = 5; i > 0 ; i--)
//		{
//			for (int j = 0; j < i; j++) {
//				
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}

		Scanner Sc = new Scanner(System.in);

		System.out.println("Print the count of Row :- ");

		int x = Sc.nextInt();
		
		for (int i = 0; i <= x; i++) {
			for (int j = x; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
