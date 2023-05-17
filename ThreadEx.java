package com.hp.threads;

public class ThreadEx implements Runnable{// FI-->SAM

	@Override
	public void run() {//running
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("rps");
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");// 5,thread-0
		}//end/dead 
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("hp");
		System.out.println(Thread.currentThread().getName());
		Thread thread = new Thread(new ThreadEx()); //new state 
		thread.start();// runnable state

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");// thread schedular main 1-10 5
		}
	}

}
