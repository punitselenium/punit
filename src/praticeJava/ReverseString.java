package praticeJava;

public class ReverseString {

	public static void main(String[] args) {

		String text = "lntinfotech";
		System.out.println(text);
		int textCount = text.length();

		System.out.println(textCount);

	//	String rev = "" ;
	//	String text1 = "";
		
		for (int i = textCount-1; i >= 0; i--) {

			System.out.println(text.charAt(i));
		//	text1= text1+ text.charAt(i);
			
		//	rev = rev + text.charAt(i);

		}
	//	System.out.println(text1);
//		System.out.println(rev);

	}

}
