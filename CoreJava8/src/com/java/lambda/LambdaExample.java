package com.java.lambda;

interface Shape {
	void draw();
}

/*class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle method : is called");
		
	}
	
}*/

/*class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Square  method : is called");
		
	}
	
}*/

 /*class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Circle method : is called");
		
	}
	
}*/


public class LambdaExample {

	public static void main(String[] args) {
		
		Shape rectangle=()->System.out.println("Rectangle method : is called");
		rectangle.draw();
		

		Shape square=()->System.out.println("Square method : is called");
		square.draw();
		

		Shape Circle=()->System.out.println("Circle method : is called");
		Circle.draw();
		
		print(rectangle);
		print(square);
		print(Circle);
		
		}
  
	
	private static void print(Shape shape) {
		shape.draw();
	}
	
	

}
