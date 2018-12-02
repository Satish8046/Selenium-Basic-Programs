package com.abc.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch4 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		String title =driver.getTitle();
		System.out.println("The title is "+title);
		
		String url=driver.getCurrentUrl();
		System.out.println("The current page URL is "+url);
		
		String code=driver.getPageSource();
		System.out.println("The current page source code  is "+code);
		
	}

}
