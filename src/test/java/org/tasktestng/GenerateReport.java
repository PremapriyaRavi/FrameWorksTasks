package org.tasktestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GenerateReport {
	@Test
	private void test()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" http://www.greenstechnologys.com/");
	
}
}