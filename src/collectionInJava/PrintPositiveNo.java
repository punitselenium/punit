package collectionInJava;

import java.util.Scanner;

public class PrintPositiveNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Start No :- ");
		int x = sc.nextInt();

		System.out.println("Enter The End No :- ");
		int y = sc.nextInt();

		for (int i = x; i <= y; i++) {
			if (i % 2 == 0) {
				System.out.println(i+","+"Love");

			}

		}
	}

}
