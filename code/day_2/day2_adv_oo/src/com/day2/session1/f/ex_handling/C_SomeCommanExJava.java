package com.day2.session1.f.ex_handling;
class Animal{
	void sound() {
		System.out.println("sound of animal");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("bho bho");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("meou");
	}
}
public class C_SomeCommanExJava {

	public static void main(String[] args) {
		// ArithmeticException
//		int i=9;
//		int j=0;
//		int k=i/j;
		
		// NullPointerException

//		Animal animal=null;
//		animal.sound();
		
//		Animal []animals=new Animal[5];
//		animals[0]=new Animal();
//		animals[1]=new Animal();
//		animals[2]=new Animal();
//		animals[3]=new Animal();
//		animals[4]=new Animal();
//		
//		for(Animal a: animals) {
//			a.sound();
//		}
		
		//ArrayStoreException
		Dog[]dogs=new Dog[2];
		add(dogs);
		
		
		// ArrayIndexOutOfBoundsException

		// ClassCastException

		// IOException
		// SQLException
		

	}

	private static void add(Animal[] animals) {
		animals[0]=new Cat();
	}
}
