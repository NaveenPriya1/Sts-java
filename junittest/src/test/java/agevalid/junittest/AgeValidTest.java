package agevalid.junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgeValidTest {
    
	AgeValidator valid;
	@Before
	public void objCreation() {
		AgeValidator valid = new AgeValidator();
	}
	@Test
	public void test1() {
		assertEquals("You are Eligible to vote",valid.ageValid(18));
	}
	
	@Test
	public void test2() {
		assertEquals("You are Eligible to vote",valid.ageValid(60));
	}
	
	@Test
	public void test3() {
		assertEquals("You are not eligible to Vote",valid.ageValid(10));
	}
	
	public void destroyObj() {
		valid=null;
	}

}
