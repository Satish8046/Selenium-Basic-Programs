package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch18 {

	public static void main(String[] args) throws InterruptedException
	{
		String url="https://account.magento.com/customer/account/create/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement dropdown=driver.findElement(By.id("customer_company_type"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		Thread.sleep(4000);
		s.selectByValue("development");
		Thread.sleep(4000);
		s.selectByVisibleText("Tech Partner");
		Thread.sleep(4000);
		driver.close();
	}

}
