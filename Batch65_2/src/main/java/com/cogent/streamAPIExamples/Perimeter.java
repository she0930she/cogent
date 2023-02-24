package com.cogent.streamAPIExamples;

@FunctionalInterface
public interface Perimeter {
	
	void peri(int a, int b);
	
	default void show() {
		System.out.println("show in Perimeter interface");
	}

}
