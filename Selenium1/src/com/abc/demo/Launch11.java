package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch11 {

	public static void main(String[] args) 
	{
		String url="https://account.magento.com/customer/account/login?_ga=2.191795242.1854918044.1540315779-129209018.1540315779";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("sucheendra.abc@gmail.com");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Welcom123");
		
		WebElement send=driver.findElement(By.id("send2"));
		send.click();

	}

}
