package com.day1.session3.relationship;
//passanger name raj moving from office to home using metro

//it is not flexible code
//abstraction help us to write flexible code
//loose coupling and high cohesion


class Vehicle{
	public void move(String s, String d) {
		System.out.println("moving from "+ s +" to "+ d +" using ?");
	}
}
class Metro extends Vehicle{
	public void move(String s, String d) {
		System.out.println("moving from "+ s +" to "+ d +" using metro");
	}
}
class Bike extends Vehicle{
	public void move(String s, String d) {
		System.out.println("moving from "+ s +" to "+ d +" using bike");
	}
}
class Bus extends Vehicle{
	public void move(String s, String d) {
		System.out.println("moving from "+ s +" to "+ d +" using bus");
	}
}
class Passanger{
	private String name;

	public Passanger(String name) {
		this.name = name;
	}
	//loose coupling
	public void travel(String s,String d, Vehicle vehicle) {
		System.out.println("Passanger name: "+ name);
		vehicle.move(s, d);
	}
}
public class USE_A {
	
	public static void main(String[] args) {
		Vehicle v=new Bus();
		Passanger passanger=new Passanger("raj");
		passanger.travel("office", "home", v);
	}

}
