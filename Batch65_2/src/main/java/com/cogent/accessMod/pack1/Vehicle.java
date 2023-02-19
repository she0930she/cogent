package com.cogent.accessMod.pack1;

public class Vehicle {
	
	// private
	private void tryPrivate() {
		System.out.println("in private");
	}
	
	// public
	public void show() {
		System.out.println("I am public");
		tryPrivate();
		System.out.println("after private");
	}
	
	// protected
	protected void disp() {
		System.out.println("protected implements here");
	}

}
