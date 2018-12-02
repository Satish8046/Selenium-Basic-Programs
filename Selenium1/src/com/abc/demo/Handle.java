package com.abc.demo;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:/Selenium/page1.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement link1=driver.findElement(By.xpath("//a/h2[text()='This is page1']"));
		Thread.sleep(5000);
		link1.click();
		String parentId=driver.getWindowHandle();
		System.out.println("Parent id is "+parentId);
		Set <String> allIds=driver.getWindowHandles();
		System.out.println(allIds);
		for(String s:allIds)
		{
			driver.switchTo().window(s);	
		}
		/*ArrayList<String> al=new ArrayList<String>(allIds);
		for(String i:al)
		{
			driver.switchTo().window(al.get(0));
		}*/
		driver.findElement(By.xpath("html/body/a/h2")).click();
		//driver.close();
	}
}