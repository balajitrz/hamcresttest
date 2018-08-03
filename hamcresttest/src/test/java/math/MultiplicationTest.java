package math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class MultiplicationTest {
	@Test
	public void testTwoNumberMultiplication() {
		int a = 5;
		int b = 10;
		assertThat(Multiplication.multiplyTwoNumbers(a, b),is(50));
	}
	
	@Test
	public void testThreeNumberMultiplication() {
		int a = 5;
		int b = 10;
		int c = 15;
		assertThat(Multiplication.multiplyThreeNumbers(a, b, c),is(750));
	}
	
	@Test
	public void testNumberMultiplication() {
		int[] a = {1,2,3,4,5};
		assertThat(Multiplication.multiplyNumbers(a),is(120));
	}
}
