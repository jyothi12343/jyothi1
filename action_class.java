package com.day.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class {
	public static class Demo1 {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.amazon.in/");
			Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='nav-line-1-container']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("jyothi").build().perform();

	
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).contextClick().build().perform();
		Thread.sleep(3000);
		driver.quit();
			
			
			
			
			
			
		
		}
	}
}