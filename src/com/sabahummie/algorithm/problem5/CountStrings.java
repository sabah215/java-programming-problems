/**
 * @author Sabah Ummie
 * @date 06-26-24
 * 
 * Write a Java program to Counts the number of digits, alphabets, and special characters in a queue of strings.
 * 
 * Time: 
 * Space:
 * 
 * */
package com.sabahummie.algorithm.problem5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CountStrings {

	public static void main(String[] args) {
		/**
		 *  cat | dog | ant1 | !@@spy | @pple
		 *  
		 *  c -> 1, a -> 1, t -> 1
		 *  d -> 1, o -> 1, g -> 1
		 *  a -> 1, n-> 1, t -> 1, 
		 *  
		 * */
		
		Queue<String> words = new LinkedList<>();
		words.add("cat");
		words.add("eleph@nt!!!1223");
		words.add("hipp0@@109");
		words.add("d))gg");
		words.add("superC@l1frQg1l!5t!kesp!@l1d0shUs");
		
		countStrings(words);
	}
	
	public static void countStrings(Queue<String> queue) {
		
		while(!queue.isEmpty()) {
			String s = queue.poll();
			System.out.println(s);
			char [] ch = s.toCharArray();
			Map<Character, Integer> freqMap = new HashMap<>();
			
			for(char c : ch) {
				if(freqMap.containsKey(c)) {
					freqMap.put(c, freqMap.get(c) + 1);
				}
				else {
					freqMap.put(c, 1);
					}
			}
			
			for(Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
				System.out.print(entry.getKey() + " occurs " + entry.getValue() + " times.");
				System.out.println();
				
			}
			System.out.println("-------------------------------------------");
		}
		
	}
}


