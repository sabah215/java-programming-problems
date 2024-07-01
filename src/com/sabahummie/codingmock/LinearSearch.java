package com.sabahummie.codingmock;

public class LinearSearch {

	public static void main(String[] args) {
		
		int [] arr = {12, 7, 5, 13, 9, 6, 11};
		int numberToSearch = 13;
		
		System.out.println(linearSearch(arr, numberToSearch));
	}

	private static String linearSearch(int[] arr, int num) {
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == num) {
				return num + " found at index " + i;
			}
		}
		return "Number not found";
	}

}
