package com.hp.threads;

public class ThreadEx implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");// 5,thread-0
		}

	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("hp");
		System.out.println(Thread.currentThread().getName());
		Thread thread = new Thread(new ThreadEx());
		thread.start();// run method

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");// thread schedular main 1-10 5
		}
	}

}
