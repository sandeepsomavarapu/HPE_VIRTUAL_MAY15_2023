package com.hp.exceptions;

import java.util.Scanner;

class Exception1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value for devision");
		int a = sc.nextInt();
		System.out.println("Enter Second value for devision");
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("division is " + c);
		} catch (ArithmeticException exce) {
			System.out.println("denominator can't be zero");
		}
		System.out.println("remaining 1000 lines of code");
	}
}


// 1.system defined error messages
// 2.abnormal termination

//1.user friendly error messages
//2.normal termination
//try,catch,finally,throw,throws