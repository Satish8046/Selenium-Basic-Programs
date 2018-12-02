package com.abc.demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollBarEvent {
	public static void main(String[] args) throws InterruptedException {
		
    	 WebDriver driver= new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	 driver.get("https://www.abctechtraining.com/home");
         JavascriptExecutor js = (JavascriptExecutor) driver;
    // This  will scroll down the page by  1000 pixel vertical	
         Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,1000)");
    }
}