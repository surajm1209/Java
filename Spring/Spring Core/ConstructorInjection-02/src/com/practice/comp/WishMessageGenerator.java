package com.practice.comp;
import java.util.Date;

//Target class(userDefined=>WishMessageGenerator)
public class WishMessageGenerator {

	// Dependant class
	private Date date;

	static {
		System.out.println("\nWishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator(Date date) {
		this.date = date;
		System.out.println("WishMessageGenerator:: One Param constructor....");
	}

	// Business logic method
	public String generateMessage(String userName) {
		int hour = date.getHours();// get hour in 24 hour format

		if (hour < 12) {
			return "Good Morning :: " + userName;
		} else if (hour < 16) {
			return "Good AfterNoon :: " + userName;
		} else if (hour < 20) {
			return "Good Evening ::  " + userName;
		} else {
			return "Good Night :: " + userName;
		}
	}

	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}
