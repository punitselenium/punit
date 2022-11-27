package collectionInJava;

public class Employee {
	int id;
	String name;
	String city;

	Employee(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public String showName() 
	{
		return id + " " + name + " " + city;

	}

	public static void main(String args[]) {
		Employee e1 = new Employee(01, "Ari", "NewYork");
		Employee e2 = new Employee(02, "Jon", "Chicago");
		System.out.println(e1.showName());// compiler writes here s1.toString()
		e2.showName();// compiler writes here s2.toString()
	}
}