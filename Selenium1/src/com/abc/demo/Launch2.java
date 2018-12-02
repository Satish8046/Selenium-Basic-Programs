package com.abc.demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.driver", "D:\\Drivers\\Selenium Web Driver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.magento.com");
	}
}
