package org.excel;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel1 {
	static List<String> l = new ArrayList<String>();
	static List<String> ll = new ArrayList<String>();
public static void main(String[] args) throws Throwable {

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    driver.findElement(By.name("q")).sendKeys("mobiles");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(5000);
	  List<WebElement> w1= driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for (int i = 0; i < w1.size(); i++) {
			WebElement w2 = w1.get(i);
			String text = w2.getText();
			l.add(text);
		}
		List<WebElement> w2 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (WebElement x : w2) {
          String text2= x.getText();
          ll.add(text2);
          System.out.println(text2);
		}
		
	File f = new File("C:\\Users\\Ezhil\\eclipse-workspace\\AugBatch\\src\\test\\resources\\augest xlsx 16.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("excel1");
	for (int k = 0; k<l.size(); k++) {
		Row r = s.createRow(k);
		Cell c = r.createCell(0);
        c.setCellValue(l.get(k));
	
    for (int j= 0; j<ll.size(); j++) {
    	//Row r1 = s.createRow(k);    		
    	Cell c1 = r.createCell(1);
            c1.setCellValue(ll.get(j));
      	}}
              FileOutputStream ff = new FileOutputStream(f);
          	w.write(ff);
      	
	}}
		
	  













/* File f = new File("C:\\Users\\Ezhil\\eclipse-workspace\\AugBatch\\src\\test\\resources\\augest xlsx 2.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("excel");
	Row r = s.createRow(0);
	Cell c = r.createCell(0);
    Cell c1 = r.createCell(1);
    Cell c2 = r.createCell(2);
	c.setCellValue("ezhilpugal");
	c1.setCellValue("lokeshsuresh");
	c2.setCellValue("vendhan");
	FileOutputStream ff = new FileOutputStream(f);
	w.write(ff);
}}*/
      	
      	
      	
      	
      	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*FileInputStream ff1= new FileInputStream(f);
	Workbook w1= new XSSFWorkbook(ff1);
	Sheet s1 = w1.getSheet("excel");
	Row r1 = s1.getRow(0);
	Cell c1 = r1.getCell(0);
	int cc = c1.getCellType();
	if (cc==1) {
		String svalue = c1.getStringCellValue();
		System.out.println(svalue);
		if (svalue.equals("ezhilpugal")) {
			c1.setCellValue("lokeshsuresh");
		
			
			
			
			
		}
	}
	FileOutputStream ff2 = new FileOutputStream(f);
	w1.write(ff2);
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*FileInputStream ff1= new FileInputStream(f);
	Workbook w1= new XSSFWorkbook(ff1);
	Sheet s1 = w1.getSheet("excel");
	Row r1 = s1.createRow(0);
	Cell c1 = r1.createCell(0);
	int cc = c1.getCellType();
	if (cc==1) {
		String svalue = c1.getStringCellValue();
		System.out.println(svalue);
		if (svalue.equals("ezhilpugal")) {
			c1.setCellValue("lokeshsuresh");
			//FileOutputStream ff2 = new FileOutputStream(f);
			//w.write(ff2);
			
			
			
			
			
		}
	}
	FileOutputStream ff2 = new FileOutputStream(f);
	w.write(ff2);
	*/

