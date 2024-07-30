package com.day2.session1.c.case_study;

public class Tester {

	public static void main(String[] args) {
		


		
		Employee employee=new PartTimeEmployee(1, "amit", 3000, 23, 5600);
		//System.out.println(employee);
		
		PaymentProceseingSystem.paymentProcessingSystem(employee);
	}

}
