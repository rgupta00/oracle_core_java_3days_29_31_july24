package com.day2.session1.b.interface_ab_class;

import java.util.Scanner;
//this shap class was used as a abstraction, how to create it better abstaction
/*
 * abs class vs interface
 */
//abstract class Shape{
//	public abstract void getArea();
//}

 interface Shape{
	public abstract void getArea();
}

class Circle implements Shape{

	@Override
	public void getArea() {
		System.out.println("pi X r x r");
	}
	
}

class Triangle implements  Shape{
	public void getArea() {
		System.out.println("0.5 X b X h");
	}
}

class Rectangle implements  Shape{
	public void getArea() {
		System.out.println("b X h");
	}
}
public class C_Overriding {

	public static void main(String[] args) {

		Shape shape=null;
		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("PE 1. circle 2. tri 3. rectangle");
		choice = scanner.nextInt();
		
		if(choice==1)
			shape=new Circle();
		else if(choice==2)
			shape=new Triangle();
		else 
			shape=new Rectangle();
		
		shape.getArea();
		
		
	}
}







