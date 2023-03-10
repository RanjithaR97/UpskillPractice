package com.example.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
		
@GetMapping(path="/hello-world")	
public String helloWorld() {
	return "Hello World";
}

@GetMapping(path="/hello-world-bean")	
public HelloWorldBean helloWorldbean() {
	return new HelloWorldBean("Hello World");
}

@GetMapping(path="/hello-world/path-variable/{name}")	
public HelloWorldBean helloWorldbean(@PathVariable String name) {
	return new HelloWorldBean(String.format("HelloWorld  %s",name));
}


}
