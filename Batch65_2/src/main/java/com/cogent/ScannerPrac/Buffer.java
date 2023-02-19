package com.cogent.ScannerPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		float no1, no2, no3, no4;
		no4 = 0.00f;
		no1 = Float.parseFloat(bf.readLine());
		no2 = Float.parseFloat(bf.readLine());
		no3 = Float.parseFloat(bf.readLine());
		
		//System.out.println("no1: "+ no1+ ", no2: "+ no2+ " , no3: "+ no3);
		no4 += no1+ no2+ no3;
		System.out.println("result adding: "+ no4);
	}

}
