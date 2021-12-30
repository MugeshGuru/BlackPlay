package org.test;

import org.testng.annotations.Test;

public class ExampleTwo {
	
	@Test
	public void test11() {
	System.out.println("test11 :"+Thread.currentThread().getId());

	}

	@Test
	private void test22() {
	System.out.println("test22 :"+Thread.currentThread().getId());

	}

	@Test
	private void test33() {
	System.out.println("test33 :"+Thread.currentThread().getId());

	}

	@Test
	private void test44() {
	System.out.println("test44 :"+Thread.currentThread().getId());

	}

}
