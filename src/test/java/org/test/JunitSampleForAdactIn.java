package org.test;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utility.BaseClass;

public class JunitSampleForAdactIn extends BaseClass {
	@BeforeClass
	public static void launch(){
		launchBrowser();
        launchUrl("http://adactinhotelapp.com/Register.php");
        //maximizeWindow();
        getTitle();
        getCurrentUrl();      
    }
	@Before
	public void startTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
	}
    @Test
	public void Test() {
		 AdactInWithPojo a=new AdactInWithPojo();
	        insert(a.getUserName(),"Premapinky");
	        insert(a.getPassWord(),"@123456$");
	        insert(a.getConfirmPW(),"@123456$");
	        insert(a.getFullName(),"Premapriya Ravi");
	        insert(a.getEmailAddress(),"selenium@1234");
	        //Scanner sc=new Scanner(System.in);
	        //System.out.println("enter the string");
	        //String captcha = sc.nextLine();
	        String captcha=JOptionPane.showInputDialog("enter the captcha");
	        insert(a.getCaptchaTxt(),captcha);
	        click(a.getConditions());
	        click(a.getRegister());
	}
	@AfterClass
	public static void quit() {
		quitBrowser();
	}		
}