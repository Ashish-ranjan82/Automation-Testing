package com.ashish.SelIntro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingMakautwebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://makaut1.ucanapply.com/smartexam/public/");
		 driver.findElement(By.xpath("//div[@class='databox-left bg-themeprimary']//img")).click();
		 driver.findElement(By.cssSelector("#username")).sendKeys("13000220063");
		 driver.findElement(By.cssSelector("#password")).sendKeys("1234567890a");
		 driver.findElement(By.xpath("//a[normalize-space()='Submit']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//li[14]//a[1]//span[1]//img[1]"));
		 
		 

}
}
