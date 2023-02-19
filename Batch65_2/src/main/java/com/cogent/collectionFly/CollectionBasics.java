package com.cogent.collectionFly;

import java.util.ArrayList;

public class CollectionBasics {
	public static void main (String[] args) {
		
	// type of bucket(Collection)
				//name of bucket
		ArrayList<String> batch65 = new ArrayList<>();
				// type of object
		
		batch65.add("Helen");
		batch65.add("Keyu");
		batch65.add("Amit");
		System.out.println(batch65);
		
		// enhanced for loop
		for (String name: batch65) {}
		
	}

}
