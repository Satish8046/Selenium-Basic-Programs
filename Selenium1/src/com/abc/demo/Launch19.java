package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch19 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.magento.com");
		WebElement myacc=driver.findElement(By.linkText("My Account"));
		myacc.click();
		Thread.sleep(10000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("sucheendra.abc@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Welcome123");
		WebElement login=driver.findElement(By.id("send2"));
		login.click();
		Thread.sleep(10000);
		WebElement logout=driver.findElement(By.linkText("Log Out"));
		logout.click();		
	}

}
