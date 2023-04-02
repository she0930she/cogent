package com.cogent.immutableExample;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Amanda";  //immutable   // store in 1. constant pool
		// heap area: 1. constant pool, 2. non-constant pool
		
		String str2 = new String("King"); // store in 2. non-constant pool
		String str2_2 = new String("King");
		String str1 = "Amanda";
		System.out.println(str == str1);  // same value, 
		System.out.println(str2 == str2_2); // diff obj, false
		System.out.println(str2.hashCode() == str2_2.hashCode()); // hashcode stored based on value
		System.out.println(str.equals(str1));
		System.out.println(str2.equals(str2_2));
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		// ==  --> compare address
		// .equals()  --> compare values
		
		
//		System.out.println(str.hashCode()+ str.toString());
//		
//		str = str+ "Helen";
//		System.out.println(str.hashCode());
//		
//
//		StringBuffer sb= new StringBuffer("Amanda");  // mutable
//		System.out.println(sb.hashCode());
//		sb = sb.append("Helen");
//		System.out.println(sb.hashCode());
//		
		
	}

}
