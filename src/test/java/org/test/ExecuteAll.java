package org.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class ExecuteAll {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(Employee.class,JunitTest.class);
		System.out.println("Run count="+r.getRunCount());
		System.out.println("Ignore count="+r.getIgnoreCount());
		System.out.println("Failure count="+r.getFailureCount());
		System.out.println("Run Time="+r.getRunTime());
	
		List<Failure> f = r.getFailures();
//		for(Failure x:f) {
//			System.out.println(x);
//		}
		for(int i=0;i<f.size();i++) {
			Failure fail = f.get(i);
			System.out.println(fail);
		}
	}

}
