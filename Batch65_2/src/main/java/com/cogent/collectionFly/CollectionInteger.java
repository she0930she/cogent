package com.cogent.collectionFly;

import java.util.ArrayList;

public class CollectionInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> info = new ArrayList<>();
		info.add(11);
		info.add(12);
		info.add(13);
		//info.add("Hee");
		
		System.out.println(info);
		
//		for (int num: info) {
//			System.out.println(num);
//		}
		
		// Any 5 methods
		
		//info.clone();
		//ArrayList clone = info.clone();
		
		// get()
		System.out.println(info.get(0));
		System.out.println(info.get(1));
		

		
		// contains()
		System.out.println(info.contains(99));
		System.out.println(info.contains(11));
		System.out.println(info.contains("has"));
		
		// size()
		System.out.println(info.size());
		
		
		// sort()
		info.add(-1);
		info.sort(null);
		System.out.println(info);
		
		info.forEach((num) -> System.out.println(num));
		//System.out.println(info.forEach(null));
		
		
		//clear()
		info.clear();
		System.out.println(info);
	}

}
