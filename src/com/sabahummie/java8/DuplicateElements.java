/**
 * @author Sabah Ummie
 * @date 06-27-24
 * 
 * How to find duplicate elements in a given integers list in java using Stream functions?
 * 
 * 
 * */
package com.sabahummie.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,4,16,5, 1);
		
		System.out.println(list);
		
		Set<Integer> numbers = getDuplicate(list);
		System.out.println(numbers);
	}

	private static Set<Integer> getDuplicate(List<Integer> list) {
//		Set<Integer> duplicates = 
//				list.stream().filter(n -> Collections.frequency(list, n) > 1)
//				.collect(Collectors.toSet());
//		return duplicates;
		
		Set<Integer> dup = new HashSet<>();
		Set<Integer> set = list.stream().filter(
				 n -> !dup.add(n))
				.collect(Collectors.toSet());
		return set;
	}
	
	
}
