package com.cogent.StringTypes;

public class StringBuilderExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
//		
//		// append()
		sb.append("Helen");
		System.out.println(sb);
		
		// deleteCharAt()
		System.out.println("***** deleteCharAt() *****");
		sb.deleteCharAt(1); // start, end
		System.out.println(sb);
		sb = new StringBuilder("Helen");

		// setCharAt()
		sb.setCharAt(1, 'g');
		System.out.println(sb);
		
		
		// setLength()
		sb.setLength(2);
		System.out.println(sb);
		sb = new StringBuilder("Helen");

		// subSequence(int start, int end)
		System.out.println("****** subSequence ******");
		sb.subSequence(1, 3);
		System.out.println(sb);
		System.out.println(sb.subSequence(1, 3));
		
		//subString()
		System.out.println("****** subString ******");
		System.out.println(sb.substring(1));
		System.out.println(sb.substring(1, 3));
		
//		
//		//reverse()
//		bf.reverse();
//		System.out.println(bf);
//		System.out.println(bf.reverse());
		
	}

}
