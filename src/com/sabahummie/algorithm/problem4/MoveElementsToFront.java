/**
 * @author Sabah Ummie
 * @date 06-26-24
 * 
 * Write a Java program to Move all Even elements to the front of the queue while maintaining the relative order of other elements.
 * 
 * Time: 
 * Space:
 * 
 * */
package com.sabahummie.algorithm.problem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MoveElementsToFront {

	public static void main(String[] args) {
	
		Queue<Integer> queue = new LinkedList<>();
		Random rand = new Random();
		
		for (int i = 0; i < 5; i++) {
			queue.add(rand.nextInt(10));
		}
		
		System.out.println(queue);
		moveToFront(queue);
		System.out.println(queue);
	}
	
	public static void moveToFront(Queue<Integer> queue) {
		int size = queue.size();
		Queue<Integer> tempQueue = new LinkedList<>();
		
		for(int i = 0; i < size; i++) {
			int element = queue.poll();
			
			if(element % 2 == 0) {
				queue.offer(element);
			}
			else {
				tempQueue.offer(element);
			}
		}
		
		
		while(!tempQueue.isEmpty()) {
			queue.offer(tempQueue.poll());
		}
	}

}
