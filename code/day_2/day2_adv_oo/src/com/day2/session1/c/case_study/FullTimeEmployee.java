package com.day2.session1.c.case_study;

public class FullTimeEmployee extends Employee {

	private double tax;
	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name, salary);
		tax=.20*getSalary();
	}
	


	@Override
	public String toString() {
		return "FullTimeEmployee [tax=" + tax + "]";
	}



	@Override
	public double payment() {
		return 4500000;
	}
	
	
	

}
