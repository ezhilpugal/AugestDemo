package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	

	public static void main(String[] args) throws Exception {
	
	File f = new File ("C:\\Users\\Ezhil\\Documents\\New folder\\maven1.xlsx");
	
	FileInputStream ff= new FileInputStream(f);
	Workbook w =new  XSSFWorkbook(ff);
	Sheet s = w.getSheet("Sheet1");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		
	
		 Row r = s.getRow(i);
		 for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		  Cell c = r.getCell(j);
		  int ss= c.getCellType();
		 if (ss==1) {
			  String value = c.getStringCellValue();
			  System.out.println(value);
		 }
		  
		  
		 else if (ss==0) {
			  if (DateUtil.isCellDateFormatted(c)) {
				  Date d = c.getDateCellValue();
				  SimpleDateFormat s1 = new SimpleDateFormat();
				  String value = s1.format(d);
				  System.out.println(value);
			  }
			  else {
				double dd = c.getNumericCellValue();
				long l = (long)dd;
				String value = String.valueOf(l);
				System.out.println(value);
			}
		 }
	 
	}}
	
	}}
			  
	

