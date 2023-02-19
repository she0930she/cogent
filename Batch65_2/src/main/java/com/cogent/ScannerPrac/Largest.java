package com.cogent.ScannerPrac;

import java.util.Scanner;

public class Largest {

	public static float largestNum(float[] arr) {
		float max = arr[0];
		
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float no1, no2, no3;
		float[] arr = new float[3];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter float num");
			arr[i] = sc.nextFloat();
		}
		
		float max = largestNum(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[i]: "+ arr[i]);
			
		}
		System.out.println("largest num: "+ max);

	}
}
