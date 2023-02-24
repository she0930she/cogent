package com.cogent.streamAPIExamples;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perimeter p = (a, b) -> {
			System.out.println("the perimeter is: "+ (a+b)*2 );
		};
		
		
		p.peri(3, 2);

	}

}
