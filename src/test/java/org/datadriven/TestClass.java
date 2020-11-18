package org.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;

@Test()
private void test1() {
	 Assert.assertTrue(true);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://demoqa.com/automation-practice-form");
	WebElement ele1 = driver.findElement(By.xpath("//input[@id='firstName']"));
	ele1.sendKeys("pinky");
}

@Test(retryAnalyzer=ExeFailedTc.class)
private void test2() {
	Assert.assertTrue(false);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://demoqa.com/automation-practice-form");
	WebElement ele2 = driver.findElement(By.xpath("//input[@id='lastName']"));
	ele2.sendKeys("R");		
}

@Test()
private void test3() {
	Assert.assertTrue(true);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://demoqa.com/automation-practice-form");   
	WebElement ele3 = driver.findElement(By.xpath("//input[@id='userEmail']"));
	ele3.sendKeys("user@123");
}

@Test()
private void test4() {
	 Assert.assertTrue(true);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://demoqa.com/automation-practice-form");
	WebElement ele4 = driver.findElement(By.xpath("//label[text()='Female']"));
	ele4.click();
}
@Test()
private void test5() {
	 Assert.assertTrue(false);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://demoqa.com/automation-practice-form"); 
	WebElement ele5 = driver.findElement(By.xpath("//input[@id='userNumber']"));
	ele5.sendKeys("1234567898");
}

}
