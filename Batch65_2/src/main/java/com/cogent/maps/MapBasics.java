package com.cogent.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Map Family
			// 1. HashMap
			// 2. HashTable
			// TreeMap
		
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Mary");
		map.put(2, "Kevin");
		map.put(8, "Jane");
		map.put(6, "Samuel");
		map.put(2, "Vivian");
		
		//System.out.println(map);
		
		// Iterator
		Iterator<Map.Entry<Integer, String>> ite = map.entrySet().iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
			//Map.Entry<Integer, String> entry = ite.next();
			//System.out.println(entry.getKey()+ ", "+ entry.getValue());
		}
		System.out.println("::: loop :::");
		
		// enhanced for loop
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ ", "+ entry.getValue());
		}
		
		

	}

}
