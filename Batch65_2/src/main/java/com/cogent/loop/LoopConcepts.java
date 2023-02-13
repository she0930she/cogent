package com.cogent.loop;

public class LoopConcepts {
		
	void runLoops(int initialValue, int finalValue) {
		int counter = initialValue;
		for (int i = initialValue; i<= finalValue; i++) {
			counter += 1;
			System.out.println(counter);
		}
		
	}

}
