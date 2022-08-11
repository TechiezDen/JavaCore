package com.demo.oop;

public class StudentCon {
	
	int id;
	String name;
	String subject;
	
	// method to display the id and the name  
	void display() {
		System.out.println(id + " " + name + " " + subject);
	}
	
	public static void main(String[] args) {
		StudentCon s1 = new StudentCon();
		StudentCon s2 = new StudentCon();
		
		s1.display();
		s2.display();
		
	}

}
