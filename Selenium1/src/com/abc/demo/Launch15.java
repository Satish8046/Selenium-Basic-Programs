package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch15
{

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		WebElement myAcct=driver.findElement(By.linkText("My Account"));
		myAcct.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000); 
		
		driver.close();
	}

}
