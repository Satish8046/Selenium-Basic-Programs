package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cleartrip.com/?dxid=CjwKCAiAlb_fBRBHEiwAzMeEdhhMan6C1gC2Wo5WpkAZAnx6fZrCouJJBz32-C2Xlkfm0jWyWV3OJRoCIjMQAvD_BwE&gclid=CjwKCAiAlb_fBRBHEiwAzMeEdhhMan6C1gC2Wo5WpkAZAnx6fZrCouJJBz32-C2Xlkfm0jWyWV3OJRoCIjMQAvD_BwE");
		WebElement radio=driver.findElement(By.id("RoundTrip"));
		radio.click();
		WebElement ret=driver.findElement(By.id("ReturnDate"));
		WebElement button=driver.findElement(By.id("SearchBtn"));
		if(radio.isSelected()==true && ret.isDisplayed()==true)
		{
			System.out.println("Round Trip is selected & displayed");
		}
		else
		{
			System.out.println("Is not selected & not displayed");
		}
		if(button.isEnabled()==true)
		{
			System.out.println("Button is Enabled");
		}
		else
		{
			System.out.println("Button is not Enabled");
		}
	}

}
