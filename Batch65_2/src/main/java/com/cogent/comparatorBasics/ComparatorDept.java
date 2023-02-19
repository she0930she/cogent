package com.cogent.comparatorBasics;

import java.util.Comparator;

public class ComparatorDept implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.dept.compareTo(o2.dept);
	}



}
