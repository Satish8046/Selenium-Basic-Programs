package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent2 {

	public static void main(String[] args) 
	{
		String url="https://www.google.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		WebElement text=driver.findElement(By.name("q"));
		
		Actions a=new Actions(driver);
		a.moveToElement(text).click().build().perform();
		a.keyDown(Keys.SHIFT).sendKeys("ABC for technology & training").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
	}

}
