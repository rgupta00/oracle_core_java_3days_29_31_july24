package a.b;

import a.c.C;
//?
public class CClient extends C{

	public static void main(String[] args) {
		CClient c=new CClient();
		System.out.println(c.i);
		c.fooPublic();
		
		//What is the diff be default and protected
		
		//procted data/method can only be called in other package iff
		//a class of other package subclass that class
		
//		c.fooProtected();
//		c.fooDefault();
		//c.fooPrivate();
	}
}
