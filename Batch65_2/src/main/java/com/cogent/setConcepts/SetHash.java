package com.cogent.setConcepts;


import java.util.HashSet;
import java.util.LinkedHashSet;

import com.cogent.comparableBasics.Employee;

public class SetHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// does not allow duplicated element
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(55);
		set.add(999);
		set.add(-100);
		set.add(55);
		
		for(Integer num: set) {
			System.out.println(num);
		}
		
		System.out.println("Try methods");
		System.out.println("isEmpty(): "+set.isEmpty());
		System.out.println(set.contains("J"));
		System.out.println(set.remove(11));
		System.out.println(set.remove(1));
		System.out.println(set.size());
		
		System.out.println(set.clone());
		System.out.println(set.toArray());
//		for (String s: set.toArray().toString()) {
//			System.out.println();
//		}
		System.out.println("LinkedSet");
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(1);
		set2.add(55);
		set2.add(999);
		set2.add(-100);
		set2.add(55);
		
		for(Integer num: set2) {
			System.out.println(num);
		}
		set2.remove(999);
		System.out.println("after remove()");
		for(Integer num: set2) {
			System.out.println(num);
		}
		
		

	}

}
