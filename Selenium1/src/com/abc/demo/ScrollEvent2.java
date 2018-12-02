package com.abc.demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEvent2 {
public static void main(String[] args) {

    String url="https://magento.com/";
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    
   driver.get(url);
     JavascriptExecutor js = (JavascriptExecutor) driver;
        //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath("//a[text()=\"Explore\"]"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}