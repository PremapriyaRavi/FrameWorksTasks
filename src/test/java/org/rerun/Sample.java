package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.rerun.TestListener.class)
public class Sample {
	@Test(successPercentage=50)
	private void tes1() {
		Assert.assertTrue(true);
		System.out.println("test 1");
	}
	@Test
	private void test2() {
		System.out.println("test 2");
	}
	@Test()
	private void test3() {
		System.out.println("test 3");
	}
	@Test(successPercentage=20)
	private void test4() {
	 Assert.assertTrue(false);
		System.out.println("test 4");
	}
	@Test
	private void test5() {
		System.out.println("test 5");
	}

}
