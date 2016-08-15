package math;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 * 
		 */

		//Scanner data= new Scanner(System.in);
		int value[]= new int[]{100,99,98,97,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32,96,95,94,93,92,91,90};
		int temp,i=0,j=0;
		//enter the the numbers and will be displayed an
		//System.out.println("Enter 20 element of array");
		//for(i=0;i<20;i++)
			//value[i]=data.nextInt();

		//here we are using the concept of swaping
		temp=value[0];
		for(i=0;i<value.length;i++)
		{
			for(j=i;j<value.length;j++)
			{
				if(value[i]<value[j])
				{
					temp=value[i];
					value[i]=value[j];
					value[j]=temp;
				}
			}

		}
		// Increasing Order out
		System.out.println("Numbers will Order:");
		for(i=0;i<value.length;i++)
			System.out.print(value[i]+",");




	}
}
