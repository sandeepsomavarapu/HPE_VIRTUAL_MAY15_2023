package com.hp.java8;

interface Calculator1 {

	public void caluculate(int a, int b);

}

public class DoubleColonOperatorEx {

	DoubleColonOperatorEx(int a, int b) {
		System.out.println(a * b);
	}

	public DoubleColonOperatorEx() {
		System.out.println("default constructor");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {

		Calculator1 cal = DoubleColonOperatorEx::sub;
		cal.caluculate(12, 9);
		
		DoubleColonOperatorEx obj = new DoubleColonOperatorEx();
		Calculator1 cal1 = obj::add;
		cal1.caluculate(12, 9);
		
		Calculator1 cal2 =DoubleColonOperatorEx::new;
		cal2.caluculate(12, 9);
		
	}

}
