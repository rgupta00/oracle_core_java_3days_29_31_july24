package com.day2.session3.data_stru;
import java.util.*;
public class F_CollectionOfEmpoyeeObject {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(198, "raj",67890.00));
		employees.add(new Employee(71, "amit",62890.00));
		employees.add(new Employee(19, "kapil",67889.00));
		employees.add(new Employee(15, "durga",77890.00));
		
		System.out.println("---------printing the records----------");
		print(employees);
		System.out.println("---------printing the records by sorting as per id----------");
		
		Collections.sort(employees);
		print(employees);
		
		System.out.println("---------printing the records by sorting as per name----------");
		Collections.sort(employees, new NameSorter());
		print(employees);
		
	}

	private static void print(List<Employee> employees) {
		for(Employee e: employees) {
			System.out.println(e);
		}
	}
}
