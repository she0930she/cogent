package com.cogent.ArrayListPrac;

import java.util.ArrayList;

public class HrTeam {
	
	void addEmp() {
		ArrayList<Employee> ls = new ArrayList<>();
		Employee e1 = new Employee(01, "Mary", 65000.00f);
		ls.add(e1);
		ls.add(new Employee(02, "John", 35000.00f));
		ls.add(new Employee(03, "Jane", 99000.00f));
		
		ls.forEach((indv) -> System.out.println(indv));
		
		System.out.println("============");
		
		for (Employee e: ls) {
			if (e.getSalary() > 50000.00f) {
				System.out.println(e+ "you get extra bonus");
				
			}
		}
		
	}

}
