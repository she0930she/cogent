package com.cogent.staticMethod;

public class Employee {
	int id;
	static String name;
	
	void disp() {
		System.out.println("normal");
		//id = 4;
		System.out.println("name: "+ name);
	}
	
	static void show() {
		System.out.println("static");
		//id = 4;
		//name = "Johnn";
		System.out.println("name: "+ name);
	}

}
