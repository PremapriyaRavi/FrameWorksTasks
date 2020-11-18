package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}

}
