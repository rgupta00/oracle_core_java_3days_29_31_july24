package com.day2.session1.b.interface_ab_class;
/*
 * interface is used to achive 100% abstraction ?
 * ie u cant define a body of the method inside the interface (upto java 7)
 * u can not have instance variable inside the interface
 */

interface Foo{
	public static final int i=6;
	abstract public void foo();
}
class FooImpl implements Foo{

	@Override
	public void foo() {
		System.out.println(Foo.i);
		System.out.println("foo method is overriden");
	}
	
}
public class A_BasicsOfInterface {

	public static void main(String[] args) {
		Foo f=new FooImpl();
		f.foo();
	}
}
