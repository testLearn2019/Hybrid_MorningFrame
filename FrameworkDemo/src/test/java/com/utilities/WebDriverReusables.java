package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverReusables {
	
	WebDriver driver;
	public WebDriverReusables(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void enterTextById(String locatorValue, String data) {
		driver.findElement(By.id(locatorValue)).sendKeys(data);
	}
	
	public void selectValByText(String locatorValue, String selectValue) {
		Select sel1 = new Select(driver.findElement(By.id(locatorValue)));
		sel1.selectByVisibleText(selectValue);
	}
	
	public void clickById(String locatorValue) {
		driver.findElement(By.id(locatorValue)).click();
	}
	
	public void moveToActions(String Mainmenu, String submenu, String submenu1) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id(Mainmenu))).
		moveToElement(driver.findElement(By.id(submenu))).
		moveToElement(driver.findElement(By.id(submenu1))).click().build().perform();
	}
	
	public void getScreenshot(String filename) {
	File destin = new File ("./Screenshots/"+filename+".png");
	TakesScreenshot screen = (TakesScreenshot) driver;
	File source = screen.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(source, destin);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
