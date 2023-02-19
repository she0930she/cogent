package com.cogent.exceptionBasics;

public class ArrayRelatedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] info = new int[5]; // Array definition
		info[0] = 10;
		info[1] = 20;
		info[2] = 10;
		info[3] = 20;
		info[4] = 10;

		System.out.println("going beyond");
		info[5] = 9;
	}

}
