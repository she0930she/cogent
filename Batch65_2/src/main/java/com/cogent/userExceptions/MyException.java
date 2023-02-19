package com.cogent.userExceptions;

public class MyException extends Exception{
	
	public MyException( String msg) {
		super();
		System.out.println("my exception created");
		System.out.println(msg);
	}
	
	// throw -- explicity throw the created objects
	// throws -- whenever checked exception occurs that during that ,Method should
		// use throws keyword at definition along with Exception class Name


}
