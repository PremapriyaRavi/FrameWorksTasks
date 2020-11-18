package org.taskpom;

import org.utility.BaseClass;

public class Greens_1 extends BaseClass {
	
public static void main(String[] args) {
	launchBrowser();
	launchUrl("http://greenstechnologys.com/");
	maximizeWindow();
	GreensWithPojo g=new GreensWithPojo();
	System.out.println(srlDown(g.getDown()));
	System.out.println(srlUp(g.getUp()));
	
}
}