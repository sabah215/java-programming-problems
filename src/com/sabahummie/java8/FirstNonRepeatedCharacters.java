/**
 * @author Sabah Ummie
 * @date 06-28-24
 * 
 * Given a String, find the first non-repeated character in it using Stream functions
 * 
 * 
 * */

package com.sabahummie.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacters {

	public static void main(String[] args) {
		String s = "Google";
		
		System.out.println(s);
		
		getNonRepeatedCharacter(s);
	}

	private static void getNonRepeatedCharacter(String s) {
		
//		Map<String, Long> map = Arrays.stream(s.split(""))
//				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//		
//		String firstRepeatedChar = map.entrySet().stream().filter(e -> e.getValue() == 1)
//				.map(e -> e.getKey()).findFirst().get();
//		System.out.println(firstRepeatedChar);		
	}

}
