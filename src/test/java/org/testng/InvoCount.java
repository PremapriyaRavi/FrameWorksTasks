package org.testng;

import org.testng.annotations.Test;

public class InvoCount {
	@Test(invocationCount=5)
	private void test1()
	{
		System.out.println("test 7");
	}
	@Test(enabled=false)
	private void test2() {
		System.out.println("test 8");
	}

}
