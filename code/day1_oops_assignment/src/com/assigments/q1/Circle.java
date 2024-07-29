package com.assigments.q1;

public class Circle {
	private int radius;
	private String color;
	
	public Circle() {}

	public Circle(int radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public double getArea() {
		return Math.PI*radius * radius;
	}
}
