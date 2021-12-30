package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.apache.commons.lang3.text.WordUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataDriven extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Mugesh G\\eclipse-workspace\\FrameWork1\\ExcelFiles\\SampleData.xlsx");
		
		FileInputStream fin = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Greens");
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(1);
		
		String value = c.getStringCellValue();
		
		if (value.equals("Guru")) {
			
			c.setCellValue("Mugesh");
		}
		
		FileOutputStream fout = new FileOutputStream(file);
		
		w.write(fout);
		
		System.out.println("Done");
		
	}
	
}
