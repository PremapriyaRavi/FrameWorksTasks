package org.taskpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class FaceBookWithPojo extends BaseClass {
	 public FaceBookWithPojo(){
	    	PageFactory.initElements(driver,this);
	    }
	    @FindBy(id="email")
		private WebElement email;
	    @FindBy(id="pass")
		private WebElement passWord;
	    @FindBy(name="login")
		private WebElement logIn;
		public WebElement getEmail() {
			return email;
		}
		public void setEmail(WebElement email) {
			this.email = email;
		}
		public WebElement getPassWord() {
			return passWord;
		}
		public void setPassWord(WebElement passWord) {
			this.passWord = passWord;
		}
		public WebElement getLogIn() {
			return logIn;
		}
		public void setLogIn(WebElement logIn) {
			this.logIn = logIn;
		}


}
