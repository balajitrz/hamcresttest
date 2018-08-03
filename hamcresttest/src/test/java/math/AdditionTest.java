package math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Calendar;

import org.junit.Assume;
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
	
	@Test
	public void testAdditionOfHugeInput() {
		Assume.assumeTrue(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY);
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,
				26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,
				51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,
				76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
		assertThat(Addition.addNumbers(a),is(5050));
	}
	
}
