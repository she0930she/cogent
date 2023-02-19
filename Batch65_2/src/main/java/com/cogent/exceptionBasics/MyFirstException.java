package com.cogent.exceptionBasics;

public class MyFirstException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hey how y'all doing");
		System.out.println("Let's initilize some numbers");
		int no1 = 10;
		int no2 = 0;
		
		System.out.println("all good so far");
		int no3;
		
		no3 = no1 / no2;  // ----- important line, infinity, Abnormal situation
		// JVM activates
		// JVM identify problem and accordingly Exception Object gets created
		// and created Exception Object gets thrown
		// which leads to Abrupt termination of Application
		
		System.out.println("the res is: "+ no3);
		System.out.println("success");
		

	}

}
