package org.testng;

import org.testng.annotations.Test;

public class First {
	@Test(groups= {"smoke","sanity"})
	private void test1() {
		System.out.println("test1");
	}
	@Test(groups="sanity")
	private void test7() {
		System.out.println("test7");
	}
	@Test(groups="regression")
	private void test5() {
		System.out.println("test5");
	}
	@Test(groups="retesting")
	private void test4() {
		System.out.println("test4");
	}
	@Test(groups= {"sanity","regression"})
	private void test8() {
		System.out.println("test8");
	}
	@Test(groups="smoke")
	private void test11() {
		System.out.println("test11");
	}
	@Test(groups= {"regression","retesting"})
	private void test9() {
		System.out.println("test9");
	}

}
