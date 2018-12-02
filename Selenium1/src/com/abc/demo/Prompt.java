package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	public static void main(String[] args) throws InterruptedException
	{
		String url="file:///D:/Selenium/Prompt.html";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to(url);
		WebElement alertbox=driver.findElement(By.xpath("//button[text()='Try it']"));
		Thread.sleep(2000);
		alertbox.click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(5000);
	    a.sendKeys("Satish");
		a.accept();
	}
}
