package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseClass;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
	    
	    WebElement txtEmail = driver.findElement(By.id("email"));
	    txtEmail.sendKeys("user@123");
	    insert(txtEmail,"User@123");
	    WebElement txtPass = driver.findElement(By.id("pass"));
	    insert(txtPass,"12345");
	    
	    WebElement btnLogIn = driver.findElement(By.name("login"));
	    click(btnLogIn);
	    
	    getTitle();
	   // getCurrentUrl();
	    
	    //if the url is return then use this
	   System.out.println(getCurrentUrl());
	   
	   //WebElement indexVal = driver.findElement(By.id("countries"));
	   //SelectValue(indexVal);
	   List<WebElement> elements=driver.findElements(By.xpath("//div[@style='display: block;']//li"));
		int size= elements.size();
	    
	}


}
