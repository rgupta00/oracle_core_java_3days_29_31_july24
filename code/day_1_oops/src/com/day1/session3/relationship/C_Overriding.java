package com.day1.session3.relationship;

import java.util.Scanner;
/*
 * overriden method must belong to drived class
 *  overriden method can not reduce visiblty of base method
 *  
 */

class Shape{
	public void getArea() {
		System.out.println("i dnot know the area as share i dont know");
	}
}
class Circle extends Shape{
	public void getArea() {
		System.out.println("pi X r X r");
	}
}

class Triangle extends  Shape{
	public void getArea() {
		System.out.println("0.5 X b X h");
	}
}

class Rectangle extends  Shape{
	public void getArea() {
		System.out.println("b X h");
	}
}
public class C_Overriding {

	public static void main(String[] args) {
		//what is run time polymorphism: code flexiblity
		//achive by overrding
		//which method is going to be called is decided at run time
		//by the the type of object pointed by the pointer of base class
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







