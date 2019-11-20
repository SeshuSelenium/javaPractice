package com.practice;

public class Student {

	int roolNomber;
	Student(int roolNumber){
		roolNomber = roolNumber;
	}
	void display() {
		System.out.println(roolNomber);
	}
	public static void main(String[] args) {
		Student s = new Student(25);
		s.display();
		Student s1 = new Student(15);
		s1.display();
		Student s2 = new Student(10);
		s2.display();
		
	}
}
