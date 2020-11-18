package org.testng;

import org.testng.annotations.Test;

public class Par1 {
	
	@Test
	private void test1() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void test7() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void test3() {
		System.out.println(Thread.currentThread().getId());
	}

}
