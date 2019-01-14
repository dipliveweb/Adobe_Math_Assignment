import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @desc This class will test calculateFactSum() method from FactorialSum class
 * @author Md Merajul Islam
 */

public class TestFactorialSum {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		FactorialSum ob = new FactorialSum();

		// Expected values
		long expectedFactSum = 648; // for 100!
		int expectedInvalidData = 0;

		// Actual test

		System.out.println("Test with valid data");
		assertEquals(expectedFactSum, ob.calculateFactSum(100));

		System.out.println("\nTest with invalid data");
		assertEquals(expectedInvalidData, ob.calculateFactSum(-1));
		;
	}

}
