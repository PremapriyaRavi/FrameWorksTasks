package org.tasktestng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class Gmail extends BaseClass {
	@BeforeMethod
	private void bMethod()
	{
		launchBrowser();
		launchUrl("https://mail.google.com/");
	    maximizeWindow();
	}
	@Parameters({"email","pword"})
	@Test
	private void test(String s1,String s2) throws AWTException 
	{
     
     WebElement eMail = driver.findElement(By.xpath("//input[@name='identifier']"));
     insert(eMail,s1);
     Robot r=new Robot();
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     WebElement pWord = driver.findElement(By.xpath("//input[@name='password']"));
     insert(pWord,s2);
	}
	@AfterMethod
	private void aMethod()
	{
		//closeBrowser();
	}	
}