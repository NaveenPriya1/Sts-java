package mavenex.mavenbuild;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AgeValidatorTest {

	@Test
	public void  test1() {
		AgeValidator valid = new AgeValidator();
		assertEquals("you are eligible to vote", valid.ageValidator(19));
	}
	@Test
	public void  test2() {
		AgeValidator valid = new AgeValidator();
		assertEquals("you are eligible to vote", valid.ageValidator(18));
	}
	@Test
	public void  test3() {
		AgeValidator valid = new AgeValidator();
		assertEquals("you are not eligible to vote", valid.ageValidator(9));
	}
}
