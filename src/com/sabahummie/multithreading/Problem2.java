/**
 * Write a Java program to check thread is alive or not
 * 
 * */

package com.sabahummie.multithreading;

public class Problem2 {

	public static void main(String[] args) {
		
		CustomThread th = new CustomThread();
		System.out.println("Before start " + th.isAlive());
		th.start();
		System.out.println("After start " + th.isAlive());
	}
}

class CustomThread extends Thread{
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("name " + Thread.currentThread().getName() + " " +i);
			
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}