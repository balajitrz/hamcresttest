package string;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void checkStringsAreEqual() {
		String a = "foo";
		String b = "FOO";
		assertThat(a, equalToIgnoringCase(b));
	}
	
	@Test
	public void testStringConcatenation() {
		String a = "Hello ";
		String b = "World";
		assertThat(StringOperations.addStrings(a,b), equalTo("Hello World"));
	}
	
}
