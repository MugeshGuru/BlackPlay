package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.sample.PojoClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx extends BaseClass {

	
	@BeforeClass
	public void launchBrowser() {
		browserLaunch();
		windowMax();
		
	}
	
	@AfterClass
	public void qitBrowser() {
		//closeBrowser();

	}
	
	@BeforeMethod
	public void start() {
		findSysdate();
		

	}
	@AfterMethod
	public void end() {
		findSysdate();
		

	}
	
	@Test (dataProvider="SampleData") // dataProviderClass=Sample.class
	public void tc1(String username, String password) throws IOException, InterruptedException {
		urlLaunch("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(username);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(password);
		
//		WebElement btnClick = driver.findElement(By.name("login"));
//		btnClick.click();
		
		Thread.sleep(2000);
					
}

	@DataProvider (name="SampleData")
	public Object data() [] [] throws IOException{
			
			return new Object[][] {
				
				{"Java", "Java123"},
				{"Python", "Python123"},
				{"Oracle", "Oracle123"},
				{"Selenium", "Selenium123"},
				{excelRead(1, 1),excelRead(1, 2)}
				
		
			};
	}
	
	
	
	
	
	
	
	
	
	
	
}