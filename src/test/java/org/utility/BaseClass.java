package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	  public  static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	public static void launchUrl(String s) {
		driver.get(s);
	}  
	public static void maximizeWindow() {
		driver.manage().window().maximize();	
	}
	public static void insert(WebElement e,String value) {
	e.sendKeys(value);	
	}
	public static void click(WebElement e) {
		e.click();
	}
	public static void getTitle() {	
	String title = driver.getTitle();
    System.out.println(title);	    
	}
	public static void getText(WebElement e) {	
		String text = e.getText();
	    System.out.println(text);
	    
		}
	public static String getCurrentUrl() {
		String title2 = driver.getCurrentUrl();
	    return title2;
	}
	
//	public static void getCurrentUrl() {
//		String title2 = driver.getCurrentUrl();
//		System.out.println(title2);
//	}
	
	public static void selectValue(List<WebElement> e){
	System.out.println(e.size());
		for(int i=0;i<e.size();i++) {
			if(i==3||i==32||i==23)
			{
				WebElement ele = e.get(i);
				ele.click();
			}
		}
		
	}
	public static void choose(WebElement e) throws AWTException {
		clkAction(e);
		String file="C:\\Users\\PREMA\\Downloads\\hello.txt";
		StringSelection s=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public static void clkAction(WebElement e) {
		Actions a=new Actions(driver);
		a.click(e).perform();
		
	}
	public static void keyRobot(WebElement e) throws AWTException {
		clkAction(e);
		Robot r=new Robot();
		for(int i=0;i<3;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}	
			
	    r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void closeBrowser() {
		driver.close();

	}
	public static void quitBrowser() {
	driver.quit();
	}
	public static String srlUp(WebElement e) {
		JavascriptExecutor jk= (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(false)", e);
		String text = e.getText();
		return text;
	}	
	public static String srlDown(WebElement e) {
		JavascriptExecutor jk= (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", e);
		String text2 = e.getText();
		return text2;
	}	
	public static void moveTo(WebElement e) {
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
	}
}


