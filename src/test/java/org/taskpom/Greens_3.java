package org.taskpom;

import org.utility.BaseClass;

public class Greens_3 extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("http://greenstechnologys.com/");
		maximizeWindow();
		GreensWithPojo g=new GreensWithPojo();
		moveTo(g.getCourse());
		moveTo(g.getJava());
		click(g.getCorejava());
		getText(g.getReviews());
		
	}

}
