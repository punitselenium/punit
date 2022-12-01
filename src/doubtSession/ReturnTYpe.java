package doubtSession;

public class ReturnTYpe {

	int x;
	int y;

//	public ReturnTYpe(int x, int y)
//	{
//		this.x=x;
//		this.y=y;
//	}
//	public void add(int x,int y) {
//		System.out.println(x+y);
//		
//	}

	public int add(int x, int y) {
		this.x = x;
		this.y = y;

		return x+y;

	}
	public void show() 
	{
		System.out.println("Value of x : "+x +"\n"+"Value of y : "+y );
	}

	

	public static void main(String[] args) {

//		ReturnTYpe rt= new ReturnTYpe(4,6); o/p=10;
//      rt.add(); o/p=10
//		ReturnTYpe rt= new ReturnTYpe();
//		
//		rt.add(4, 6);
//		
		ReturnTYpe ry = new ReturnTYpe();
		ry.add(4, 6);
		ry.show();
	
		int value = ry.add(4, 6);
		System.out.println(value);

	}

}
