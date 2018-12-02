package com.abc.demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch6 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter url");
		String url=scan.next();
		
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);

	}

}
