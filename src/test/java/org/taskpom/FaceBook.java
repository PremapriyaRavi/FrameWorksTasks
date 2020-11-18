package org.taskpom;

import java.util.concurrent.TimeUnit;

import org.utility.BaseClass;

public class FaceBook extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
		getTitle();	
		FaceBookWithPojo f=new FaceBookWithPojo();
		insert(f.getEmail(),"User@123");
		insert(f.getPassWord(),"123#");
		click(f.getLogIn());
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println(getCurrentUrl());
	}
}
