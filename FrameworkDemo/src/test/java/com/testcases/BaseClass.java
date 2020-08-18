package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.utilities.GlobalReusables;

//This class contains methods to run before and after testcases 
public class BaseClass {
	GlobalReusables globalReuse = new GlobalReusables();
	//String baseURL = "https://opensource-demo.orangehrmlive.com/";
	static WebDriver driver;
	//static String driverPath = "./Drivers/chromedriver.exe";
	
	
	@BeforeTest
	public void browserSetup() {
		
		System.setProperty("webdriver.chrome.driver", globalReuse.readProperties("driverPath"));
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("incognito");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get(globalReuse.readProperties("baseUrl"));
		
	}
	
	/*@AfterTest
	public void afterRun() {
		driver.quit();
	}*/
}
