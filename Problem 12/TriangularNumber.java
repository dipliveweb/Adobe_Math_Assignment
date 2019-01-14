/**
 *@desc    This class has a method countDivisor which will calculate the first triangle number which has over five hundred divisors  
* @author  Md Merajul Islam 
*/
public class TriangularNumber {

	/**
	 * @desc  This method will calculate the first triangle number which has over five hundred divisors  
	 * @param divisorCount  total number of divisors
	 * @return              first triangle number which has over five hundred divisors
	 */

	public int countDivisor(int divisorCount) {

		//It will throw an exception if divisor count is less than 0 or greater than 500.
		if (divisorCount < 0 || divisorCount > 500)
			throw new IllegalArgumentException("Invalid Input");

		int triangleNumber = 0;
		int numOfDivisors;
		int count = 1;

		while (true) {

			numOfDivisors = 0;
			triangleNumber = triangleNumber + count;

			// cache square root of the triangle number
			int sqroot = (int) Math.sqrt(triangleNumber);

			// count the number of divisors
			for (int i = 1; i < sqroot; i++)
				if (triangleNumber % i == 0)

				// 1 to square root of the number holds exactly half of the divisors so increase numOfDivisors by 2 to include the other corresponding half
					numOfDivisors += 2;

			// if the total number of divisors is greater than 500 then we will break the loop.
			if (numOfDivisors > divisorCount)
				break;

			count++;
		}

		return triangleNumber;

	}

	public static void main(String args[]) {

		TriangularNumber ob = new TriangularNumber();

		// start the timer
		long startTime = System.currentTimeMillis();

		System.out.println("First triangle number which has over five hundred divisors: " + ob.countDivisor(500));

		// end the timer
		long endTime = System.currentTimeMillis();

		// get the difference between start and end Timer
		long timeElapsed = endTime - startTime;

		// Total execution time
		System.out.println("Execution time in milliseconds: " + timeElapsed);

	}
}
