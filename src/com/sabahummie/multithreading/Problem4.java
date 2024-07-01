/**
 *Write a Java program to interrupt the execution of a thread
 * 
 * */
package com.sabahummie.multithreading;

public class Problem4 {

	public static void main(String[] args) {
		
		Object resource = new Object();
		
		Thread t1 = new Thread(
				() -> {
					
					synchronized(resource) {
						try {
							System.out.println("Thread-1 is running");
							System.out.println("Thread-1 is paused");
							resource.wait();
							System.out.println("Thread-1 resuming after notified.");
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
						
					}
					
				}
		);
		
		Thread t2 = new Thread(
				() -> {
					synchronized(resource) {
						try {
							System.out.println("Thread-2 is running");
							Thread.sleep(5000L);
							System.out.println("Thread-2 notifying Thread 1 to wake up");
							resource.notify();
						}catch(InterruptedException ex) {
							ex.printStackTrace();
						}
					}	
				}
		);
		
		
		t1.start();
		t2.start();
		
	
		
	
	}
	
}

class MyThread extends Thread{
	
	@Override
	public void run() {
		
	}
}
