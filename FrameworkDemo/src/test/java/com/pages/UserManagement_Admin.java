package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.utilities.WebDriverReusables;

public class UserManagement_Admin {
	
	WebDriver driver;
	WebDriverReusables reuse;
	public UserManagement_Admin(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void search() {
		reuse = new WebDriverReusables(driver);
		
		reuse.enterTextById("searchSystemUser_userName", "Aylin");
		
		reuse.selectValByText("searchSystemUser_userType", "ESS");
		/*Select sel = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		sel.selectByVisibleText("ESS");*/
		
		reuse.enterTextById("searchSystemUser_employeeName_empName", "Grace");
		
		reuse.selectValByText("searchSystemUser_status", "Enabled");
		/*Select sel1 = new Select(driver.findElement(By.id("searchSystemUser_status")));
		sel1.selectByVisibleText("Enabled");*/
		
		reuse.clickById("searchBtn");
		//driver.findElement(By.id("searchBtn")).click();
	}
	
	public void addUser() {
		
		driver.findElement(By.name("btnAdd")).click();
		reuse.getScreenshot("Add user Information");
		reuse.selectValByText("systemUser_userType", "Admin");
		reuse.enterTextById("systemUser_employeeName_empName", "Abcdef");
		reuse.enterTextById("systemUser_userName", "abc123456");
		reuse.selectValByText("systemUser_status", "Enabled");
		reuse.enterTextById("systemUser_password", "aabbcc");
		reuse.enterTextById("systemUser_confirmPassword", "aabbcc");
		reuse.clickById("btnSave");
		reuse.getScreenshot("Added User Info");
	}
}
