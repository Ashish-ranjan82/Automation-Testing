package com.ashish.SelIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UseOfAssertFunctionInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement firstOption = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));

		if (!firstOption.isSelected()) {
			firstOption.click();
			System.out.println("checkbox is checked");

		}

		Thread.sleep(2000);

		// Verify using assert that the checkbox is checked
		Assert.assertTrue(firstOption.isSelected());
		System.out.println("Assertion passed: Checkbox is successfully checked.");

		// uncheck the checkbox

		if (firstOption.isSelected()) {
			firstOption.click();
			System.out.println("checkBox is uncheck");

		}

		// Verify the checkbox is uncheck or not
		Assert.assertFalse(firstOption.isSelected());
		System.out.println("Assertion passed: Checkbox is successfully unchecked.");

//          if (firstOption.isSelected()) {
//              System.out.println("Checkbox is successfully checked.");
//          } else {
//              System.out.println("Failed to check the checkbox.");
//          }

//            if (!firstOption.isSelected()) {
//                System.out.println("Checkbox is successfully checked.");
//            } else {
//                System.out.println("Failed to check the checkbox.");
//            }

	}

}
