package org.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example {
	@Parameters({"userName","passWord"})
	@Test
	private void test7(String s1,@Optional("goddd")String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}
	@Test()
	private void test2()
	{
		System.out.println("test2");
	}

}
