/**
 * @author Sabah Ummie
 * @date 06-28-24
 * 
 * Given a list of integers, find the maximum value element present in it using Stream functions
 * 
 * 
 * */

package com.sabahummie.java8;

import java.util.Arrays;
import java.util.List;

public class MaximumValue {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,4, 16,5, 1);
		
		System.out.println(list);
		
		getMax(list);
	}

	private static void getMax(List<Integer> list) {
		
		System.out.println(list.stream().max(Integer::compareTo).get());
	}

}
