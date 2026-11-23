package com.staticinstanceandconstructor;

//Write a Java program to demonstrate the execution order of static blocks, instance blocks, and constructors.

public class ExecutionOrder {
	
	ExecutionOrder()
	{
		System.out.println("----This is a Constructor----");
	}

	static 
	{
		System.out.println("-----This is a Static Block-----");
	}
	
	{
		System.out.println("-----This is non-Static block-----");
	}
	
	public static void main(String[] args) {
		ExecutionOrder executionOrder = new ExecutionOrder();
	}
}
