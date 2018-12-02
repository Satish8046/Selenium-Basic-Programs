package com.abc.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch7 {

	public static void main(String[] args) 
	{
		String url="https://www.gmail.com";
			WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

}
