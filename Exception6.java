package com.hp.exceptions;//our class should extends exception,Throwable

//parameterized constructor
class AgeNotValid extends Exception {
	public AgeNotValid(String message) {
		super(message);
	}
}

public class Exception6 {
	static void validation(int age) throws AgeNotValid {
		if (age < 18)

			throw new AgeNotValid("You are not eligible to vote");// MyException1 obj
		else
			System.out.println("you are eligable to vote");
	}

	public static void main(String args[]) throws AgeNotValid  {
		Exception6.validation(16);
		System.out.println("rest of the code...");
	}
}
//username =india and password =india123