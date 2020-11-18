package org.rerun;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.utility.BaseClass;
@Listeners(org.rerun.TestListener.class)
public class FaceBook  extends BaseClass{
	@BeforeMethod
	private void bMethod() {
		launchBrowser();
		launchUrl("http://amazon.in/");
	}
//	@Test
//	private void test1() {
//		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
//		insert(txtSearch,"watch");
//		WebElement btnSearch = driver.findElement(By.xpath("//input[@type='submit']"));
//		click(btnSearch);
//		Assert.assertTrue(true);	
//	}
	@Test
	private void test2()
	{
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		insert(txtSearch,"laptop");
		WebElement btnSearch = driver.findElement(By.xpath("//input[@type='submit']"));
		click(btnSearch);
		Assert.assertTrue(false);
	}
	@AfterMethod
	private void aMethod()
	{
		System.out.println("done");
		driver.close();
	}

}
