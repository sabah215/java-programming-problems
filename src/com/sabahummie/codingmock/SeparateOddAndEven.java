/**
 * @author Sabah Ummie
 * @date 06-26-24
 * 
 * 
 * Separate Odd and Even Numbers in an Array
 * 
 * [1, 2, 3, 4, 5, 6, 7, 8, 9] Output: Odd numbers: [1, 3, 5, 7, 9], Even numbers: [2, 4, 6, 8]
 * 
 * Time: 
 * Space:
 * 
 * */



package com.sabahummie.codingmock;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateOddAndEven {

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("----------------------------" );
		getOddAndEvenNumbers(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void getOddAndEvenNumbers(int [] nums) {
		
		int i = 0, j=nums.length-1;
		
		while(i < j) {
			
			while(nums[i] % 2 == 0 && i < j) {
				i++;
			}
			while(nums[j] % 2 == 1 && i < j) {
				j--;
			}
			
			if(i < j) {
				swap(nums,i, j);
				i++;
				j--;
			}
		}
	}
	
	private static void swap(int [] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
