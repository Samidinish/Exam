package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("Kaya's Plate");
		queue.add("Tanveer's plate");
		queue.add("Shakir's plate");

		//System.out.println(queue.element());

		Iterator setIteratorIndex = queue.iterator();

		// print list with the iterator
		while (setIteratorIndex.hasNext()) {
			System.out.println(setIteratorIndex.next());
		}

	}

}
