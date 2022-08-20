package com.demo.array;

public class TestArray {
	public static void main(String[] args) {
		int array1[] = new int[5]; // this is declaration and instalation of an array 
		array1[0] = 87;
		array1[1] = 54;
		array1[2]= 65;
		array1[3] = 56;
		array1[4] = 78;
		//array1[5] = 88;
//		System.out.println(array1);
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]); // i represents the index value
		}
	}

}
