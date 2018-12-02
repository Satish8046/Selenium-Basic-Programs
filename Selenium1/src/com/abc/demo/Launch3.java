package com.abc.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch3 {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.close();
		
	}

}
