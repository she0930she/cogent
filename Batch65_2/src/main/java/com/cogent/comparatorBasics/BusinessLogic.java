package com.cogent.comparatorBasics;

import java.util.ArrayList;
import java.util.Collections;

public class BusinessLogic {
	
	void addRecords() {
		// Collection
		// object need to be added
		
		ArrayList<Employee> ls = new ArrayList<>();
		ls.add(new Employee(111, "Daniel", "SW", 35000.01f));
		ls.add(new Employee(112, "Jhn", "Admin", 55000.00f));
		ls.add(new Employee(113, "Mary", "Sales", 99000.00f));
		ls.add(new Employee(114, "Jane", "Promotion", 35000.00f));
		
		System.out.println("without sorting");
		for (Employee e: ls) {
			System.out.println(e);
		}
		
		
		// want to see the Sorted data As per name
		// we need Comparator
		// need new class, coming from comparator interface
			// Override method... compare(){......}
		// sort() with comparator we created	
		
		
		Collections.sort(ls, new NewComparator());
		System.out.println("with sorting, --name");
		for (Employee e: ls) {
			System.out.println(e);
		}
		
		Collections.sort(ls, new ComparatorDept());
		System.out.println("with sorting, --dept");
		for (Employee e: ls) {
			System.out.println(e);
		}

		Collections.sort(ls, new ComparatorId());
		System.out.println("with sorting, --id");
		for (Employee e: ls) {
			System.out.println(e);
		}
		
		Collections.sort(ls, new ComparatorSalary());
		System.out.println("with sorting, --Dept");
		for (Employee e: ls) {
			System.out.println(e);
		}
		
	}

}
