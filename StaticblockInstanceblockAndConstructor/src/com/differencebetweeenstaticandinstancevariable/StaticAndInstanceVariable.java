package com.differencebetweeenstaticandinstancevariable;

//Write a Java program to demonstrate the difference between static and instance variables.
public class StaticAndInstanceVariable {

	static String college  = "PCU";
	
	int roll = 29;
	String name = "ABC";
	
	StaticAndInstanceVariable(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	
	public void displayMethod()
	{
		System.out.println("Roll No :"+roll);
		System.out.println("Name is:"+name);
		System.out.println("College Name:"+college);
	}
	
	public static void main(String[] args) {
		StaticAndInstanceVariable staticAndInstanceVariable = new StaticAndInstanceVariable(29,"PCU");
		staticAndInstanceVariable.displayMethod();
		System.out.println();
		
		StaticAndInstanceVariable.college= "DYP";
		staticAndInstanceVariable.displayMethod();
	}
}
