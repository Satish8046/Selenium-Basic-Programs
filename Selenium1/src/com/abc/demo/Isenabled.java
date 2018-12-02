package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://account.magento.com/customer/account/create/");
		WebElement button=driver.findElement(By.id("registerSubmit"));
		if(button.isEnabled()==true)
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is not enabled");
		}
	}

}
