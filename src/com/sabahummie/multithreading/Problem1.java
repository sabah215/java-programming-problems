/**
 * Write a Java program to get the state of the currently executing thread
 * 
 * */

package com.sabahummie.multithreading;

import java.util.Set;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 thread1 = new Thread1("Custom Thread 1");
		thread1.start();
		System.out.println(thread1.getState());
		
		
		Thread1 thread2 = new Thread1("Custom Thread 2");
		thread2.start();
		System.out.println("Thread 1 status: " + thread1.getState());
		System.out.println("Thread 2 status: " + thread2.getState());
		System.out.println(Thread.currentThread().getName()+ " " +Thread.currentThread().isDaemon());
	}

}

class Thread1 extends Thread {
	
	public Thread1(String threadName) {
		super(threadName);
	}
	
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + " time is running...");
			try {
				Thread.sleep(750);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+ " " +Thread.currentThread().isDaemon());
	}
}

class Thread2 extends Thread {
	
	public Thread2(String threadName) {
		super(threadName);
	}
	
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + " time is running...");
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+ " " +Thread.currentThread().isDaemon());
	}
}