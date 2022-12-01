package decFirstPratice;

public class ReverseString1 {

	public static void main(String[] args) {

		String name = "Punit Shukla";
		int lengthcount = name.length();

		System.out.println(lengthcount);

		String value = "";
		for (int i = lengthcount-1; i > 0 ; i--)
		{
			value = value + name.charAt(i);

		}
		System.out.println(value);


	}

}
