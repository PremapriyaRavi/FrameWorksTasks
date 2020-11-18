package org.testng;

import org.testng.annotations.Test;

public class Par2 {
	@Test
	private void test2() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void test4() {
		System.out.println(Thread.currentThread().getId());	
	}
	@Test
	private void test3() {
		System.out.println(Thread.currentThread().getId());	
	}
	@Test
	private void test9() {
		System.out.println(Thread.currentThread().getId());	
	}
}
