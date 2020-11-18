package org.tasktestng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Account {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement eMail = driver.findElement(By.id("identifierId"));
		eMail.sendKeys("riyaaravi97@gmail.com");
		eMail.sendKeys(Keys.ENTER);
//		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//		WebElement pWord = driver.findElement(By.name("password"));
//		pWord.sendKeys("User@123");

	}

}
