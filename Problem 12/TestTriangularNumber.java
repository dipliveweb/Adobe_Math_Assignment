import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @desc This class will test countDivisor() method from TriangularNumber class
 * @author Md Merajul Islam
 */

public class TestTriangularNumber {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		TriangularNumber ob = new TriangularNumber();

		// Expected values
		long expectedPrimeSum = 76576500;
		int expectedInvalidData = 0;
		// Actual test

		System.out.println("Test with valid data");
		assertEquals(expectedPrimeSum, ob.countDivisor(500));

		System.out.println("\nTest with invalid data");
		assertEquals(expectedInvalidData, ob.countDivisor(-1));
	}

}
