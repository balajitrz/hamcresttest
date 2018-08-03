package math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class DivisionTest {
	@Test
	public void testTwoNumberDivision() {
		double a = 5;
		double b = 10;
		assertThat(Division.divideTwoNumbers(a, b),is(0.51));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testException() {
		int a = 10;
		int b = 0;
		assertThat(Division.divideTwoNumbers(a, b),is(0));
	}
}
