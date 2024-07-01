/**
 * @author Sabah Ummie
 * @date 06-28-24
 * 
 * Given the list of integers, find the first element of the list using Stream functions?
 * 
 * 
 * */
package com.sabahummie.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,4,16,5, 1);
		
		System.out.println(list);
		
		getFirstElement(list);
	}

	private static void getFirstElement(List<Integer> list) {
		Optional<Integer> n = list.stream().findFirst();
		if(n.isPresent()) {
			System.out.println(n.get());
		}
	
	}

}
