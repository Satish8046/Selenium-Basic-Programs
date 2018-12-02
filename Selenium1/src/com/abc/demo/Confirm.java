package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm {

	public static void main(String[] args) throws InterruptedException {
		String url = "file:///D:/Selenium/Confirm.html";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to(url);
		WebElement alertbox = driver.findElement(By.xpath("//button[text()='Try it']"));
		alertbox.click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(a.getText());
		Thread.sleep(5000);

		// a.accept();
		a.dismiss();
	}
}
