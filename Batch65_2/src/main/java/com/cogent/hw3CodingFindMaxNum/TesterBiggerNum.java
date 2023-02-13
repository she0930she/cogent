package com.cogent.hw3CodingFindMaxNum;

import java.awt.SystemColor;

public class TesterBiggerNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DS1.3. Find Bigger number among two 
		BiggerNum bigger = new BiggerNum();
		int ans1 = bigger.BiggerNum(100, 6);
		System.out.println("ans 1: "+ ans1);
		
		// DS1.4. Swap two number 
		int[] pair = bigger.swap(100, 6);
		//System.out.println("ans 2: "+ String.valueOf(pair[0]) + String.valueOf(pair[1]));
		System.out.printf("ans 2: "+ pair[0] + ", " +pair[1]);
		System.out.println();

		
		// DS1.5. Swap two numbers without using extra variable 
		int[] pair2 = bigger.swapWithoutExtraVar(100, 6);
		System.out.printf("ans 3: "+ pair[0] + ", " +pair[1]);
		System.out.println();

		
		// DS1.6. Check number is even or odd using ternary operatsor
		int num = 5;
		String evenOrOdd = bigger.evenOrOdd(num);
		System.out.println("ans 4: "+ String.valueOf(num) +", " +evenOrOdd);
		
		int num2 = 10;
		String evenOrOdd2 = bigger.evenOrOdd(num2);
		System.out.println("ans 4: "+ String.valueOf(num2) + ", " + evenOrOdd2);
		
		
		// DS1.7. Find Bigger number among three numbes
		int[] array = new int[] {500, 1, 8};
		int max = bigger.maxNumAmongThree(array);
		System.out.println("ans 5: "+ max);
		
		// DS1.8. Find a character is vowel or consonant
		String ans = bigger.vowelOrConsonant('h');
		System.out.println("ans 6: "+ ans);
		String ans2 = bigger.vowelOrConsonant('a');
		System.out.println("ans 6: "+ ans2);
	
		System.out.println("************");
		// Q1: Write a method that accepts an array and return the second min and max number.
		int[] array3 = new int[] {500, 1, 8, 50, 1000, 88};
		int[] pair3 = bigger.secondMinAndMax(array3);
		System.out.println("the second min: "+ pair3[0]+ " ,the second max: " + pair3[1]);
		
		
		
		// Write a method that accepts two string arguments and returns true if they are anagram and false if they are not. An anagram is when all the letters in one string exist in another but the order of letters does not matter.
		String s1 = "tea";
		String s2 = "eat";
		boolean isAna = bigger.isAnagram(s1, s2);
		System.out.println("is anagram: "+ isAna);
		
		String[] pair4 = new String[] {"apple", "boy"};
		boolean isAna2 = bigger.isAnagram(pair4[0], pair4[1]);
		System.out.println("is anagram: "+ isAna2);
	}
	

}


/*
Find Solutions for following Questions and  ,Be ready with working of the solution you created.


DS1.3. Find Bigger number among two 
DS1.4. Swap two number 
DS1.5. Swap two numbers without using extra variable 
DS1.6. Check number is even or odd using ternary operatsor
DS1.7. Find Bigger number among three numbes
DS1.8. Find a character is vowel or consonant

Added 2 more Questions:

Q1: Write a method that accepts an array and return the second min and max number.

Q2: Write a method that accepts two string arguments and returns true if they are anagram and false if they are not. An anagram is when all the letters in one string exist in another but the order of letters does not matter.
Two question asked in walmart.



Note: Upload Solution to Git Hub, Update Once Done.
Also be ready to explain working of the code.

 */
