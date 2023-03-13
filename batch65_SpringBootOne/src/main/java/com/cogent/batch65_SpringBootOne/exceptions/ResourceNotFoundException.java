package com.cogent.batch65_SpringBootOne.exceptions;

//public class ProductNotfoundException extends RuntimeException{
//
//	private static final long serialVersionUID = 1L;
//}

public class ResourceNotFoundException extends RuntimeException{
private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}

