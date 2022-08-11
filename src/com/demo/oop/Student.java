package com.demo.oop;

public class Student {
	int id; // field , data member , instance variable
	String name;
	String subject;

	public static void main(String[] args) {
		
		Student s1 = new Student(); // this is how you create an object 
		s1.id = 776; // this is how you assign a value to an object 
		s1.name= "Nishant";
		s1.subject= "Computer Sci";
		Student s2 = new Student();
		s2.id= 777;
		s2.name= "Karan";
		s2.subject = "Biology";
		
		// printn the values of the objects
		System.out.println( "the name of student 1 is : " + s1.name);
		System.out.println( "the id of student 1 is : " + s1.id);
		
		

	}

}
