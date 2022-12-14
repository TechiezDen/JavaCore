package com.demo.polymorphism;

public class Intrest {
	public static void main(String[] args) {
		Kotak k1 = new Kotak();
		Axis a1 = new Axis();
		SBI s1 = new SBI();
		HDFC h1 = new HDFC();
		System.out.println("The interest you will get for 1,00,000 rs in a year with Kotak is " + k1.interestRate());
		System.out.println("The interest you will get for 1,00,000 rs in a year with Axis is " + a1.interestRate());
		System.out.println("The interest you will get for 1,00,000 rs in a year with HDFC is " + h1.interestRate());
		System.out.println("The interest you will get for 1,00,000 rs in a year with SBI is " + s1.interestRate());
	}
}
class Bank {
	double interestRate() {
		double rate = 100000*(1+0.05);
		return rate;
	}
}
class Kotak extends Bank {
	double interestRate() {
		double rate = 100000*(1+0.055);
		return rate;
	}
}
class Axis extends Bank {
	double interestRate() {
		double rate = 100000*(1+0.04);
		return rate;
	}
}
class HDFC extends Bank {
	double interestRate() {
		double rate = 100000*(1+0.04);
		return rate;
	}
}
class SBI extends Bank {
	double interestRate() {
		double rate = 100000*(1+0.035);
		return rate;
	}
}
