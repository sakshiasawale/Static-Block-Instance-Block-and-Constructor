package com.staticinitializationblock;

//Write a Java program to demonstrate a static initialization block.

public class InitializationBlock {

	static 
	{
		System.out.println("This is Static Method");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
	}
}
