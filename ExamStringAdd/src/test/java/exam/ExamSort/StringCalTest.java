package exam.ExamSort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalTest {

	@Test(expected = IllegalArgumentException.class)
	public void negativeThrowExceptionMultiple() {
		StringCalculator.add("0,1,2,3,-2");
	}

	@Test(expected = IllegalArgumentException.class)
	public void negativeThrowExceptionSingle() {
		StringCalculator.add("-1");
	}

	@Test
	public void largeNumberSingle() {
		assertEquals(0, StringCalculator.add("1000"));
	}

	@Test
	public void largeNumberMultiple() {
		assertEquals(7, StringCalculator.add("1003,1000,3,1000,4,43443"));
	}

	@Test
	public void verylargeNumberSingle() {
		assertEquals(403, StringCalculator.add("1000000000000000000000000,403"));
	}
}
