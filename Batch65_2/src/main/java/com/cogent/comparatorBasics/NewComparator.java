package com.cogent.comparatorBasics;

import java.util.Comparator;

// inherit interface -- key implements
public class NewComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		// logic to compare objects
		
		return o1.name.compareTo(o2.name);
		// change statement here
	}
	
	
	
	
	
	
	

}
