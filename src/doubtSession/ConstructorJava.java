package doubtSession;

public class ConstructorJava {

	String name;
	
	// constructor 
	public ConstructorJava() 
	{
		
		this.name="Peter"; 
		/*
		Now, see the example, where we have initialized field “name” in 
		the constructor of the Person class as “this.name = “Peter”;”
        Output will be now as : Person:Pet
		*/
		 
	}
	
	public String getName()
	{
		return this.name;
	}
	public static void main(String[] args)
	{
		ConstructorJava cs = new ConstructorJava();
		String cs1= cs.getName();

		System.out.println(cs1); // o/p = null
		/* 
		 So, if we don’t initialize an object , we can not have some valid name of the
		  objects like Peter and John etc.  We need to provide some valid name to them. 
		  In fact, Every person in the world is having his name? Right? So, why not it programming.


		 */
	}

}
