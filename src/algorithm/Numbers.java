package algorithm;
import javafx.scene.chart.BubbleChart;

import java.util.Arrays;
import java.util.Random;

//import static algorithm.Sort.shellSort;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 */

	public static void main(String[] args) {
		
		int [] num = new int[10000];

		Random rand = new Random();

		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(1000000);
		}

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Continue for rest of the Sorting Algorithm....
       //Bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime+ " milli sec");
		////For Quick Sort
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
		// heap sort


		// Bucket Sort
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");

		//int [] array1 = {5,3,0,2,4,1,0,5,2,3,1,4};
		//System.out.println("Before: " + Arrays.toString(array1));
		//algo.shellSort(array1);
		algo.shellSort(num);
		//System.out.println("After:  " + Arrays.toString(array1));
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		algo.heapSort(num);
		//int arr[] = {12, 11, 13, 5, 6, 7};

       // algo.heapSort(arr);
		//System.out.println("Sorted array is");
		//System.out.println("After:  " + Arrays.toString(arr));

  	}

}
