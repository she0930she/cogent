package com.cogent.streamAPIBasics;

public class Customers {
	
	int id;
	String name;
	float balance;
	String address;
	String gender;
	
	public Customers() {
		super();
	}

	public Customers(int id, String name, float balance, String address, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.address = address;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", balance=" + balance + ", address=" + address + ", gender="
				+ gender + "]";
	}

	

	
	

}
