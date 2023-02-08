package com.java.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {

	public static void main(String[] args) {
	List<String> fruit=new ArrayList<String>();
	fruit.add("Apple");
	fruit.add("Mango");
	fruit.add("Banana");
	fruit.add("Orange");
	
	//Ascending order
List<String> Sorted1=fruit.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
System.out.println(Sorted1);

List<String> Sorted2=fruit.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
System.out.println(Sorted2);

//descending order
List<String> Sorted3=fruit.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println(Sorted3);

List<String> Sorted4=fruit.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
System.out.println(Sorted4);


List<Employee> employee=new ArrayList<Employee>();
employee.add(new Employee(10,"Ram",3000));
employee.add(new Employee(11,"Rev",7000));
employee.add(new Employee(12,"Rak",1000));
employee.add(new Employee(13,"Ramesh",4000));
//ascending
 List<Employee> e1=employee.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).collect(Collectors.toList());
  System.out.println(e1);

  
  //descending
  List<Employee> e2=employee.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
  System.out.println(e2);
  

	}
}
	
class Employee{
	private int id;
	private String name;
	private int Salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
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
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
}


