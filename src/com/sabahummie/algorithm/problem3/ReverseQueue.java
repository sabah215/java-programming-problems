/**
 * @author Sabah Ummie
 * @date 06-26-24
 * 
 * Write a Java program to Reverse the order of elements in a queue without using any additional data structures
 * 
 * Time: 
 * Space:
 * 
 * */
package com.sabahummie.algorithm.problem3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ReverseQueue {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		Random rand = new Random();
		
		for (int i = 0; i < 5; i++) {
			queue.add(rand.nextInt(10));
		}
		
		for(int v : queue) {
			System.out.print(v + ", ");
		}
		System.out.println();
		reverse(queue);
		System.out.println(queue);
	}
	public static void reverse(Queue<Integer> queue) {
	
		int polled = queue.poll();
		
		if(!queue.isEmpty()) {
			reverse(queue);
		}
		queue.offer(polled);
	}
}
