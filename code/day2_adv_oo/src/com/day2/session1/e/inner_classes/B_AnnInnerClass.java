package com.day2.session1.e.inner_classes;
interface Food{
	public void cook();
}

public class B_AnnInnerClass {

	public static void main(String[] args) {
		//java 8: lamabda exppression and stream processing
		Food f=new Food() {
			
			@Override
			public void cook() {
				System.out.println("hello");
			}
		};
		
		f.cook();
	}
}
