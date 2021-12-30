package org.sample;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleOne extends LibGlobal1 {
	
	

	public static void main(String[] args) throws IOException  {

		browserLaunch();
		windowMax();
		urlLaunch("https://www.facebook.com/");
		screenShot("Login");
		
		textFill(driver.findElement(By.id("email")), "Greens");
		
		WebElement textPass = driver.findElement(By.id("pass"));
		textFill(textPass, "12345");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		clickBtn(loginButton);
		screenShot("afterLogin");
		
	}
}
 