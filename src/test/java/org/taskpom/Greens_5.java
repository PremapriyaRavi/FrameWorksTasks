package org.taskpom;

import java.util.concurrent.TimeUnit;

import org.utility.BaseClass;

public class Greens_5 extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("http://greenstechnologys.com/");
		maximizeWindow();
		GreensWithPojo g=new GreensWithPojo();
		click(g.getContactus());
		click(g.getCourses());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    srlDown(g.getTrends());
	    getText(g.getEmail());
	}

}
 