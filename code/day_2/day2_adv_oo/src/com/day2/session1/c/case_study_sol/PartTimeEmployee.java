package com.day2.session1.c.case_study_sol;

public class PartTimeEmployee extends Employee{

	private int noOfHr;
	private int noOfDays;
	
	public PartTimeEmployee(int id, String name, double salary, int noOfHr, int noOfDays) {
		super(id, name, salary);
		this.noOfHr=noOfHr;
		this.noOfDays=noOfDays;
	}
	
	

	@Override
	public String toString() {
		return "PartTimeEmployee [noOfHr=" + noOfHr + ", noOfDays=" + noOfDays + "]";
	}



	@Override
	public double payment() {
		return 4000000;
	}

	
}
