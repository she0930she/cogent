package com.cogent.streamAPIBasics.forEach;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// collection add lots of object
		ArrayList<String> batch65 = new ArrayList<>();
		// type of object

		batch65.add("Helen");
		batch65.add("Keyu");
		batch65.add("Amit");
		batch65.add("John");
		
		// stream
		batch65.stream().forEach(holiday -> System.out.println( holiday ));
			// individual obj
		
		// on stream will invoke 
			//forEach()  -lambda - functional interface -- method
		System.out.println("===========");
		Stream<String> stream = batch65.stream();
			// intermeidate operation			// terminal operation
		stream.filter(str -> str.endsWith("n")).forEach(System.out::println);
			// reference method
		
		//predicate
		int[] arr = new int[] {1,2,3};
		//Stream<Integer> ls = arr.stream();  // not allowed
		
		
		batch65.stream();
		
	}

}
