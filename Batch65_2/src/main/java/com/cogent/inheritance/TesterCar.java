package com.cogent.inheritance;

public class TesterCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car c = new Car();
		c.startEngine();
		c.roaring();
		c.engine = 3;
				
		System.out.println(c.engine);
		c.myProperty();
		
		
		Vehicle v = new Vehicle();
		v.startEngine();
		//v.myProperty();  // not valid
	}

}
