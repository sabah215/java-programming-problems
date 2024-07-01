/**
 * @author Sabah Ummie
 * @date 06-25-24
 * 
 * Write a Java program to Merge a linked list into another linked list at alternate positions
 * 
 * Time: O(n)
 * Space: O(1)
 * */
package com.sabahummie.ds.problem1;


public class MergeLinkedList {
	
	public static void main(String[] args) {
	
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.insert(5);
		l1.insert(6);
		l1.insert(7);
		
		l2.insert(8);
		l2.insert(9);
		l2.insert(1);
		
		l1.printList();
		l2.printList();
		
		l1.merge(l2);
		System.out.println("merged..");
		l1.printList();
	}	
}


class LinkedList {
	
	// head of the list	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}	
		
	/**
	 * Insert node at the head of a linked list
	 * 
	 * */
	public void insert(int data) {
		
		// Create a node with the data
		Node newNode = new Node(data);
		
		// Point the next pointer of the node to the head of the linkedlist
		newNode.next = head;
		
		// Move head pointer to the new node
		head = newNode;
		
	}
	
	/**
	 *
	 * Print the list
	 * 
	 * */
	public void printList() {
		
		Node node = head;
		
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	
	/**
	 * 
	 * Merge the lists:
	 * Here we will assume the LinkedList class as the first list a, 
	 * with which a second list b will be merged
	 * 
	 * */
	public void merge(LinkedList b) {
		
		Node aCurr = head, bCurr = b.head;
		Node aNext, bNext;
		
		// check if current node exists
		while(aCurr != null || bCurr != null) {
			/**
			 * Point a node to the next counter of the current node 
			 * first to avoid losing the next node
			 * 
			 * */
			aNext = aCurr.next;
			bNext = bCurr.next;
			
			
			bCurr.next = aNext; // Current node of b is set to next of current node of a
			aCurr.next = bCurr; // Next pointer of a points to  current of b
			
			// update the current node for next iteration
			aCurr = aNext;
			bCurr = bNext;
			
		}
		b.head = bCurr;		
	}

} 
