package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	//BrowserLaunch
	public static WebDriver browserLanch(String type) {
     
		if (type.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();		
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	//geturl
	public static WebDriver getUrl(String url) {
		driver.get(url);
		return driver;
	}
    
	//Sendkeys
	public static void passInputValue(WebElement element, String value) {
	element.sendKeys(value);
		
	}
	
	//Click
	public static void click(WebElement element) {
		
		element.click();

	}
	
	//DropDown
    public static void dropDown(WebElement element, String type, String value) {

    	Select s = new Select(element);
    	
    	if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
    	
    	else if (type.equalsIgnoreCase("index")) {
    		int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}
    	
    	else if (type.equalsIgnoreCase("visibleText")) {
    		s.selectByVisibleText(value);
			
		}    	
	}
	
	//Clear
    
    public static void clear(WebElement element) {
       element.clear();
    	
	}
	
    //close
	public static void closee() {
		driver.close();

	}
	
	
	
	
	
	
	
	
	
	
}
