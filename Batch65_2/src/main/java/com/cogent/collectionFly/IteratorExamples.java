package com.cogent.collectionFly;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ls = new ArrayList<>();
		ls.add(11);
		ls.add(14);
		ls.add(999);
		
		
		Iterator<Integer> ite = ls.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		// Iterator -- looping
			// EntrySet
				// key value
		
		
		

	}

}
