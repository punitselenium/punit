package doubtSession;

import java.util.Objects;

public class NullCheckExample3 {

	public static void main(String[] args) {

		User1 us1 = new User1();
		User2 us2=us1.getFirstUser();
		
		if (us2==null)
		{
			System.out.println("This is null value ");
			
			
		} else 
		{
			System.out.println("Object is not Null");  


		}
	// https://rollbar.com/blog/how-to-catch-and-fix-nullpointerexception-in-java/
	/*
	 * he NullPointerException occurs due to a situation in application code where an uninitialized 
	 * object is attempted to be accessed or modified. Essentially, 
	 * this means the object reference does not point anywhere and has a null value.	
	 */
		
	}

}
