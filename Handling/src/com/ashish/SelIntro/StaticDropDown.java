package com.ashish.SelIntro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub  
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       
       WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
       
       Select dropdown = new Select(staticDropdown);
//       selection Based On index
       dropdown.selectByIndex(3);
       Thread.sleep(2000);
       System.out.println(dropdown.getFirstSelectedOption().getText());
       dropdown.selectByVisibleText("AED");
       Thread.sleep(2000);
       System.out.println(dropdown.getFirstSelectedOption().getText());
       dropdown.selectByValue("INR");
       System.out.println(dropdown.getFirstSelectedOption().getText());
       
	}

}
