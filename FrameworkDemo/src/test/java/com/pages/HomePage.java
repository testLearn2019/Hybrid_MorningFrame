package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utilities.WebDriverReusables;

public class HomePage {
	WebDriver driver;
	WebDriverReusables reuse;
	public HomePage(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void admin() {
		
		reuse = new WebDriverReusables(driver);
		
		reuse.moveToActions("menu_admin_viewAdminModule", "menu_admin_UserManagement", "menu_admin_viewSystemUsers");
		
		/*Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).
		moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).
		moveToElement(driver.findElement(By.id("menu_admin_viewSystemUsers"))).click().build().perform();*/
		
	}
}
