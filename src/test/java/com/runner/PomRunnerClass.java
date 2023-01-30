package com.runner;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.pom.LoginPage;

public class PomRunnerClass extends BaseClass {
	
	public static WebDriver driver;
		
	public static void main(String[] args) {
	
		driver = browserLanch("chrome");
		getUrl("https://adactinhotelapp.com/");
		LoginPage lp = new LoginPage(driver);
		passInputValue(lp.getUsername(), "Vigeshprabhug93");
		passInputValue(lp.getPassword(), "12345678");
		click(lp.getLogin());
		
	}
	
	
	
}
