package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class First {
	@BeforeClass
	public static void beforeClass1() {
		System.out.println("first  beforeClass ");
	}
	@AfterClass
	public static void afterClass1() {
		System.out.println("first AfterClass ");
	}
	@Before
	public void before1() {
		System.out.println("first before");
	}
	@After
	public void after1() {
    System.out.println("first after");
    }
	@Test
	public void test1() {
		System.out.println("================");
		
		System.out.println("first test1");
	
		System.out.println("================");}
}