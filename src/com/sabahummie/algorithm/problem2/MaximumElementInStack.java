/**
 * @author Sabah Ummie
 * @date 06-26-24
 * 
 * Write a Java program to Find Maximum Element in a Stack
 * 
 * Time: 
 * Space:
 * 
 * */

package com.sabahummie.algorithm.problem2;

import java.util.Random;
import java.util.Stack;

public class MaximumElementInStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Random rand = new Random();
		
		for(int i = 0; i < 5; i++) {
			st.push(rand.nextInt(10));
		}
		for(int i=0; i < st.size(); i++) {
			System.out.print(st.get(i)+", ");
		}
		System.out.println();
		System.out.println(getMax(st));
	}
	
	public static int getMax(Stack<Integer> st) {
		
		int max = Integer.MIN_VALUE;
		
		while(!st.empty()) {
			max = Math.max(max, st.pop());
		}
		return max;
	}

}
