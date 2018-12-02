package com.abc.demo;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch5 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter title");
		String etitle=scan.next();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String atitle=driver.getTitle();
		System.out.println("The expected title is "+etitle);
		System.out.println("The actual title is "+atitle);
		if(etitle.equalsIgnoreCase(atitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		String handler=driver.getWindowHandle();
		System.out.println(handler);
		
		Set<String> handle=driver.getWindowHandles();
		System.out.println(handle);
		
		Class<? extends WebDriver> name=driver.getClass();
		System.out.println(name);
		
		

	}

}
