/**
 * @author Sabah Ummie
 * @date 06-27-24
 * 
 * Given a list of integers, find out all the even numbers exist in the list using Stream functions?
 * 
 * 
 * */

package com.sabahummie.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllEvenIntegers {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,5,4,16,3,15,20,22,19);
		List<Integer> even = getEvenNumbers(list);
		System.out.println(list);
		System.out.println(even);

	}
	
	public static List<Integer> getEvenNumbers(List<Integer> l) {
		
		List<Integer> even = 
				l.stream().filter(e -> (e % 2 == 0)).collect(Collectors.toList());
		
		return even;
	}

}
