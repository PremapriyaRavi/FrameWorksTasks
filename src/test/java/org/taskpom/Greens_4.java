package org.taskpom;

import org.utility.BaseClass;

public class Greens_4 extends BaseClass{
public static void main(String[] args) {
	launchBrowser();
	launchUrl("http://greenstechnologys.com/");
	maximizeWindow();
	GreensWithPojo g=new GreensWithPojo();
	click(g.getContactus());
	getText(g.getMaintext());
	getText(g.getCopyright());	
}
}
