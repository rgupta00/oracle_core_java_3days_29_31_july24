package a.c;
//if a class is public :then only it can access in other par
//if a class is default :then it can only be  access in same package

//defult class : package private class in java

  public class C {

	public int i=9;
	protected int j=99;
	 int k=999;
	private int l=9999;
	
	public void fooPublic() {
		System.out.println("it is public foo method");
	}
	
	protected void fooProtected() {
		System.out.println("it is protected foo method");
	}
	
	 void fooDefault() {
		System.out.println("it is default foo method");
	}
	
	private void fooPrivate() {
		System.out.println("it is private foo method");
	}
	
}
