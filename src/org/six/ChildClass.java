package org.six;

public class ChildClass extends ParentClass{
	
	
	public void mtc() {
		System.out.println("value");

	}
	public  void mtlf() {
		System.out.println("restart");

	}
	
	
	
	public static void main(String[] args) {
		
		ChildClass a = new ChildClass();
		
		a.mt();
		a.mtc();
		a.mtl();
		a.mtlf();
		
		ParentClass b = new ParentClass();
		
		b.mt();
		b.mtl();
		
	//ChildClass c = new ParentClass();
		
		ParentClass d = new ChildClass();
		d.mt();
		d.mtl();
		
		
		
		
		
	}

}



