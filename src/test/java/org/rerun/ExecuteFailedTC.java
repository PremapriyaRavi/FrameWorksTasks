package org.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ExecuteFailedTC implements IRetryAnalyzer {
    int minCount=1;
    int maxCount=10;
	public boolean retry(ITestResult result) {
		if(minCount<maxCount) {	
		    minCount++;
		    return true;
	}
 return false;
}
}
