package com.cogent.streamAPIBasics;

import java.util.Optional;

public class TesterOptional {
	public static void main(String[] args) {
		
		 Optional obj1 = Optional.of
		         ("This is a sample text"); 
		 Optional obj2 = Optional.empty();
		 
		 if (obj1.isPresent()) {          
		            System.out.println
		            ("isPresent method called on obj1 returned true");
		         }  
		System.out.println(obj2.isPresent());
		
	}

}
