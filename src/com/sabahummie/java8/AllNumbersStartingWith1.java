/**
 * @author Sabah Ummie
 * @date 06-27-24
 * 
 * Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 * 
 * 
 * */
package com.sabahummie.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllNumbersStartingWith1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,4,16,3,15,20,22,19, 015);
		List<Integer> numbers = getNumbersStartingWith1(list);
		System.out.println(list);
		System.out.println(numbers);

	}
	
	public static List<Integer> getNumbersStartingWith1(List<Integer> list){
		
		List<Integer> nums = 
				list.stream().filter(n -> checkNumber(n)).collect(Collectors.toList());
		
		return nums;
	}
	
	public static boolean checkNumber(int n) {
		
		if(n == 1) {
			return true;
		}
		else if(n == 0) return false;
		
		return checkNumber(n/10);
	}
}
