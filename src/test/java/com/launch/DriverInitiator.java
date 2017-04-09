package com.launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DriverInitiator {

	public static WebDriver driver;
	
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("========before suite execution=======");
		driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		System.out.println("Im starting in firefox browser");
		driver.manage().window().maximize();
		DriverInitiator.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("==========after suite execution==========");
		driver.close();
	}
}
