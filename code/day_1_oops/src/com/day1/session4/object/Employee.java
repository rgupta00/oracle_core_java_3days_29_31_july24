package com.day1.session4.object;
class Employee extends Object{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}