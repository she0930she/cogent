package com.cogent.constructor;

public class Employee {
	int id;
	String name;
	static int speed;
	
	Employee(){
		System.out.println("default constructor");
		System.out.println(speed);
	}
	
	Employee (int id, String name){
		super();
		this.id = id;
		this.name = name;
	}
	
	void dis() {
		System.out.println(id);
		System.out.println(name);
	}
	
	void add() {
		
	}
	
	

}
