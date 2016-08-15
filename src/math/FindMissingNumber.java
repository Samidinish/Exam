package math;


public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If lengthOfIndexPlusOne = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int lengthOfIndexPlusOne = 10;
        int sumOfNnumbers = sumOfNnumbers(lengthOfIndexPlusOne);
        int sumOfElements = sumOfElements(array);
        int missingNumber = sumOfNnumbers - sumOfElements;
        System.out.println("Missing Number in the Array is :- " + missingNumber);
    }
    // calculate sum of 'n' numbers
    //and store in sum

    static int sumOfNnumbers(int lengthOfIndexPlusOne)
    {
        int sum = (lengthOfIndexPlusOne * (lengthOfIndexPlusOne+1))/ 2;

        return sum;
    }

    //calculate sum of all elements of array
    //and store in sum

    static int sumOfElements(int[] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }

        return sum;
    }
}




