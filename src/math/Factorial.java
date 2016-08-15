package math;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        int num=1;
        int count=1;
        int fact = 1;

        System.out.println("Please Enter an integer to calculate Factorial of a Number");
        Scanner in = new Scanner(System.in);

        num = in.nextInt();

        if ( num < 0 )
            System.out.println("Numbers must be greater than 0");
        else
        {
            for ( count = 1 ; count <= num ; count++ )
                fact = fact*count;

            System.out.println("Factorial of "+num+"!"+" is = "+fact);
        }
    }
}
