package com.cogent.variableTypes;

public class TesterVaribleTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lb = new Library();
		lb.student = "Bill";
		Library.librarian = "Seattle Public Library";
		lb.addBooks(10);
		lb.display();

	}

}
