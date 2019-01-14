/**
	 * @desc    This class will hold the methods e.g calculatePrimeSum ()  and isPrime () to calculate the sum of the prime number
	 * @Author  Md Merajul Islam

**/

public class PrimeSum {

	/**
	 * @desc  This method will calculate the sum of the prime numbers below 2000000(or given input)
	 * @param  long value  user input (2000000 in this case)
	 * @return long        the sum of the prime numbers below 2000000
	 */

	public long calculatePrimeSum(long value) {

		// only accept value between 1 and 2000000 (inclusive)
		if (!((value > 0) && (value <= 2000000))) {
			throw new IllegalArgumentException("Not a valid Input");
		}

		long sum = 0;

		// generate prime sum
		for (long i = 2; i < value; i++) {

			// check if the number is prime or not. If yes then add it to the sum variable
			if (isPrime(i)) {
				sum = sum + i;
			}
		}
		return sum;
	}

	/**
	 * @desc  This method will check if the number is prime or not
	 * @param  long     data    number coming from the main loop
	 * @return boolean          result based on the number
	 */

	public boolean isPrime(long data) {

		if (data == 2 || data == 3) {
			return true;
		}

		if (data % 2 == 0 || data % 3 == 0) {
			return false;
		}
	
		// Optimization - loop through the square root of the number instead of the number itself
		for (int i = 3; i < Math.sqrt(data); i += 2) {
			if (data % i == 0 || data % Math.sqrt(data) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		PrimeSum ob = new PrimeSum();

		// Start the timer
		long startTime = System.currentTimeMillis();

		// Print the result
		System.out.println("The sum of all the primes below two million :" + ob.calculatePrimeSum(2000000));

		// End the timer
		long endTime = System.currentTimeMillis();

		// Get the difference between Start and end Timer
		long timeElapsed = endTime - startTime;

		// Total execution time
		System.out.println("Execution time in milliseconds: " + timeElapsed);

	}

}
