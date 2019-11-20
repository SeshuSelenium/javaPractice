package com.oops.demo;

public class Inheritence3 extends Inheritance1 {
	
	public void m7() {
		System.out.println("m7 method");
	}
	
	public void m6() {
		System.out.println("m6 method");
	}
	
	public static void main(String[] args) {
		Inheritence3 i = new Inheritence3();
		i.m1();
		i.m2();
		i.m3();
		i.m4();
		i.m5();
		i.m6();
		i.m7();
		
	}
}
