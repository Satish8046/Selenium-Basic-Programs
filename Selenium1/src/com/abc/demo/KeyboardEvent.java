package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {

	public static void main(String[] args) throws InterruptedException
	{
		String url="https://www.cleartrip.com/";
				
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to(url);
		WebElement from=driver.findElement(By.id("FromTag"));
		
		Actions a=new Actions(driver);
		a.moveToElement(from).click().sendKeys("tri").build().perform();
		Thread.sleep(5000);
		
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(5000);
		
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(5000);

		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(5000);

		
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(5000);

		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(5000);

		a.sendKeys(Keys.ENTER).build().perform();
	}
	

}
