package com.sabahummie.codingmock;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] nums = {10,5,7,3,6,9};
		//int [] nums = {10,100};
		bubbleSort(nums);
		
		printArray(nums);

	}
	
	public static void bubbleSort(int [] arr) {
		
		for(int i=0; i < arr.length; i++) {
			for(int j= i+1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	public static void swap(int [] arr, int i, int j) {
		
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
	public static void printArray(int [] arr) {
		
		for(int n : arr) {
			System.out.print(n + " ");			
		}
	}

}
