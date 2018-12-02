package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch10 {

	public static void main(String[] args) 
	{
		String url="https://www.google.com";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement id=driver.findElement(By.id("q"));
		id.sendKeys("gmail");

	}

}
