package org.test;

import java.io.IOException;

import org.sample.PojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest extends BaseClass {

	public PojoClass l;

	@BeforeClass
	public void launchBrowser() {
		browserLaunch();
		windowMax();
		
	}
	
	@AfterClass
	public void qitBrowser() {
		closeBrowser();

	}
	
	@BeforeMethod
	public void start() {
		findSysdate();
		l = new PojoClass();

	}
	@AfterMethod
	public void end() {
		findSysdate();
		

	}
	@Test
	public void tc1() throws IOException {
		urlLaunch("https://www.facebook.com/");
		
		
		fillText(l.getTxtEmail().get(0), excelRead(1, 1));
		fillText(l.getTxtPass().get(0), excelRead(1, 3));
		btnClick(l.getBtnLogin().get(0));
		
//		WebElement txtEmail = driver.findElement(By.id("email"));
//		fillText(txtEmail, "Mugesh");
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		btnClick(btnLogin);
		

	}
	
	
	
	
	
}
