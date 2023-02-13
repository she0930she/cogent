package com.cogent.pracInheritance;

public class TesterMachines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[in washing machine]");
		WashingMachine w = new WashingMachine();
		w.switchON();
		w.washClothes();
		
		
		System.out.println("*******");
		System.out.println("[in AC]");
		AC ac = new AC();
		ac.switchON();
		ac.temperature();
		
		
		System.out.println("*******");
		System.out.println("[in machine]");
		Machine m = new Machine();
		m.switchON();
		
	}

}
