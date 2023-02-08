package com.cogent.basics;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 8 operators from different types
		int no1, no2, no3, result;
		no1 = 5;
		no2 = 10;
		no3 = 15;
		result = no1;
		System.out.println("1: "+ result);
		System.out.print("2: ");
		System.out.println(no1 > no2);
		System.out.println("3: "+ no1+ no2);
		result += no1;
		System.out.println("4: "+ result);
		System.out.print("5: ");
		System.out.println(no1 == no2);
		System.out.print("6: ");
		System.out.println(no1 % no2);
		System.out.print("7: ");
		System.out.println(no1 ^ no2);
		System.out.print("8: ");
		System.out.println(no1 != no2);

	}

}
