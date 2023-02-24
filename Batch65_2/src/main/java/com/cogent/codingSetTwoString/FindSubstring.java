package com.cogent.codingSetTwoString;

public class FindSubstring {
	
	//1. Find All substring of string in java Program
	public static String[] findSubstring(String s) {
		for (int i= 0 ; i < s.length(); i++) {
			String tmp = "";
			
			for (int j = i; j< s.length(); j++) {
				tmp += s.charAt(j);
				System.out.println(tmp);
				
			}
		}
		
		
		return new String[] {};
	}
	
	// 2. Print reverse string in java Program
	public static String reverseString(String s) {
		String ans = "";
		
		for (int i = s.length()-1; i >= 0 ; i--) {
			ans += s.charAt(i);
		}
		
		return ans;
	}
	
	// 3. Check Given No is palindrome or Not in java Program
	public static boolean isPalindrome(String s) {
		boolean ans=false;
		int i=0, j = s.length()-1;
		
		while (s.charAt(i) != s.charAt(j) ) {
			if (s.charAt(i) != s.charAt(j)) {
				return ans;
			}
			i++;
			j--;
		}
		
		ans = true;
		
		return ans;
	}
	
	// . How to add two matrix in java Program
	public static int[][] makeTwoMatrix(int m, int n) {
		int[][] matrix1 = new int[m][n]; 
		int[][] matrix2 = new int[m][n];
		int cnt = 1;
		
		for (int i = 0; i< m; i++) {
			for (int j= 0; j< n; j++) {
				matrix1[i][j] = cnt;
				matrix2[i][j] = cnt;
				cnt++;
				//System.out.println(matrix1[i][j]);
			}
		}
		return matrix1;
	}
	
	// 5. How to multiply two matrix in java Program
	public static int[][] multiplyMatrix(){
		int[][] matrix1 = makeTwoMatrix(3,4);
		int[][] matrix2 = makeTwoMatrix(3,4);
		int m = matrix1.length;
		int n = matrix1[0].length;
		int[][] ans = new int[m][n];
		
		for (int i = 0; i< m ; i++) {
			for (int j = 0; j < n ; j++) {
				ans[i][j] = matrix1[i][j] * matrix2[i][j];
				System.out.println(ans[i][j]);
			}
		}
		
		return ans;
		
	}
	
	// 6. How to replace string with another string in java Program
	public static String stringReplace(String s, String word) {
		s = word;
		return s;
	}
	
	// 7. How to Generate random number in java Program
	public static double makeRandomNum() {
		double ans = Math.random();
		
		return ans* 1000;
	}
	public static int makeRandomNum2() {
		int ans = (int) (Math.random()*1000) ;
		
		return ans;
	}
	
	// 8. Binary search Program in java
	// return index
	public static int binarySearch(int[] arr, int target) {
		int l = 0;
		int r = arr.length-1;
		
		while (l <= r) {
			int mid = (r-l) / 2 + l;
			if (arr[mid] == target) {
				return mid;
			} else if (target > arr[mid] ) {
				l = mid;
			} else {
				r = mid;
			}
		}
		return l;
	}
	
	// 9. How to create Method Overriding program in java
	// in Tester, Animal, Dog
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printAllSubStrings("abc", 3);
		findSubstring("abcd");
		System.out.println(reverseString("apple"));
		System.out.println(isPalindrome("abba"));
		System.out.println(isPalindrome("aba"));
		System.out.println(isPalindrome("ab"));
		makeTwoMatrix(3,3);
		multiplyMatrix();
		System.out.println(stringReplace("Jannet", "Mary J"));
		System.out.println(makeRandomNum());
		System.out.println(makeRandomNum2());
		int[] arr = new int[] {1,3,5,7,9,11};
		System.out.println(binarySearch(arr, 7));
		
		
	}

}
