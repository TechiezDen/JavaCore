package com.demo.polymorphism;

public class Student {
	
	public double percentage(double maths, double science)
	{
		return ((maths+science) / 200)*100;
	}
	
	public int percentage(int present)
	{
		return present;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println( "Average marks for student s1 is : " + s1.percentage(78.0, 85.5));
		System.out.println("attendance percentage for student s1 is " + s1.percentage(87)+ "out of 100 days");
	}

}
 