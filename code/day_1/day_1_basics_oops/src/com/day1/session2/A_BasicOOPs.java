package com.day1.session2;

class Employee{
	//instance variable
	private int id;
	private String name;
	private double salary;
	
	//static varible: class variable
	private static int empCounter=0;
	

	//static method: used to access the static data
	//u dont need object to call this
	
	//static method
	public static int getCounter() {
		return empCounter;
	}
	
	public Employee(String name, double salary) {
		this.id=++empCounter;
		this.name=name;
		this.salary=salary;
	}
	
	public void show() {
		System.out.println("Id: "+ this.id+" name: "+ name+" salary: "+ salary);
	}
	
}
public class A_BasicOOPs {

	public static void main(String[] args) {
		Employee employee=new Employee("amit",89000);
		employee.show();
		Employee employee2=new Employee("sumit",89800);
		employee2.show();
		
		System.out.println(Employee.getCounter());
		
	}
}



//constructor: used to inilized the instance varible

//consturctor chaining?
//public Employee() {
//	this(0,"raj",60000);// calling ctr of the same class
//}

//how to teach java that i want to assign value of local variable to the instance variable? : this
//this();
