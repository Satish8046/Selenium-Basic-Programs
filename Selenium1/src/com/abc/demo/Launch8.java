package com.abc.demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch8 
{
	public static void test(WebDriver driver)
	{
		driver.get("https://www.gmail.com");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the name of browser");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String browser=scan.next();
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeDriver c=new ChromeDriver();
			test(c);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			FirefoxDriver f=new FirefoxDriver();
			test(f);
		}
		else
		{
			System.out.println("Invalid browser");
		}
		
		

	}

}
