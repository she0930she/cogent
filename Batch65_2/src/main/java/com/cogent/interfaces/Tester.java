package com.cogent.interfaces;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompleteClass cc = new CompleteClass();
		cc.show();
		cc.add();
		// cc.disp();  // coz its static method
		// cc.no= 70; // final can not be modified
		System.out.println(cc.no);
		InterfaceBasics.disp();
	}

}
