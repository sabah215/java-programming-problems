package com.sabahummie.codingmock;

import java.util.Arrays;

public class OccuranceOfElements {

	public static void main(String[] args) {
		
		int [] nums = {10, 10, 10, 2, 2, 2};
//		int [] nums = {10};
		
		countOccuranceOfElements(nums);
	}
	
	public static void countOccuranceOfElements(int [] arr) {
		
		int n = arr.length;
		
		boolean [] visited = new boolean [n];
		
		Arrays.fill(visited, false);
		
		for(int i = 0; i < n; i++) {
			
			if(visited[i]) {
				continue;
			}
			
			int count = 1;
			for(int j = i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			
			System.out.println(arr[i] + " occurs " + count + " times");
		}
	}
}
