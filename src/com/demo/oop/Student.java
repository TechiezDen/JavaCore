package com.demo.oop;

public class Student {
	int id; // field , data member , instance variable
	String name;
	String subject;

	void insert(int i, String n, String s) {
		id = i;
		name = n;
		subject = s;
	}

	public static void main(String[] args) {

		Student s1 = new Student(); // this is how you create an object
		s1.id = 776; // this is how you assign a value to an object
		s1.name = "Nishant";
		s1.subject = "Computer Sci";
		Student s2 = new Student();
		s2.id = 777;
		s2.name = "Karan";
		s2.subject = "Biology";
		
		Student s3 = new Student();
		s3.insert(778, "Peter", "Maths"); // we are calling the method  
		
		// print the values of the objects
		System.out.println("the name of student 1 is : " + s1.name);
		System.out.println("the id of student 1 is : " + s1.id);
		System.out.println("name: " + s2.name + " id: " + s2.id + " subjects: " + s2.subject);
		System.out.println("name: " + s3.name + " id: " + s3.id + " subjects: " + s3.subject);

	}

}
