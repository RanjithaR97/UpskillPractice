package com.java.lambda;



interface Vehicle{
	String getBrand();
	String speedup();
	String slowdown();
	
	default String AlarmOn() {
		
		return "The vehicle alarm is on";
	}
default String AlarmOff() {
		
		return "The vehicle alarm is off";
	}
  static String getComp() {
	  return "JP";
  }
	
}
class Car implements Vehicle{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public String speedup() {
		// TODO Auto-generated method stub
		return "The car is speedingup";
	}

	@Override
	public String slowdown() {
		// TODO Auto-generated method stub
		return "The car is slow down";
	}
	
}
public class DefaultStatic {

	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println(c.getBrand());
		System.out.println(c.speedup());
		System.out.println(c.slowdown());
		System.out.println(c.AlarmOn());
		System.out.println(c.AlarmOff());
		System.out.println(Vehicle.getComp());
		
			
		
		

	

	}

}
