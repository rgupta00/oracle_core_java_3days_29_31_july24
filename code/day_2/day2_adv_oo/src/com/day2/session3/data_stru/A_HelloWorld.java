package com.day2.session3.data_stru;
import java.util.*; //data struction of java
public class A_HelloWorld {
	public static void main(String[] args) {
		//ArrayList vs LinkedList
		List<String> list=new LinkedList<String>();
		list.add("raj");
		list.add("amit");
		list.add("gunika");
		list.add("ravi");
		
		//System.out.println(list);	
//		for(String a: list) {
//			System.out.println(a);
//		}
		//i can print the data using Iterator (cursor)
		print(list);
		//how to sort the data: 
		Collections.sort(list);
		System.out.println("----------------sorted data------------------");
		print(list);
	}

	private static void print(List<String> list) {
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
