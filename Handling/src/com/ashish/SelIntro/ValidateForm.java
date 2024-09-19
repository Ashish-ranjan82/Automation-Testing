package com.ashish.SelIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("Ashish Ranjan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("pratice1234@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("pratice123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='exampleCheck1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Student']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name ='bday']")).sendKeys("30-08-2002");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

	}

}
