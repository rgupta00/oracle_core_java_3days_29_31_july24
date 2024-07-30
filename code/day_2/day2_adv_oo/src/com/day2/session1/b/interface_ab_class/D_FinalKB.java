package com.day2.session1.b.interface_ab_class;
final class Emp{
	int id;
	String name;
}
//class Mgr extends Emp{
//	
//}
public class D_FinalKB {
	
	public static void main(String[] args) {
		//final data: i can not change the value 
//		final int i=5;
//		i=55;
		
		final Emp e=new Emp();
//		e=new Emp();
		e.id=5;
		e.name="indu";
		
		
	}

}
