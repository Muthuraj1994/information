package org.six;

public class Suma {
	

	private int args(int a,int b) {
		
		int c = a+b;
		
		System.out.println(c);
		
		return c;
		}
	public void agrs1(int d,int c) {
     int f = c+d;
     
     System.out.println(f);

	}
	public static void main(String[] args) {
		 
		Suma mm = new Suma();
		
		int args2 = mm.args(10, 20);
		mm.agrs1(20,args2);
		
	}
	

}
