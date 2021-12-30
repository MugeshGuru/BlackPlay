package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static String excelRead(int rowNum, int cellNum) throws IOException {
	
		// 1.Give a location of file
		File f = new File("C:\\Users\\Mugesh G\\eclipse-workspace\\SamplePro\\ExcelFile\\sample.xlsx");
		
		// 2.Read the file
		FileInputStream fin = new FileInputStream(f);
		
		//3. Workbook
		Workbook b = new XSSFWorkbook(fin);
		
		// 4.Get a Sheet
		Sheet s = b.getSheet("Sheet1");
		
			Row r = s.getRow(rowNum);
				
			Cell c = r.getCell(cellNum);
			
				String value = "";
				
			int type = c.getCellType();
			
			
			if (type == 1) {
				// Cell type is String
				 value = c.getStringCellValue();
				
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				
				// date format
				Date d = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
				 value = sim.format(d);
		
			}
			
			else {
				//Number
				double dd = c.getNumericCellValue();
				// NewVariable ref = (NewVariable)oldVariable;
				long l = (long)dd;
				 value = String.valueOf(l);
			}
			
			return value;
				
			}
	
	
	
	
	
	
	
	
	
			
	public static WebDriver driver;

	public static Actions a;

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

	public static void btnClick(WebElement element) {
		element.click();

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

	public static void closeBrowser() {
			driver.close();

		}	
			
	public static void findSysdate() {
		Date d = new Date();
		System.out.println(d);

	}		
			
		}
	
	

