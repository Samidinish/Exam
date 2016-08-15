package math;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 */
		int  array[] = new int[]{110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65,2};

         // the algorithm is if the lowest number is greater than the array[i] the
		//assign the value of the array[i] to lowest
		int lowestNumber = Integer.MAX_VALUE; // I use the Interger.MAX_VALUE method
		for(int i =0;i<array.length;i++) {
			if(lowestNumber > array[i]) {
			lowestNumber = array[i];

			}
		}
	System.out.println("Lowest number The Array is : " +lowestNumber);
	}

}
