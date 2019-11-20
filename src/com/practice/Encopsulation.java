package com.practice;

public class Encopsulation {
	// binding the data and code into single unit it is called as encopsulation
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >0) {
		this.age = age;
		}else {
			System.out.println("age mast be positive number");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
