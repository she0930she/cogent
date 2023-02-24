package com.cogent.streamAPIBasics;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// call as function, not called as method
		// lambda are consider function without any name, [no name to it]
		java8Interface ji = (n)-> {
			System.out.println("area* area: " + n * n);
		};
		
		ji.area(10);
		
		

	}

}
