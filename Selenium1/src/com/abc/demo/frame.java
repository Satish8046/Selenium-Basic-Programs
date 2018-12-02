package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="D:\\Selenium\\frame2.html";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to(url);
		//driver.findElement(By.xpath("//input[@id='frame2']")).sendKeys("Vivekanand");
		
		driver.findElement(By.id("frame2")).sendKeys("Vivekanand");
		//driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.switchTo().frame("nameinfo");
		//driver.findElement(By.xpath("//input[@id='frame']")).sendKeys("Satish");
		
		driver.findElement(By.id("frame")).sendKeys("Satish");
		

	}

}
