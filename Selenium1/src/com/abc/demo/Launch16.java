package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch16
{

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		WebElement myAcct=driver.findElement(By.linkText("My Account"));
		myAcct.click();
		
		Thread.sleep(3000);
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("sucheendra.abc@gmail.com");
		
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Welcome123");
		
		WebElement login=driver.findElement(By.id("send2"));
		login.click();
		
		Thread.sleep(3000);
		
		WebElement logout=driver.findElement(By.linkText("Log Out"));
		logout.click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
