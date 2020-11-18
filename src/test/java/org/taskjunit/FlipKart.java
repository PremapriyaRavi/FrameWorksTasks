package org.taskjunit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;
import org.utility.BaseClass;

public class FlipKart extends BaseClass {
	@BeforeClass
	public static void bclass(){
		launchBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		Assert.assertTrue(getCurrentUrl().contains("flipkart"));
		maximizeWindow();
	}
	@Before
	public void test2()
	{
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void test3(){
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	public static void test4() {
		quitBrowser();
	}
	@Test
	public void test(){
		 FlipKartWithPojo f=new FlipKartWithPojo();
		 insert(f.getEmail(), "User@1234");
		// Assert.assertEquals("User@1234",f.getEmail().getAttribute("value"));
		 insert(f.getPassword(),"Qwerty@123");
		 //Assert.assertEquals("Qwerty@123",f.getPassword().getAttribute("value"));
	}

}
