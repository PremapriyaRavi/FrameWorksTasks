package org.tasktestng;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.BaseClass;
import org.utility.SampleForExcel;

public class FaceBook extends BaseClass{
	@BeforeMethod
	private void test1()
	{
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		
	}
	@Test(dataProvider="data",dataProviderClass=SampleForExcel.class)
	private void test2(String s1,String s2)
	{
	WebElement txtEmail = driver.findElement(By.id("email"));	
	txtEmail.sendKeys(s1);
	WebElement txtPass = driver.findElement(By.id("pass"));	
	txtPass.sendKeys(s2);
	WebElement btnLogIn = driver.findElement(By.xpath("//button[@type='button']"));
	btnLogIn.click();
	}
	
	@AfterMethod
	private void test3()
	{
	 System.out.println("done");
	 //driver.close();
	}

}

