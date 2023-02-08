package com.java.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		//create stream
		Stream<String> s1=Stream.of("a","b","c");
		s1.forEach(System.out::println);
  
		//create stream from Collections
		Collection<String> collection=Arrays.asList("JAVA","Hibernate","javascript");
		Stream<String> s2=collection.stream();
		s2.forEach(System.out::println);
		
		//create stream from Collections
				List<String> list=Arrays.asList("JAVA","Hibernate","javascript");
				Stream<String> s3=collection.stream();
				s3.forEach(System.out::println);
				
				
				Set<String> set=new HashSet<>(list);
				Stream<String> s4=collection.stream();
				s3.forEach(System.out::println);
				
				String[] sr= {"a","b","c"};
				Stream<String> s5=Arrays.stream(sr);
				s5.forEach(System.out::println);
				
				
				
		
		
		
	}

}
