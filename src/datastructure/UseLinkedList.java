package datastructure;

import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List<String> list = new LinkedList<>();
		list.add("NY");
		list.add("FL");
		list.add("AZ");
		list.add("Nahreen got headace");
		list.add("Abdul is taking class from Sweet home");
		list.add("Sohan is taking from home");

		for(Object city:list){
			System.out.println(city);
		}
		System.out.println("Before: " + list.size());
		list.remove(3);
		System.out.println("After change has been made") ;
		for(Object city:list){
			System.out.println(city);
		}
		System.out.println("After : " + list.size());
	}

}
