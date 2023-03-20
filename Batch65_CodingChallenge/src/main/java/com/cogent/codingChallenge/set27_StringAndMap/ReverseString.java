package com.cogent.codingChallenge.set27_StringAndMap;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class ReverseString {
	
	// 1. How do you reverse a string in Java?
	
	// 2. Write a Java program to print a Fibonacci sequence using recursion.
	public static int fib(int num) {
		if (num == 1) {
			return 1;
		}
		if (num == 2) {
			return 2;
		}
		
		return fib(num-1) + fib(num-2);
		
	}
	
	
	// 3. Write a Java program that sorts HashMap by value.
	public static HashMap<Integer, Integer> sortedByValue(HashMap<Integer, Integer> map ){
		LinkedList<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());  // assign mapinto LinkedList
		
		Collections.sort(list, new comparatorByValue());
		//System.out.println(list);
		LinkedHashMap<Integer, Integer> ansMap= new LinkedHashMap<>();
		for (Map.Entry<Integer, Integer> entry: list) {
			//System.out.println("loop entry: "+ entry.getKey()+ ", "+ entry.getValue());
			ansMap.put(entry.getKey(), entry.getValue());
		}
		
		return ansMap;
	}
	
	public static class comparatorByValue implements Comparator<Map.Entry<Integer, Integer>>{

		@Override
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
			// TODO Auto-generated method stub
			return o1.getValue() - o2.getValue();
			//return o1.getValue().compareTo(o2.getValue());
		}

	}
	
	// 4. How do you get distinct characters and their count in a string in Java?
	public static HashMap<Character, Integer> distinctChar(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char cha: str.toCharArray()) {
			map.put(cha, map.getOrDefault(cha, 0)+1);
		}
		
		return map;
	}
	
	
	// 5.  How do you show a diamond problem with multiple inheritance in Java?

	
	// 6. Write a program in Java to count the digits in a number.
	public static int countDigits(int num) {
		int cnt = 0;
		while (num != 0) {
			num = num / 10;
			cnt += 1;
		}
		return cnt;
				
	}
	
	
	// 7. Write a program in Java to Toggle the case of every character of a string. For instance, if the input string is “CoGEnt”, the output should be “cOgeNT”.
	public static String toggleCase(String str) {
		
		String ans = "";
		for (char cha: str.toCharArray()) {
			if ((cha >= 'A') && (cha <= 'Z')){ // upperletter
				int pos = cha - 'A' + 'a';
				ans += (char) pos;
			}else if ((cha >= 'a') && (cha <= 'z')) {
				int pos = cha - 'a' + 'A';
				ans += (char) pos;
			}
		}
		
		return ans;
	}
	
	// 8.Java program to remove duplicate elements from a singly linked list
	public static Node removeDuplicatedNode(Node head) {
		if (head == null || head.next ==null) {
			return head;
		}
		
		HashSet<Integer> set = new HashSet<>();
		
		Node dummy = new Node(0);
		dummy.next = head;
		Node cur = head;
		
		while (cur != null && cur.next != null) {
			if ( !set.contains(cur.val)) { // no repeat
				cur = cur.next;
			}else { // repeated
				cur = cur.next.next;
			}
		}
		
		return dummy.next;
	}
	
	
	public static class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(5));
		HashMap<Integer, Integer> map= new HashMap<>();
		map.put(1, 100);
		map.put(5, 6);
		map.put(50, 2);
		map.put(9, 9999);
		System.out.println(sortedByValue(map));
		System.out.println("=== Q4 ===");
		System.out.println(distinctChar( "appple"));
		System.out.println("=== Q6 ===");
		System.out.println(countDigits(10445));
		
		System.out.println((char) 65);
		System.out.println("=== Q7 ===");
		System.out.println(toggleCase("CoGeNt"));
		
	}

}
