package com.cogent.bookApp;

public class Library {
	int curAvailable = 100;
	
	void bookAvailable() {
		
		System.out.println("current available book amount: "+ curAvailable);
		
	}
	
	void bookSold() {
		System.out.println("book sold: " + curAvailable);
	}

}
