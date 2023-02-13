package com.cogent.thisKey;

public class Employee {
	int id; // instance
	String name;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("default con");
	}


	public Employee(int id, String name) { // local
		this();
		this.id = id;  // this key is used with instance var
		this.name = name;
		System.out.println(" 2 param");
		
	}
	
	public Employee(int id, String name, int salary) { // local
		this(1, "gg");
		this.id = id;  // this key is used with instance var
		this.name = name;
		System.out.println(" 3 param");
	}
	

}
