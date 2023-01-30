package com.upskill;

//Simple example of Encapsulation (hiding data implementation using private Keyword)
public class Encap {

	// name is a Member Variable(private)
	private String name;

	//access through getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		// This is called shadowing
		// Local variable or parameter with
		// same name as a member variable
		// this.name refers to member variable
		// name refers to local variable
		this.name = name;
	}

	public static void main(String[] args) {
		// bradPitt & tomCruise are objects or instances
		// of Class Actor
		// Each instance has separate value for the
		// member variable name
		Encap bradPitt = new Encap();
		bradPitt.setName("Brad Pitt");
		bradPitt.getName();

		Encap tomCruise = new Encap();
		tomCruise.setName("Tom Cruise");
	}
}



