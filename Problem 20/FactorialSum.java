import java.math.BigInteger;

/** @desc  This class will hold the method calculateFactSum() to calculate the sum of the digit in the factorial number
 * @author Md Merajul Islam 
*/

public class FactorialSum {

	/**
	 * @desc this method will calculate the sum of the digits in the number 100!
	 * @param   int num  factorial number
	 * @return  int      factorial sum
	 */
	public int calculateFactSum(int num) {
		
		//if the number is less than 0 or greater than 100 than it will throw an exception
		if (num < 0 || num > 100)
			throw new IllegalArgumentException("Invalid Input");

		int sum = 0;
		BigInteger result = BigInteger.ONE;

		// get factorial of 100(given input)
		for (int i = 1; i <= num; i++)
			result = result.multiply(BigInteger.valueOf(i));

		String temp = result.toString();

		// calculate factorial sum
		for (int i = 0; i < temp.length(); i++)
			sum += temp.charAt(i) - '0';

		return sum;

	}

	public static void main(String[] args) {
		FactorialSum ob = new FactorialSum();

		// start the timer
		long startTime = System.currentTimeMillis();

		System.out.println("The sum of the digits in the number 100! is : " + ob.calculateFactSum(100));

		// end the timer
		long endTime = System.currentTimeMillis();

		// get the difference between start and end Timer
		long timeElapsed = endTime - startTime;

		// Total execution time
		System.out.println("Execution time in milliseconds: " + timeElapsed);

	}

}
