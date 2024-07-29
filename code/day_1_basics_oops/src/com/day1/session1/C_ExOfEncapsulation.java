package com.day1.session1;

//data hiding is a way to achive encapsulation
//poor encapsulation
//class Employee{
//	public int id;
//	public String name;
//	public double salary;
//	
//	public void printEmployee() {
//		System.out.println("emp id :"+ id +" name : "+name+" salary: "+ salary);
//	}
//}

class Employee{
	private int id;
	private String name;
	private double salary;
	
	//We can use a const to solve this issue*
	public void printEmployee() {
		System.out.println("emp id :"+ id +" name : "+name+" salary: "+ salary);
	}
}

public class C_ExOfEncapsulation {

	public static void main(String[] args) {
		Employee employee=new Employee();
		//employee id can change?
//		employee.id=6;
////		
//		employee.id=666;
		
	}
}
