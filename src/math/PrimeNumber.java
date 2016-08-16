package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * 
		 */
		//define limit
		int limit = 1000000;

		System.out.println("Prime numbers from 2 to one million and " + limit);

		//loop through the numbers one by one
		for(int i=1; i < 1000000; i++){

			boolean isPrime = true;

			//check to see if the number is prime
			for(int j=2; j < i ; j++){

				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			// print the number
			if(isPrime)
				System.out.print(i + " ");
		}

	}

}
