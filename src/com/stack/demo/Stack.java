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
	
	public int peek() {
		System.out.println(top.key);
		return top.key;
	}
	
	public int pop() {
		if(top == null) {
			System.out.println("List is Empty");
			return 0;
		}
		Node temp = top;
		top = temp.next;
		return temp.key;
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