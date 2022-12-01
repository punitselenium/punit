package doubtSession;

public class ParameterConstructor {

	String name;
	int age;
	String college;
	
	public ParameterConstructor(String name, int age, String college){
		this.name=name;
		this.age=age;
		this.college=college;
		
	}
	
	public void show()
	{
		System.out.println(name +"\n"+age+"\n"+college);
	}
	public static void main(String[] args) {

		ParameterConstructor ps = new ParameterConstructor("Punit", 29, "JNCT");

		ps.show();
	}

}
