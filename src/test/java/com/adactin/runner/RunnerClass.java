package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\adactin.feature",
glue="com.adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags="@smokeTest,@sanityTest,@sanityTest,@sanityTest,@sanityTest",
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html",
		"html:Reports/HtmlReports",
		"pretty",
		"json:Reports/JsonReports.json"
})

public class RunnerClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void borwserLanch() {
		
		WebDriverManager.chromedriver().setup();
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();		  

	}	
	
	@AfterClass
	public static void logout() {
        driver.close();
	}
}


