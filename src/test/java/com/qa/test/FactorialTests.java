package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.main.Factorial;

public class FactorialTests {

	@Test
	public void test5Factorial() {
		assertEquals("5!", Factorial.reverse(120));
	}

	@Test
	public void test4Factorial() {
		assertEquals("4!", Factorial.reverse(24));
	}

	@Test
	public void test3Factorial() {
		assertEquals("3!", Factorial.reverse(6));
	}

	@Test
	public void test2Factorial() {
		assertEquals("2!", Factorial.reverse(2));
	}

	@Test
	public void test1Factorial() {
		assertEquals("1!", Factorial.reverse(1));
	}

	@Test
	public void testNONEFactorial() {
		assertEquals("NONE", Factorial.reverse(150));
	}

}
