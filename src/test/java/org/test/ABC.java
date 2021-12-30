package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sample.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ABC {

	public WebDriver driver;
	@Parameters("browsers")
	@Test
	public void tc1(String browserName) {
		

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Mugesh G\\\\eclipse-workspace\\\\Fast11Selenium\\\\driver\\\\chromedriver.exe\"");
			 driver = new ChromeDriver();
			
			
		}
		
		
		else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Mugesh G\\eclipse-workspace\\SamplePro\\driver\\msedgedriver.exe");
			 driver = new EdgeDriver();
			
		}
		
		else {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Mugesh G\\eclipse-workspace\\SamplePro\\driver\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		
		driver.get("https://www.facebook.com/");
		
	}
	
}
