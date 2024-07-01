/**
 * @author Sabah Ummie
 * @date 06-25-24
 * 
 * Write a Java program to Checking Balanced Parentheses using a Stack
 * 
 * Time: 
 * Space:
 * 
 * */

package com.sabahummie.algorithm.problem1;

import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		
		String s = "[(())";
		System.out.println(isBalanced(s));
		
	}
	
	public static boolean isBalanced(String p) {
		char [] arr = p.toCharArray();
		Stack<Character> st = new Stack<>();
		
		
		for(int i=0; i< arr.length; i++)
		{
		
			if(arr[i] == '(' ) {
				st.push(')');
			}
			else if(arr[i] == '{' ) {
				st.push('}');
			}
			else if(arr[i] == '[') {
				st.push(']');
			}
		}
		return st.empty();
	}
}
