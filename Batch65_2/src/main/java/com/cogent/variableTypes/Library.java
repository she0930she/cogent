package com.cogent.variableTypes;

public class Library {
	static String librarian;
	String student;
	
	void addBooks(int books) {
		System.out.println("this is local varaible books: "+ books);
	}
	
	void display() {
		System.out.println("static variable: "+ librarian);
		System.out.println("instance variable: "+ student);
		//System.out.println();
	}

}
