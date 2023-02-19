package com.cogent.abstractConcept;

public abstract class Employee {
	
	void add() {
		System.out.println("complete -- NO Abstract Method");
	}
	
	abstract void display(); // No definitions means incomplete
	// abstract method got only declaration, definition is not given

}
