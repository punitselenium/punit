package naveenImportanProgram;

public class AddNo {

	
	int a ;
	int b;
	int c;
	
	public void add(int a,int b , int c) 
	{
		int sum =a+b+c;
		
		System.out.println(sum);
	//	return sum;
	}
	
	public static void main(String[] args) {

		AddNo  no = new AddNo();
		no.add(5, 7, 8);
		//System.out.println(no1);
	}

}
