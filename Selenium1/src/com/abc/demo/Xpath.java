package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args)
	{
		String url="file:///D:/Selenium/Selenium1/xpath2.html";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement pwd=driver.findElement(By.xpath("/html/body/input[2]"));
		pwd.sendKeys("1234");

	}

}
