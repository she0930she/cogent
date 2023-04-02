package com.cogent.streamAPIBasics.mapStream;

import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> list2 = Arrays.asList(1,2, 3, 4, 5);
		listOfStrings.stream().map(Integer::valueOf).forEach(System.out::println);
		list2.stream().map(n -> n*n).forEach(System.out::println);
		System.out.println(list2);
		

	}

}
