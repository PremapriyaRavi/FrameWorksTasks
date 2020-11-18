package org.taskpom;

import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class Greens_2 extends BaseClass {
	public static void main(String[] args) {
	launchBrowser();
	launchUrl("http://greenstechnologys.com/");
	maximizeWindow();
	GreensWithPojo g=new GreensWithPojo();
	click(g.getCerclick());
	getText(g.getSeltitle());
	click(g.getContentclick());
	
	getText(g.getHeading());
	
}
}
