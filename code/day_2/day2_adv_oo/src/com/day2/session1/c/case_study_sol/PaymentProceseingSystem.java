package com.day2.session1.c.case_study_sol;

public class PaymentProceseingSystem {

	public static void paymentProcessingSystem(Payable payable) {
		//add the details of salary to the the db
		//process it and put the taxation details to some other table
		
		double value= payable.payment();
		System.out.println(value);
	}
}
