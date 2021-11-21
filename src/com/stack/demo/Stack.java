package com.stack.demo;

public class Stack {
	private Node top;
	
	private class Node {
		int key;
		Node next;
		
		public Node(int key) {
			this.key = key;
		}
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}
	
	public void print() {
		Node temp = top;
		
		System.out.println("LinkedList : ");
		
		while(temp != null) {
			System.out.print(temp.key+" -> ");
			temp = temp.next;
		}
		System.out.println();
	}
}