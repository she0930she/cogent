package com.cogent.constructorTypes;

public class TesterVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle();
		Vehicle v2 = new Vehicle("Model 3", "M3", 98000);
		
		System.out.println(v2.toString());
		System.out.println(v.toString());

	}

}
