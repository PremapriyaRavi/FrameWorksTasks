package org.testng;

import org.testng.annotations.Test;

public class Sample {
	@Test(priority=-5)
	private void test1() {
		System.out.println("Test 1");
	}
	@Test
	private void test5() {
		System.out.println("Test 5");
	}
	@Test(priority=2)
	private void test2() {
	System.out.println("Test 2");
	}
	@Test
	private void test9() {
	 System.out.println("Test 9");
	}
	@Test(priority=-7)
	private void test3() {
		System.out.println("Test 3");

	}
	
}
