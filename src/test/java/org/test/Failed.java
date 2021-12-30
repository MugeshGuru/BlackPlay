package org.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer {
	
	int min =0, max = 3;
	
	public boolean retry(ITestResult arg0) {
	
		if (min < max) {
			
			min++;
			return true;
		}
		
		
		return false;
	}
	
	/*
	 * tc333 ----Failed---0<3---min =1 ---true-- Rerun
	 * tc333-----Failed --1<3---min =2----true--Rerun
	 * tc333-----Failed--2<3 ---min =3----true--Rerun
	 * tc333-----Failed--3<3---> Stop the Rerun
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

}
