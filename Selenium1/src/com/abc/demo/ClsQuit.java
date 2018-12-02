package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClsQuit {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:/Selenium/page1.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement link1=driver.findElement(By.xpath("//a/h2"));
		link1.click();
		Thread.sleep(5000);
		WebElement link2=driver.findElement(By.xpath("html/body/a/h2"));
		link2.click();
		

		
		//driver.close();//close parent tab
		//driver.quit();//close all tabs
		
	}

}
