package com.demo.inheritance;

class Employee {

	int id;
	float baseSalary = 50000; // this isthe property of my parent class
}
class HR extends Employee {
	int Bonus = 10000;
	void TotalPayment() {
		System.out.println( "total payment : " + (baseSalary + Bonus));
	}
}
public class Developers extends Employee {
	int bonus = 15000; // this is the property of child class

	public static void main(String args[]) {
		HR h1 = new HR();
		h1.TotalPayment();
		Developers d1 = new Developers();
		System.out.println("Developers base salary is : " + d1.baseSalary);
		System.out.println("Developers bonus is :" + d1.bonus);
		System.out.println("Developers total Payment is " + (d1.bonus + d1.baseSalary));

	}
}
