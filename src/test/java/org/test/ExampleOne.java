package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleOne {

	@Test
	public void tc111() {
		System.out.println("Test 111 ");

	}
	@Test
	private void tc222() {
		Assert.assertTrue(false);
		System.out.println("Test 222 :");

	}
	@Test 
	private void tc333() { 
		Assert.assertTrue(false);
		System.out.println("Test 333 :");

	}
	
	
	
	
	
	
}
