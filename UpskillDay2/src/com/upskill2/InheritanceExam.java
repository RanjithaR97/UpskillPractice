package com.upskill2;

abstract class Animal {
	String name;

	// cool functionality
	abstract String bark();
}

class Dog extends Animal {
	String bark() {
		return "Bow Bow";
	}
}

class Cat extends Animal {
	String bark() {
		return "Meow Meow";
	}
}

public class InheritanceExam {
	public static void main(String[] args) {
		Animal animal = new Dog();
		System.out.println(animal.bark());
	}
}
