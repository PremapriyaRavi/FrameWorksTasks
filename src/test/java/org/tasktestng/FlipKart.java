package org.tasktestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FlipKart {
	WebDriver driver;
	@BeforeMethod
	private void bMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(" https://www.flipkart.com/account/login");
	}
	@Test()
	private void test() {
	   WebElement uname = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	   uname.sendKeys("User@123");
	   Assert.assertEquals("User@123","User@123");
	   WebElement pword = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
	   SoftAssert s=new SoftAssert();
	   pword.sendKeys("Qwerty@123");
       s.assertEquals(false,true);
       s.assertAll();
}
	@AfterMethod
	private void aMethod() {
		System.out.println("done");
	}
}