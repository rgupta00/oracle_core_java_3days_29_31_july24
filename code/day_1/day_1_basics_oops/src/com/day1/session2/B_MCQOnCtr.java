package com.day1.session2;

class A{
	//it not a ctr
	public void A() {
		System.out.println("foo");
	}
	//ctr
	public  A() {
		System.out.println("bar");
	}
}
public class B_MCQOnCtr {

	public static void main(String[] args) {
		new A().A();
	}
}
