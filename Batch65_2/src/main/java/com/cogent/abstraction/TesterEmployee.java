package com.cogent.abstraction;

public class TesterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.addEmployee(1, "Mary", "accounting", 11000);
		e.deleteEmployee();
		e.updateEmployee();
		e.display();
		System.out.println(e);

	}

}
