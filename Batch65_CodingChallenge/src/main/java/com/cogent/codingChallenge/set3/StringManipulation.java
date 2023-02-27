package com.cogent.codingChallenge.set3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Stack;

import org.apache.jasper.tagplugins.jstl.core.Set;

public class StringManipulation {
	
	// 1. Remove All occurrences of given character from String?(Assume Accordingly)
	public static String removeOccurences(String input, char character) {
		
		if (input == null || input.length() == 0) {
			return input;
		}
		
		String s = "";
		
		for (char cha: input.toCharArray()) {
			if(cha != character) {
				s += cha;
			}
		}
		
		return s;
	}
	
	
	// 2. How to swap 2 numbers without using 3rd variable?
	public static int[]  swapWithoutThirdVar(int x, int y) {
		
		// logic
//		X=23, Y=25
//		X = X+ Y = 48
//		Y = X- Y = 48-25 = 23
//		X = X-Y = 48-23 = 25
		

		int[] pair = new int[2];
		x = x+ y;
		y = x-y;
		x = x-y;
		pair[0] = x;
		pair[1] = y;
		
		return pair;
		
	}

	// 3. How to remove whitespaces from a string?
	public static String removeWhiteSpaces (String s) {
		String ans = "";
		
		for (char cha: s.toCharArray()) {
			if (cha == ' ') {
				continue;
			}
			
			ans += cha;
		}
		return ans;
		
	}
	

	// 4. Check if two arrays contains same elements?
	public static boolean containSameElement (int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i< arr1.length ; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
		
	}
	
	
	
	// 5. Find 3rd largest element in an integer array?
	public static int findThirdLargest (int[] arr) {
		if (arr == null || arr.length < 3) {
			return -1;
		}
		
		Arrays.sort(arr);
		return arr[2];
		
	}
	
	
	// 6. How to sort HashMap by using values?

	public static HashMap<Integer, Integer> sortHashMapByVal (HashMap<Integer, Integer> map){
		
		List<Entry<Integer, Integer>> listOfEntries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(listOfEntries, new SortByVal());
		
		
		LinkedHashMap<Integer, Integer> sortedByValue = new LinkedHashMap<Integer, Integer>(listOfEntries.size()); 
		// copying entries from List to Map

		for(Entry<Integer, Integer> entry : listOfEntries){
			sortedByValue.put(entry.getKey(), entry.getValue()); }
		
		return sortedByValue;


	}
		
	
	
	
	// 7.  Write a java code to check balanced parentheses in an expression using stack.
	public static boolean isValid (String s) {
		Stack<Character> stk = new Stack();
		
		for (char cha: s.toCharArray()) {
			if (cha == '(' || cha == '[' || cha == '{') {
				stk.add(cha);
			}else {
				if (stk.size() == 0) {
					return false;
				}
				
				// if match?
				char left = stk.pop();
				if (left == '(' && cha != ')') {
					return false;
				}else if(left == '[' && cha != ']') {
					return false;
				}else if(left == '{' && cha != '}') {
					return false;
				}

			}
			
		}
		
		return stk.size() == 0;
		
	}
	
	
	public static void main(String[] args) {
		
		// 1. Remove All occurrences of given character from String?(Assume Accordingly)
		System.out.println(removeOccurences("Animal", 'a'));
		int[] pair = swapWithoutThirdVar(23,25);
		System.out.println(pair[0]+ ", "+ pair[1]);
		System.out.println(removeWhiteSpaces("you are welcome !!! ~~ "));
		System.out.println(containSameElement(new int[] {6,10,3}, new int[] {3,5,0}));
		System.out.println(containSameElement(new int[] {6,10,3}, new int[] {10,3,6}));
		
		System.out.println("parenthesis: "+isValid("([]){"));
		

	}

}
