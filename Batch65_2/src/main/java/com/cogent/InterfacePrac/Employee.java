package com.cogent.InterfacePrac;

public interface Employee {
	int comanyId = 100;
	
	void add();
	static void show() {
		System.out.println("show in Employee interface");
	}

}
