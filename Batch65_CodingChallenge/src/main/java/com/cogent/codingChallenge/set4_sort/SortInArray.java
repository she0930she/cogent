package com.cogent.codingChallenge.set4_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SortInArray {

	// 1WAP to Search an Element in an Array
	public static int findanElement(int num, int[] arr) {
		// return idx
		
		if (arr == null || arr.length == 0) {
			return -1;
		}
		
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	
	// 2WAP to Find the Largest Element in an Array
	public static int findLargest(int[] arr) {
		// return idx
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int maxIdx = 0;
				
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] > arr[maxIdx]) {
				maxIdx = i;
			}
		}
		
		return maxIdx;
		
	}
	
	// 3WAP to Sort an Array
	public static int[] sortArray(int[] arr) {
		if (arr == null || arr.length == 0) {
			return new int[] {};
		}
		
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		return arr;
		
	}
	
	// 4WAP to Sort the Elements of an Array in Descending Order
	public static int[] sortArrayDesc(int[] arr) {
		if (arr == null || arr.length == 0) {
			return new int[] {};
		}
		
		Arrays.sort(arr);
		arr = inplaceSort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		
		return arr;
		
	}
	public static int[] inplaceSort(int[] arr) {
		int l = 0;
		int r = arr.length-1;
		
		while(l < r) {
			int tmp = arr[l];
			arr[l] = arr[r];
			arr[r] = tmp;
			l ++;
			r --;
		}
		return arr;
	}
	
	// 5WAP to Sort the Elements of an Array in Ascending Order
	
	
	// 6WAP to Remove Duplicate Elements From an Array
	public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> arr) {
		if (arr == null || arr.size() == 0) {
			return new ArrayList<Integer>() ;
		}
		
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		for (int num: arr) {
			if (set.contains(num)) {
				continue;
			}
			ans.add(num);
			set.add(num);
		}
		
		return ans;
			
	}
	
	// 7WAP to Merge Two Arrays
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		// count backwards
		int l = m-1, r = n-1;
		
		while (l >=0 && r >= 0) {
			if (nums1[l] >= nums2[r]) {
				
				nums1[l+r+1] = nums1[l];
				l --;
				
			}else {
				nums1[l+r+1] = nums2[r];
				r --;
			}
			
		}
		Arrays.stream(nums1).forEach(System.out::println);
		return nums1;
        
    }
	
	
	// 8WAP to Check if Two Arrays Are Equal or Not
	public boolean sameArray(int[] nums1,  int[] nums2) {
		if (nums1.length != nums2.length) {
			return false;
		}
		
		for (int i = 0; i< nums1.length; i++) {
			if (nums1[i] != nums2[i]) {
				return false;
			}
		}
		return true;
	}
	
	// 9WAP to Remove All Occurrences of an Element in an Array
	
	
	// 10WAP to Find Common Array Elements
	public static ArrayList<Integer> findCommmons(int[] arr1, int[] arr2){
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer> ans = new ArrayList<>();
		
		int l=0,r =0;
		
		while (l < arr1.length &&r< arr2.length) {
			if (arr1[l] == arr2[r]) {
				ans.add(arr1[l]);
				l ++;
				r ++;
			} else if (arr1[l] > arr2[r]) {
				// move smaller ele
				r ++;
			}else {
				l ++;
			}
		}
		
		return ans;	
	}
	
	
	
	
	// 11WAP to Copy All the Elements of One Array to Another Array
	public static int[] copyArray(int[] arr) {
		if (arr == null || arr.length == 0) {
			return new int[] {};
		}
		
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i ++) {
			ans[i] = arr[i];
		}
		return ans;
	}
	
	
	
	// 12WAP For Array Rotation
	public static int[] rotateArray(int[] arr, int d) {
		
		int[] copyArr = new int[arr.length];
		for (int i = 0; i< arr.length; i++) {
			copyArr[i] = arr[i];
		}
		
		// 2~5
		for (int i = d; i< arr.length; i++) {
			arr[i-d] = arr[i];
		}
		
		// 0~1
		for (int i = 0; i<d; i++) {
			arr[arr.length - d + i] = copyArr[i];
		}
		Arrays.stream(arr).forEach(System.out::println);
		return arr;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(findanElement(8, new int[] {80,9,100,7,3,8}));
		System.out.println(findLargest(new int[] {80,9,100,7,3,8}));
		System.out.println("==== q3 ====");
		System.out.println(sortArray(new int[] {80,9,100,7,3,8}));
		System.out.println("==== q4 ====");
		System.out.println(sortArrayDesc(new int[] {80,9,100,7,3,8}));
		System.out.println("==== q5 ====");
		System.out.println(merge(new int[] {1,2,4,5, 0, 0, 0},4, new int[] {1,3,6}, 3));
		
		System.out.println(findCommmons(new int[] {80,9,100,7,3,8}, new int[] {0,8,88,9,80,7}));
		
		System.out.println("==== Q12 ====");
		System.out.println(rotateArray(new int[] {1,2,3,4,5}, 2));
		
		
	}

}
