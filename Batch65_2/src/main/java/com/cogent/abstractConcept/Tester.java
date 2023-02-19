package com.cogent.abstractConcept;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Abstract class objects can not be created
		// Employee e1 = new Employee();  --NO object
		// OK to create obj references -- YES
		Employee e1; // object reference -- YES
		HrDept hr = new HrDept();
		hr.add();
		hr.display();
		
		e1 = new HrDept(); // object creation of complete or concrete class
		e1.add();
		e1.display();
		
	}

}
