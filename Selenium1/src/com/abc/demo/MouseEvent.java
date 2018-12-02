package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		WebElement dept=driver.findElement(By.xpath("//span[text()=\"Departments\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(dept).build().perform();
		WebElement baby=driver.findElement(By.xpath("//span[text()='Baby']"));
		baby.click();

	}

}
