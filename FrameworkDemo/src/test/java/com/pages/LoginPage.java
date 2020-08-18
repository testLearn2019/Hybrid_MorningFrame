package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.GlobalReusables;
import com.utilities.WebDriverReusables;

public class LoginPage {
	
	WebDriver driver;
	WebDriverReusables reuse;
	GlobalReusables globalReuse = new GlobalReusables();
	public LoginPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void login() throws Exception {
		reuse = new WebDriverReusables(driver);
		reuse.getScreenshot("BeforeLogin");
		reuse.enterTextById("txtUsername", globalReuse.readExcel("Login",0, 0));
		reuse.enterTextById("txtPassword", globalReuse.readExcel("Login",0, 1));
		
		reuse.clickById("btnLogin");
		reuse.getScreenshot("AfterLogin");
		globalReuse.writeData("passsedddddddddd", 0, 2);
		//driver.findElement(By.id("btnLogin")).click();
		
	}
}
