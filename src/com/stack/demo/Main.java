package com.stack.demo;

public class Main {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.print();
		stack.peek();
		stack.pop();
		stack.print();
	}

}
