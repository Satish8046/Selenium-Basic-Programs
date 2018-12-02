package com.abc.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch9 {

	public static void main(String[] args) 
	{
		String url="https://www.gmail.com";
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		String eUrl="https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fca%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		String aUrl=driver.getCurrentUrl();
		System.out.println(aUrl);
		System.out.println(eUrl);
		if(eUrl.equals(aUrl))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
