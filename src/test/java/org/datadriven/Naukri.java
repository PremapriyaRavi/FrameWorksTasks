
package org.datadriven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Naukri {
	@Test
	private void test() throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://my.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		WebElement btn = driver.findElement(By.xpath("//button[text()='I am a Fresher']"));
		btn.click();
		WebElement fName = driver.findElement(By.id("fname"));
		fName.sendKeys("Priya");
		WebElement eMail = driver.findElement(By.xpath("//input[@id='email']"));
		eMail.sendKeys("priya@gmail.com");
		eMail.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement btn1 = driver.findElement(By.xpath("(//a[@class='ltGlobalCls'])[2]"));
		btn1.click();
		WebElement pWord = driver.findElement(By.name("password"));
		pWord.sendKeys("Qwerty@3");
		WebElement pNumber = driver.findElement(By.name("number"));
		pNumber.sendKeys("9534567805");
		WebElement btn2 = driver.findElement(By.xpath("(//label[@class='left mandatory'])[4]"));
		btn2.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebElement loc = driver.findElement(By.xpath("//input[@class='sugInp']"));
//		loc.sendKeys("Chennai");	
		List<WebElement> elm = driver.findElements(By.cssSelector("#basicDetailForm > resman-location > div > div > div.errorCover.locationSugg > div > ul"));
		System.out.println(elm.size());
//		for(int i=0;i<elm.size();i++)
//			System.out.println(elm.get(i));
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		WebElement cv = driver.findElement(By.xpath("//input[@name='uploadCV']"));
//		cv.click();
//		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
//		WebElement sel = driver.findElement(By.name("state"));
//		sel.sendKeys("Tamil Nadu"); 
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
	}
}