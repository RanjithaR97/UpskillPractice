package com.upskill;

class Animals {

	public Animals(String name, String type) {
		this.name = name;
		this.type = type;
	}

	String name;
	String type;
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}	
}

public class toStringExample {
	public static void main(String[] args) {
		Animals animal = new Animals("Tommy", "Dog");
		System.out.println(animal);// Animal [name=Tommy, type=Dog]
	}
}
