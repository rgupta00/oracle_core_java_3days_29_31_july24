package com.day1.session3.relationship;

class Employee{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.println("id "+ id +" name "+ name);
	}
}
class FullTimeEmp extends Employee{
	private double netSalary;
	private String ppfNumber;
	
	public FullTimeEmp(int id, String name,double salary, String ppfNumber) {
		super(id, name);
		this.netSalary=salary*.8;
		this.ppfNumber=ppfNumber;
	}
	
	public void print() {
		super.print();
		System.out.println("netSalary "+ netSalary +" ppf no "+ ppfNumber);
	}
	
}

class PartTimeEmp extends Employee{
	private int noOfDay;
	private int payPerDay;
	private double netSalary;
	
	public PartTimeEmp(int id, String name,int noOfDay, int payPerDay) {
		super(id, name);
		this.noOfDay=noOfDay;
		this.payPerDay=payPerDay;
		this.netSalary=this.noOfDay+this.payPerDay*.8;
	}
	
	public void print() {
		super.print();
		System.out.println("netSalary "+ netSalary +"payPerDay "+ payPerDay+" noOfDay "+ noOfDay+" netSalary "+netSalary);
	}
	
}
public class IS_A {
	
	public static void main(String[] args) {
		Employee employee=new FullTimeEmp(1, "amit", 90000, "ASBSAJL");
		employee.print();
	}

}
