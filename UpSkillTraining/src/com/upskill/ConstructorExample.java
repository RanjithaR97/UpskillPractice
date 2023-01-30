package com.upskill;
class Animal1 {
	String name;

	public Animal1(String name) {
		this.name = name;
		System.out.println("Animal Constructor with name");
	}
}

class Dog1 extends Animal1 {
	public Dog1(String name) {
		super(name);
	}

	public Dog1() {
		super("Default Dog Name");
	}
}

public class ConstructorExample {
	public static void main(String[] args) {
		Dog1 dog = new Dog1("Terry");
	}
}
