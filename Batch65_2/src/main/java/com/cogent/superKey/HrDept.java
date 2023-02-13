package com.cogent.superKey;

public class HrDept extends Employee{
	
//	void trySomething() {
//		super.id = 700;
//		super.addEmp();
//		System.out.println(id);
//		System.out.println(super.id);
//	}
	public HrDept() {
		//super(100);
		System.out.println("child");
	}
	
	public HrDept(int data) {
		super(1000);
		System.out.println("child2: "+ data);
	}
	
	
	

}
