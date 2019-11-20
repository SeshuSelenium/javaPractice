package com.practice;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class ConstructorClass {
	
	protected int id;
	private String name;
	public int salary;
	String college;
	
	 ConstructorClass() {
		int id = 101;
		String name = "beautiful sirisha";
		int salary = 95000;
		String college = "svdc";
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.college = college;
	}
	 
	 ConstructorClass(int id, String name, String company, int salary ){
		 this.id = id;
		 this.name = name;
		 this.college = company;
		 this.salary = salary;
	 }
	 

	public static void main(String[] args) {
		ConstructorClass c = new ConstructorClass();
		System.out.println(c.id);
		System.out.println(c.name);
		System.out.println(c.salary);
		ConstructorClass c1 = new ConstructorClass(2000, "SirishaReddy", "apple", 95000);
		System.out.println(c1.id);
		System.out.println(c1.name);
		System.out.println(c1.salary);
		System.out.println(c1.college);

	}

}
