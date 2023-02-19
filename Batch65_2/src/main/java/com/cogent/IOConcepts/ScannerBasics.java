package com.cogent.IOConcepts;

import java.util.Scanner;
// package --> java.util
// pre-defined class name --- > Scanner

public class ScannerBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WAP to perform Addition of two int Numbers...
		// you need to ask user to enter values
		int no1;
		int no2;
		
		// Library of I/ O
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter no1: ");
		no1 = sc.nextInt();
		System.out.println("no1: "+ no1);

	}

}
