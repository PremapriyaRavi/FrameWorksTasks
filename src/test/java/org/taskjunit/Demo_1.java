package org.taskjunit;

import java.awt.AWTException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.taskpom.DemoWithPojo;
import org.utility.BaseClass;


public class Demo_1 extends BaseClass {
@BeforeClass
public static void bclass() {
	launchBrowser();
	launchUrl("http://demo.automationtesting.in/Register.html");
	Assert.assertTrue(getCurrentUrl().contains("automationtesting"));
	System.out.println(getCurrentUrl());
	getTitle();
}
@Before
public void before()
{
	Date d=new Date();
	System.out.println(d);
}
@Test
public  void test() throws AWTException {
	
	DemoWithPojo d=new DemoWithPojo();
	//choose(d.getChooseFile());
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
	insert(d.getFirstName(),"Pinky");
	Assert.assertEquals("Pinky",d.getFirstName().getAttribute("value"));
	insert(d.getLastName(),"R");
	Assert.assertEquals("R",d.getLastName().getAttribute("value") );
	insert(d.getAddress(),"123,pinky,614441");
	Assert.assertEquals("123,pinky,614441","614441","614441");
	insert(d.geteMail(),"User@123");
	Assert.assertTrue(true);
	insert(d.getMobile(),"6789350894");
	Assert.assertEquals("6789350894",d.getMobile().getAttribute("value"));
	click(d.getGender());
	Assert.assertTrue(d.getGender().isEnabled());
	click(d.getHobbies());
	clkAction(d.getSel());
	selectValue((List<WebElement>)d.getLanguages());
	clkAction(d.getLabel());
	insert(d.getSkills(),"Java");
	insert(d.getCountry(),"India");
	keyRobot(d.getSelCountry());
	insert(d.getYear(),"2020");
	insert(d.getMonth(),"October");
	insert(d.getDay(),"25");
	Assert.assertEquals("25","25");
	insert(d.getPassWord(),"Pinky123@#");
	Assert.assertTrue(true);
	insert(d.getConfirm(),"Pinky123@#");
	click(d.getSubmit());
}
@After
public void after() {
	Date d=new Date();
	System.out.println(d);
}
@AfterClass()
public static void aclass() {
	//driver.close();
	System.out.println("done");
}
}
