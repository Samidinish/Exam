package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

    long executionTime = 0;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;
    private static int[] array;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int count = array.length;
        for (int j = 1; j < count; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
            //printNumbers(array);
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int n = array.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (array[j - 1] > array[j]) {
                    //swap the elements!
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;


    }

    //// Merge Sort
    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    ///quick Sort
    public int[] quickSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        quicksort(list, 0, list.length - 1);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void quicksort(int list[], int from, int to) {
        // If the indexes cross, then we've sorted the whole array.
        if (from >= to) {
            return;
        }

        int pivot = list[from];
        int i = from - 1;
        int j = to + 1;
        while (i < j) {

            i++;
            while (list[i] < pivot) {
                i++;
            }

            j--;
            while (list[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(list, i, j);
            }
        }


        quicksort(list, from, j);
        quicksort(list, j + 1, to);
    }


    ///// The end of the QuickSort Program
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                        Heap Sort                                                                   //
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void heapSort(int array[]){
        final long startTime = System.currentTimeMillis();
        int n = array.length;

        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);
        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int array[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && array[l] > array[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && array[r] > array[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                           Bucket Sort Start Here                                                                                      //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int bucketCount = 1;
        //implement here
        if (bucketCount <= 0) throw new IllegalArgumentException("Invalid bucket count");

        if (array.length <= 1) return array; //trivially sorted

        int high = array[0];

        int low = array[0];

        for (int i = 1; i < array.length; i++) { //find the range of input elements

            if (array[i] > high) high = array[i];

            if (array[i] < low) low = array[i];

        }

        double interval = ((double) (high - low + 1)) / bucketCount; //range of one bucket

        ArrayList<Integer> buckets[] = new ArrayList[bucketCount];

        for (int i = 0; i < bucketCount; i++) { //initialize buckets

            buckets[i] = new ArrayList();

        }

        for (int i = 0; i < array.length; i++) { //partition the input array

            buckets[(int) ((array[i] - low) / interval)].add(array[i]);

        }

        int pointer = 0;

        for (int i = 0; i < buckets.length; i++) {

            Collections.sort(buckets[i]); //mergeSort

            for (int j = 0; j < buckets[i].size(); j++) { //merge the buckets

                array[pointer] = buckets[i].get(j);

                pointer++;

            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                     Shell SOrt                                                                     //
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        int inner, outer;
        int temp;

        int head = 1;
        while (head <= array.length / 3) {
            head = head * 3 + 1;
        }
        while (head > 0) {
            for (outer = head; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;

                while (inner > head - 1 && array[inner - head] >= temp) {
                    array[inner] = array[inner - head];
                    inner -= head;
                }
                array[inner] = temp;
            }
            head = (head - 1) / 3;
        }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;

    }




    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
