package com.upskill2;

public class Initializers {
	static int count;
	int i;
	{
		// This is an instance initializers. Run every time an object is
		// created.
		// static and instance variables can be accessed
		System.out.println("Instance Initializer");
		i = 6;
		count = count + 1;
		System.out
				.println("Count when Instance Initializer is run is " + count);
	}

	static {
		// This is a static initializers. Run only when Class is first loaded.
		// Only static variables can be accessed
		System.out.println("Static Initializer");
		// i = 6;//COMPILER ERROR
		System.out.println("Count when Static Initializer is run is " + count);
	}

	public static void main(String[] args) {
		Initializers example = new Initializers();// Output below
		// Static Initializer
		// Count when Static Initializer is run is 0
		// Instance Initializer
		// Count when Instance Initializer is run is 1

		Initializers example1 = new Initializers();// Output below
		// Instance Initializer
		// Count when Instance Initializer is run is 2

		Initializers example2 = new Initializers();// Output below
		// Instance Initializer
		// Count when Instance Initializer is run is 3

	}

}