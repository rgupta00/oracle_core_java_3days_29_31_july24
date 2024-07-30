package com.day2.session1.f.ex_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_HelloExHanding {

	public static void main(String[] args) {
		// try catch throw throws finally

		//memory management in java: automatic gc
		//resouces: files, db connection... u should close the resouces... memory leak ( performace problem)
		
//		Scanner scanner = null;
//		
//		try {
//			// risky code
//			scanner = new Scanner(System.in);
//			System.out.println("PE 2 numbers");
//			int x = scanner.nextInt();
//			int y = scanner.nextInt();
//			int z = x / y;
//			System.out.println("value of division z: " + z);
//		} catch (ArithmeticException ex) {
//			System.out.println("deno must not be zero");
//		} catch (InputMismatchException ex) {
//			System.out.println("pls enter int only");
//
//		} finally {
//			scanner.close();//its always execute no matter what... close the resources
//		}
//
//		System.out.println("end");
		
	Scanner scanner = null;
		
		try {
			// risky code
			scanner = new Scanner(System.in);
			System.out.println("PE 2 numbers");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = x / y;
			System.out.println("value of division z: " + z);
		} catch (ArithmeticException | InputMismatchException ex) {
			System.out.println(ex);
		} finally {
			scanner.close();//its always execute no matter what... close the resources
		}

		System.out.println("end");
	}
}
