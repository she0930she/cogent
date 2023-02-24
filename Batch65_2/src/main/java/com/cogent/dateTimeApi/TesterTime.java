package com.cogent.dateTimeApi;

import java.time.LocalTime;

public class TesterTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());

		System.out.println("=== current time ===");
		if (lt.getHour()>= 12 && lt.getHour() <= 18) {
			System.out.println("Good evening");
		} else if(lt.getHour()>= 0 && lt.getHour()<= 11 ) {
			System.out.println("Good morning");
		}else {
			System.out.println("Good night");
		}
		
		System.out.println("=== input time ===");
		greeting(13, 50);
		greeting(20,00);
		greeting(11,59);
		
		
	}
	
	public static void greeting(int hour, int min) {
		if (hour>= 12 && hour <= 18) {
			System.out.println("Good evening");
			
		} else if( hour>= 0 && hour <= 11 ) {
			
			System.out.println("Good morning");
		}else {
			
			System.out.println("Good night");
		}
	}
}
