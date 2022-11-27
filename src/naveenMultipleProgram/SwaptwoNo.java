package naveenMultipleProgram;

public class SwaptwoNo {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		System.out.println(x);
		System.out.println(y);

		int temp ;
		temp=x;
		x = y;
		y = temp;

		System.out.println(x);
		System.out.println(y);


		System.out.println("=======2nd method=========");
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println(x);
		System.out.println(y);

	}

}
