package com.cogent.abstraction;

public class Employee {
	int empId;
	String empName;
	String empDept;
	float empSalary;
	
	void addEmployee(int id, String name, String dept, float salary) {
		empId = id;
		empName = name;
		empDept = dept;
		empSalary = salary;
		
		System.out.println("add employees here");
	}
	
	void deleteEmployee() {
		System.out.println("delete employees here");
	}
	
	void updateEmployee () {
		System.out.println("update employees here");
	}
	
	void display() {
		System.out.println("id: "+ empId);
		System.out.println("name: "+ empName);
		System.out.println("dept: "+ empDept);
		System.out.println("salary: "+ empSalary);
	}

	
}
