package org.tasktestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class FlipParallel extends BaseClass{
	
	@Parameters("browserName")
	@Test
	private void test(String browser) {
		WebDriver driver = null;
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();

		}else if(browser.equals("ff")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();

		}else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
	    launchUrl("https://www.flipkart.com/account/login");
		WebElement uName = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		insert(uName,"User@567");
		WebElement pWord = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		insert(pWord,"Qwerty@3");
	}
	
}
