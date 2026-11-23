package com.staticcount;

//Write a Java program to count the number of objects created using a static variable.
public class StaticCount {

	static int count = 0;
	
	StaticCount()
	{
		count++;
	}
	
	public void display()
	{
		System.out.println("Object Count is:"+count);
	}
	
	public static void main(String[] args) {
		StaticCount staticCount = new StaticCount();
		StaticCount staticCount1 = new StaticCount();
		StaticCount staticCount2 = new StaticCount();
		
		staticCount2.display();
		staticCount1.display();
		staticCount.display();
	}
}
