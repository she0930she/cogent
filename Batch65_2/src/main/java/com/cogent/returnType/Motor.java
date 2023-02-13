package com.cogent.returnType;

public class Motor {
	
	int motorSpeed = 10;
	
	int speed (int accelerator) {
		
		motorSpeed *= accelerator;
		
		if (accelerator < 5) {
			System.out.println("safe speed: "+ accelerator);
		}else {
			System.out.println("not safe speed: "+ accelerator);
		}
			
		
		return motorSpeed;
	}
	
	

}
