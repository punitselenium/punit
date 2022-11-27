package novJavaPratice;

public class SwapTwoNo1 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		System.out.println(x);
		System.out.println(y);

		x = x + y;//30
		
		y=x-y;// 30-20=10
		x=x-y;//30-10=20

		System.out.println("Value of y ="+y);

		System.out.println("Value of x ="+x);

	}

}
