package org.test;

import java.util.Scanner;

import javax.swing.JOptionPane;

import org.utility.BaseClass;

public class Sample_1 extends BaseClass{
    public static void main(String[] args) {
    	launchBrowser();
        launchUrl("http://adactinhotelapp.com/Register.php");
        AdactInWithPojo a=new AdactInWithPojo();
        insert(a.getUserName(),"Premapinky");
        insert(a.getPassWord(),"@123456$");
        insert(a.getConfirmPW(),"@123456$");
        insert(a.getFullName(),"Premapriya Ravi");
        insert(a.getEmailAddress(),"selenium@1234");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String captcha = sc.nextLine();
        insert(a.getCaptchaTxt(),captcha);
        click(a.getConditions());
        click(a.getRegister());       
	}
    
    
}
