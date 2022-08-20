package com.demo.overriding;

class Vehicle { // this is my parent class

	void run() // this is a method which is defined in my parent class
	{
		System.out.println("Engine is running ");
	}

} // parent class ends

public class Jet extends Vehicle {

	// defining the same method which is present in my parent class
	void run() {
		System.out.println("The Airbus A380 is the largest commcial plane on the planet which is running");
	}

	public static void main(String[] args) {
		// creating an instance of the child class
		Jet Airbus = new Jet();

		// calling the method with child class instance
		Airbus.run();

	}
}
