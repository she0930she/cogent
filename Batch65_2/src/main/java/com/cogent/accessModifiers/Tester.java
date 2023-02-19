package com.cogent.accessModifiers;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor motor = new Motor();
		
		// but from outside any other class, private member can not be accessed
		// private access, from outside world, no access to private world
		//motor.disp(); 
		
		motor.show(); 
	}

}
