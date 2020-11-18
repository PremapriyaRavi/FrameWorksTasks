package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utility.BaseClass;



public class JunitFaceBook extends BaseClass {
	@Before
	public void startTime() {
		Date d=new Date();
		System.out.println(d);
		
	}
	@After
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@BeforeClass
	public static void launch(){
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		Assert.assertTrue(getCurrentUrl().contains("face"));
		maximizeWindow();
	}
		@AfterClass
	public static void quit() {
		quitBrowser();
	}
		@Test
		public void test() {
			FaceBookWithPojo f=new FaceBookWithPojo();
			insert(f.getEmail(),"user@123");
			Assert.assertEquals("user@123", f.getEmail().getAttribute("value"));
			insert(f.getPassWord(),"123456");
			Assert.assertEquals("123456",f.getPassWord().getAttribute("value"));
			click(f.getLogIn());

		}
}
