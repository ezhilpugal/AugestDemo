package org.excel;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({Excel3.class,Excel4.class})
public class Excel5 {
	
	
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(Excel3.class,Excel4.class);
		int failureCount = r.getFailureCount();
		System.out.println("IGNORECOUNT.............."+r.getIgnoreCount());
		System.out.println("RUNCOUNT...................."+r.getRunCount());
		System.out.println("RUNTIME............"+r.getRunTime());
		System.out.println("FAILURECOUNT.............."+r.getFailureCount());
		System.out.println("WAS SUCCESFUL............."+r.wasSuccessful());
		 
		List<Failure> failures = r.getFailures();
		System.out.println("...........FAILURES............");
		for (Failure x : failures) {
		
			System.out.println(x);
		}
	}

}
