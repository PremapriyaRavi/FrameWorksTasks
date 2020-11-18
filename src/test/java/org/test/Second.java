package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Second extends First{
	@BeforeClass
	public static void beforeClass() {
		System.out.println("second  beforeClass ");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("second AfterClass ");
	}
	@Before
	public void before() {
		System.out.println("second before");
	}
	@After
	public void after() {
    System.out.println("second after");
    }
	@Test
	public void test2() {
		System.out.println("================");
		System.out.println("second test1");
		System.out.println("@@@@@");
		Second s=new Second();
		s.after1();
		s.before1();
		s.beforeClass1();
		s.afterClass1();
		
		System.out.println("@@@@@");
		System.out.println("================");
	}

}
