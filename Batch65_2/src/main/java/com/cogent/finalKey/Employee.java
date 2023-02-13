package com.cogent.finalKey;

public class Employee {
	final int id = 111;  // final variable must be init at the start
	
	void show() {
		System.out.println(id);
		//id += 50;  //final not not be modified
	}
	
}
