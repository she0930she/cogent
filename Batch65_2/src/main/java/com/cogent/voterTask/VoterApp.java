package com.cogent.voterTask;

public class VoterApp {

	void checkAvailability(int age) {
		if (age < 18) {
			System.out.println("not the age can vote: " + age);
		} else {
			System.out.println("you can vote: " + age);
		}

	}

}
