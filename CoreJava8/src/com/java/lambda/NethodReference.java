package com.java.lambda;
import java.util.function.Function;
import java.util.function.BiFunction;


public class NethodReference {
	public static int add(int a,int b) {
		return (a+b);
	}


	public static void main(String[] args) {
		//lambda expression
	Function<Integer, Double> functionlam = (input)-> Math.sqrt(input);
	System.out.println(functionlam.apply(4));
	
	//Methodreference
	Function<Integer, Double> functional=Math::sqrt;
	System.out.println(functional.apply(5));
	
	BiFunction<Integer,Integer,Integer> bifun=NethodReference::add;
	System.out.println(bifun.apply(10, 20));
	
	
	

	}

}
