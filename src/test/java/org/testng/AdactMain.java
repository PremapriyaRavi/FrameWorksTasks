package org.testng;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.BaseClass;
import org.utility.SampleForExcel;

public class AdactMain extends BaseClass {	
	@BeforeMethod
	public  void test1() {
	launchBrowser();
    launchUrl("http://adactinhotelapp.com/Register.php");
    getTitle();
    System.out.println(getCurrentUrl());
	}
	@Test(dataProvider="data",dataProviderClass=SampleForExcel.class)
	public void test2(String uname,String pword,String fname,String email) {
    AdactForDataWithPojo a=new AdactForDataWithPojo();
    insert(a.getUserName(),uname);
    insert(a.getPassWord(),pword);
    insert(a.getConfirmPW(),pword);
    insert(a.getFullName(),fname);
    insert(a.getEmailAddress(),email);
    String captcha=JOptionPane.showInputDialog("enter the captcha");
    insert(a.getCaptchaTxt(),captcha);
    click(a.getConditions());
	}
	@AfterMethod
	public  void test3()
	{
    AdactForDataWithPojo a=new AdactForDataWithPojo();
    click(a.getRegister());
	}
	
}
