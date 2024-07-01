/**
 * @author Sabah Ummie
 * @date 06-25-24
 * 
 * Write a Java program to Reverse alternate K nodes in a Singly Linked List
 * 
 * Time: O(n)
 * Space: O(1)
 * */

package com.sabahummie.ds.problem2;


public class ReverseAlternateKNodes {

	public static void main(String[] args) {
		
		
		LinkedList l1 = new LinkedList();
		
		l1.insert(9);
		l1.insert(8);
		l1.insert(7);
		l1.insert(6);
		l1.insert(5);
		l1.insert(4);
		l1.insert(3);
		l1.insert(2);
		l1.insert(1);
		
		l1.printList();
		l1.head = l1.reverseAltKNodes(l1.head, 3);
		System.out.println("Altered list..");
		l1.printList();
	}
}

class Node{
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList{
	
	Node head;
	
	
	
	public Node reverseAltKNodes(Node node, int k) {
		
		Node curr = node; 
		Node prev = null, next = null;
		int count = 0;
		
		// 1. Reverse k nodes of ll
		while(curr != null && count < k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		
		// 2. Set the node.head to the kth node and next of the head points to (k+1)th node.  
		if(node != null) {
			node.next = curr;
		}
		
		
		// 3.  Skip k nodes without reversing
		count = 0;
		while(curr != null && count < k-1) {
			curr = curr.next;
			count++;
		}
		
		// 4. Recursively call reverseAltKNodes() on curr->next
		if(curr != null) {
			curr.next = reverseAltKNodes(curr.next, k);
		}
		
		// 5. return prev
		return prev;
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
}
