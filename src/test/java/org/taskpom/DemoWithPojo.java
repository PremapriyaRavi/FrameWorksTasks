package org.taskpom;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class DemoWithPojo extends BaseClass{
	public DemoWithPojo() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstName;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastName;
	@FindBy(xpath="//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea[@ng-model='Adress']")
	private WebElement Address;
	@FindBy(xpath="//div[@id='eid']/input[@ng-model='EmailAdress']")
	private WebElement eMail;
	@FindBy(xpath="(//div[@class='col-md-4 col-xs-4 col-sm-4'])[4]/input[@ng-model='Phone']")
	private WebElement mobile;
	@FindBy(xpath="//label[text()=' FeMale']")
	private WebElement gender;
	@FindBy(id="checkbox1")
	private WebElement hobbies;
	@FindBy(id="msdd")
	private WebElement sel;
	@FindBy(xpath="//div[@style='display: block;']//li")
	private List<WebElement> languages;
		public WebElement getFirstName() {
		return firstName;
	}
		@FindBy(xpath="//label[text()='Skills']")
		private WebElement label;
		@FindBy(id="Skills")
		private WebElement skills;
		@FindBy(id="countries")
		private WebElement country;
		@FindBy(xpath="//span[@role='combobox']")
		private WebElement selCountry;
		private WebElement state;
		private WebElement city;
		@FindBy(id="yearbox")
		private WebElement year;
		@FindBy(xpath="//select[@placeholder='Month']")
		private WebElement month;
		@FindBy(id="daybox")
		private WebElement day;
		@FindBy(xpath="//input[@id='firstpassword' and @ng-model='Password']")
		private WebElement passWord;
		@FindBy(xpath="(//div[@class='col-md-4 col-xs-4 col-sm-4'])[12]/input[@id='secondpassword']")
		private WebElement confirm;
		@FindBy(xpath="//input[@id='imagesrc']")
		private WebElement chooseFile;
		@FindBy(id="submitbtn")
		private WebElement submit;

	public WebElement getChooseFile() {
		return chooseFile;
	}
	public void setChooseFile(WebElement chooseFile) {
		this.chooseFile = chooseFile;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public void setAddress(WebElement address) {
		Address = address;
	}
	public WebElement geteMail() {
		return eMail;
	}
	public void seteMail(WebElement eMail) {
		this.eMail = eMail;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public void setMobile(WebElement mobile) {
		this.mobile = mobile;
	}
	public WebElement getGender() {
		return gender;
	}
	public void setGender(WebElement gender) {
		this.gender = gender;
	}
	public WebElement getHobbies() {
		return hobbies;
	}
	public void setHobbies(WebElement hobbies) {
		this.hobbies = hobbies;
	}
	public WebElement getSel() {
		return sel;
	}
	public void setSel(WebElement sel) {
		this.sel = sel;
	}
	
	public List<WebElement> getLanguages() {
		return languages;
	}
	public void setLanguages(List<WebElement> languages) {
		this.languages = languages;
	}
	public WebElement getLabel() {
		return label;
	}
	public void setLabel(WebElement label) {
		this.label = label;
	}
	public WebElement getSkills() {
		return skills;
	}
	public void setSkills(WebElement skills) {
		this.skills = skills;
	}
	public WebElement getCountry() {
		return country;
	}
	public void setCountry(WebElement country) {
		this.country = country;
	}
	public WebElement getSelCountry() {
		return selCountry;
	}
	public void setSelCountry(WebElement selCountry) {
		this.selCountry = selCountry;
	}
	public WebElement getState() {
		return state;
	}
	public void setState(WebElement state) {
		this.state = state;
	}
	public WebElement getCity() {
		return city;
	}
	public void setCity(WebElement city) {
		this.city = city;
	}
	public WebElement getYear() {
		return year;
	}
	public void setYear(WebElement year) {
		this.year = year;
	}
	public WebElement getMonth() {
		return month;
	}
	public void setMonth(WebElement month) {
		this.month = month;
	}
	public WebElement getDay() {
		return day;
	}
	public void setDay(WebElement day) {
		this.day = day;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	public void setConfirm(WebElement confirm) {
		this.confirm = confirm;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	
}
