package com.hp.threads;

public class ThreadEx1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("child thread...");
		}
	}

	public static void main(String[] args) {

		ThreadEx1 obj=new ThreadEx1();
		obj.start();//run
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread...");
		}//thread schedular
	}

}
