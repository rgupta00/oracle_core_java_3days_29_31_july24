package com.day2.session1.b.interface_ab_class;
//abs class is aka incomplete class, i can not create object directly

abstract class Bar{
	int i;
	public Bar(int i) {
		this.i=i;
	}
	public int getI() {
		return i;
	}
	public  abstract void myMethod();
}
class Bar1 extends Bar{

	public Bar1(int i) {
		super(i);
	}
	@Override
	public void myMethod() {
			System.out.println("it is ab method defination");
			System.out.println(super.getI());
	}
	
}

public class B_BasicsOfAbClass {

	public static void main(String[] args) {
		Bar bar=new Bar1(5);
		bar.myMethod();
	}
}
