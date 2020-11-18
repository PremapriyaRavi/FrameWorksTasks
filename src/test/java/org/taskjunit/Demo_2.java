package org.taskjunit;

import java.awt.AWTException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.taskpom.DemoWithPojo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utility.BaseClass;
import org.utility.SampleForExcel;

public class Demo_2 extends BaseClass {
	@BeforeMethod()
	public void bclass() {
		launchBrowser();
		launchUrl("http://demo.automationtesting.in/Register.html");
		System.out.println(getCurrentUrl());
		getTitle();
	}


	@Test(dataProvider="data",dataProviderClass=SampleForExcel.class)
	public void test1(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12) throws Throwable {	
		//@Test
		//public void test() {
			DemoWithPojo d=new DemoWithPojo();
		//choose(d.getChooseFile());
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		insert(d.getFirstName(),s1);
		Assert.assertTrue(true);
		insert(d.getLastName(),s2);
		insert(d.getAddress(),s3);
		insert(d.geteMail(),s4);
		insert(d.getMobile(),s5);
		click(d.getGender());
		SoftAssert s=new SoftAssert();
		Assert.assertTrue(d.getGender().isEnabled());
		click(d.getHobbies());
		clkAction(d.getSel());
		selectValue((List<WebElement>)d.getLanguages());
		clkAction(d.getLabel());
		insert(d.getSkills(),s6);
		insert(d.getCountry(),s7);
		keyRobot(d.getSelCountry());
		insert(d.getYear(),s8);
		insert(d.getMonth(),s9);
		insert(d.getDay(),s10);
		insert(d.getPassWord(),s11);
		insert(d.getConfirm(),s12);
		click(d.getSubmit());
		
	}
		@AfterMethod()
	public  void aclass() {
		//driver.close();
		System.out.println("done");
	}
}
