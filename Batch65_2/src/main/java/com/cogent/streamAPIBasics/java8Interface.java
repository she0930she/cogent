package com.cogent.streamAPIBasics;

@FunctionalInterface    // only when we have only 1 abstract method
public interface java8Interface {
	int data = 100;
	
	void area(int x); // write lambda for area()
	//void perepheral(); // a problem, not allowed
	
	//not having definition
	
	
	//default method
	default void process() {
		System.out.println("default method");
	}
	
	// static method
	static void doIt() {
		System.out.println("static method");
	}

}
