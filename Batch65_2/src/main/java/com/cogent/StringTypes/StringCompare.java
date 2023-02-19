package com.cogent.StringTypes;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("Mary");
		String s2 = new String("Mary");
		String sA = new String("A");
		String sM = new String("M");
		
		// The comparison is based on the Unicode value of each character in the strings.
		// The method returns 0 if the string is equal to the other string.
		// a value greater than 0 if the string is greater than the other string (more characters).
		System.out.println("****** compareTo()  *******");
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(sA));
		System.out.println(sA.compareTo(s));
		
		// return bool
		System.out.println("****** contains()  *******");
		System.out.println(s.contains(sM));
		System.out.println(s.contains(sA));
		
		System.out.println("****** length()  *******");
		System.out.println(s.length());
		System.out.println(sA.length());
		
		
		System.out.println("****** toCharArray()  *******");
		//System.out.println(s);
		
		char[] arr = s.toCharArray();
		System.out.println(arr);
		for (char cha: arr) {
			System.out.println(cha);
		}

		
		System.out.println("****** charAt()  *******");
		System.out.println(s.charAt(3));
	}

}
