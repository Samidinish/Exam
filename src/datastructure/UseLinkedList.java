package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		// create a LinkedList
		LinkedList list = new LinkedList();

		// add some elements
		list.add("Selenium");
		list.add(2);
		list.add("Qtp");
		list.add("10");

		// print the list
		System.out.println("LinkedList:" + list);

		// set Iterator at specified index
		Iterator setIteratorIndex = list.listIterator(2);

		// print list with the iterator
		while (setIteratorIndex.hasNext()) {
			System.out.println(setIteratorIndex.next());
		}
	}

}
