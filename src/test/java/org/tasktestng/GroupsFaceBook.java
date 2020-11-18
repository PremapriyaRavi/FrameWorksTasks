
package org.tasktestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class GroupsFaceBook extends BaseClass{
	@Parameters("url")
	@Test(groups="smoke")
	private void test1(String s) {
		launchBrowser();
		launchUrl(s);
		WebElement txtEmail = driver.findElement(By.id("email"));	
		insert(txtEmail,"Priya");
		WebElement txtPass = driver.findElement(By.id("pass"));	
		insert(txtPass,"Qwerty@1");
	}
	@Parameters("url")
    @Test(groups={"sanity","regression"})
    private void test2(String s){
    	launchBrowser();
		launchUrl(s);
    	WebElement txtEmail = driver.findElement(By.id("email"));	
    	insert(txtEmail,"Pinky");
    	WebElement txtPass = driver.findElement(By.id("pass"));	
    	insert(txtPass,"Qwerty@2");	
    }
	@Parameters("url")
    @Test(groups="retesting")
    private void test3(String s) {
    	launchBrowser();
		launchUrl(s);
    	WebElement txtEmail = driver.findElement(By.id("email"));	
    	insert(txtEmail,"Sugu");
    	WebElement txtPass = driver.findElement(By.id("pass"));	
    	txtPass.sendKeys("Qwerty@3");	
    }
	@Parameters("url")
    @Test(groups= {"sanity","retesting"})
    private void test4(String s) {
    	launchBrowser();
		launchUrl(s);
    	WebElement txtEmail = driver.findElement(By.id("email"));	
    	txtEmail.sendKeys("Shobi");
    	WebElement txtPass = driver.findElement(By.id("pass"));	
    	txtPass.sendKeys("Qwerty@4");	
    }
    
}
