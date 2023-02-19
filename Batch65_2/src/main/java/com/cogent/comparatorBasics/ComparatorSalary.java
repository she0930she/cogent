package com.cogent.comparatorBasics;

import java.util.Comparator;

public class ComparatorSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return Float.compare(o1.salary, o2.salary);
	}


	
}
