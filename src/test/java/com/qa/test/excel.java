package com.qa.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fs = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Excel\\src\\test\\java\\com\\qa\\test\\readfromexcel.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		
		System.out.println(cell);
		
		
		

	}

}
