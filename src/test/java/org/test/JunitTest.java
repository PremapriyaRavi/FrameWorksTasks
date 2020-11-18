package org.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest {
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}

	@Test
	public void test4() {
	Assert.assertTrue(false);	
	}
	@Ignore
	@Test
	public void test1() {
		
	}
	@Test
	public void test3() {
		System.out.println("null is printed");
		
	}
	

}
