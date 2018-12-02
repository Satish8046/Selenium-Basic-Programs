package com.abc.demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class User1 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the browser");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String browser=scan.next();
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriver c=new ChromeDriver();
			test(c);
		}
		else
		{
			WebDriver f=new FirefoxDriver();
			test(f);
		}

	}
	public static void test(WebDriver driver)
	{
		driver.get("http://www.magento.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
