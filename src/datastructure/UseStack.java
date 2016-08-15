package datastructure;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack stack = new Stack();
		stack.push("Kaya's Plate");
		stack.push("Tanveer's plate");
		stack.push("Shakir's plate");

		System.out.println("Kaya is crying for her plate");
		System.out.println(stack.pop());
		stack.push("Iqbal's plate");
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
