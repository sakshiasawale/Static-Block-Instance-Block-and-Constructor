package com.instanceblock;

//Write a Java program to demonstrate an instance initialization block.

public class InstanceBlock {

	{
		System.out.println("This is a Instance Block");
	}
	
	public static void main(String[] args) {
		InstanceBlock instanceBlock = new InstanceBlock();
		InstanceBlock instanceBlock1 = new InstanceBlock();
	}
}
