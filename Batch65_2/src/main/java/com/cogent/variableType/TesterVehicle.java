package com.cogent.variableType;

public class TesterVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instance
		Vehicle v = new Vehicle();
		v.engine = 5;
		
		Vehicle v2 = new Vehicle();
		// static
		Vehicle.speed = 100;
		Vehicle.speed = 200;
		
		// local variable
		// bound to this Method
		v.startOn(10);
		v.speed = 300;
		
		System.out.println(v.engine);
		System.out.println(v2.engine);
	}

}
