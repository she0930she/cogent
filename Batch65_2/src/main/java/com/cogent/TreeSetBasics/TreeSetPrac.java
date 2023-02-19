package com.cogent.TreeSetBasics;

import java.util.TreeSet;

public class TreeSetPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> set3 = new TreeSet<>();
		set3.add(999);
		set3.add(-100);
		set3.add(1);
		set3.add(55);
		
		for (int num: set3) {
			System.out.println(num);
		}

	}

}
