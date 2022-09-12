package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Productspage {
	public WebDriver driver;
	String countleft;

	public Productspage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonshop() {
		String path="//div[@class='primary-menu-container']//a[text()='Shop']";
		driver.findElement(By.xpath(path)).click();
	}
	public void clickonlinks() throws InterruptedException {
		
		String link="//ul[@class='product-categories']//li/a";
		List<WebElement>productlinks=driver.findElements(By.xpath(link));
		int n=productlinks.size();
		//(//span[@class='count'])[1]
		
		try {
		for(int i=0;i<n;i++) {
			WebDriverWait wait = new WebDriverWait(driver, 20000);
		//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(link)));
		//	JavascriptExecutor je = (JavascriptExecutor) driver;
		//	 je.executeScript("arguments[0].scrollIntoView(true);", productlinks.get(i));
			productlinks.get(i).click();
			Thread.sleep(3000);
			
		
		String text="(//span[@class='count'])";
	int x=i+1;
		String two="["+x+"]";
		String xp=text+two;
		
		
		countleft=driver.findElement(By.xpath(xp)).getText();
		String numberOnly= countleft.replaceAll("[^0-9]", "");
		Thread.sleep(3000);
		int n2=Integer.parseInt(numberOnly);
		System.out.println(n2);
		
		String texta="//p[contains(text(),'result')]";
		String act=driver.findElement(By.xpath(texta)).getText();
		System.out.println("results"+act);
		Thread.sleep(3000);
		boolean exp=act.contains(numberOnly);
		System.out.println(exp);
		
		driver.navigate().back();
		
		
		
				
		
		}
		}
		catch(StaleElementReferenceException e) {
		/*	String linke="//ul[@class='product-categories']//li/a";
			List<WebElement>productlinkse=driver.findElements(By.xpath(linke));
			int n1=productlinkse.size();
			
			for(int i=1;i<n1;i=i+2) {
			//	WebDriverWait wait = new WebDriverWait(driver, 20000);
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(link)));
				productlinkse.get(i).click();
				
		
	String text="(//span[@class='count'])";
			i=i+1;
			String two="["+i+"]";
			String xp=text+two;
			
			
			countleft=driver.findElement(By.xpath(xp)).getText();
			String numberOnly= countleft.replaceAll("[^0-9]", "");
			Thread.sleep(3000);
			int n2=Integer.parseInt(numberOnly);
			System.out.println(n2);
			
	
		}
		*/
		}
		}
		public void clickonlinksodd() throws InterruptedException {
			
			String link="//ul[@class='product-categories']//li/a";
			List<WebElement>productlinks=driver.findElements(By.xpath(link));
			int n=productlinks.size();
			//(//span[@class='count'])[1]
			
			try {
			for(int i=1;i<n;i=i+2) {
				WebDriverWait wait = new WebDriverWait(driver, 20000);
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(link)));
				productlinks.get(i).click();
				
			
			String text="(//span[@class='count'])";
		//	i=i+1;
			String two="["+i+1+"]";
			String xp=text+two;
			
			
			countleft=driver.findElement(By.xpath(xp)).getText();
			String numberOnly= countleft.replaceAll("[^0-9]", "");
			Thread.sleep(3000);
			int n2=Integer.parseInt(numberOnly);
			System.out.println(n2);
			driver.navigate().back();
			
			
			}}
			
			catch(StaleElementReferenceException e) {
	
	
}
}
}