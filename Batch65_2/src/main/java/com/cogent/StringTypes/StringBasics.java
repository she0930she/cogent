package com.cogent.StringTypes;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Mary";
		char[] s2 = {'M', 'a', 'r', 'y'};
		String s3 = new String(s2);
		String s4 = new String("Mary");
		String s5 = new String("A");
		String s6 = new String("B");
		
		System.out.println(s2.hashCode());
		System.out.println('A');
//		
		// ASCII A-65 (hashCode() is different only String)
		// equals() -- it compares content in the string
		// instead of reference object
		// == VS equals()
		
		System.out.println("*****   equals() ********");
		System.out.println(s.equals(s4)); //true
		
		System.out.println("******* == *******");
		System.out.println(s == s4); 
		// false, both reference pointing other locations
		
		String s7 = "Mary";
		System.out.println("*****  String Pool  ********");
		System.out.println(s4 == s7);
		System.out.println(s == s7);
		
		s = "Sandeep";
		System.out.println("*****  Sandeep ********");
		System.out.println(s == s7);
		System.out.println(s.equals(s7));
		
		// 7 - All pre-defined methods
		System.out.println(s.charAt(0));
		// any 5 methods of my choice
		
		System.out.println("*****  new String ********");
		String s8 = new String("Mary");
		System.out.println(s4.equals(s8));
		System.out.println(s4 == s8);
		
		
		
		

	}

}
