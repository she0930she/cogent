package com.cogent.constructorTypes;

public class Vehicle {
	String model;
	String type;
	int cost;
	
	public Vehicle() {
		//super();
		System.out.println("default constructor is here");
	}

	public Vehicle(String model, String type, int cost) {
		super();
		this.model = model;
		this.type = type;
		this.cost = cost;
		System.out.println("parameterized constructor is here");
		
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", type=" + type + ", cost=" + cost + "]";
	}
	

}
