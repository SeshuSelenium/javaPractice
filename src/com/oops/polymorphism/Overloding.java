package com.oops.polymorphism;

public class Overloding {
	
	

	public void myBeautipleSiri(int a, int b) {
		System.out.println(a*b);
		
	}
	
	public void myBeautipleSiri(long a, long b) {
		System.out.println(a + b);
	}
	
	public void myBeautipleSiri(String s, String s1) {
		System.out.println(s + " : " + s1);
	}
	
	public void myBeautipleSiri(char c, char c1) {
		System.out.println(c + " : "+ c1);
		
	}
	public static void main(String[] args) {
		Overloding over = new Overloding(); 
		over.myBeautipleSiri(10, 5);
		over.myBeautipleSiri(25, 75);
		over.myBeautipleSiri("sirisha", "seshu");
		over.myBeautipleSiri('T', 'C');
	}
}
