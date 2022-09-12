package com.qa.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class practiceexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\HP\\eclipse-workspace\\Excel\\src\\test\\java\\com\\qa\\test\\readfromexcel.xlsx";
FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Excel\\src\\test\\java\\com\\qa\\test\\readfromexcel.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(fis);
XSSFSheet sheet=workbook.getSheetAt(0);
int lastrow=sheet.getLastRowNum();
for(int i=0;i<=lastrow;i++) {
	Row row=sheet.getRow(i);
	Cell cell=row.createCell(5);
	cell.setCellValue("onetwo");
	
}
FileOutputStream fiso=new FileOutputStream(path);
workbook.write(fiso);
fiso.close();
	}

}
