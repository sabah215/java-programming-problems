/**
 * @author Sabah Ummie
 * @date 06-28-24
 * 
 * 
 * Write a program to print 5 random numbers using forEach in Java 8
 * 
 * 
 * */

package com.sabahummie.java8;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumbers {

	public static void main(String[] args) {
		
	
		Random rand = new Random();
		rand.ints(5, 1, 10).limit(5).forEach(System.out::println);
		
	}
}
