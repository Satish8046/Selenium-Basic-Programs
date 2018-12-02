package com.abc.demo;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Links {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.magento.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List <WebElement> links=driver.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println(size);
		for(WebElement e:links)
		{
			String text=e.getText();
			if(text.equals("My Account"))
			{
				e.click();
				
			}
			
			System.out.println(text);
		}
		
	}

}
