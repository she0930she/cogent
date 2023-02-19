package com.cogent.StringTypes;

public class StringBufferExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer bf = new StringBuffer();
		System.out.println(bf.capacity());
		
		// append()
		bf.append("Helen");
		System.out.println(bf);
		
		// capacity()
		// The capacity is the amount of storage available for newly inserted characters
		System.out.println(bf.capacity());
		
		// delete()
		System.out.println("***** delete() *****");
		bf.delete(1, 3); // start, end
		System.out.println(bf);
		bf = new StringBuffer("Helen");
		
		// indexOf()
		System.out.println(bf.indexOf("e"));
		
		// insert(idx, String s)
		bf.insert(1, "second");
		System.out.println(bf);
		
		//length()
		System.out.println(bf.length());
		
		//reverse()
		bf.reverse();
		System.out.println(bf);
		System.out.println(bf.reverse());
		

	}

}
