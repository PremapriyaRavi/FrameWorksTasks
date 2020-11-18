package org.datadriven;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Analys implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotaion, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer r = annotaion.getRetryAnalyzer();
		if(r==null)
		{
			annotaion.setRetryAnalyzer(ExeFailedTc.class);
		}
	}

}
