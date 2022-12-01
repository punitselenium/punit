package doubtSession;

public class NullPointer {

	String name;

//	public NullPointer(String name) {
//		this.name = name;
//
//	}
	
	public void show(String name) {

		System.out.println(name);
	}

	public static void main(String[] args) {
		
		NullPointer np = new NullPointer();
		np.show("Punit1");

		np.show("Punit2");
		np.show("Punit3");

	}

}
