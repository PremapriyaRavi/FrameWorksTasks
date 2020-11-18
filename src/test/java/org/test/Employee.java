package org.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Employee {
	@Test
	public void test8() {
	Assert.assertEquals("true","true");	
	System.out.println(" test 8 is printed");
	}
	@Ignore
	@Test
	public void test6() {
		System.out.println("hello");
	}
	@Test
	public void test5(){
		Assert.assertTrue(false);
		
	}
	@Test
	public void test7() {
		System.out.println(3/0);
	}

}
