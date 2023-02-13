package com.cogent.variableType;

public class Vehicle {
	
	// 1)
	int engine; // instance variable
	static int speed; // static variable
	// class property
	
	void startOn(int accelerator) { // local variable
		int totalSpeed = accelerator * 2;  // local variable
		// want to use this local variable, we need to call this method
		// life time in the Method
		
		System.out.println("instance: "+ engine);
		System.out.println("static instance: "+ speed);
		System.out.println("acc: "+ accelerator);
	}
	
	
	// 2) how they will get access

}
