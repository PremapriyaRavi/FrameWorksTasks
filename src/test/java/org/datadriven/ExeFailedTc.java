package org.datadriven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ExeFailedTc implements IRetryAnalyzer{

	public boolean retry(ITestResult result) {
		int minCount=1;
		int maxCount=3;
		if(minCount<maxCount) {
			minCount++;
		    return true;
		}
		return false;
	}

}
