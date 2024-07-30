package com.day1.session3.relationship;
//compile time funda?
//in case of overloading no restruction
//both method can be in same class
class Cal{
	 static int add(int a, int b) {
		return a+b;
	}
	 static int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class B_FunctionOverloading {
	
	public static void main(String[] args) {
		
		int sum=Cal.add(3, 4,9);
		
		System.out.println(sum);
		
	}

}
