package math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class SubtractionTest {

	@Test
	public void testTwoNumberSubtraction() {
		int a = 5;
		int b = 10;
		assertThat(Subtraction.subTwoNumbers(a, b),is(-5));
	}
	
	@Test
	public void testThreeNumberSubtraction() {
		int a = 50;
		int b = 10;
		int c = 20;
		assertThat(Subtraction.subThreeNumbers(a, b, c),is(20));
	}
	
	@Test
	public void testNumberSubtraction() {
		int[] a = {1,2,3,4,5};
		assertThat(Subtraction.subFromHundred(a),is(85));
	}
	
}
