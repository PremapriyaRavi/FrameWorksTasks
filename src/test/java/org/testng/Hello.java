package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class Hello{
	@Parameters("browserName")
	@Test()
	private void test(String browser)
	{
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();

		}else if(browser.equals("ie")) {
        	System.setProperty("webdriver.ie.driver","C:\\Users\\PREMA\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
        driver=new InternetExplorerDriver();
        
        }else if(browser.equals("firefox")) {
			
            System.setProperty("webdriver.gecko.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\geckodriver.exe");
            driver=new FirefoxDriver();
           
        }else {
        	System.out.println("invalid browser");
        }
		driver.get("https://www.facebook.com/");
		
	   }
	
}