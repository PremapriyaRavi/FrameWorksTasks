package org.test;

import org.junit.Assert;
import org.junit.Test;
import org.utility.BaseClass;

public class JnitSampleWithAssert_1{
	@Test
	public void test1(){
		Assert.assertTrue(true);
		System.out.println("test 1");
		
	}
	@Test
	public void test5(){
		Assert.assertTrue(true);
		System.out.println("test 5");
		Assert.assertTrue(true);
		System.out.println("hello");
	}

	@Test
	public void test3(){
		System.out.println("test 3");
	}

	@Test
	public void test4(){
		System.out.println("test 1");
	}

	@Test
	public void test2(){
		System.out.println("test 2");
	}




}