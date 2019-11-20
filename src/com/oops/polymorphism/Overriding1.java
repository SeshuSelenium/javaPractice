package com.oops.polymorphism;

public class Overriding1 extends Overloding {
	public void method1() {
		System.out.println("child m1");
	}
	
	public void method2() {
		System.out.println("child m2");
	}
	
	
	public static void main(String[] args) {
		Overriding1 or = new Overriding1();
		or.method1();
		or.method2();
		
		
	}

}
