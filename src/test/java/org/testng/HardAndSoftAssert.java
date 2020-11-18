package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssert {
	@Test
	private void test1() {
		Assert.assertEquals(true,true);
		System.out.println("test1");
		Assert.assertEquals(true,false);
		System.out.println("Hard Assert");
	}
	@Test
	private void test2() {
		SoftAssert s=new SoftAssert();
		s.assertTrue(false);
		System.out.println("Hii");
		s.assertTrue(true);
		System.out.println("Hello");
		s.assertFalse(false);
		System.out.println("End 2");
		//s.assertAll();			
	}
	@Test
	private void test3() {
		SoftAssert s=new SoftAssert();
		s.assertEquals(true,true);
		System.out.println("test 3");
		s.assertEquals(true,false);
		System.out.println("softAssert");
		s.assertAll();
	}
	@Test
	private void test4() {
		Assert.assertTrue(false);
		System.out.println("Hard Assert");
		Assert.assertTrue(true);
		System.out.println("End 4");
	}

}
