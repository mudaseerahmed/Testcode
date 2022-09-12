package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.Productspage;

public class Testproduct {
	WebDriver driver;
	String baseurl;
@BeforeClass
	public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (5)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	baseurl="https://www.kapoorlampshades.com/";

	
	driver.get(baseurl);
		
		
		
	}

@Test

public void comparetwo() throws InterruptedException {
	
	Productspage p=new Productspage(driver);
	
	p.clickonshop();
	p.clickonlinks();
	//p.clickonshop();
//p.clickonlinksodd();
	
	
}


}

