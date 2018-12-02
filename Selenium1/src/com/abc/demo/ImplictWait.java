package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.magento.com");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys("sucheendra.abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();

	}

}
