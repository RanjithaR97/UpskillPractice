package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterStream {

	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<Product>();
		for(Product prod:getProducts()) {
			if(prod.getSalary()>200) {
				
			list.add(prod);
				
			}
		}	
		
		for(Product prod:list) {
			System.out.println(prod);
		}
		
		
		//using stream
	getProducts().stream().filter((prod)->prod.getSalary()>200).forEach(System.out::println);
		
	
	}
	
private static List<Product> getProducts(){
	 List<Product> productlist=new ArrayList<Product>();
	 productlist.add(new Product(1,"Ranji",200));
	 productlist.add(new Product(2,"Ram",300));
	 productlist.add(new Product(3,"Ravi",400));
	 return  productlist;
}
		 
}	
class Product{
	private int id;
	private String name;
	private int salary;
	
	
	
	
	public Product(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}


