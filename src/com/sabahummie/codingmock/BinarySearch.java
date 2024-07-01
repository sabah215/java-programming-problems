package com.sabahummie.codingmock;

public class BinarySearch {

	public static void main(String[] args) {
		
		int [] arr = { 5, 6, 7, 9, 11, 12, 13};
		int numberToSearch = 11;
		
		System.out.println(binarySearch(arr, numberToSearch));
	}

	private static int binarySearch(int[] arr, int num) {
		
		int s = 0, e = arr.length -1;
		
		while(s <= e) {
			 
			int m = s + (e-s)/2;
			
			if(arr[m] == num)
				return m;
			
			else if(arr[m] < num) {
				s = m+1;
			}
			else {
				e = m-1;
			}
		}	
		return -1;
	}

}
