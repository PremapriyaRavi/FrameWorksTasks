package org.taskjunit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utility.BaseClass;

public class Facebook extends BaseClass {
	@BeforeClass
	public static void test1(){
		launchBrowser();
		launchUrl(" https://www.facebook.com/");
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
	public void test5()
	{
		WebElement txtEmail = driver.findElement(By.id("email"));
		insert(txtEmail,"priya@89");
		Assert.assertEquals("priya@89",txtEmail.getAttribute("value"));
		WebElement txtPass = driver.findElement(By.id("pass"));
		insert(txtPass,"Qwerty@123");
		Assert.assertEquals("Qwerty@123",txtPass.getAttribute("value"));
	}
}
