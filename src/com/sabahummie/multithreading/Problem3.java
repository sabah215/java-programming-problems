/**
 * Write a Java program to suspend and resume a thread
 * */

package com.sabahummie.multithreading;

public class Problem3 {

	public static void main(String[] args) {
		
		Thread t = new Thread(
				() -> {
					try {
						System.out.println("Threads starts running...");
						Thread.sleep(5000L);
						System.out.println("Thread stops");
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
		);
		
		t.start();

	}

}
