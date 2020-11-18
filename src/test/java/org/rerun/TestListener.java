package org.rerun;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.utility.BaseClass;

public class TestListener extends BaseClass implements ITestListener{

	public void onFinish(ITestContext context) {
	}
	public void onStart(ITestContext context) {
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
    public void onTestFailure(ITestResult result) {
    	String path="E:\\FailedSS\\";
    	TakesScreenshot tk=(TakesScreenshot)driver;
    	File src = tk.getScreenshotAs(OutputType.FILE);
    	File des=new File(path + result.getName()+".png");
    	try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	public void onTestSkipped(ITestResult result) {	
	}
    public void onTestStart(ITestResult result) {
	}
	public void onTestSuccess(ITestResult result) {	
	}
}
