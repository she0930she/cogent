package com.cogent.comparableBasics;

import java.util.ArrayList;
import java.util.Collections;


//import com.cogent.comparatorBasics.BusinessLogic;
//import com.cogent.comparatorBasics.Employee;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> ls = new ArrayList<>();
		ls.add(new Employee(111, "Daniel", "SW", 35000.01f));
		ls.add(new Employee(112, "Jhn", "Admin", 55000.00f));
		ls.add(new Employee(113, "Mary", "Sales", 99000.00f));
		ls.add(new Employee(114, "Jane", "Promotion", 35000.00f));
		
		
		
		System.out.println("without sorting");
		for (Employee e: ls) {
			System.out.println(e);
		}
		
		Collections.sort(ls);
		for (Employee e: ls) {
			System.out.println(e);
		}
		
		
		//BusinessLogic b = new BusinessLogic();
		//b.addEmp();
		
	}

}
