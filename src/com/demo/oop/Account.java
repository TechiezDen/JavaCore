package com.demo.oop;

// this is a banking system 
public class Account {
	// three fields
	int acc_no;
	String name;
	float amount;

	// insert method to add all the data at once
	void insert(int acc, String n, float amt) {
		acc_no = acc;
		name = n;
		amount = amt;
	}

	// deposit amount
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " has been deposited!");
	}

	void checkBalance() {
		System.out.println("The current balance is : Rupees:" + amount);
	}

// withdraw 
	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient BAlance");
		} else {
			amount = amount - amt;
			System.out.println("The withdrawn balance is : Rupees:" + amt);
		}
	}
	// method to diplay all the acc details 
	void display() {
		System.out.println("Account number: " + acc_no + " Account Holder's name: " + name + " Account Balance: " + amount);
	}

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account();
		
		a2.insert(56790, "Peter", 25000);
		a1.insert(56789, "Nishant", 100000);
		a2.display();
		a1.display();
		a1.deposit(10000);
		a1.checkBalance();
		a1.withdraw(50000);
		a1.display();

	}

}
