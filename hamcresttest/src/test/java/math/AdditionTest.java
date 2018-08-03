package math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void testTwoNumberAddition() {
		int a = 5;
		int b = 10;
		assertThat(Addition.addTwoNumbers(a, b),is(15));
	}
	
	@Test
	public void testThreeNumberAddition() {
		int a = 5;
		int b = 10;
		int c = 15;
		assertThat(Addition.addThreeNumbers(a, b, c),is(30));
	}
	
	@Test
	public void testNumberAddition() {
		int[] a = {1,2,3,4,5};
		assertThat(Addition.addNumbers(a),is(15));
	}
	
	
	
}
