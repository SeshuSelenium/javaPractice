package com.oops.demo;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>5 && name.length()<15) {
		this.name = name;
		}else {
			System.out.println("name must be geater than 5 less then 15");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
		this.age = age;
		}else {
			System.out.println("age not will be negative");
		}
	}
	

	
}
