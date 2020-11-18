package org.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
@Parameters("url")
@Test(groups="smoke")
private void test1(String s1) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(s1);
	WebElement ele1 = driver.findElement(By.xpath("//input[@id='firstName']"));
	ele1.sendKeys("pinky");
}
@Parameters("url")
@Test(groups="sanity")
private void test2(String s1) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(s1);
	WebElement ele2 = driver.findElement(By.xpath("//input[@id='lastName']"));
	ele2.sendKeys("R");		
}
@Parameters("url")
@Test(groups="sanity")
private void test3(String s1) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(s1);
	WebElement ele3 = driver.findElement(By.xpath("//input[@id='userEmail']"));
	ele3.sendKeys("user@123");
}
@Parameters("url")
@Test(groups="smoke")
private void test4(String s1) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(s1);
	WebElement ele4 = driver.findElement(By.xpath("//label[text()='Female']"));
	ele4.click();
}
@Test(groups={"sanity","retest"})
private void test5(String s1) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(s1);
	WebElement ele5 = driver.findElement(By.xpath("//input[@id='userNumber']"));
	ele5.sendKeys("1234567898");
}
}