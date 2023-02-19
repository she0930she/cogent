package com.cogent.maps;

import java.util.Hashtable;
import java.util.TreeMap;

public class HashtableBasics {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> table = new Hashtable<>();
		table.put(1, "Mary");
		// table.put(null, "Mary");  
		// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
		// at java.base/java.util.Hashtable.put(Hashtable.java:481)
		System.out.println(table);
		
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Jane");
		treeMap.put(2, "Bill");
		//treeMap.put(null, "Kelly");
		// java.lang.NullPointerException
		System.out.println(treeMap);
		
	}

}
