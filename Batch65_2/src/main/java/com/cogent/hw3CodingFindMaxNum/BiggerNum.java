package com.cogent.hw3CodingFindMaxNum;

import java.util.Arrays;

public class BiggerNum {
//	int a;
//	int b;
	
	int BiggerNum(int a, int b) {
		if (a >= b) {
			return a;
		}else {
			return b;
		}
	}
	
	int[] swap (int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;		
		
		return new int[] {a,b};
	}
	
	int[] swapWithoutExtraVar (int a, int b) {
		
		return new int[]{b,a};
	}
	
	String evenOrOdd(int num) {
		String ans = (num % 2 == 0) ? "even" : "odd";
		
		return ans;
	}
	
	
	int maxNumAmongThree(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -1;
			} 
		int max = arr[0];
		for (int num: arr) {
			if (max < num) {
				max = num;
			}
		}
		
		return max;
	}
	
	String vowelOrConsonant(char cha) {
		char[] vowels = new char[] {'a', 'e','i','o','u','A','E','i','o','u'};
		for (char letter: vowels) {
			if (letter == cha) {
				return cha + " is vowel";
			}
		}
		
		return  cha + " is consonant";
		
	}
	
	int[] secondMinAndMax(int[] arr) {
		if (arr == null || arr.length < 4) {
			return new int[] {-1};
		}
		
		Arrays.sort(arr);
		int min = arr[1];
		int max = arr[arr.length -2];
		
		return new int[] {min, max};
		
	}
	
	
	boolean isAnagram(String w1, String w2) {
		
		int[] arr1 = countFrequency(w1);
		int[] arr2 = countFrequency(w2);
		
		for (int i = 0; i< arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	int[] countFrequency (String w) {
		int[] arr = new int[26];
		
		for (char cha: w.toCharArray()) {
			int pos = cha - 'a';
			arr[pos] += 1;
		}
		
		return arr;
	}
	

}
