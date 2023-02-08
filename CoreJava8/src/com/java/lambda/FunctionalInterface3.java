package com.java.lambda;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class Functional implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}
	
}
public class FunctionalInterface3 {

	public static void main(String[] args) {
		Supplier<LocalDateTime> supp	=()-> { return LocalDateTime.now();
		};
     System.out.println(supp.get());
	}

}
