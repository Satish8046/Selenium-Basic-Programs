package com.abc.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\Selenium Web Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
	}
}
