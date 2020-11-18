package org.taskpom;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class DemoQa extends BaseClass{
	
public static void main(String[] args) throws AWTException {
	launchBrowser();
	launchUrl("http://demo.automationtesting.in/Register.html");
	getTitle();
	System.out.println(getCurrentUrl());
	maximizeWindow();
	DemoWithPojo d=new DemoWithPojo();
	//choose(d.getChooseFile());
	//driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
	insert(d.getFirstName(),"Pinky");
	insert(d.getLastName(),"R");
	insert(d.getAddress(),"123,pinky,614441");
	insert(d.geteMail(),"User@123");
	insert(d.getMobile(),"6789350894");
	click(d.getGender());
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
	insert(d.getPassWord(),"Pinky123@#");
	insert(d.getConfirm(),"Pinky123@#");
	click(d.getSubmit());
	
}
}
