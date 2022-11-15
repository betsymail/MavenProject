package com.tutorials.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropDowns {
	
	public static WebDriver driver;
	
	public static String baseURl="https://www.wikipedia.org/";

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(baseURl);
		
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.id("searchLanguage"));
		
		
	}

}
