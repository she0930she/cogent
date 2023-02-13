package com.cogent.bankTask;

public class BankApp {
	
	float balance = 0;
	
	void withdrawAmt(float num) {
		balance -= num;
		System.out.println("withdraw amount: " + balance);
		
	}
	
	void depositAmt(float num) {
		balance += num;
		System.out.println("deposit amount: " + balance);
		
	}
	
	void displayBal() {
		System.out.print("display balance: " + balance);
		
	}

}
