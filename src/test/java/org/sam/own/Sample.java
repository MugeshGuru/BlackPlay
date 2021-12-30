package org.sam.own;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample extends BaseClass {

	@Test 
	public void tc1() {
		System.out.println("Test 1");

	}
	
	@Test 
	private void tc2() {
		System.out.println("Test 2");

	}
	
	@Test  
	private void tc3() {
		System.out.println("Test 3");

	}
	
	@Test (dataProvider="SampleData")     // dataProviderClass=Sample.class
	private void tc4(String username, String password) throws InterruptedException {
		browserLaunch();
		windowMax();
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(username);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(password);
		
		// Btn
		Thread.sleep(2000);
		
		
	}
	
	@DataProvider(name="SampleData")
	public Object[][] data() throws IOException {
		
		return new Object[] [] {
			
			{"java","Java123"},
			{"python","Python123"},
			{"sql","sql123"},
			{excelRead(1, 1),excelRead(1, 2)}
		
		};
		
	}
	
	
	
	
	
	
	
	
	
	
}
