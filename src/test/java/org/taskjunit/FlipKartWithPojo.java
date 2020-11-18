package org.taskjunit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class FlipKartWithPojo extends BaseClass {
	public FlipKartWithPojo(){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement email;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement password;
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
}
