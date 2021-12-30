package org.test;

import org.testng.annotations.Test;

public class Example {
	
	@Test 
	public void tc1() {
		
		System.out.println("Test 1 :"+Thread.currentThread().getId());

	}
	@Test
	private void tc2() {
		System.out.println("Test 2 : "+Thread.currentThread().getId());

	}
	@Test
	private void tc3() {
		System.out.println("Test 3 :"+Thread.currentThread().getId());

	}
	
	@Test 
	private void tc4() {
		System.out.println("Test 4 :"+Thread.currentThread().getId());

	}

	@Test
	private void tc5() {
		System.out.println("Test 5 :"+Thread.currentThread().getId());

	}

}
