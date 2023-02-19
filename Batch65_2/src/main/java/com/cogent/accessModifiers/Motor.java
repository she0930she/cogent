package com.cogent.accessModifiers;

public class Motor {
	
	private void disp() {
		System.out.println("I got hidden info, restricted from outside");
	}
	
	public void show(){
		System.out.println(" No restriction Accross Application and Packages");
		disp(); // from the same class, private member can be access
	}
}
