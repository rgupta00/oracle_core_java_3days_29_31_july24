package com.day2.session1.a.object_class;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee=new Employee(1, "raj");
		Employee employee2=new Employee(1, "raj");
		
		//compare the objects
		if(employee.equals(employee2)) {
			System.out.println("it is eq");
		}else {
			System.out.println("not eq");
		}
		
		//what is clonning?
		Employee employee3=new Employee(16, "umesh");
		
		//used to make duplicate copy of the object
		Employee employee4=(Employee) employee3.clone();
		System.out.println(employee3);
		System.out.println(employee4);
		
	}
}
