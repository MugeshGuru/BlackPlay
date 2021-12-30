package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	static WebDriver driver;

	static Actions a;

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	public static void urlLaunch(String url) {

		driver.get(url);
	}

	public static void windowMax() {
		driver.manage().window().maximize();
	}

	public static void fillText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void screenShot(String screenshot) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				"C:\\Users\\Mugesh G\\eclipse-workspace\\FrameWork1\\ScreenShots//" + screenshot + ".png");
		FileUtils.copyFile(source, target);
	}

	public static void mousehoverAction(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void dragAndDrop(WebElement element, WebElement element2) {
		a = new Actions(driver);
		a.dragAndDrop(element, element2).perform();
	}

}
