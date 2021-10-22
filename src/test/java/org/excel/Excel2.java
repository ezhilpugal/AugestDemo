package org.excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel2 {
	public static void main(String[] args) throws Throwable {
		
     
		File f = new File ("C:\\Users\\Ezhil\\eclipse-workspace\\AugBatch\\src\\test\\resources\\augest xlsx.xlsx");
		
		FileInputStream ff1= new FileInputStream(f);
		Workbook w1= new XSSFWorkbook(ff1);
		Sheet s1 = w1.getSheet("Sheet1");
		Row r1 = s1.getRow(0);
		Cell c1 = r1.getCell(0);
		int cc = c1.getCellType();
		if (cc==1) {
			String svalue = c1.getStringCellValue();
			System.out.println(svalue);
			if (svalue.equals("lokeshsuresh")) {
				c1.setCellValue("lokesh");
				FileOutputStream ff2 = new FileOutputStream(f);
				w1.write(ff2);	

				
	}}
		
}}