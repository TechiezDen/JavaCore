package com.demo.assesment;

public class Employee {
	String name;
	int yoj;
	float salary;
	String address;
	
	void insert(String n, int year, float sal, String add) {
		name = n;
		yoj = year;
		salary = sal;
		add = address;
	}
	
	void print() {
		System.out.println("Name: " + name + " Year of joining : " + yoj + " Salary in Rupees: " + salary + "Address: " + address );
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.insert("Robert", 1994, 50000, "64 C wallstreet ");
		e1.print();
		Employee e2  = new Employee();
		e2.insert("Sam", 2008, 46000, "68C wallsteet ");
		e2.print();
		
		
		
	}

}
