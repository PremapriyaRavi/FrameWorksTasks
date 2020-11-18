package org.test;


import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;


public class JunitSampleWithAssert_2 extends BaseClass{
	@BeforeClass
	public static void launch() {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
	    Assert.assertTrue(getCurrentUrl().contains("facebookapp"));
		maximizeWindow();	
	}
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
	@AfterClass
	public static void quit() {
		quitBrowser();
	}
	@Test
	public void tc1(){
		WebElement txtEmail=driver.findElement(By.id("email"));
		insert(txtEmail,"user@123");
		Assert.assertEquals("user@123",txtEmail.getAttribute("value"));
		WebElement txtPass=driver.findElement(By.id("pass"));
		insert(txtPass,"12345");
		WebElement btnLogin = driver.findElement(By.name("login"));
		click(btnLogin);
	}

}
