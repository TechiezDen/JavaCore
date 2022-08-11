package com.demo.oop;

public class Rectangle {
	int length;
	int width;
	
	void insert(int l, int w) {
		length = l;
		width = w;
	}
	
	void calculateArea() {
		System.out.println("The area of the Rectangle is : " + length * width);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.insert(10, 5);
		r1.calculateArea();
	}

}
