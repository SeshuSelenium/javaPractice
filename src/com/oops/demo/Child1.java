package com.oops.demo;

public class Child1 extends Child {
	
	public void m5() {
		System.out.println("m5 child1");
	}
	
	public void m6() {
		System.out.println("m6 child1");
	}
	
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		c.m6();
	}
}
