package com.java.lambda;

import java.util.function.Function;

class FunctionalImpl implements Function<String,Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}


public class FuntionalInterface {

	public static void main(String[] args) {
	//	Function<String,Integer> function=new FunctionalImpl();
	//	System.out.println(function.apply("ranji"));
		 Function<String,Integer> function=(String t)->{ return t.length();};
		 System.out.println( function.apply("Ranji"));
		
		

	}

}
