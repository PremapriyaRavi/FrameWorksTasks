package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class AdactInWithPojo extends BaseClass{
	public AdactInWithPojo(){
	PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@name='re_password']")
	private WebElement confirmPW;
	
	@FindBy(xpath="//input[@id='full_name']")         
	private WebElement fullName;
	@CacheLookup
	@FindBy(xpath="//input[@id='email_add']")
	private WebElement emailAddress;
	@FindBys({@FindBy(xpath="//input[@name='captcha']"),@FindBy(xpath="//input[@id='captcha-form']")})
	
	
	private WebElement captchaTxt;
	@FindBy(id="tnc_box")
	private WebElement conditions;
	@FindAll({@FindBy(xpath="//input[@name='Submit']"),@FindBy(xpath="//input[@value='Register']")})
	
	
	private WebElement register;
	public WebElement getUserName() {
		return userName;
	}
	public void setUserName(WebElement userName) {
		this.userName = userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}
	public WebElement getConfirmPW() {
		return confirmPW;
	}
	public void setConfirmPW(WebElement confirmPW) {
		this.confirmPW = confirmPW;
	}
	public WebElement getFullName() {
		return fullName;
	}
	public void setFullName(WebElement fullName) {
		this.fullName = fullName;
	}
	public WebElement getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(WebElement emailAddress) {
		this.emailAddress = emailAddress;
	}
	public WebElement getCaptchaTxt() {
		return captchaTxt;
	}
	public void setCaptchaTxt(WebElement captchaTxt) {
		this.captchaTxt = captchaTxt;
	}
	public WebElement getConditions() {
		return conditions;
	}
	public void setConditions(WebElement conditions) {
		this.conditions = conditions;
	}
	public WebElement getRegister() {
		return register;
	}
	public void setRegister(WebElement register) {
		this.register = register;
	}
	

}
