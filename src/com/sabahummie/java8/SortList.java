/**
 * @author Sabah Ummie
 * @date 06-28-24
 * 
 * Given a list of integers, sort all the values present in it using Stream functions
 * 
 * 
 * */


package com.sabahummie.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
	
		List<Integer> l = Arrays.asList(15, 9, 3,17, 12, 13, 4);
		
		List<Integer> sorted = l.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sorted);
	}

}
