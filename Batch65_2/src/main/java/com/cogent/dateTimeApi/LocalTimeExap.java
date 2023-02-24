package com.cogent.dateTimeApi;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalTimeExap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		Date dateinfo = new Date();
		System.out.println(dateinfo.toLocaleString());

	    ZoneId id = ZoneId.of("Europe/Paris");
	    System.out.println("ZoneId: " + id);
		
		
	}

}
