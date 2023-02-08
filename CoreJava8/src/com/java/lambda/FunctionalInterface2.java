package com.java.lambda;

import java.util.function.Consumer;

class Function implements Consumer<String>{

	@Override
	public void accept(String t) {
	System.out.println(t);
		
	}
	
}
public class FunctionalInterface2 {

	public static void main(String[] args) {
		Consumer<String> con=(t) ->
			System.out.println(t);
			con.accept("Hello world");
				
			
			

	}

}
