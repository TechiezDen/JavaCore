package com.demo.oop;

public class StudentCon {
	
	int id;
	String name;
	String subject;
	// parameterized constructor 
	
	StudentCon(int i, String n, String sub) {
		id = i ;
		name = n;
		subject = sub;
	}
	
	// method to display the id and the name  
	void display() {
		System.out.println(id + " " + name + " " + subject);
	}
	
	public static void main(String[] args) {
		StudentCon s1 = new StudentCon(800, "Rishav", "Science");
		StudentCon s2 = new StudentCon(801, "Peter", "English");
		
		s1.display();
		s2.display();
		
	}

}
