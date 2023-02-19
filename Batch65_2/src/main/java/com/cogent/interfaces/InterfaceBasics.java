package com.cogent.interfaces;

public interface InterfaceBasics {
	int no = 100; // final must be finalized
	
	void show(); // JDK 1.8 before
	// public abstract void show();  --- same
	
	// JDK 1.8 after
	// methods can have definition
		// i) default method with definitions
		// ii) static method with definitions
	
	default void add() {
		System.out.println("add");
	}
	
	static void disp() {
		System.out.println("disp");
	}
	
}
