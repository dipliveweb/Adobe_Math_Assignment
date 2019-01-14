import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @desc This class will test calculatePrimeSum() method from PrimeSum class
 * @author Md Merajul Islam
 */

public class TestPrimeSum {

	@Test(expected = IllegalArgumentException.class)

	// @Test
	public void test() {

		PrimeSum ob = new PrimeSum();

		// Expected values
		long expectedPrimeSum = 142913828922L;
		int expectedInvalidData = 0;

		// Actual test
		System.out.println("Test with valid data");
		assertEquals(expectedPrimeSum, ob.calculatePrimeSum(2000000));

		System.out.println("\nTest with invalid data");
		assertEquals(expectedInvalidData, ob.calculatePrimeSum(-1));
	}

}
