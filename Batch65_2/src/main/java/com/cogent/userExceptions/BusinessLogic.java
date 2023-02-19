package com.cogent.userExceptions;

public class BusinessLogic {

	void process (int num) throws MyException {
		if (num == 8) {
			throw new MyException("Oh my god, num 8 was no expected");
		}else {
			System.out.println("all well");
		}
		System.out.println("success");
	}
	
	
}
