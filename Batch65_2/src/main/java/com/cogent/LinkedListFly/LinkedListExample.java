package com.cogent.LinkedListFly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Float> ls = new LinkedList<>();
		ls.add(5.67f);
		ls.add(9999.88f);
		ls.add(-400.00f);
		ls.add(500.00f);
		ls.sort(null);
		System.out.println(ls);
		
		
		ArrayList<Float> ls2 = new ArrayList<>();
		ls2.add(5.67f);
		ls2.add(9999.88f);
		ls2.add(-400.00f);
		ls2.add(500.00f);
		Collections.sort(ls2);
		System.out.println(ls2);

	}

}
