package com.test.java;

public class Encapsulation_test1 {

	//private data member
	private String name;
	public String getName()
	{
		return name;
	}
	
	
	public void setName(String name)
	{
		this.name=name;
		
	}
	
	
	public static void main(String[] args) 
	{
		Encapsulation_test1 et1 = new Encapsulation_test1();
	//	String showName= et1.getName("Punit"); not working 

//		System.out.println(et1.getName("Punit")); not working
		
		et1.setName("Punit");
		
//		System.out.println(et1.getName());

		String showName=et1.getName();
		
		System.out.println(showName);
	}

}
