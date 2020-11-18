package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Employee {
	@Test
	private void test1() {
	Assert.assertTrue(true);
	System.out.println("test1");
	}
	@Test(retryAnalyzer=ExecuteFailedTC.class)
	private void test2() {
		Assert.assertTrue(false);
		System.out.println("test2");
	}
	@Test(retryAnalyzer=ExecuteFailedTC.class)
	private void test3() {
		Assert.assertTrue(false);
		System.out.println("test3");
	}
	@Test
	private void test4() {
		Assert.assertTrue(true);
		System.out.println("test4");
	}
	@Test
	private void test5() {
		Assert.assertTrue(true);
		System.out.println("test5");
	}

}
