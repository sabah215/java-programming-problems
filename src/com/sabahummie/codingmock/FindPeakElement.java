/**
 * @author Sabah Ummie
 * @date 06-26-24
 * 
 * 
 *Find Peak Element in the Array
 *
 *[1, 3, 5, 2, 4, 6, 8] Output: The peak element is 5
 * 
 * Time: 
 * Space:
 * 
 * */

package com.sabahummie.codingmock;

import java.util.Arrays;
import java.util.List;

public class FindPeakElement {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 3, 5, 2, 4, 6, 8);
		
//		List<Integer> nums = Arrays.asList(1, 3, 4, 6, 5, 6, 8);
		System.out.println(getPeak(nums));
	}

	private static int getPeak(List<Integer> nums) {
		
		int peak = Integer.MIN_VALUE;
		
		for(int i = 1; i< nums.size()-1; i++) {
			
			if(nums.get(i) > peak) {
				peak = nums.get(i);
			}
			else break;
		}
		
		return peak;
	}

}
