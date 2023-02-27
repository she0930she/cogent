package com.cogent.codingChallenge.set3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class SortByVal implements Comparator<Entry<Integer, Integer>>{

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue() - o2.getValue();
	}


	
	

}
