package com.day1.session3.relationship;
class A{
	int i;

	public A(int i) {
		this.i = i;
	}
	
	public void print() {
		System.out.println("value of i: "+ i);
	}
}
class B extends A{
	int j;
	
	public B(int i, int j) {
		super(i);
		this.j=j;
	}
	public void print() {
		super.print();
		System.out.println("value of j: "+ j);
	}
}
class C extends B{
	int k;
	
	public C(int i, int j, int k) {
		super(i,j);
		this.k=k;
	}
	public void print() {
		super.print();
		System.out.println("value of k: "+ k);
	}
}

public class A_SimpleInh {
	
	public static void main(String[] args) {
		C p=new C(1,2,3);
		p.print();
	}
}
