package org.excel;

import org.excelbase.BaseClassExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFaceBok extends BaseClassExcel{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    WebElement txtEmail= driver.findElement(By.id("email"));
	    txtEmail.sendKeys(getData(1,0));
	    WebElement txtPass = driver.findElement(By.name("pass"));
	    txtPass.sendKeys(getData(1,1));
	}

}
