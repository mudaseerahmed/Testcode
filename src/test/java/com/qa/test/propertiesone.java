package com.qa.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesone {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Excel\\src\\test\\java\\com\\qa\\test\\one.properties");
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("name"))
;
	}

}
