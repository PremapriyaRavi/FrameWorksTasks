package org.taskpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class GreensWithPojo extends BaseClass {
	public GreensWithPojo(){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h1[contains(text(),'Institutes')]")
	private WebElement up;
	@FindBy(xpath="//u[contains(text(),'Software')]")
	private WebElement down;
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement cerclick;
	@FindBy(xpath="(//a[text()='Course Content'])[29]")
    private WebElement contentclick;
	@FindBy(xpath="//p[contains(text(),'chennai at Greens technology.')]")
	private WebElement heading;
	@FindBy(xpath="//h1[text()='SELENIUM']")
	private WebElement seltitle;
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement course;
	@FindBy(xpath="//span[text()='Java Training']")
	private WebElement java;
	@FindBy(xpath="//span[text()='Core Java Training']")
	private WebElement corejava;
	@FindBy(xpath="//h2[contains(text(),'Reviews from Anitha')]")
	private WebElement reviews;
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement contactus;
	@FindBy(xpath="//h3[contains(text(),'Our Main')]")
	private WebElement maintext;
	@FindBy(xpath="//p[contains(text(),'Copyright')]")
	private WebElement copyright;
	@FindBy(xpath="(//a[text()='Careers'])[1]")
	private WebElement courses;
	@FindBy(xpath="(//p[@class='mail-info'])[16]")
	private WebElement email;
	@FindBy(xpath="//h3[@title='Top Selenium Trends In 2020']")
	private WebElement trends;
	
	public WebElement getTrends() {
		return trends;
	}
	public void setTrends(WebElement trends) {
		this.trends = trends;
	}
	public WebElement getCourses() {
		return courses;
	}
	public void setCourses(WebElement courses) {
		this.courses = courses;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getCourse() {
		return course;
	}
	public WebElement getContactus() {
		return contactus;
	}
	public void setContactus(WebElement contactus) {
		this.contactus = contactus;
	}
	public WebElement getMaintext() {
		return maintext;
	}
	public void setMaintext(WebElement maintext) {
		this.maintext = maintext;
	}
	public WebElement getCopyright() {
		return copyright;
	}
	public void setCopyright(WebElement copyright) {
		this.copyright = copyright;
	}
	public void setCourse(WebElement course) {
		this.course = course;
	}
	public WebElement getJava() {
		return java;
	}
	public void setJava(WebElement java) {
		this.java = java;
	}
	public WebElement getCorejava() {
		return corejava;
	}
	public void setCorejava(WebElement corejava) {
		this.corejava = corejava;
	}
	public WebElement getReviews() {
		return reviews;
	}
	public void setReviews(WebElement reviews) {
		this.reviews = reviews;
	}
	public WebElement getSeltitle() {
		return seltitle;
	}
	public void setSeltitle(WebElement seltitle) {
		this.seltitle = seltitle;
	}
	public WebElement getCerclick() {
		return cerclick;
	}
	public void setCerclick(WebElement cerclick) {
		this.cerclick = cerclick;
	}
	public WebElement getContentclick() {
		return contentclick;
	}
	public void setContentclick(WebElement contentclick) {
		this.contentclick = contentclick;
	}
	public WebElement getHeading() {
		return heading;
	}
	public void setHeading(WebElement heading) {
		this.heading = heading;
	}
	public WebElement getUp() {
		return up;
	}
	public void setUp(WebElement up) {
		this.up = up;
	}
	public WebElement getDown() {
		return down;
	}
	public void setDown(WebElement down) {
		this.down = down;
	}

	

}
